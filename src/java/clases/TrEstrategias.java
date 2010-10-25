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
public class TrEstrategias
{
    private int estrategia_ID;
    private String fecha_Inicio_Registro;
    private String mensaje;
    private int Maestro_ID;
    

    public TrEstrategias(int estrategia_ID,String fecha_Inicio_Registro, String mensaje, int Maestro_ID){
        this.setEstrategia_ID(estrategia_ID);
        this.setMaestro_ID(Maestro_ID);
        this.setFecha_Inicio_Registro(fecha_Inicio_Registro);
        this.setMensaje(mensaje);
    }
    /**
     * @return the estrategia_ID
     */
    public int getEstrategia_ID() {
        return estrategia_ID;
    }

    /**
     * @param estrategia_ID the estrategia_ID to set
     */
    public void setEstrategia_ID(int estrategia_ID) {
        this.estrategia_ID = estrategia_ID;
    }

    /**
     * @return the fecha_Inicio_Registro
     */
    public String getFecha_Inicio_Registro() {
        return fecha_Inicio_Registro;
    }

    /**
     * @param fecha_Inicio_Registro the fecha_Inicio_Registro to set
     */
    public void setFecha_Inicio_Registro(String fecha_Inicio_Registro) {
        this.fecha_Inicio_Registro = fecha_Inicio_Registro;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
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
     * @return the maestros_Maestro_ID
     */
    

    /**
     * @param evaluacion the evaluacion to set
     */
    @Override
             public String toString()
    {
        String regresa="";
        StringBuilder sb=new StringBuilder();
        sb.append("estrategia_ID [").append(getEstrategia_ID()).append("], ");
        sb.append("fecha_Inicio_Registro [").append(getFecha_Inicio_Registro()).append("], ");
        sb.append("mensaje [").append(getMensaje()).append("], ");
        sb.append("Maestro_ID [").append(getMaestro_ID()).append("], ");
        regresa  = sb.toString();
        return regresa;

    }
}
