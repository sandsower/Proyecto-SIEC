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
public class TcReportes
{
    private int reportes_ID;
    private String des_Reportes;
    private int perfil_ID;
    
    public TcReportes(int reportes_ID,String des_Reportes, int perfil_ID){
        this.setDes_Reportes(des_Reportes);
        this.setPerfil_ID(perfil_ID);
        this.setReportes_ID(reportes_ID);
        
    }
    /**
     * @return the reportes_ID
     */
    public int getReportes_ID() {
        return reportes_ID;
    }

    /**
     * @param reportes_ID the reportes_ID to set
     */
    public void setReportes_ID(int reportes_ID) {
        this.reportes_ID = reportes_ID;
    }

    /**
     * @return the des_Reportes
     */
    public String getDes_Reportes() {
        return des_Reportes;
    }

    /**
     * @param des_Reportes the des_Reportes to set
     */
    public void setDes_Reportes(String des_Reportes) {
        this.des_Reportes = des_Reportes;
    }

    /**
     * @return the perfil_ID
     */
    public int getPerfil_ID() {
        return perfil_ID;
    }

    /**
     * @param perfil_ID the perfil_ID to set
     */
    public void setPerfil_ID(int perfil_ID) {
        this.perfil_ID = perfil_ID;
    }

    public TcReportes obtenerReporte (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcReportes rep = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Reportes WHERE Reportes_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                rep = new TcReportes(rs.getInt("Reportes_ID"), rs.getString("Des_Reportes"), rs.getInt("Perfil_ID"));
            }
            return rep;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
