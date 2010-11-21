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
public class llenarCompetencias extends HttpServlet {

    //Inicializamos metodos de obtencion
    private ObtenerIndividuo obti = new ObtenerIndividuo();
    private ObtenerConjunto obtc = new ObtenerConjunto();
   
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Obtenemos ID de la materia seleccionada
        int id = Integer.parseInt(req.getParameter("ID"));
        //Obtenemos el alumno por el ID de usuario
        //TODO: Cambiar el valor estatico por la variable de sesion
        TrAlumnos al = obti.obtenerAlumnobyUsuarioID(7);
        //Obtenemos la materia con el id
        TcMaterias mat = obti.obtenerMateria(id);
        //Llenamos nuestra lista de la tabla MaestroMateriaGrupo
        ArrayList listaMMG = this.llenarMateriasMaestroGrupo(al);
        //Filtramos nuestra lista por grupo
        TrMaestroMateriaGrupo mmg = this.filterByMateria(listaMMG,mat);
        //Obtenemos sesiones filtradas por mmg
        ArrayList sesiones = obtc.obtenerSesionesbyMaeMatGrpID(mmg.getMaestroMateriaGrupo_ID());
        //Obtenemos lista de presesiones basandonos en las sesiones
        ArrayList presesiones = this.llenarPresesiones(sesiones);
        //Obtenemos lista de CriteriosCompetencias basandonos en la lista de presesiones
        ArrayList criterioCompetencias = this.llenarCriterioCompetencia(presesiones);
        //Obtenemos las competencias basandonos en nuestra lista de criteriosCompetencias
        ArrayList listaCompetencias = this.llenarCompetencias(criterioCompetencias);
        //Regresamos la lista de competencias a la vista
        req.setAttribute("Competencias", listaCompetencias);
        RequestDispatcher view = req.getRequestDispatcher("SeleccionCompetencia.jsp");
        view.forward(req, resp);
    }

    protected TrMaestroMateriaGrupo filterByMateria(ArrayList mmg, TcMaterias mat){
        Iterator it = mmg.iterator();
        TrMaestroMateriaGrupo nuevoMmg = null;
        while(it.hasNext()){
            nuevoMmg = (TrMaestroMateriaGrupo) it.next();
            if(mat.getMaterias_ID() == nuevoMmg.getMateria_ID())
                return nuevoMmg;
        }
        return nuevoMmg;
    }

    protected ArrayList llenarPresesiones(ArrayList sesiones){
        ArrayList listaPresesiones = new ArrayList();
        Iterator it = sesiones.iterator();
        while(it.hasNext()){
            TrSesion sesion = (TrSesion) it.next();
            listaPresesiones.add(obti.obtenerPreSesion(sesion.getPreSesion_ID()));
        }
        return listaPresesiones;
    }

    protected ArrayList llenarCriterioCompetencia(ArrayList presesiones){
        ArrayList listaCriterioCompetencias = new ArrayList();
        Iterator it = presesiones.iterator();
        while(it.hasNext()){
            TrPreSesion presesion = (TrPreSesion) it.next();
            TrCriterioCompetencia crico = obti.obtenerCriterioCompetencia(presesion.getCriterioCompetencia_ID());
            listaCriterioCompetencias.add(crico);
        }
        return listaCriterioCompetencias;
    }

    protected ArrayList llenarCompetencias(ArrayList criterioCompetencias){
        ArrayList listaCompetencias = new ArrayList();
        Iterator it = criterioCompetencias.iterator();
        while(it.hasNext()){
            TrCriterioCompetencia criterioCompetencia = (TrCriterioCompetencia) it.next();
            listaCompetencias.add(obti.obtenerCompetencia(criterioCompetencia.getCompetencia_ID()));
        }
        return listaCompetencias;
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
