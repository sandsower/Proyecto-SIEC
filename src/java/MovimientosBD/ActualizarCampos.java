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
public class ActualizarCampos {

    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public ActualizarCampos() {
        ConexionBD nuevaConexion = new ConexionBD();
        nuevaConexion.conectarBD("root", "13450811");
        this.setCon(nuevaConexion.getCon());
    }

    public boolean actualizarEvaluacionParcial(TrEvaluacionParcial eva){
        Statement stmt = null;
        try {
            String SQL = "update Tr_Evaluacion_Parcial SET Calificacion=".toLowerCase()+eva.getCalificacion()+",Parcial="+eva.getParcial()+",Evaluacion_Nivel_ID="+eva.getEvaluacion_nivel_ID()+",Tipo_Evaluacion_ID="+eva.getTipo_evaluacion_ID()+",Sesion_ID="+eva.getMaestro_materia_grupo_sesion_ID()+",Alumnos_ID="+eva.getAlumnos_ID()
                    + "WHERE Evaluacion_Parcial_ID=".toLowerCase()+eva.getEvaluacion_parcial_ID();
            stmt = con.createStatement();
            stmt.execute(SQL);
            return true;
        } catch (SQLException ex) {
            
        }
        return false;
    }

}
