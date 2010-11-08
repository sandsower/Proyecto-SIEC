/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases.Competencias;

import MovimientosBD.Com.ConexionBD;
import java.sql.*;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author garrison
 */
public class Categorias {
    private int idCategoria;
    private String nombre;
    private String descripcion;
    private int orden;

    public Categorias(){}
    public Categorias(int xIdCategoria,String xNombre){
    setIdCategoria(xIdCategoria);
    setNombre(xNombre);
    }
    public Categorias(String xNombre,String xDescripcion,int xIdOrden){}
    public Categorias(int xIdCategoria,String xNombre,String xDescripcion,int xIdOrden){}

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
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getOrden() {
        return orden;
    }
    public void setOrden(int orden) {
        this.orden = orden;
    }

    public ArrayList obtenerCategorias (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            ArrayList cat = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM tc_categorias".toLowerCase();
            stmt = (Statement) con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cat.add(new Categorias(rs.getInt("Categoria_id"), rs.getString("Des_Categoria")));
            }
            return cat;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    @Override
   public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("id[").append(getIdCategoria()).append("]");
        sb.append("nombre[").append(getNombre()).append("]");
        sb.append("descripcion[").append(getDescripcion()).append("]");
        sb.append("orden[").append(getOrden()).append("]");
        return sb.toString();
    }

    @Override
   protected void finalize() throws Throwable {
        super.finalize();
    }


}
