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
public class TrSesion
{
    private int sesion_ID;
    private String mensaje;
    private int estado;
    private int criterioCompetencia_ID;
    private int sesionRechazada_ID;
    private String ponderacion;

    public TrSesion(int sesion_ID, String mensaje, int estado, int criterioCompetencia_ID, int sesionRechazada_ID, String ponderacion){
        this.setCriterioCompetencia_ID(criterioCompetencia_ID);
        this.setEstado(estado);
        this.setMensaje(mensaje);
        this.setPonderacion(ponderacion);
        this.setSesionRechazada_ID(sesionRechazada_ID);
        this.setSesion_ID(sesion_ID);
    }

    /**
     * @return the sesion_ID
     */
    public int getSesion_ID() {
        return sesion_ID;
    }

    /**
     * @param sesion_ID the sesion_ID to set
     */
    public void setSesion_ID(int sesion_ID) {
        this.sesion_ID = sesion_ID;
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

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the criterio_Competencia_Criterio_Competencia_ID
     */
    public int getCriterioCompetencia_ID() {
        return criterioCompetencia_ID;
    }

    /**
     * @param criterio_Competencia_Criterio_Competencia_ID the criterio_Competencia_Criterio_Competencia_ID to set
     */
    public void setCriterioCompetencia_ID(int criterioCompetencia_ID) {
        this.criterioCompetencia_ID = criterioCompetencia_ID;
    }

    /**
     * @return the sesion_Rechazada_sesion_Recahzada
     */
    public int getSesionRechazada_ID() {
        return sesionRechazada_ID;
    }

    /**
     * @param sesion_Rechazada_sesion_Recahzada the sesion_Rechazada_sesion_Recahzada to set
     */
    public void setSesionRechazada_ID(int sesionRechazada_ID) {
        this.sesionRechazada_ID = sesionRechazada_ID;
    }

    /**
     * @return the ponderacion
     */
    public String getPonderacion() {
        return ponderacion;
    }

    /**
     * @param ponderacion the ponderacion to set
     */
    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }

     public TrSesion obtenerSesion (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrSesion ses = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Sesion WHERE Sesion_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ses = new TrSesion(rs.getInt("Sesion_ID"), rs.getString("mensaje"), rs.getInt("Estado"), rs.getInt("Criterio_Competencia_ID"), rs.getInt("Sesion_Rechazada_ID"), rs.getString("Ponderacion"));
            }
            return ses;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
    
}
