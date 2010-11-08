/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Competencias;

import clases.Competencias.Competencias;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author RaiL
 */
public class modificarCompetencia extends HttpServlet {
   
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
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet modificarCompetencia</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet modificarCompetencia at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
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
        int id = Integer.parseInt(request.getParameter("idCompetencia"));
        Competencias com = null;
        Competencias competencia = new Competencias();
        com = competencia.obtenerCompetencia(id);
        
        RequestDispatcher view = null;
       if(com != null){
            request.setAttribute("Competencia", com);
            view = request.getRequestDispatcher("modificar.jsp");
       }
       else{
           view = request.getRequestDispatcher("../error.jsp");
       }
       view.forward(request, response);
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
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        int idCategoria = Integer.parseInt(request.getParameter("categoria"));
        int idCompetencia= Integer.parseInt(request.getParameter("idCompetencia"));
        RequestDispatcher view = null;
        Competencias  modCompetencia = new Competencias(idCompetencia,nombre,descripcion,idCategoria);

       try {
            int competencia = modCompetencia.modificarCompetencia(modCompetencia);
            request.setAttribute("filas", competencia);
       if(competencia > 0){
                Competencias com = new Competencias();
                ArrayList Competencias =null;
                Competencias =com.obtenerCompetencias();
                request.setAttribute("Competencias", Competencias);
           view = request.getRequestDispatcher("competencias.jsp");
       }
       else{
           view = request.getRequestDispatcher("../error.jsp");
       }
       view.forward(request, response);


        } catch (SQLException ex) {
            Logger.getLogger(modificarCompetencia.class.getName()).log(Level.SEVERE, null, ex);
        }
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
