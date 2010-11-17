/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Estrategias;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MovimientosBD.*;

/**
 *
 * @author David
 */
@WebServlet(name="saveEstrategias", urlPatterns={"/saveEstrategias"})
public class saveEstrategias extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int op1 = Integer.parseInt(request.getParameter("id").substring(0, 1));
            String op2 = request.getParameter("id").substring(1, 2);
            int idn = Integer.parseInt(request.getParameter("id").substring(2));

            switch(op1){
                case 0: //Caso de actualizar o eliminar Estrategias
                    switch(op2.charAt(0)){
                        case 'm': // Caso actualizar mensaje
                            ActualizarCampos update = new ActualizarCampos();
                            if(update.actualizarEstrategiasMensaje(idn, request.getParameter("value")))
                                out.println(request.getParameter("value"));
                            else
                                out.println("Error");
                            break;
                         case 'd': // Caso para eliminar estrategia
                                EliminarCampos delete = new EliminarCampos();
                                if(delete.eliminarEstrategiaById(idn))
                                    out.println("ok"); 
                            break;
                        default:
                            out.println(idn);
                    }
                    break;
                case 1: //Caso de Estrategias por alumno
                     switch(op2.charAt(0)){
                        case 'm':
                                ActualizarCampos update = new ActualizarCampos();
                                if(update.actualizarEstrategiasMensaje(idn, request.getParameter("value")))
                                    out.println(request.getParameter("value"));
                                else
                                    out.println("Error");
                                break;        
                        default:
                            out.println(idn);
                    }
                    break;
                default:
                     out.println("es por alumno def");
            }
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
