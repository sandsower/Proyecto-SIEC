/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.AutoEvaluacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import clases.*;
import MovimientosBD.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author sands
 */
public class crearAE extends HttpServlet {
    //Inicializamos metodos de obtencion

    private ObtenerIndividuo obti = new ObtenerIndividuo();
    private ObtenerConjunto obtc = new ObtenerConjunto();
    private int tipoEvaluacion = 1;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Obtenemos ID de la competencia seleccionada
        int id = Integer.parseInt(req.getParameter("ID"));
        //Llenamos nuestra lista de la tabla CriterioCompetencias
        ArrayList listaCriCo = obtc.obtenerCriterioCompetenciasbyCompetenciaID(id);
        //Obtenemos el alumno con el ID del usuario
        //TODO: Cambiar valor estatico por variable de sesion
        TrAlumnos alumno = obti.obtenerAlumnobyUsuarioID(7);
        //Obtenemos lista de MaestroMateriasGrupos por el ID de grupo sacado del alumno
        ArrayList listaMMG = llenarMateriasMaestroGrupo(alumno);
        //Llenamos nuestra lista de presesiones con coincidencia en nuestra lista criterioCompetencia seleccionada
        ArrayList listaPresesiones = this.llenarPresesiones(listaCriCo);
        //Filtramos las sesiones disponibles de acuerdo a las listas de presesiones y de maestroMateriaGrupo disponibles
        TrSesion sesion = this.filtrarSesiones(listaPresesiones, listaMMG);
        //Obtenemos la lista de criterios basandonos en la sesion filtrada
        TrPreSesion presesion = obti.obtenerPreSesion(sesion.getPreSesion_ID());
        TrCriterioCompetencia crico = obti.obtenerCriterioCompetencia(presesion.getCriterioCompetencia_ID());
        TcCriterios crit = obti.obtenerCriterio(crico.getCriterio_ID());
        //Comprobamos la existencia de valores de autoevaluacion en nuestra tabla de evaluaciones parciales
        //De no ser asi, creamos el campo con valores nulos
        //Si no, avanzamos al siguiente paso (modificacion de valores)
        TrEvaluacionParcial eva = null;
        if (!this.evaluadaAE(sesion,alumno)) {
            eva = new TrEvaluacionParcial(0, 0, 0, 1, this.tipoEvaluacion, sesion.getMaestroMateriaGrupoSesion_ID(), alumno.getAlumnos_ID());
            InsertarNuevo ins = new InsertarNuevo();
            if(!ins.insertarNuevaEvaluacionParcial(eva)){
                RequestDispatcher view = req.getRequestDispatcher("../../Error.jsp");
                view.forward(req, resp);
            }
        } else {
             //TODO: Cambiar valor estatico por variable de sesion
            eva = obti.obtenerEvaluacionParcialFilter(sesion.getMaestroMateriaGrupoSesion_ID(), this.tipoEvaluacion, alumno.getAlumnos_ID());
        }
        eva = obti.obtenerEvaluacionParcialFilter(sesion.getMaestroMateriaGrupoSesion_ID(), this.tipoEvaluacion, alumno.getAlumnos_ID());
        //Obtenemos ademas los niveles de evaluacion disponibles para evaluar.
        ArrayList niveles = obtc.obtenerEvaluacionesNiveles();
        //Mandamos a la vista los valores con los que vamos a interactuar
        req.setAttribute("Niveles", niveles);
        req.setAttribute("Criterio", crit);
        req.setAttribute("Evaluacion", eva);
        RequestDispatcher view = req.getRequestDispatcher("AutoEva.jsp");
        view.forward(req, resp);
    }

    protected ArrayList llenarPresesiones(ArrayList listaCriCo) {
        ArrayList listaPresesiones = new ArrayList();
        Iterator it = listaCriCo.iterator();
        while (it.hasNext()) {
            TrCriterioCompetencia crico = (TrCriterioCompetencia) it.next();
            Iterator temp = obtc.obtenerPreSesionesbyCriterioCompetenciaID(crico.getCriterioCompetencia_ID()).iterator();
            while (temp.hasNext()) {
                TrPreSesion pres = (TrPreSesion) temp.next();
                listaPresesiones.add(pres);
            }
        }
        return listaPresesiones;
    }

    protected TrSesion filtrarSesiones(ArrayList listaPresesiones, ArrayList listaMMG) {
        ArrayList listaSesiones = obtc.obtenerSesiones();
        Iterator it1 = listaSesiones.iterator();
        while (it1.hasNext()) {
            TrSesion sesion = (TrSesion) it1.next();
            Iterator it2 = listaPresesiones.iterator();
            while (it2.hasNext()) {
                TrPreSesion presesion = (TrPreSesion) it2.next();
                Iterator it3 = listaMMG.iterator();
                while (it3.hasNext()) {
                    TrMaestroMateriaGrupo mmg = (TrMaestroMateriaGrupo) it3.next();
                    if (sesion.getMaeMatGrp_ID() == mmg.getMaestroMateriaGrupo_ID() && sesion.getPreSesion_ID() == presesion.getSesion_ID()) {
                        return sesion;
                    }
                }
            }
        }
        return null;
    }

    protected boolean evaluadaAE(TrSesion sesion,TrAlumnos alumno) {
        //TODO: Cambiar valor estatico por variable de sesion
        TrEvaluacionParcial eva = obti.obtenerEvaluacionParcialFilter(sesion.getMaestroMateriaGrupoSesion_ID(), 1, alumno.getAlumnos_ID());
        if (eva != null) {
            return true;
        }
        return false;
    }

    public ArrayList llenarMateriasMaestroGrupo(TrAlumnos al) {
        //Inicializamos la lista de materias a llenarse
        ArrayList materias = new ArrayList();
        ArrayList mmgs = new ArrayList();
        ArrayList grupos = new ArrayList();
        //Obtenemos los grupos en los que puede estar el alumno
        ArrayList grupoAl = obtc.obtenerGrupoAlumnosbyAlumno(al.getAlumnos_ID());
        Iterator it = grupoAl.iterator();
        //Filtramos los grupos
        while (it.hasNext()) {
            TrGrupoAlumno gra = (TrGrupoAlumno) it.next();
            grupos.add(obti.obtenerGrupo(gra.getGrupo_ID()));
        }
        //Filtramos los campos que coincidan en nuestra tabla de relacion Maestro-Materia-Grupo
        it = grupos.iterator();
        while (it.hasNext()) {
            TcGrupo grp = (TcGrupo) it.next();
            mmgs = obtc.obtenerMaestrosMateriasGruposbyGrupo(grp.getGrupo_ID());
        }
        return mmgs;
    }
}
