/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author sands
 */
public class TrGrupoAlumno {
    private int GrupoAlumno_ID;
    private int Grupo_ID;
    private int Alumno_ID;

    public TrGrupoAlumno(int GrupoAlumno_ID, int Grupo_ID, int Alumno_ID) {
        this.GrupoAlumno_ID = GrupoAlumno_ID;
        this.Grupo_ID = Grupo_ID;
        this.Alumno_ID = Alumno_ID;
    }

    public int getAlumno_ID() {
        return Alumno_ID;
    }

    public void setAlumno_ID(int Alumno_ID) {
        this.Alumno_ID = Alumno_ID;
    }

    public int getGrupoAlumno_ID() {
        return GrupoAlumno_ID;
    }

    public void setGrupoAlumno_ID(int GrupoAlumno_ID) {
        this.GrupoAlumno_ID = GrupoAlumno_ID;
    }

    public int getGrupo_ID() {
        return Grupo_ID;
    }

    public void setGrupo_ID(int Grupo_ID) {
        this.Grupo_ID = Grupo_ID;
    }

    @Override
    public String toString() {
        return "TrGrupoAlumno{" + "GrupoAlumno_ID=" + GrupoAlumno_ID + "Grupo_ID=" + Grupo_ID + "Alumno_ID=" + Alumno_ID + '}';
    }
}
