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
public class TrComentarioDPAEstrategia
{
    private int comentarioEstrategiaDPA_ID;
    private int estrategia_ID;

    public TrComentarioDPAEstrategia(int comentarioEstrategiaDPA_ID, int estrategia_ID){
        this.setComentarioEstrategiaDPA_ID(comentarioEstrategiaDPA_ID);
        this.setEstrategia_ID(estrategia_ID);
    }

    public TrComentarioDPAEstrategia obtenerComentarioDPAEstrategia (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrComentarioDPAEstrategia cde = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Comentario_Pda_Estrategia WHERE Coment_Estra_DPA_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cde = new TrComentarioDPAEstrategia(rs.getInt("Coment_Estra_DPA_ID"), rs.getInt("Estrategia_ID"));
            }
            return cde;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    /**
     * @return the ComentarioEstrategiaDPA_ID
     */
    public int getComentarioEstrategiaDPA_ID() {
        return comentarioEstrategiaDPA_ID;
    }

    /**
     * @param ComentarioEstrategiaDPA_ID the ComentarioEstrategiaDPA_ID to set
     */
    public void setComentarioEstrategiaDPA_ID(int comentarioEstrategiaDPA_ID) {
        this.comentarioEstrategiaDPA_ID = comentarioEstrategiaDPA_ID;
    }

    /**
     * @return the Estrategia_ID
     */
    public int getEstrategia_ID() {
        return estrategia_ID;
    }

    /**
     * @param Estrategia_ID the Estrategia_ID to set
     */
    public void setEstrategia_ID(int estrategia_ID) {
        this.estrategia_ID = estrategia_ID;
    }

}
