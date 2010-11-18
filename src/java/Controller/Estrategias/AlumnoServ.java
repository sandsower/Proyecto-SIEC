/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Estrategias;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import clases.*;
import MovimientosBD.*;

/**
 *
 * @author Belian
 */
public class AlumnoServ extends HttpServlet {
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
   {
       
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        int idm = Integer.parseInt(request.getParameter("materias"));
        int idg = Integer.parseInt(request.getParameter("grupos"));
        session.setAttribute("idg",idg);
        session.setAttribute("idm",idm);

        ObtenerConjunto conj = new  ObtenerConjunto();
        ArrayList<TrAlumnos> al= conj.obtenerAlumnosbyIdGrupoIdMateria(idg, idm);
        
        request.setAttribute("alumnos", al);
        RequestDispatcher view = request.getRequestDispatcher("listaalumnos.jsp");
        view.forward(request, response);
    }

    
}
