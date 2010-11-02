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
public class TrMaestros
{
    private int Maestro_ID;
    private String codigo;
    private int usuario_ID;

    public TrMaestros(int Maestro_ID, String codigo, int usuario_ID){
        this.setCodigo(codigo);
        this.setMaestro_ID(Maestro_ID);
        this.setUsuario_ID(usuario_ID);
    }

    /**
     * @return the Maestro_ID
     */
    public int getMaestro_ID() {
        return Maestro_ID;
    }

    /**
     * @param Maestro_ID the Maestro_ID to set
     */
    public void setMaestro_ID(int Maestro_ID) {
        this.Maestro_ID = Maestro_ID;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString()
    {
        String regresa="";
        StringBuilder sb=new StringBuilder();
        sb.append("Maestro_ID").append(getMaestro_ID()).append("], ");
        sb.append("codigo").append(getCodigo()).append("], ");
        sb.append("usuario_ID").append(getUsuario_ID()).append("], ");
        regresa  = sb.toString();
        return regresa;

    }
}
