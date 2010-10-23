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
public class TrCriterioCompetencia
{
    private int criterio_ID;
    private String des_Criterio;
    private String descripcion;

    public TrCriterioCompetencia(int criterio_ID, String des_Criterio, String descripcion){
        this.setCriterio_ID(criterio_ID);
        this.setDes_Criterio(des_Criterio);
        this.setDescripcion(descripcion);
    }

    /**
     * @return the criterio_ID
     */
    public int getCriterio_ID() {
        return criterio_ID;
    }

    /**
     * @param criterio_ID the criterio_ID to set
     */
    public void setCriterio_ID(int criterio_ID) {
        this.criterio_ID = criterio_ID;
    }

    /**
     * @return the des_Criterio
     */
    public String getDes_Criterio() {
        return des_Criterio;
    }

    /**
     * @param des_Criterio the des_Criterio to set
     */
    public void setDes_Criterio(String des_Criterio) {
        this.des_Criterio = des_Criterio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TrCriterioCompetencia obtenerCriterioCompetencia (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrCriterioCompetencia ccm = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Criterio_Competencia WHERE Criterio_Competencia_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ccm = new TrCriterioCompetencia(rs.getInt("Criterio_ID"), rs.getString("Des_Criterio"), rs.getString("Descripcion"));
            }
            return ccm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
