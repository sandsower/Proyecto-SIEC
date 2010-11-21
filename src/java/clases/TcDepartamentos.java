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
public class TcDepartamentos
{
    private int departamento_ID;
    private String des_Departamento;
    
    public TcDepartamentos(int departamento_ID,String des_Departamento){
        this.setDepartamento_ID(departamento_ID);
        this.setDes_Departamento(des_Departamento);
    }
    /**
     * @return the departamento_ID
     */
    public int getDepartamento_ID() {
        return departamento_ID;
    }

    /**
     * @param departamento_ID the departamento_ID to set
     */
    public void setDepartamento_ID(int departamento_ID) {
        this.departamento_ID = departamento_ID;
    }

    /**
     * @return the des_Departamento
     */
    public String getDes_Departamento() {
        return des_Departamento;
    }

    /**
     * @param des_Departamento the des_Departamento to set
     */
    public void setDes_Departamento(String des_Departamento) {
        this.des_Departamento = des_Departamento;
    }
    
    @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("departamento_ID").append(getDepartamento_ID()).append("], ");
        sb.append("des_Departamento").append(getDes_Departamento()).append("], ");
        return sb.toString();
    }
     
}
