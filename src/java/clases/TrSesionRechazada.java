/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;

/**
 *
 * @author Sandsower
 */
public class TrSesionRechazada
{
    private int sesion_Rechazada;
    private String mensaje;

    public TrSesionRechazada(int sesion_Rechazada, String mensaje){
        this.setMensaje(mensaje);
        this.setSesion_Rechazada(sesion_Rechazada);
    }
    /**
     * @return the sesion_Rechazada
     */
    public int getSesion_Rechazada() {
        return sesion_Rechazada;
    }

    /**
     * @param sesion_Rechazada the sesion_Rechazada to set
     */
    public void setSesion_Rechazada(int sesion_Rechazada) {
        this.sesion_Rechazada = sesion_Rechazada;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

     public TrSesionRechazada obtenerSesionRechazada (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrSesionRechazada ser = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Sesion_Rechazada WHERE Sesion_Rechazada_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ser = new TrSesionRechazada(rs.getInt("Sesion_Rechazada_ID"), rs.getString("Mensaje"));
            }
            return ser;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
