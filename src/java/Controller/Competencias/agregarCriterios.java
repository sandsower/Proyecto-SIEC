/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Competencias;

import clases.Competencias.CriterioCompetencia;
import clases.Competencias.Criterios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author garrison
 */
public class agregarCriterios extends HttpServlet {
   
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
            out.println("<title>Servlet agregarCriterios</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet agregarCriterios at " + request.getContextPath () + "</h1>");
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
        int idCompetencia=Integer.parseInt(request.getParameter("idCompetencia"));
        String nombre = request.getParameter("nombre");        
        RequestDispatcher view = null;
        CriterioCompetencia cc = new CriterioCompetencia();
        ArrayList CriterioCompetencia = new ArrayList();
        
        try {
                CriterioCompetencia = cc.obtenerCriterioxCompetencia(idCompetencia);
                request.setAttribute("CriterioCompetencia",CriterioCompetencia );
                request.setAttribute("idCompetencia",idCompetencia);
                request.setAttribute("nombre",nombre );
                if(CriterioCompetencia != null){
                    view = request.getRequestDispatcher("agregarCriterios.jsp");
                    }
                else{
                 view = request.getRequestDispatcher("../error.jsp");
                }
                view.forward(request, response);
            }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        
        
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
