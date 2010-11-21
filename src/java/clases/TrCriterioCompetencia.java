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
public class TrCriterioCompetencia
{
    private int criterioCompetencia_ID;
    private int competencia_ID;
    private int criterio_ID;
    private String ponderacionCriterio;
    

    public TrCriterioCompetencia(int criterio_ID, int criterioCompetencia_ID, int competencia_ID, String ponderacionCriterio){
        this.setCriterio_ID(criterio_ID);
        this.setCompetencia_ID(competencia_ID);
        this.setCriterioCompetencia_ID(criterioCompetencia_ID);
        this.setPonderacionCriterio(ponderacionCriterio);
    }

    /**
     * @return the criterioCompetencia_ID
     */
    public int getCriterioCompetencia_ID() {
        return criterioCompetencia_ID;
    }

    /**
     * @param criterioCompetencia_ID the criterioCompetencia_ID to set
     */
    public void setCriterioCompetencia_ID(int criterioCompetencia_ID) {
        this.criterioCompetencia_ID = criterioCompetencia_ID;
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
     * @return the ponderacionCriterio
     */
    public String getPonderacionCriterio() {
        return ponderacionCriterio;
    }

    /**
     * @param ponderacionCriterio the ponderacionCriterio to set
     */
    public void setPonderacionCriterio(String ponderacionCriterio) {
        this.ponderacionCriterio = ponderacionCriterio;
    }

    @Override
    public String toString(){
        String regresa = "";
        regresa = "Valores de criterioCompetencia: "
                + "Criterio_ID ["+this.getCriterio_ID()+"]\n"
                + "Competencia_ID ["+this.getCompetencia_ID()+"]\n"
                + "Criterio_Competencia_ID ["+this.getCriterioCompetencia_ID()+"]\n"
                + "Ponderacion_Criterio ["+this.getPonderacionCriterio()+"]\n";
        return regresa;
    }
}
