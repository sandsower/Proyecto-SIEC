
package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;

public class TcTipoEvaluacion {
    private  int tipoEvaluacion_ID;
    private String desTipoEvaluacion;

     public TcTipoEvaluacion(int tipoEvaluacion_ID,String desTipoEvaluacion)
    {
       this.setDesTipoEvaluacion(desTipoEvaluacion);
       this.setTipoEvaluacion_ID(tipoEvaluacion_ID);
    }

    /**
     * @return the tipoEvaluacion_ID
     */
    public int getTipoEvaluacion_ID() {
        return tipoEvaluacion_ID;
    }

    /**
     * @param tipoEvaluacion_ID the tipoEvaluacion_ID to set
     */
    public void setTipoEvaluacion_ID(int tipoEvaluacion_ID) {
        this.tipoEvaluacion_ID = tipoEvaluacion_ID;
    }

    /**
     * @return the desTipoEvaluacion
     */
    public String getDesTipoEvaluacion() {
        return desTipoEvaluacion;
    }

    /**
     * @param desTipoEvaluacion the desTipoEvaluacion to set
     */
    public void setDesTipoEvaluacion(String desTipoEvaluacion) {
        this.desTipoEvaluacion = desTipoEvaluacion;
    }

    @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipoEvaluacion_ID").append(getTipoEvaluacion_ID()).append("], ");
        sb.append("desTipoEvaluacion").append(getDesTipoEvaluacion()).append("], ");
        return sb.toString();
    }
}
