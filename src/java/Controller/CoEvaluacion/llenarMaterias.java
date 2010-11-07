/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.CoEvaluacion;

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

    private ObtenerIndividuo obti = new ObtenerIndividuo();
    private ObtenerConjunto obtc = new ObtenerConjunto();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Obtenemos ID (asignado por default para pruebas)
    int id = Integer.parseInt(req.getParameter("ID"));
        //Inicializamos metodos de obtencion
        //Obtenemos el alumno con el ID del usuario
        TrAlumnos alumno = obti.obtenerAlumnobyUsuarioID(id);
        //Obtenemos lista de MaestroMateriasGrupos por el ID de grupo sacado del alumno
        //Actualizacion: Ahora se sacan la lista de materias basandonos en la lista de grupos en los que esta el alumno inscrito.
        ArrayList listaMMG = this.llenarMateriasMaestroGrupo(alumno);
        //Creamos un iterador para la listaMMG
        Iterator it = listaMMG.iterator();
        //Creamos la lista donde se guardaran las materias
        ArrayList listaMaterias = new ArrayList();
        //Iterador
        while (it.hasNext()) {
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
