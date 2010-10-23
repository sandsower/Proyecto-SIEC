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
    private String Maestro_ID;
    private int maestros_Maestro_ID;
    private int evaluacion;

    public TrEstrategias(int estrategia_ID,String fecha_Inicio_Registro, String mensaje, String Maestro_ID, int maestros_Maestro_ID, int evaluacion ){
        this.setEstrategia_ID(estrategia_ID);
        this.setEvaluacion(evaluacion);
        this.setMaestro_ID(Maestro_ID);
        this.setFecha_Inicio_Registro(fecha_Inicio_Registro);
        this.setMaestros_Maestro_ID(maestros_Maestro_ID);
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
    public String getMaestro_ID() {
        return Maestro_ID;
    }

    /**
     * @param Maestro_ID the Maestro_ID to set
     */
    public void setMaestro_ID(String Maestro_ID) {
        this.Maestro_ID = Maestro_ID;
    }

    /**
     * @return the maestros_Maestro_ID
     */
    public int getMaestros_Maestro_ID() {
        return maestros_Maestro_ID;
    }

    /**
     * @param maestros_Maestro_ID the maestros_Maestro_ID to set
     */
    public void setMaestros_Maestro_ID(int maestros_Maestro_ID) {
        this.maestros_Maestro_ID = maestros_Maestro_ID;
    }

    /**
     * @return the evaluacion
     */
    public int getEvaluacion() {
        return evaluacion;
    }

    /**
     * @param evaluacion the evaluacion to set
     */
    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
    }

    public TrEstrategias obtenerEstrategia (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrEstrategias est = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Comentario_Pda_Estrategia WHERE Coment_Estra_DPA_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                est = new TrEstrategias(rs.getInt("Estrategia_ID"), rs.getString("Fecha_Inicio_Registro"), rs.getString("Mensaje"), rs.getString("Maestro_ID"), rs.getInt("Maestros_Maestro_ID"), rs.getInt("Evaluacion"));
            }
            return est;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
