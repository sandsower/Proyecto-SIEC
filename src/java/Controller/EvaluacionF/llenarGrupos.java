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
import javax.servlet.http.HttpSession;

/**
 *
 * @author sands
 */
public class llenarGrupos extends HttpServlet {

    private ObtenerIndividuo obti = new ObtenerIndividuo();
    private ObtenerConjunto obtc = new ObtenerConjunto();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Obtenemos ID del maestro
        //Obtenemos tambien el ID de la materia seleccionada
        int idMateria = Integer.parseInt(req.getParameter("IDMateria"));
        //Inicializamos metodos de obtencion
        //Obtenemos el maestro con el ID del usuario
        //Para esto obtenemos el usuario por medio de la sesion
        HttpSession objSesion = req.getSession(true);
        TrUsuario user = (TrUsuario) objSesion.getAttribute("usuario");
        TrMaestros maestro = obti.obtenerMaestrobyUsuario_ID(user.getUsuario_ID());
        //Obtenemos lista de MaestroMateriasGrupos por el ID de grupo sacado del maestro
        ArrayList listaMMG = obtc.obtenerMaestrosMateriasGruposbyMaestro(maestro.getMaestro_ID());
        //Creamos un iterador para la listaMMG
        Iterator it = listaMMG.iterator();
        //Creamos la lista donde se guardaran los grupos
        ArrayList listaGrupos = new ArrayList();
        //Iterador
        while (it.hasNext()) {
            //Sacamos el objeto de la lista 
            TrMaestroMateriaGrupo mmg = (TrMaestroMateriaGrupo) it.next();
            //Obtenemos el grupo correspondiente al indice de nuestra lista inicial solo si concuerda con los valores almacenados
            TcGrupo grp = null;
            if (mmg.getMaestro_ID() == maestro.getMaestro_ID() && mmg.getMateria_ID() == idMateria) {
                grp = obti.obtenerGrupo(mmg.getGrupoGrupo_ID());
                //Y lo añadimos a la lista que regresaremos
                listaGrupos.add(grp);
            }

        }
        //Regresamos la lista de grupos a la vista SeleccionGrupo.jsp
        req.setAttribute("Grupos", listaGrupos);
        req.setAttribute("IDMateria", idMateria);
        RequestDispatcher view = req.getRequestDispatcher("SeleccionGrupo.jsp");
        view.forward(req, resp);
    }
}
