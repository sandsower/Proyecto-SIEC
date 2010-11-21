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
public class TrEvaluacionParcial {
    private int evaluacion_parcial_ID;
    private int calificacion;
    private int parcial;
    private int evaluacion_nivel_ID;
    private int tipo_evaluacion_ID;
    private int maestro_materia_grupo_sesion_ID;
    private int alumnos_ID;

    public TrEvaluacionParcial(int evaluacion_parcial_ID, int calificacion, int parcial, int evaluacion_nivel_ID, int tipo_evaluacion_ID, int maestro_materia_grupo_sesion_ID, int alumnos_ID){
        this.setAlumnos_ID(alumnos_ID);
        this.setCalificacion(calificacion);
        this.setEvaluacion_nivel_ID(evaluacion_nivel_ID);
        this.setEvaluacion_parcial_ID(evaluacion_parcial_ID);
        this.setMaestro_materia_grupo_sesion_ID(maestro_materia_grupo_sesion_ID);
        this.setParcial(parcial);
        this.setTipo_evaluacion_ID(tipo_evaluacion_ID);
    }

    public int getAlumnos_ID() {
        return alumnos_ID;
    }

    public void setAlumnos_ID(int alumnos_ID) {
        this.alumnos_ID = alumnos_ID;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getEvaluacion_nivel_ID() {
        return evaluacion_nivel_ID;
    }

    public void setEvaluacion_nivel_ID(int evaluacion_nivel_ID) {
        this.evaluacion_nivel_ID = evaluacion_nivel_ID;
    }

    public int getEvaluacion_parcial_ID() {
        return evaluacion_parcial_ID;
    }

    public void setEvaluacion_parcial_ID(int evaluacion_parcial_ID) {
        this.evaluacion_parcial_ID = evaluacion_parcial_ID;
    }

    public int getMaestro_materia_grupo_sesion_ID() {
        return maestro_materia_grupo_sesion_ID;
    }

    public void setMaestro_materia_grupo_sesion_ID(int maestro_materia_grupo_sesion_ID) {
        this.maestro_materia_grupo_sesion_ID = maestro_materia_grupo_sesion_ID;
    }

    public int getParcial() {
        return parcial;
    }

    public void setParcial(int parcial) {
        this.parcial = parcial;
    }

    public int getTipo_evaluacion_ID() {
        return tipo_evaluacion_ID;
    }

    public void setTipo_evaluacion_ID(int tipo_evaluacion_ID) {
        this.tipo_evaluacion_ID = tipo_evaluacion_ID;
    }

    @Override
    public String toString()
    {
        String regresa="";
        StringBuilder sb=new StringBuilder();
        sb.append("evaluacion_parcial_ID").append(getEvaluacion_parcial_ID()).append("], ");
        sb.append("calificacion").append(getCalificacion()).append("], ");
        sb.append("parcial").append(getParcial()).append("], ");
        sb.append("evaluacion_nivel_ID").append(getEvaluacion_nivel_ID()).append("], ");
        sb.append("tipo_evaluacion_ID").append(getTipo_evaluacion_ID()).append("], ");
        sb.append("maestro_materia_grupo_sesion_ID").append(getMaestro_materia_grupo_sesion_ID()).append("], ");
        sb.append("alumnos_ID").append(getAlumnos_ID()).append("], ");
        regresa  = sb.toString();
        return regresa;

    }
}
