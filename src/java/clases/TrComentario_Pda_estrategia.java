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
public class TrComentario_Pda_estrategia
{
    private int coment_Estra_DPA_ID;
    private int estrategia_ID;

    public TrComentario_Pda_estrategia(int coment_Estra_DPA_ID, int estrategia_ID){
        this.setComent_Estra_DPA_ID(coment_Estra_DPA_ID);
        this.setEstrategia_ID(estrategia_ID);
        
    }

    /**
     * @return the coment__Estra_DPA_ID
     */
    public int getComent_Estra_DPA_ID() {
        return coment_Estra_DPA_ID;
    }

    /**
     * @param coment__Estra_DPA_ID the coment__Estra_DPA_ID to set
     */
    public void setComent_Estra_DPA_ID(int coment_Estra_DPA_ID) {
        this.coment_Estra_DPA_ID = coment_Estra_DPA_ID;
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

    public TrComentario_Pda_estrategia obtenerComentario_Pda_estrategia (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrComentario_Pda_estrategia cpe = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Comentario_Pda_Estrategia WHERE Coment_Estra_DPA_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cpe = new TrComentario_Pda_estrategia(rs.getInt("Coment_Estra_DPA_ID"), rs.getInt("Estrategia_ID"));
            }
            return cpe;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

}
