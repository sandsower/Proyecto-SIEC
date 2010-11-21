
package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;


public class TrMaestroMateriaGrupo {

    public TrMaestroMateriaGrupo(int maestroMateriaGrupo_ID, int grupoGrupo_ID, int maestro_ID, int materia_ID) {
        this.maestroMateriaGrupo_ID = maestroMateriaGrupo_ID;
        this.grupoGrupo_ID = grupoGrupo_ID;
        this.maestro_ID = maestro_ID;
        this.materia_ID = materia_ID;
    }

    private int maestroMateriaGrupo_ID;
    private int grupoGrupo_ID;
    private int maestro_ID;
    private int materia_ID;

    public int getMaestro_ID() {
        return maestro_ID;
    }

    public void setMaestro_ID(int maestro_ID) {
        this.maestro_ID = maestro_ID;
    }

    public int getMateria_ID() {
        return materia_ID;
    }

    public void setMateria_ID(int materia_ID) {
        this.materia_ID = materia_ID;
    }
    /**
     * @return the maestroMateriaGrupo_ID
     */
    public int getMaestroMateriaGrupo_ID() {
        return maestroMateriaGrupo_ID;
    }

    /**
     * @param maestroMateriaGrupo_ID the maestroMateriaGrupo_ID to set
     */
    public void setMaestroMateriaGrupo_ID(int maestroMateriaGrupo_ID) {
        this.maestroMateriaGrupo_ID = maestroMateriaGrupo_ID;
    }

    /**
     * @return the grupoGrupo_ID
     */
    public int getGrupoGrupo_ID() {
        return grupoGrupo_ID;
    }

    /**
     * @param grupoGrupo_ID the grupoGrupo_ID to set
     */
    public void setGrupoGrupo_ID(int grupoGrupo_ID) {
        this.grupoGrupo_ID = grupoGrupo_ID;
    }

  

    @Override
    public String toString()
    {
        String regresa="";
        StringBuilder sb=new StringBuilder();
        sb.append("maestroMateriaGrupo_ID").append(getMaestroMateriaGrupo_ID()).append("], ");
        sb.append("grupoGrupo_ID").append(getGrupoGrupo_ID()).append("], ");
        sb.append("Materia_ID").append(getMateria_ID()).append("], ");
        sb.append("Maestro_ID").append(getMateria_ID()).append("]");
        regresa  = sb.toString();
        return regresa;

    }
}
