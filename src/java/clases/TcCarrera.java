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
public class TcCarrera
{
    private int carrera_ID;
    private String des_Carrera;

    public TcCarrera(int carrera_ID, String des_Carrera){
        this.setCarrera_ID(carrera_ID);
        this.setDes_Carrera(des_Carrera);
    }
    /**
     * @return the carrera_ID
     */
    public int getCarrera_ID() {
        return carrera_ID;
    }

    /**
     * @param carrera_ID the carrera_ID to set
     */
    public final void setCarrera_ID(int carrera_ID) {
        this.carrera_ID = carrera_ID;
    }

    /**
     * @return the des_Carrera
     */
    public String getDes_Carrera() {
        return des_Carrera;
    }

    /**
     * @param des_Carrera the des_Carrera to set
     */
    public final void setDes_Carrera(String des_Carrera) {
        this.des_Carrera = des_Carrera;
    }


    public TcCarrera obtenerCarrera (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcCarrera car = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Carrera WHERE Carrera_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                car = new TcCarrera(rs.getInt("Carrera_ID"), rs.getString("Des_Carrera"));
            }
            return car;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
