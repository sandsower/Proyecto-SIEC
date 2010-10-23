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
public class TcGrupo
{
    private int grupo_ID;
    private String des_Grupo;
    private int carrera_ID;
    private String cuatrimestre;
    private String letra;

    public TcGrupo(int grupo_ID, String des_Grupo, int carrera_ID, String cuatrimestr, String letra){
        this.setCarrera_ID(carrera_ID);
        this.setCuatrimestre(cuatrimestre);
        this.setDes_Grupo(des_Grupo);
        this.setGrupo_ID(grupo_ID);
        this.setLetra(letra);
    }
    /**
     * @return the grupo_ID
     */
    public int getGrupo_ID() {
        return grupo_ID;
    }

    /**
     * @param grupo_ID the grupo_ID to set
     */
    public void setGrupo_ID(int grupo_ID) {
        this.grupo_ID = grupo_ID;
    }

    /**
     * @return the des_Grupo
     */
    public String getDes_Grupo() {
        return des_Grupo;
    }

    /**
     * @param des_Grupo the des_Grupo to set
     */
    public void setDes_Grupo(String des_Grupo) {
        this.des_Grupo = des_Grupo;
    }

    /**
     * @return the carrera_ID
     */
    public int getCarrera_ID() {
        return carrera_ID;
    }

    /**
     * @param carrera_ID the carrera_ID to set
     */
    public void setCarrera_ID(int carrera_ID) {
        this.carrera_ID = carrera_ID;
    }

    /**
     * @return the cuatrimestre
     */
    public String getCuatrimestre() {
        return cuatrimestre;
    }

    /**
     * @param cuatrimestre the cuatrimestre to set
     */
    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    /**
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }

    public TcGrupo obtenerGrupo (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TcGrupo grp = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Grupo WHERE Grupo_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                grp = new TcGrupo(rs.getInt("Grupo_ID"), rs.getString("Des_Grupo"), rs.getInt("Carrera_ID"), rs.getString("Cuatrimestre"), rs.getString("Letra"));
            }
            return grp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
