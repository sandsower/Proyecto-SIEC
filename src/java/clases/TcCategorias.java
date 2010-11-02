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
public class TcCategorias
{
    private int categoria_ID;
    private String des_categoria;
    private String descripcion;
    private int orden;

    public TcCategorias(int categoria_ID, String des_categoria, String descripcion, int orden ){
        this.setCategoria_ID(categoria_ID);
        this.setDes_categoria(des_categoria);
        this.setDescripcion(descripcion);
        this.setOrden(orden);
    }

    /**
     * @return the ctegoria_ID
     */
    public int getCategoria_ID() {
        return categoria_ID;
    }

    /**
     * @param ctegoria_ID the ctegoria_ID to set
     */
    public void setCategoria_ID(int ctegoria_ID) {
        this.categoria_ID = ctegoria_ID;
    }

    /**
     * @return the des_categoria
     */
    public String getDes_categoria() {
        return des_categoria;
    }

    /**
     * @param des_categoria the des_categoria to set
     */
    public void setDes_categoria(String des_categoria) {
        this.des_categoria = des_categoria;
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
     * @return the orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("categoria_ID").append(getCategoria_ID()).append("], ");
        sb.append("des_categoria").append(getDes_categoria()).append("], ");
        sb.append("descripcion").append(getDescripcion()).append("], ");
        sb.append("orden").append(getOrden()).append("], ");
        return sb.toString();
    }

}
