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
public class TrAlumnos
{
    private int alumnos_ID;
    private String matricula;
    private int usuario_ID;
    private int grupo_ID;
    private int carrera_ID;

    public TrAlumnos(int alumnos_ID,String matricula, int usuario_ID, int grupo_ID, int carrera_ID){
        this.setAlumnos_ID(alumnos_ID);
        this.setCarrera_ID(carrera_ID);
        this.setGrupo_ID(grupo_ID);
        this.setMatricula(matricula);
        this.setUsuario_ID(usuario_ID);
        
    }
    /**
     * @return the alumnos_ID
     */
    public int getAlumnos_ID() {
        return alumnos_ID;
    }

    /**
     * @param alumnos_ID the alumnos_ID to set
     */
    public void setAlumnos_ID(int alumnos_ID) {
        this.alumnos_ID = alumnos_ID;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the usuario_ID
     */
    public int getUsuario_ID() {
        return usuario_ID;
    }

    /**
     * @param usuario_ID the usuario_ID to set
     */
    public void setUsuario_ID(int usuario_ID) {
        this.usuario_ID = usuario_ID;
    }

    /**
     * @return the grupo_ID
     */
    public int getGrupo_ID() {
        return grupo_ID;
    }

    /**
     * @param grupo_ID the grupo_ID to set
     */
    public void setGrupo_ID(int grupo_ID) {
        this.grupo_ID = grupo_ID;
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
    public void setCarrera_ID(int carrera_ID) {
        this.carrera_ID = carrera_ID;
    }

     public String toString() {
        String regresa = "";
        StringBuilder sb = new StringBuilder();
        sb.append("alumnos_ID").append(getAlumnos_ID()).append("], ");
        sb.append("matricula").append(getMatricula()).append("], ");
        sb.append("usuario_ID").append(getUsuario_ID()).append("], ");
        sb.append("grupo_ID").append(getGrupo_ID()).append("], ");
        sb.append("carrera_ID").append(getCarrera_ID()).append("], ");
        return regresa;
    }
     
}
