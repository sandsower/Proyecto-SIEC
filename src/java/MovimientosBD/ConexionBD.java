/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MovimientosBD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandsower
 */
public class ConexionBD {

    @Override
    public String toString() {
        return "ConexionBD{" + "con=" + con + '}';
    }

    private Connection con;

    public void conectarBD(String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:8889/siec?user=" + username + "&password=" + password;
            Connection theCon = DriverManager.getConnection(connectionUrl);
            this.setCon(theCon);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found Exception: " + e.toString());
        }
    }

    public void cerrarCon() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("SQL Exception:" + ex.toString());
        }
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }
}
