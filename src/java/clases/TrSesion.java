/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author Sandsower
 */
public class TrSesion
{
    private int sesion_ID;
    private String mensaje;
    private int estado;
    private int criterio_Competencia_Criterio_Competencia_ID;
    private int sesion_Rechazada_sesion_Recahzada;
    private String ponderacion;

    /**
     * @return the sesion_ID
     */
    public int getSesion_ID() {
        return sesion_ID;
    }

    /**
     * @param sesion_ID the sesion_ID to set
     */
    public void setSesion_ID(int sesion_ID) {
        this.sesion_ID = sesion_ID;
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
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the criterio_Competencia_Criterio_Competencia_ID
     */
    public int getCriterio_Competencia_Criterio_Competencia_ID() {
        return criterio_Competencia_Criterio_Competencia_ID;
    }

    /**
     * @param criterio_Competencia_Criterio_Competencia_ID the criterio_Competencia_Criterio_Competencia_ID to set
     */
    public void setCriterio_Competencia_Criterio_Competencia_ID(int criterio_Competencia_Criterio_Competencia_ID) {
        this.criterio_Competencia_Criterio_Competencia_ID = criterio_Competencia_Criterio_Competencia_ID;
    }

    /**
     * @return the sesion_Rechazada_sesion_Recahzada
     */
    public int getSesion_Rechazada_sesion_Recahzada() {
        return sesion_Rechazada_sesion_Recahzada;
    }

    /**
     * @param sesion_Rechazada_sesion_Recahzada the sesion_Rechazada_sesion_Recahzada to set
     */
    public void setSesion_Rechazada_sesion_Recahzada(int sesion_Rechazada_sesion_Recahzada) {
        this.sesion_Rechazada_sesion_Recahzada = sesion_Rechazada_sesion_Recahzada;
    }

    /**
     * @return the ponderacion
     */
    public String getPonderacion() {
        return ponderacion;
    }

    /**
     * @param ponderacion the ponderacion to set
     */
    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }
}
