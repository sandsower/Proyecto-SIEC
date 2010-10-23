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
public class TrUsuario
{
    private int usuario_ID;
    private String Nombres;
    private String Apellidos;
    private String fecha_Nac;
    private String usuario;
    private String password;
    private int perfil_ID;

    public TrUsuario(int usuario_ID,String Nombres, String Apellidos, String fecha_Nac, String usuario, String password, int perfil_ID){
        this.setApellidos(Apellidos);
        this.setFecha_Nac(fecha_Nac);
        this.setNombres(Nombres);
        this.setPassword(password);
        this.setPerfil_ID(perfil_ID);
        this.setUsuario(usuario);
        this.setUsuario_ID(usuario_ID);
    }

    /**
     * @return the usuario_ID
     */
    public int getUsuario_ID() {
        return usuario_ID;
    }

    /**
     * @param usuario_ID the usuario_ID to set
     */
    public void setUsuario_ID(int usuario_ID) {
        this.usuario_ID = usuario_ID;
    }

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the fecha_Nac
     */
    public String getFecha_Nac() {
        return fecha_Nac;
    }

    /**
     * @param fecha_Nac the fecha_Nac to set
     */
    public void setFecha_Nac(String fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the perfil_ID
     */
    public int getPerfil_ID() {
        return perfil_ID;
    }

    /**
     * @param perfil_ID the perfil_ID to set
     */
    public void setPerfil_ID(int perfil_ID) {
        this.perfil_ID = perfil_ID;
    }

     public TrUsuario obtenerUsuario (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrUsuario usr = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Usuario WHERE Tr_Usuario_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                usr = new TrUsuario(rs.getInt("Usuario_ID"), rs.getString("Nombres"), rs.getString("Apellidos"), rs.getString("Fecha_Nac"), rs.getString("Usuario"), rs.getString("Password"), rs.getInt("Perfil_ID"));
            }
            return usr;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
