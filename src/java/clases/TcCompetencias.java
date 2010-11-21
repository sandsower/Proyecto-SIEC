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
public class TcCompetencias
{
    private int competencia_ID;
    private String des_Competencia;
    private String descripcion;
    private int categoria_ID;

    public TcCompetencias(int competencia_ID, String des_Competencia, String descripcion, int categoria_ID){
        this.setCategoria_ID(categoria_ID);
        this.setCompetencia_ID(competencia_ID);
        this.setDes_Competencia(des_Competencia);
        this.setDescripcion(descripcion);
    }
    /**
     * @return the competencia_ID
     */
    public int getCompetencia_ID() {
        return competencia_ID;
    }

    /**
     * @param competencia_ID the competencia_ID to set
     */
    public void setCompetencia_ID(int competencia_ID) {
        this.competencia_ID = competencia_ID;
    }

    /**
     * @return the des_Competencia
     */
    public String getDes_Competencia() {
        return des_Competencia;
    }

    /**
     * @param des_Competencia the des_Competencia to set
     */
    public void setDes_Competencia(String des_Competencia) {
        this.des_Competencia = des_Competencia;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the categoria_ID
     */
    public int getCategoria_ID() {
        return categoria_ID;
    }

    /**
     * @param categoria_ID the categoria_ID to set
     */
    public void setCategoria_ID(int categoria_ID) {
        this.categoria_ID = categoria_ID;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("competencia_ID").append(getCompetencia_ID()).append("], ");
        sb.append("des_Competencia").append(getDes_Competencia()).append("], ");
        sb.append("descripcion").append(getDescripcion()).append("], ");
        sb.append("categoria_ID").append(getCategoria_ID()).append("], ");
        return sb.toString();
    }
 
}
