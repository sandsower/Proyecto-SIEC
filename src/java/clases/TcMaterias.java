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
public class TcMaterias
{
    private int materias_ID;
    private String des_Materias;
    private int departamento;

    public TcMaterias(int materias_ID, String des_Materias, int departamento){
        this.setDepartamento(departamento);
        this.setDes_Materias(des_Materias);
        this.setMaterias_ID(materias_ID);
    }
    /**
     * @return the materias_ID
     */
    public int getMaterias_ID() {
        return materias_ID;
    }

    /**
     * @param materias_ID the materias_ID to set
     */
    public void setMaterias_ID(int materias_ID) {
        this.materias_ID = materias_ID;
    }

    /**
     * @return the des_Materias
     */
    public String getDes_Materias() {
        return des_Materias;
    }

    /**
     * @param des_Materias the des_Materias to set
     */
    public void setDes_Materias(String des_Materias) {
        this.des_Materias = des_Materias;
    }

    /**
     * @return the departamento
     */
    public int getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("materias_ID").append(getMaterias_ID()).append("], ");
        sb.append("des_Materias").append(getDes_Materias()).append("], ");
        sb.append("departamento").append(getDepartamento()).append("], ");
        return sb.toString();
    }

}
