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
public class TrEvaluacionParcialAcumulativa {
    private int evaluacion_parcial_acumulativa_ID;
    private int evaluacion_parcial_ID;
    private int evaluacion_acumulativa_ID;

    public TrEvaluacionParcialAcumulativa(int evaluacion_parcial_acumulativa_ID, int evaluacion_parcial_ID, int evaluacion_acumulativa_ID){
        this.setEvaluacion_parcial_acumulativa_ID(evaluacion_parcial_acumulativa_ID);
        this.setEvaluacion_parcial_ID(evaluacion_parcial_ID);
        this.setEvaluacion_acumulativa_ID(evaluacion_acumulativa_ID);
    }

    public int getEvaluacion_acumulativa_ID() {
        return evaluacion_acumulativa_ID;
    }

    public void setEvaluacion_acumulativa_ID(int evaluacion_acumulativa_ID) {
        this.evaluacion_acumulativa_ID = evaluacion_acumulativa_ID;
    }

    public int getEvaluacion_parcial_ID() {
        return evaluacion_parcial_ID;
    }

    public void setEvaluacion_parcial_ID(int evaluacion_parcial_ID) {
        this.evaluacion_parcial_ID = evaluacion_parcial_ID;
    }

    public int getEvaluacion_parcial_acumulativa_ID() {
        return evaluacion_parcial_acumulativa_ID;
    }

    public void setEvaluacion_parcial_acumulativa_ID(int evaluacion_parcial_acumulativa_ID) {
        this.evaluacion_parcial_acumulativa_ID = evaluacion_parcial_acumulativa_ID;
    }

    public TrEvaluacionParcialAcumulativa obtenerEvaluacionParcialAcumulativa (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrEvaluacionParcialAcumulativa epa = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Parcial_Acumulativa WHERE Tr_Evaluacion_Parcial_Acumulativa_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                epa = new TrEvaluacionParcialAcumulativa(rs.getInt("Evaluacion_Parcial_Acumulativa_ID"), rs.getInt("Evaluacion_Parcial_ID"), rs.getInt("Evaluacion_Acumulativa_ID"));
            }
            return epa;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

}
