package clases.Competencias;

import MovimientosBD.Com.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Criterios {

    private int id;
    private String nombre;
    private String descripcion;
    private int ponderacion;

    public Criterios(){}
    public Criterios(String xNombre){
    setNombre(xNombre);
    }
    public Criterios(int xId,String xNombre){
    setId(xId);
    setNombre(xNombre);
    }
    public Criterios(String xNombre, String xDescripcion, int xPonderacion){
    setNombre(xNombre);
    setDescripcion(xDescripcion);
    setPonderacion(xPonderacion);
    }
    public Criterios(int xId,String xNombre, String xDescripcion, int xPonderacion){
    setId(xId);
    setNombre(xNombre);
    setDescripcion(xDescripcion);
    setPonderacion(xPonderacion);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPonderacion() {
        return ponderacion;
    }
   public void setPonderacion(int ponderacion) {
        this.ponderacion = ponderacion;
    }
   public int crearCriterio(Criterios elCriterio) throws SQLException{
        ConexionBD connect = new ConexionBD();
        Connection con = connect.getConnect();
        if(con!=null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("Insert into tc_criterios(DES_CRITERIO,DESCRIPCION,PONDERACION)"
                            +  "VALUES(?,?,?)");
                    stmt1.setString(1, this.nombre);
                    stmt1.setString(2, this.descripcion);
                    stmt1.setInt(3, this.ponderacion);
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
   public int eliminarCriterio(String xId){
        int id= Integer.parseInt(xId);
       ConexionBD connect = new ConexionBD();
       Connection con = connect.getConnect();
        if(con!= null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("DELETE FROM tc_criterios WHERE CRITERIO_ID=?");
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
   public int modificarCriterio(Criterios elCriterio) throws SQLException{
        ConexionBD connect = new ConexionBD();
        Connection con = connect.getConnect();
        if(con!=null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("UPDATE tc_criterios SET DES_CRITERIO=?,DESCRIPCION=?,PONDERACION=? WHERE CRITERIO_ID=?");
                    stmt1.setString(1, this.nombre);
                    stmt1.setString(2, this.descripcion);
                    stmt1.setInt(3, this.ponderacion);
                    stmt1.setInt(4, this.id);
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
   public ArrayList obtenerCriterios (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            ArrayList cri = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM tc_Criterios".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cri.add(new Criterios(rs.getInt("Criterio_ID"), rs.getString("Des_Criterio"), rs.getString("Descripcion"),rs.getInt("ponderacion")));
            }
            return cri;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
   public Criterios obtenerCriterio (String xId){
       int id = Integer.parseInt(xId);
        try {
            Statement stmt = null;
            ResultSet rs = null;
            Criterios cri = null;
            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Criterios WHERE Criterio_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cri = new Criterios(rs.getInt("Criterio_ID"), rs.getString("Des_Criterio"), rs.getString("Descripcion"),rs.getInt("Ponderacion"));
            }
            return cri;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
   public ArrayList obtenerCriterioXNombre (String xNombre){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            ArrayList cri = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM tc_Criterios where des_nombre LIKE% "+xNombre+"%";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cri.add(new Criterios(rs.getInt("Criterio_ID"), rs.getString("Des_Criterio"), rs.getString("Descripcion"),rs.getInt("ponderacion")));
            }
            return cri;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

   public ArrayList obtenerCriteriosxCompetencia (int xId){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            ArrayList cri = new ArrayList();
              //SQL query command
            String SQL = "SELECT tc_criterios.CRITERIO_ID, tc_criterios.DES_CRITERIO"+
                        " FROM tc_criterios,tr_criterio_competencia"+
                        " WHERE tc_criterios.CRITERIO_ID = tr_criterio_competencia.CRITERIO_ID "+
                        "AND tr_criterio_competencia.COMPETENCIA_ID=" +xId;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cri.add(new Criterios(rs.getInt("Criterio_ID"), rs.getString("Des_Criterio")));
            }
            return cri;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
   
   @Override
   public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("id[").append(getId()).append("]");
        sb.append("nombre[").append(getNombre()).append("]");
        sb.append("descripcion[").append(getDescripcion()).append("]");
        sb.append("Ponderacion[").append(getPonderacion()).append("]");
        return sb.toString();
    }

    @Override
   protected void finalize() throws Throwable {
        super.finalize();
    }

    


}
