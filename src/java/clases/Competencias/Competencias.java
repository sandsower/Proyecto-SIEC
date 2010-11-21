/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases.Competencias;

import MovimientosBD.Com.ConexionBD;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author RaiL
 */
public class Competencias {
    private int idCompetencia;
    private String nombre;
    private String descripcion;
    private int idCategoria;

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public int getIdCompetencia() {
        return idCompetencia;
    }
    public void setIdCompetencia(int idCompetencia) {
        this.idCompetencia = idCompetencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Competencias(){}
    public Competencias(String xNombre,String xDescripcion,int xIdCategoria){
        setNombre(xNombre);
        setDescripcion(xDescripcion);
        setIdCategoria(xIdCategoria);
    }
    public Competencias(int xIdCompetencia,String xNombre,String xDescripcion,int xIdCategoria){
        setIdCompetencia(xIdCompetencia);
        setNombre(xNombre);
        setDescripcion(xDescripcion);
        setIdCategoria(xIdCategoria);
    }


    public int crearCompetencia(Competencias laCompetencia) throws SQLException{
        ConexionBD connect = new ConexionBD();
        Connection con = connect.getConnect();
        if(con!=null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("Insert into tc_competencias(DES_COMPETENCIA,DESCRIPCION,CATEGORIA_ID)"
                            +  "VALUES(?,?,?)");
                    stmt1.setString(1, this.nombre);
                    stmt1.setString(2, this.descripcion);
                    stmt1.setInt(3, this.idCategoria);
                    System.out.println(stmt1.toString());
                int rows_updated = stmt1.executeUpdate();
            con.close();
            return rows_updated;
             }
            catch (SQLException ex) {
                System.out.println("SQL Exception: "+ ex.toString());
            }
        }
        return 0;
    }
   public int eliminarCompetencia(String xId){
        int id= Integer.parseInt(xId);
       ConexionBD connect = new ConexionBD();
       Connection con = connect.getConnect();
        if(con!= null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("DELETE FROM tc_competencias WHERE competencia_ID=?");
                 stmt1.setInt(1, id);
                 int rows_updated = stmt1.executeUpdate();
            con.close();
            return rows_updated;


             }
            catch (SQLException ex) {
                System.out.println("SQL Exception: "+ ex.toString());
            }

        }
        return 0;
    }
    public int modificarCompetencia(Competencias laCompetencia) throws SQLException{
        ConexionBD connect = new ConexionBD();
        Connection con = connect.getConnect();
        if(con!=null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("UPDATE tc_competencias SET DES_COMPETENCIA=?,DESCRIPCION=?,CATEGORIA_ID=? WHERE COMPETENCIA_ID=?");
                    stmt1.setString(1, this.nombre);
                    stmt1.setString(2, this.descripcion);
                    stmt1.setInt(3, this.idCategoria);
                    stmt1.setInt(4, this.idCompetencia);
                int rows_updated = stmt1.executeUpdate();
            con.close();
            return rows_updated;
             }
            catch (SQLException ex) {
                System.out.println("SQL Exception: "+ ex.toString());
            }


        }
        return 0;
    }
    public ArrayList obtenerCompetencias (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            ArrayList com = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM tc_competencias".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                com.add(new Competencias(rs.getInt("COMPETENCIA_ID"), rs.getString("DES_COMPETENCIA"), rs.getString("DESCRIPCION"),rs.getInt("CATEGORIA_ID")));
            }
            return com;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
    public Competencias obtenerCompetencia (int xId){
       
        try {
            Statement stmt = null;
            ResultSet rs = null;
            Competencias com= null;
            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            //SQL query command
            String SQL = "SELECT * FROM tc_competencias WHERE competencia_id=".toLowerCase()+xId;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                com = new Competencias(rs.getInt("Competencia_id"), rs.getString("Des_Competencia"), rs.getString("Descripcion"),rs.getInt("categoria_id"));
            }
            return com;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("id[").append(getIdCompetencia()).append("]");
        sb.append("nombre[").append(getNombre()).append("]");
        sb.append("descripcion[").append(getDescripcion()).append("]");
        sb.append("IdCategoria[").append(getIdCompetencia()).append("]");
        return sb.toString();
    }
    @Override
        protected void finalize() throws Throwable {
        super.finalize();
    }

}
