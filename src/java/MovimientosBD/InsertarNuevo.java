/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MovimientosBD;

import clases.TrEvaluacionParcial;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sands
 */
public class InsertarNuevo {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public InsertarNuevo() {
        ConexionBD nuevaConexion = new ConexionBD();
        nuevaConexion.conectarBD("root", "13450811");
        this.setCon(nuevaConexion.getCon());
    }

    public boolean insertarNuevaEvaluacionParcial(TrEvaluacionParcial eva){
        Statement stmt = null;
        try {
            String SQL = "insert into Tr_Evaluacion_Parcial(Calificacion,Parcial,Evaluacion_Nivel_ID,Tipo_Evaluacion_ID,Sesion_ID,Alumnos_ID) ".toLowerCase()
                    + "VALUES("+eva.getCalificacion()+","+eva.getParcial()+","+eva.getEvaluacion_nivel_ID()+","+eva.getTipo_evaluacion_ID()+","+eva.getMaestro_materia_grupo_sesion_ID()+","+eva.getAlumnos_ID()+")" ;
            stmt = con.createStatement();
            stmt.execute(SQL);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InsertarNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
