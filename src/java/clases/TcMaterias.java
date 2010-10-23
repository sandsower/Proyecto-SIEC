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
public class TcMaterias
{
    private int materias_ID;
    private String des_Materias;
    private int departamento;

    public TcMaterias(int materias_ID, String des_Materias, int departamento){
        this.setDepartamento(departamento);
        this.setDes_Materias(des_Materias);
        this.setMaterias_ID(materias_ID);
    }
    /**
     * @return the materias_ID
     */
    public int getMaterias_ID() {
        return materias_ID;
    }

    /**
     * @param materias_ID the materias_ID to set
     */
    public void setMaterias_ID(int materias_ID) {
        this.materias_ID = materias_ID;
    }

    /**
     * @return the des_Materias
     */
    public String getDes_Materias() {
        return des_Materias;
    }

    /**
     * @param des_Materias the des_Materias to set
     */
    public void setDes_Materias(String des_Materias) {
        this.des_Materias = des_Materias;
    }

    /**
     * @return the departamento
     */
    public int getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public TcMaterias obtenerMateria (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcMaterias mat = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Materias WHERE Materias_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mat = new TcMaterias(rs.getInt("Materias_ID"), rs.getString("Des_Materias"), rs.getInt("Departamento"));
            }
            return mat;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
