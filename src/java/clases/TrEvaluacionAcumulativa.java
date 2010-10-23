/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;

/**
 *
 * @author Jane
 */
public class TrEvaluacionAcumulativa {
    private int evaluacion_acumulativa_ID;
    private int parcial;
    private int calificacion;

    public TrEvaluacionAcumulativa(int evaluacion_acumulativa_ID, int parcial, int calificacion){
        this.setEvaluacion_acumulativa_ID(evaluacion_acumulativa_ID);
        this.setParcial(parcial);
        this.setCalificacion(calificacion);
    }

    public int getEvaluacion_acumulativa_ID() {
        return evaluacion_acumulativa_ID;
    }

    public void setEvaluacion_acumulativa_ID(int evaluacion_acumulativa_ID) {
        this.evaluacion_acumulativa_ID = evaluacion_acumulativa_ID;
    }

    public int getParcial() {
        return parcial;
    }

    public void setParcial(int parcial) {
        this.parcial = parcial;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public TrEvaluacionAcumulativa obtenerEvaluacionAcumulativa (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrEvaluacionAcumulativa eva = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Acumulativa WHERE Tr_Evaluacion_Acumulativa_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                eva = new TrEvaluacionAcumulativa(rs.getInt("Evaluacion_Acumulativa_ID"), rs.getInt("Parcial"), rs.getInt("Calificacion"));
            }
            return eva;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
