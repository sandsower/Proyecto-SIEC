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
public class TrMaestroMateria
{
    private int maestro_Materia_ID;
    private int materia_ID;
    private int maestro_ID;

    public TrMaestroMateria(int maestro_Materia_ID,int materia_ID, int maestro_ID){
        this.setMaestro_Materia_ID(maestro_Materia_ID);
        this.setMaestro_ID(maestro_ID);
        this.setMateria_ID(materia_ID);
    }
    /**
     * @return the maestro_Materia_ID
     */
    public int getMaestro_Materia_ID() {
        return maestro_Materia_ID;
    }

    /**
     * @param maestro_Materia_ID the maestro_Materia_ID to set
     */
    public void setMaestro_Materia_ID(int maestro_Materia_ID) {
        this.maestro_Materia_ID = maestro_Materia_ID;
    }

    /**
     * @return the materias_Materias_ID
     */
    public int getMateria_ID() {
        return materia_ID;
    }

    /**
     * @param materias_Materias_ID the materias_Materias_ID to set
     */
    public void setMateria_ID(int materia_ID) {
        this.materia_ID = materia_ID;
    }

    /**
     * @return the Maestros_Maestro_ID
     */
    public int getMaestro_ID() {
        return maestro_ID;
    }

    /**
     * @param Maestros_Maestro_ID the Maestros_Maestro_ID to set
     */
    public void setMaestro_ID(int maestro_ID) {
        this.maestro_ID = maestro_ID;
    }

    @Override
    public String toString()
    {
        String regresa="";
        StringBuilder sb=new StringBuilder();
        sb.append("maestro_Materia_ID").append(getMaestro_Materia_ID()).append("], ");
        sb.append("materia_ID").append( getMateria_ID()).append("], ");
        sb.append("maestro_ID").append(getMaestro_ID()).append("], ");
        regresa  = sb.toString();
        return regresa;

    }
}