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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author garrison
 */

public class crearCriterioCompetencia extends HttpServlet {
   
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
            out.println("<title>Servlet crearCriterioCompetencia</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet crearCriterioCompetencia at " + request.getContextPath () + "</h1>");
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
        int idCompetencia=Integer.parseInt(request.getParameter("idCompetencia") );
        int idCriterio=Integer.parseInt(request.getParameter("idCriterio"));
        CriterioCompetencia cc = new CriterioCompetencia();
        Criterios c = new Criterios();
        String nombre = request.getParameter("nombre");
        ArrayList CriterioCompetencia = new ArrayList();
        ArrayList Criterios = new ArrayList();
        CriterioCompetencia  nuevoCriterio = new CriterioCompetencia();
        RequestDispatcher view =null;

       try {
       int criterio = nuevoCriterio.crearCriterioCompetencia(idCompetencia,idCriterio);
       CriterioCompetencia = cc.obtenerCriterioxCompetencia(idCompetencia);
       Criterios = c.obtenerCriterios();
       request.setAttribute("CriterioCompetencia",CriterioCompetencia );
       if(criterio > 0){
           request.setAttribute("idCompetencia",idCompetencia );
           request.setAttribute("Criterios", Criterios);
           request.setAttribute("nombre",nombre );
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
