/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MovimientosBD.Com;
import java.sql.*;

/**
 *
 * @author Sandsower
 */
public class ConexionBD {

    public ConexionBD(){
        this.conectarBD("root", "root");
    }

    private Connection connect = null;

    public final void conectarBD(String username, String password){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:8889/siec?user="+username+"&password="+password;
            Connection con = DriverManager.getConnection(connectionUrl);
            this.setConnect(con);
        }
        catch(SQLException e){
            System.out.println("SQL Exception: "+e.toString());
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found Exception: "+e.toString());
        }
    }

    public void cerrarBD(){
        try {
            connect.close();
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ex.toString());
        }
    }

    /**
     * @return the connect
     */
    public Connection getConnect() {
        return connect;
    }

    /**
     * @param connect the connect to set
     */
    public void setConnect(Connection connect) {
        this.connect = connect;
    }

}