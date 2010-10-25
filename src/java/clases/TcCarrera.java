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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("carrera_ID").append(getCarrera_ID()).append("], ");
        sb.append("des_Carrera").append(getDes_Carrera()).append("], ");
        return sb.toString();
    }

}
