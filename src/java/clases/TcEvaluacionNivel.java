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

    
     
    @Override
      public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("evaluacion_Nivel_ID").append(getEvaluacion_Nivel_ID()).append("], ");
        sb.append("des_Evaluacion").append(getDes_Evaluacion()).append("], ");
        return sb.toString();
    }

}
