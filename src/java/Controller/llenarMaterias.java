/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MovimientosBD.*;
import clases.*;
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
        ObtenerTodos obtt = new ObtenerTodos();
        //Obtenemos el alumno con el ID del usuario
        TrAlumnos alumno = obti.obtenerAlumnobyUsuarioID(id);
        
    }
}
