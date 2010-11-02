/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;

/**
 *
 * @author Jane
 */
public class TrEvaluacionParcialAcumulativa {
    private int evaluacion_parcial_acumulativa_ID;
    private int evaluacion_parcial_ID;
    private int evaluacion_acumulativa_ID;

    public TrEvaluacionParcialAcumulativa(int evaluacion_parcial_acumulativa_ID, int evaluacion_parcial_ID, int evaluacion_acumulativa_ID){
        this.setEvaluacion_parcial_acumulativa_ID(evaluacion_parcial_acumulativa_ID);
        this.setEvaluacion_parcial_ID(evaluacion_parcial_ID);
        this.setEvaluacion_acumulativa_ID(evaluacion_acumulativa_ID);
    }

    public int getEvaluacion_acumulativa_ID() {
        return evaluacion_acumulativa_ID;
    }

    public void setEvaluacion_acumulativa_ID(int evaluacion_acumulativa_ID) {
        this.evaluacion_acumulativa_ID = evaluacion_acumulativa_ID;
    }

    public int getEvaluacion_parcial_ID() {
        return evaluacion_parcial_ID;
    }

    public void setEvaluacion_parcial_ID(int evaluacion_parcial_ID) {
        this.evaluacion_parcial_ID = evaluacion_parcial_ID;
    }

    public int getEvaluacion_parcial_acumulativa_ID() {
        return evaluacion_parcial_acumulativa_ID;
    }

    public void setEvaluacion_parcial_acumulativa_ID(int evaluacion_parcial_acumulativa_ID) {
        this.evaluacion_parcial_acumulativa_ID = evaluacion_parcial_acumulativa_ID;
    }

    @Override
    public String toString()
    {
        String regresa="";
        StringBuilder sb=new StringBuilder();
        sb.append("evaluacion_parcial_acumulativa_ID").append(getEvaluacion_acumulativa_ID()).append("], ");
        sb.append("evaluacion_parcial_ID").append(getEvaluacion_parcial_ID()).append("], ");
        sb.append("evaluacion_acumulativa_ID").append( getEvaluacion_parcial_acumulativa_ID()).append("], ");
        regresa  = sb.toString();
        return regresa;

    }

}
