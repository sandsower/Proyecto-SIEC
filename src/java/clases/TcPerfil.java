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
public class TcPerfil
{
    private int perfil_ID;
    private String des_Perfil;
    public TcPerfil(int perfil_ID, String des_Perfil){
        this.setDes_Perfil(des_Perfil);
        this.setPerfil_ID(perfil_ID);
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

    /**
     * @return the des_Perfil
     */
    public String getDes_Perfil() {
        return des_Perfil;
    }

    /**
     * @param des_Perfil the des_Perfil to set
     */
    public void setDes_Perfil(String des_Perfil) {
        this.des_Perfil = des_Perfil;
    }

    public TcPerfil obtenerPerfil (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcPerfil per = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Perfil WHERE Perfil_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                per = new TcPerfil(rs.getInt("Perfil_ID"), rs.getString("Des_Perfil"));
            }
            return per;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

}
