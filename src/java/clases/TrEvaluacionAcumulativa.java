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
public class TrEvaluacionAcumulativa {
    private int evaluacion_acumulativa_ID;
    private int parcial;
    private int calificacion;

    public TrEvaluacionAcumulativa(int evaluacion_acumulativa_ID, int parcial, int calificacion){
        this.setEvaluacion_acumulativa_ID(evaluacion_acumulativa_ID);
        this.setParcial(parcial);
        this.setCalificacion(calificacion);
    }

    public int getEvaluacion_acumulativa_ID() {
        return evaluacion_acumulativa_ID;
    }

    public void setEvaluacion_acumulativa_ID(int evaluacion_acumulativa_ID) {
        this.evaluacion_acumulativa_ID = evaluacion_acumulativa_ID;
    }

    public int getParcial() {
        return parcial;
    }

    public void setParcial(int parcial) {
        this.parcial = parcial;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
}
