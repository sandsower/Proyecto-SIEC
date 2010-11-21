/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.EvaluacionF;

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
        //Obtenemos el maestro con el ID del usuario
        TrMaestros maestro = obti.obtenerMaestrobyUsuario_ID(id);
        //Obtenemos lista de MaestroMateriasGrupos por el ID del maestro
        ArrayList listaMMG = obtc.obtenerMaestrosMateriasGruposbyMaestro(maestro.getMaestro_ID());
        //Creamos un iterador para la listaMMG
        Iterator it = listaMMG.iterator();
        //Creamos la lista donde se guardaran las materias
        ArrayList listaMaterias = new ArrayList();
        //Iterador
        while (it.hasNext()) {
            //Sacamos el objeto de la lista
            TrMaestroMateriaGrupo mmg = (TrMaestroMateriaGrupo) it.next();
            //Obtenemos el grupo correspondiente al indice de nuestra lista inicial
            TcMaterias mat = obti.obtenerMateria(mmg.getMateria_ID());
            //Y lo añadimos a la lista que regresaremos
            listaMaterias.add(mat);
        }
        //Regresamos la lista de grupos a la vista SeleccionGrupo.jsp
        req.setAttribute("Materias", listaMaterias);
        req.setAttribute("IDMaestro", id);
        RequestDispatcher view = req.getRequestDispatcher("SeleccionMateria.jsp");
        view.forward(req, resp);
    }
}
