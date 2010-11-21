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
public class EstrategiaServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        ObtenerIndividuo getIndividuo = new ObtenerIndividuo();

        TrUsuario usuario = (TrUsuario)session.getAttribute("usuario");
        TrMaestros miMaestro = getIndividuo.obtenerMaestrobyUsuario_ID(usuario.getUsuario_ID());

        int idg = Integer.parseInt(session.getAttribute("idg").toString());
        int idm = Integer.parseInt(session.getAttribute("idm").toString());
        int but= Integer.parseInt(request.getParameter("button"));
        InsertarNuevo in= new InsertarNuevo();

        java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String fecha = f.format(Calendar.getInstance().getTime());
        switch(but)
        {
            case 0:
                if(request.getParameter("mensaje").isEmpty())
                {
                    request.setAttribute("message", "<div class='msnerror'><strong>Error:</strong> El campo de Texto para la Estrategia\n estaba Vacio por favor Ingrese una  Estrategia.</div>");
                }else if(
                        in.insertarEstrategia(
                        new TrEstrategias(0,fecha,request.getParameter("mensaje"),fecha)
                        ,idg, idm, miMaestro.getMaestro_ID())
                        )
                {
                    request.setAttribute("message", "<div class='msnok'>La Estrategia se ha insertado Correctamente</div>");
                }else
                {
                    request.setAttribute("message", "<div class='msnerror'><strong>Error:</strong> La Estrategia no pudo ser Insertada.</div>");
                }               
                break;
            case 1:
                if(request.getParameter("mensaje").isEmpty())
               {
                   request.setAttribute("message", "<div class='msnerror'><strong>Error:</strong> El campo de Texto para la Estrategia de Alumno\n estaba Vacio por favor Ingrese una  Estrategia.</div>");
               }else if(in.insertarEstrategiaAlumnos(
                        new TrEstrategias(0,fecha,request.getParameter("mensaje"),fecha)
                        , idg, idm,  miMaestro.getMaestro_ID(), Integer.parseInt(request.getParameter("ida")))
                        )
               {
               request.setAttribute("message", "<div class='msnok'>La Estrategia Individual se ha insertado Correctamente</div>");
               }else
               {
               request.setAttribute("message", "<div class='msnerror'><strong>Error:</strong> La Estrategia no pudo ser Insertada.</div>");
               }
                break;
            }
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
    }


}
