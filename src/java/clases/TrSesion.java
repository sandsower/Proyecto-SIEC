package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;

public class TrSesion {

    private int maestroMateriaGrupoSesion_ID;
    private int preSesion_ID;
    private int maeMatGrp_ID;
    private int estado;

    public TrSesion(int maestroMateriaGrupoSesion_ID, int preSesion_ID, int maeMatGrp_ID, int estado) {
        this.maestroMateriaGrupoSesion_ID = maestroMateriaGrupoSesion_ID;
        this.preSesion_ID = preSesion_ID;
        this.maeMatGrp_ID = maeMatGrp_ID;
        this.estado = estado;
    }

    public int getPreSesion_ID() {
        return preSesion_ID;
    }

    public void setPreSesion_ID(int preSesion_ID) {
        this.preSesion_ID = preSesion_ID;
    }

    /**
     * @return the maestroMateriaGrupoSesion_ID
     */
    public int getMaestroMateriaGrupoSesion_ID() {
        return maestroMateriaGrupoSesion_ID;
    }

    /**
     * @param maestroMateriaGrupoSesion_ID the maestroMateriaGrupoSesion_ID to set
     */
    public void setMaestroMateriaGrupoSesion_ID(int maestroMateriaGrupoSesion_ID) {
        this.maestroMateriaGrupoSesion_ID = maestroMateriaGrupoSesion_ID;
    }

    /**
     * @return the maeMatGrp_ID
     */
    public int getMaeMatGrp_ID() {
        return maeMatGrp_ID;
    }

    /**
     * @param maeMatGrp_ID the maeMatGrp_ID to set
     */
    public void setMaeMatGrp_ID(int maeMatGrp_ID) {
        this.maeMatGrp_ID = maeMatGrp_ID;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String regresa = "";
        StringBuilder sb = new StringBuilder();
        sb.append("maestroMateriaGrupoSesion_ID").append(getMaestroMateriaGrupoSesion_ID()).append("], ");
        sb.append("PreSesion_ID").append(getPreSesion_ID()).append("], ");
        sb.append("maeMatGrp_ID").append(getMaeMatGrp_ID()).append("]");
        sb.append("estado").append(getEstado()).append("]");
        regresa = sb.toString();
        return regresa;

    }
}
