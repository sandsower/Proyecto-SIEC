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
public class TrPreSesionRechazada {

    private int sesion_Rechazada_Id;
    private String mensaje;
    private int preSesionId;

    public TrPreSesionRechazada(int sesion_Rechazada_Id, String mensaje, int preSesionId) {
        this.sesion_Rechazada_Id = sesion_Rechazada_Id;
        this.mensaje = mensaje;
        this.preSesionId = preSesionId;
    }

    /**
     * @return the sesion_Rechazada
     */
    public int getSesion_Rechazada() {
        return sesion_Rechazada_Id;
    }

    /**
     * @param sesion_Rechazada the sesion_Rechazada to set
     */
    public void setSesion_Rechazada(int sesion_Rechazada) {
        this.sesion_Rechazada_Id = sesion_Rechazada;
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

    public int getPreSesionId() {
        return preSesionId;
    }

    public void setPreSesionId(int preSesionId) {
        this.preSesionId = preSesionId;
    }

    @Override
    public String toString() {
        String regresa = "";
        StringBuilder sb = new StringBuilder();
        sb.append("sesion_Rechazada [").append(getSesion_Rechazada()).append("], ");
        sb.append("mensaje [").append(getMensaje()).append("], ");
        sb.append("PreSesionId [").append(getPreSesionId()).append("], ");
        regresa = sb.toString();
        return regresa;

    }
//    public static void main(String []args){
//        TrPreSesionRechazada ses = new TrPreSesionRechazada(1,"mensaje",1);
//        ses.toString();
//    }
}
