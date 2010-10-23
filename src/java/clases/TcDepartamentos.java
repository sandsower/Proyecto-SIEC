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
public class TcDepartamentos
{
    private int departamento_ID;
    private String des_Departamento;
    public TcDepartamentos(int departamento_ID,String des_Departamento){
        this.setDepartamento_ID(departamento_ID);
        this.setDes_Departamento(des_Departamento);
    }
    /**
     * @return the departamento_ID
     */
    public int getDepartamento_ID() {
        return departamento_ID;
    }

    /**
     * @param departamento_ID the departamento_ID to set
     */
    public void setDepartamento_ID(int departamento_ID) {
        this.departamento_ID = departamento_ID;
    }

    /**
     * @return the des_Departamento
     */
    public String getDes_Departamento() {
        return des_Departamento;
    }

    /**
     * @param des_Departamento the des_Departamento to set
     */
    public void setDes_Departamento(String des_Departamento) {
        this.des_Departamento = des_Departamento;
    }

     public TcDepartamentos obtenerDepartamento (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcDepartamentos dep = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Departamentos WHERE Departamento_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                dep = new TcDepartamentos(rs.getInt("Departamento_ID"), rs.getString("Des_Departamento"));
            }
            return dep;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
