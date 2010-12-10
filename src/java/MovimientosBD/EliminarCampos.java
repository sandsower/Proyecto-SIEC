/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MovimientosBD;
import clases.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
/**
 *
 * @author sands
 */
public class EliminarCampos {

    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public EliminarCampos() {
        ConexionBD nuevaConexion = new ConexionBD();
        nuevaConexion.conectarBD("root", "13450811");
        this.setCon(nuevaConexion.getCon());
    }

    public boolean eliminarEstrategiaById (int id){
            Statement stmt = null;
        try {
            String SQL = "DELETE FROM tr_est_alumno WHERE ESTRATEGIA_ID =".toLowerCase()+id;
            stmt = con.createStatement();
            stmt.execute(SQL);

            SQL = "DELETE FROM tr_estra_mgm WHERE ESTRATEGIA_ID =".toLowerCase()+id;
            stmt = con.createStatement();
            stmt.execute(SQL);

            SQL = "DELETE FROM tr_estrategias WHERE ESTRATEGIA_ID =".toLowerCase()+id;
            stmt = con.createStatement();
            stmt.execute(SQL);

            return true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return false;
    }

}