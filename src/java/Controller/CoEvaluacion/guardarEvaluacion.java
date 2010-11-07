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
import clases.*;
import MovimientosBD.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author sands
 */
public class guardarEvaluacion extends HttpServlet {
   //Inicializamos metodos de obtencion

    private ObtenerIndividuo obti = new ObtenerIndividuo();
    private ObtenerConjunto obtc = new ObtenerConjunto();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Obtenemos los datos mandados desde la vista para guardar la evaluacion
        int idEvaluacion = Integer.parseInt(req.getParameter("idEvaluacion"));
        int nivel = Integer.parseInt(req.getParameter("seleccionNivel"));
        TrEvaluacionParcial evaluacion = obti.obtenerEvaluacionParcial(idEvaluacion);
        //Instanciamos un nuevo objeto para actualizar los datos
        TrEvaluacionParcial nuevaEvaluacion = new TrEvaluacionParcial(idEvaluacion, 0, 1, nivel, evaluacion.getTipo_evaluacion_ID(), evaluacion.getMaestro_materia_grupo_sesion_ID(), evaluacion.getAlumnos_ID());
        //Actualizamos los valores en nuestra base de datos
        ActualizarCampos act = new ActualizarCampos();
        RequestDispatcher view = null;
        if(act.actualizarEvaluacionParcial(nuevaEvaluacion)){
            view = req.getRequestDispatcher("../../Gracias.jsp");
        }else{
            view = req.getRequestDispatcher("../../Error.jsp");
        }
        view.forward(req, resp);
    }

}
