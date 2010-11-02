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
import MovimientosBD.*;
import clases.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author sands
 */
public class llenarMaterias extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Obtenemos ID (asignado por default para pruebas)
        int id = Integer.parseInt(req.getParameter("ID"));
        //Inicializamos metodos de obtencion
        ObtenerIndividuo obti = new ObtenerIndividuo();
        ObtenerConjunto obtc = new ObtenerConjunto();
        //Obtenemos el alumno con el ID del usuario
        TrAlumnos alumno = obti.obtenerAlumnobyUsuarioID(id);
        //Obtenemos lista de MaestroMateriasGrupos por el ID de grupo sacado del alumno
        ArrayList listaMMG = obtc.obtenerMaestrosMateriasGruposbyGrupo(alumno.getGrupo_ID());
        //Creamos un iterador para la listaMMG
        Iterator it = listaMMG.iterator();
        //Creamos la lista donde se guardaran las materias
        ArrayList listaMaterias = new ArrayList();
        //Iterador
        while(it.hasNext()){
            //Sacamos el objeto de la lista
            TrMaestroMateriaGrupo mmg = (TrMaestroMateriaGrupo) it.next();
            //Obtenemos la materia correspondiente al indice de nuestra lista inicial
            TcMaterias mat = obti.obtenerMateria(mmg.getMateria_ID());
            //Y lo añadimos a la lista que regresaremos
            listaMaterias.add(mat);
        }
        //Regresamos la lista de materias a la vista SeleccionMateria.jsp
        req.setAttribute("Materias", listaMaterias);
        RequestDispatcher view = req.getRequestDispatcher("SeleccionMateria.jsp");
        view.forward(req, resp);
    }
}
