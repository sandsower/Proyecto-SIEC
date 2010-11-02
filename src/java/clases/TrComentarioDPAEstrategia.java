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
public class TrComentarioDPAEstrategia
{
    private int comentarioEstrategiaDPA_ID;
    private int estrategia_ID;

    public TrComentarioDPAEstrategia(int comentarioEstrategiaDPA_ID, int estrategia_ID){
        this.setComentarioEstrategiaDPA_ID(comentarioEstrategiaDPA_ID);
        this.setEstrategia_ID(estrategia_ID);
    }

    

    /**
     * @return the ComentarioEstrategiaDPA_ID
     */
    public int getComentarioEstrategiaDPA_ID() {
        return comentarioEstrategiaDPA_ID;
    }

    /**
     * @param ComentarioEstrategiaDPA_ID the ComentarioEstrategiaDPA_ID to set
     */
    public void setComentarioEstrategiaDPA_ID(int comentarioEstrategiaDPA_ID) {
        this.comentarioEstrategiaDPA_ID = comentarioEstrategiaDPA_ID;
    }

    /**
     * @return the Estrategia_ID
     */
    public int getEstrategia_ID() {
        return estrategia_ID;
    }

    /**
     * @param Estrategia_ID the Estrategia_ID to set
     */
    public void setEstrategia_ID(int estrategia_ID) {
        this.estrategia_ID = estrategia_ID;
    }

    @Override
      public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("comentarioEstrategiaDPA_ID").append(getComentarioEstrategiaDPA_ID()).append("], ");
        sb.append("estrategia_ID").append(getEstrategia_ID()).append("], ");
        return sb.toString();
    }

}
