/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author Sandsower
 */
public class TcGrupo
{
    private int grupo_ID;
    private String des_Grupo;
    private int carrera_ID;
    private String grado;

    public TcGrupo(int grupo_ID, String des_Grupo, int carrera_ID, String grado) {
        this.grupo_ID = grupo_ID;
        this.des_Grupo = des_Grupo;
        this.carrera_ID = carrera_ID;
        this.grado = grado;
    }
    
    /**
     * @return the grupo_ID
     */
    public int getGrupo_ID() {
        return grupo_ID;
    }

    /**
     * @param grupo_ID the grupo_ID to set
     */
    public void setGrupo_ID(int grupo_ID) {
        this.grupo_ID = grupo_ID;
    }

    /**
     * @return the des_Grupo
     */
    public String getDes_Grupo() {
        return des_Grupo;
    }

    /**
     * @param des_Grupo the des_Grupo to set
     */
    public void setDes_Grupo(String des_Grupo) {
        this.des_Grupo = des_Grupo;
    }

    /**
     * @return the carrera_ID
     */
    public int getCarrera_ID() {
        return carrera_ID;
    }

    /**
     * @param carrera_ID the carrera_ID to set
     */
    public void setCarrera_ID(int carrera_ID) {
        this.carrera_ID = carrera_ID;
    }

    /**
     * @return the cuatrimestre
     */
    public String getGrado() {
        return grado;
    }

    /**
     * @param cuatrimestre the cuatrimestre to set
     */
    public void setGrado(String cuatrimestre) {
        this.grado = grado;
    }

    /**
     * @return the letra
     */
   

    @Override
       public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("grupo_ID").append(getGrupo_ID()).append("], ");
        sb.append("des_Grupo").append(getDes_Grupo()).append("], ");
        sb.append("carrera_ID").append(getCarrera_ID()).append("], ");
        sb.append("Grado").append(getGrado()).append("], ");
        return sb.toString();
    }
       
}
