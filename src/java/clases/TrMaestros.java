/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author Sandsower
 */
public class TrMaestros
{
    private int Maestro_ID;
    private String codigo;
    private int usuario_ID;
    private int materia_Grupo;

    /**
     * @return the Maestro_ID
     */
    public int getMaestro_ID() {
        return Maestro_ID;
    }

    /**
     * @param Maestro_ID the Maestro_ID to set
     */
    public void setMaestro_ID(int Maestro_ID) {
        this.Maestro_ID = Maestro_ID;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the usuario_ID
     */
    public int getUsuario_ID() {
        return usuario_ID;
    }

    /**
     * @param usuario_ID the usuario_ID to set
     */
    public void setUsuario_ID(int usuario_ID) {
        this.usuario_ID = usuario_ID;
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
}
