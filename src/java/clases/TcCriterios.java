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
public class TcCriterios
{
    private int criterio_ID;
    private String des_Criterio;
    private String descripcion;

    public TcCriterios(int criterio_ID, String des_Criterio, String descripcion){
        this.setCriterio_ID(criterio_ID);
        this.setDes_Criterio(des_Criterio);
        this.setDescripcion(descripcion);
    }

    /**
     * @return the criterio_ID
     */
    public int getCriterio_ID() {
        return criterio_ID;
    }

    /**
     * @param criterio_ID the criterio_ID to set
     */
    public void setCriterio_ID(int criterio_ID) {
        this.criterio_ID = criterio_ID;
    }

    /**
     * @return the des_Criterio
     */
    public String getDes_Criterio() {
        return des_Criterio;
    }

    /**
     * @param des_Criterio the des_Criterio to set
     */
    public void setDes_Criterio(String des_Criterio) {
        this.des_Criterio = des_Criterio;
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

    @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("criterio_ID").append(getCriterio_ID()).append("], ");
        sb.append("des_Criterio").append(getDes_Criterio()).append("], ");
        sb.append("descripcion").append(getDescripcion()).append("], ");
        return sb.toString();
    }
  
}
