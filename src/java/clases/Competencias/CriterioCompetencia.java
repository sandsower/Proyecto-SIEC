/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases.Competencias;
import MovimientosBD.Com.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garrison
 */
public class CriterioCompetencia {

    private int idCriterioCompetencia;
    private int idCriterio;
    private int idCompetencia;

    public CriterioCompetencia(){}
    public CriterioCompetencia(int xIdCriterio, int xIdCompetencia){
        setIdCriterio(xIdCriterio);
        setIdCompetencia(xIdCompetencia);

    }
    public CriterioCompetencia(int xId,int xIdCriterio, int xIdCompetencia){
        setIdCriterioCompetencia(xId);
        setIdCriterio(xIdCriterio);
        setIdCompetencia(xIdCompetencia);
    }
    public int getIdCompetencia() {
        return idCompetencia;
    }
    public void setIdCompetencia(int idCompetencia) {
        this.idCompetencia = idCompetencia;
    }
    public int getIdCriterio() {
        return idCriterio;
    }
    public void setIdCriterio(int idCriterio) {
        this.idCriterio = idCriterio;
    }
    public int getIdCriterioCompetencia() {
        return idCriterioCompetencia;
    }
    public void setIdCriterioCompetencia(int idCriterioCompetencia) {
        this.idCriterioCompetencia = idCriterioCompetencia;
    }
    public ArrayList obtenerCriterioxCompetencia(int xId){
        
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ConexionBD connect = new ConexionBD();
            Connection con = connect.getConnect();
            ArrayList cc = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM tr_criterio_competencia where competencia_id = "+xId;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cc.add(new CriterioCompetencia(rs.getInt("CRITERIO_COMPETENCIA_ID"), rs.getInt("CRITERIO_ID"), rs.getInt("COMPETENCIA_ID")));
            }
            return cc;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;

   }
    public int crearCriterioCompetencia(int idCompetencia, int idCriterio) {
        ConexionBD connect = new ConexionBD();
        Connection con = connect.getConnect();
        if(con!=null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("Insert into tr_criterio_competencia(competencia_id,criterio_id)"
                            +  "VALUES(?,?)");
                    stmt1.setInt(1, idCompetencia);
                    stmt1.setInt(2, idCriterio);

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
    public int eliminarCriterio(int xIdCriterio, int xIdCompetencia){

       ConexionBD connect = new ConexionBD();
       Connection con = connect.getConnect();
        if(con!= null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("DELETE FROM tr_criterio_competencia WHERE CRITERIO_ID=? AND COMPETENCIA_ID = ?");
                 stmt1.setInt(1, xIdCriterio);
                 stmt1.setInt(2,xIdCompetencia);
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
}