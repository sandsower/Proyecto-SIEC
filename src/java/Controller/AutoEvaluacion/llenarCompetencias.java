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
        //Llenamos nuestra lista de la tabla MaestroMateriaGrupo
        ArrayList listaMMG = obtc.obtenerMaestrosMateriasGruposbyMateria(id);
        //Filtramos nuestra lista por grupo
        TrMaestroMateriaGrupo mmg = this.filterByGrupo(listaMMG);
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

    protected TrMaestroMateriaGrupo filterByGrupo(ArrayList mmg){
        //Obtenemos el alumno con el ID del usuario
        //TODO: Cambiar valor estatico por variable de sesion
        TrAlumnos alumno = obti.obtenerAlumnobyUsuarioID(5);
        //Creamos un iterador para la listaMMG
        Iterator it = mmg.iterator();
        //Filtramos la busqueda por el grupo
        while(it.hasNext()){
            //Guardamos el valor de la lista
            TrMaestroMateriaGrupo item = (TrMaestroMateriaGrupo) it.next();
            //Comparamos los valores de Grupo_ID
            if(alumno.getGrupo_ID() == item.getGrupoGrupo_ID()){
                //Si concuerdan, regresamos el item
                return item;
            }
        }
        //Si no hubo concordancia, regresamos null
        return null;
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
            listaCriterioCompetencias.add(obti.obtenerCriterioCompetencia(presesion.getCriterioCompetencia_ID()));
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
}
