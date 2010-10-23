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
public class TcCompetencias
{
    private int competencia_ID;
    private String des_Competencia;
    private String descripcion;
    private int categoria_ID;

    public TcCompetencias(int competencia_ID, String des_Competencia, String descripcion, int categoria_ID){
        this.setCategoria_ID(categoria_ID);
        this.setCompetencia_ID(competencia_ID);
        this.setDes_Competencia(des_Competencia);
        this.setDescripcion(descripcion);
    }
    /**
     * @return the competencia_ID
     */
    public int getCompetencia_ID() {
        return competencia_ID;
    }

    /**
     * @param competencia_ID the competencia_ID to set
     */
    public void setCompetencia_ID(int competencia_ID) {
        this.competencia_ID = competencia_ID;
    }

    /**
     * @return the des_Competencia
     */
    public String getDes_Competencia() {
        return des_Competencia;
    }

    /**
     * @param des_Competencia the des_Competencia to set
     */
    public void setDes_Competencia(String des_Competencia) {
        this.des_Competencia = des_Competencia;
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

    /**
     * @return the categoria_ID
     */
    public int getCategoria_ID() {
        return categoria_ID;
    }

    /**
     * @param categoria_ID the categoria_ID to set
     */
    public void setCategoria_ID(int categoria_ID) {
        this.categoria_ID = categoria_ID;
    }
     public TcCompetencias obtenerCompetencia (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcCompetencias com = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Competencias WHERE Competencia_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                com = new TcCompetencias(rs.getInt("Competencia_ID"), rs.getString("Des_Competencia"), rs.getString("Descripcion"), rs.getInt("Categoria_ID"));
            }
            return com;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
