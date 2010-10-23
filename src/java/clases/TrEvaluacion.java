/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import MovimientosBD.ConexionBD;

/**
 *
 * @author Sandsower
 */
public class TrEvaluacion {

    private int evaluacion;
    private String des_Evaluacion;
    private int materia_Grupo;
    private int evaluacion_Nivel_ID;
    private int maestro_Materia_Grupo_Sesion_ID;

    public TrEvaluacion(int evaluacion, String des_Evaluacion, int materia_Grupo, int evaluacion_Nivel_ID, int maestro_Materia_Grupo_Sesion_ID){
        this.setDes_Evaluacion(des_Evaluacion);
        this.setEvaluacion(evaluacion);
        this.setEvaluacion_Nivel_ID(evaluacion_Nivel_ID);
        this.setMaestro_Materia_Grupo_Sesion_ID(maestro_Materia_Grupo_Sesion_ID);
        this.setMateria_Grupo(materia_Grupo);
    }

    /**
     * @return the evaluacion
     */
    public int getEvaluacion() {
        return evaluacion;
    }

    /**
     * @param evaluacion the evaluacion to set
     */
    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
    }

    /**
     * @return the des_Evaluacion
     */
    public String getDes_Evaluacion() {
        return des_Evaluacion;
    }

    /**
     * @param des_Evaluacion the des_Evaluacion to set
     */
    public void setDes_Evaluacion(String des_Evaluacion) {
        this.des_Evaluacion = des_Evaluacion;
    }

    /**
     * @return the materia_Grupo
     */
    public int getMateria_Grupo() {
        return materia_Grupo;
    }

    /**
     * @param materia_Grupo the materia_Grupo to set
     */
    public void setMateria_Grupo(int materia_Grupo) {
        this.materia_Grupo = materia_Grupo;
    }

    /**
     * @return the evaluacion_Nivel_ID
     */
    public int getEvaluacion_Nivel_ID() {
        return evaluacion_Nivel_ID;
    }

    /**
     * @param evaluacion_Nivel_ID the evaluacion_Nivel_ID to set
     */
    public void setEvaluacion_Nivel_ID(int evaluacion_Nivel_ID) {
        this.evaluacion_Nivel_ID = evaluacion_Nivel_ID;
    }

    /**
     * @return the maestro_Materia_Grupo_Maestro_Materia_Grupo_Sesion_ID
     */
    public int getMaestro_Materia_Grupo_Sesion_ID() {
        return maestro_Materia_Grupo_Sesion_ID;
    }

    /**
     * @param maestro_Materia_Grupo_Sesion_ID the maestro_Materia_Grupo_Sesion_ID to set
     */
    public void setMaestro_Materia_Grupo_Sesion_ID(int maestro_Materia_Grupo_Sesion_ID) {
        this.maestro_Materia_Grupo_Sesion_ID = maestro_Materia_Grupo_Sesion_ID;
    }

    public TrEvaluacion obtenerEvaluacion (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrComentario_Pda_estrategia cpe = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Comentario_Pda_Estrategia WHERE Coment_Estra_DPA_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cpe = new TrComentario_Pda_estrategia(rs.getInt("Coment_Estra_DPA_ID"), rs.getInt("Estrategia_ID"));
            }
            return cpe;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
}
