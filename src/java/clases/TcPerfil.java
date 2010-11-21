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
public class TcPerfil
{
    private int perfil_ID;
    private String des_Perfil;
    public TcPerfil(int perfil_ID, String des_Perfil){
        this.setDes_Perfil(des_Perfil);
        this.setPerfil_ID(perfil_ID);
    }
    /**
     * @return the perfil_ID
     */
    public int getPerfil_ID() {
        return perfil_ID;
    }

    /**
     * @param perfil_ID the perfil_ID to set
     */
    public void setPerfil_ID(int perfil_ID) {
        this.perfil_ID = perfil_ID;
    }

    /**
     * @return the des_Perfil
     */
    public String getDes_Perfil() {
        return des_Perfil;
    }

    /**
     * @param des_Perfil the des_Perfil to set
     */
    public void setDes_Perfil(String des_Perfil) {
        this.des_Perfil = des_Perfil;
    }

    @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("perfil_ID").append(getPerfil_ID()).append("], ");
        sb.append("des_Perfil").append(getDes_Perfil()).append("], ");
        return sb.toString();
    }

}
