/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;
import MovimientosBD.ConexionBD;
import java.sql.*;

public class TrEstrategiaAlumno {
    private int estrategia_id;
    private int alumno_id;
    private int usuario_id;

    public TrEstrategiaAlumno() {
    }

    public TrEstrategiaAlumno(int estrategia_id, int alumno_id, int usuario_id) {
        this.estrategia_id = estrategia_id;
        this.alumno_id = alumno_id;
        this.usuario_id = usuario_id;
    }


    public int getAlumno_id() {
        return alumno_id;
    }
    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }
    public int getEstrategia_id() {
        return estrategia_id;
    }
    public void setEstrategia_id(int estrategia_id) {
        this.estrategia_id = estrategia_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

}
