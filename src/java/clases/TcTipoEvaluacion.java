
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

    public TcTipoEvaluacion obtenerTipoEvaluacion (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcTipoEvaluacion tev = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Tipo_Evaluacion WHERE Tipo_Evaluacion_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                tev = new TcTipoEvaluacion(rs.getInt("Tipo_Evaluacion_ID"), rs.getString("Des_Tipo_Evaluacion"));
            }
            return tev;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
   
}
