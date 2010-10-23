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
public class TcEvaluacionNivel
{
    private int evaluacion_Nivel_ID;
    private String des_Evaluacion;

    public TcEvaluacionNivel(int evaluacion_Nivel_ID, String des_Evaluacion){
        this.setDes_Evaluacion(des_Evaluacion);
        this.setEvaluacion_Nivel_ID(evaluacion_Nivel_ID);
    }
    /**
     * @return the evaluacion__Nivel_ID
     */
    public int getEvaluacion_Nivel_ID() {
        return evaluacion_Nivel_ID;
    }

    /**
     * @param evaluacion__Nivel_ID the evaluacion__Nivel_ID to set
     */
    public void setEvaluacion_Nivel_ID(int evaluacion_Nivel_ID) {
        this.evaluacion_Nivel_ID = evaluacion_Nivel_ID;
    }

    /**
     * @return the des_Evaluacion
     */
    public String getDes_Evaluacion() {
        return des_Evaluacion;
    }

    /**
     * @param des_Evaluacion the des_Evaluacion to set
     */
    public void setDes_Evaluacion(String des_Evaluacion) {
        this.des_Evaluacion = des_Evaluacion;
    }

     public TcEvaluacionNivel obtenerEvaluacionNivel (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcEvaluacionNivel evn = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Evaluacion_Nivel WHERE Evaluacion_Nivel_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                evn = new TcEvaluacionNivel(rs.getInt("Evaluacion_Nivel_ID"), rs.getString("Des_Evaluacion"));
            }
            return evn;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
