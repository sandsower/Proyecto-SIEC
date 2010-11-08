/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Competencias;

import clases.Competencias.Categorias;
import clases.Competencias.Competencias;
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
 * @author RaiL
 */
public class crearCompetencia extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            Categorias cat = new Categorias();
            ArrayList Categorias =null;
            Categorias =cat.obtenerCategorias();
            request.setAttribute("Categorias", Categorias);
            RequestDispatcher view= null;
            if(Categorias!=null){
                view = request.getRequestDispatcher("crear.jsp");

            }
            else{
                view = request.getRequestDispatcher("../Error.jsp");
            }
          view.forward(request, response);

        } catch(Exception ex){
            System.out.println(ex);
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
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        int idCategoria = Integer.parseInt(request.getParameter("categoria"));
        RequestDispatcher view = null;
        Competencias  nuevaCompetencia = new Competencias(nombre,descripcion,idCategoria);

            try {
                int comp = nuevaCompetencia.crearCompetencia(nuevaCompetencia);
                request.setAttribute("filas",comp );
                Competencias com = new Competencias();
                ArrayList Competencias =null;
                Competencias =com.obtenerCompetencias();
                request.setAttribute("Competencias", Competencias);
                if((comp > 0)&&(Competencias!=null)){
                    view = request.getRequestDispatcher("competencias.jsp");
                    }
                else{
                 view = request.getRequestDispatcher("http://localhost:8083/siecCompetencias/error.jsp");
                }
                view.forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(crearCompetencia.class.getName()).log(Level.SEVERE, null, ex);
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
