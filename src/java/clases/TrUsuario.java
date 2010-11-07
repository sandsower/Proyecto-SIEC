/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author Sandsower
 */
public class TrUsuario
{
    private int usuario_ID;
    private String Nombres;
    private String apellidoPat;
    private String apellidoMat;
    private String fecha_Nac;
    private String usuario;
    private String img;
    private int perfil_ID;

    public TrUsuario(int usuario_ID,String Nombres, String apellidoPat, String apellidoMat, String fecha_Nac, String usuario, String img, int perfil_ID){
        this.setApellidoPat(apellidoPat);
        this.setApellidoMat(apellidoMat);
        this.setFecha_Nac(fecha_Nac);
        this.setNombres(Nombres);
        this.setPerfil_ID(perfil_ID);
        this.setUsuario(usuario);
        this.setImg(img);
        this.setUsuario_ID(usuario_ID);
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
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Apellidos
     */

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    /**
     * @return the fecha_Nac
     */
    public String getFecha_Nac() {
        return fecha_Nac;
    }

    /**
     * @param fecha_Nac the fecha_Nac to set
     */
    public void setFecha_Nac(String fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public String toString()
    {
        String regresa="";
        StringBuilder sb=new StringBuilder();
        sb.append("usuario_ID").append(getUsuario_ID()).append("], ");
        sb.append("Nombres").append(getNombres()).append("], ");
        sb.append("Apellido Paterno").append(getApellidoPat()).append("], ");
        sb.append("Apellido Materno").append(getApellidoMat()).append("], ");
        sb.append("fecha_Nac").append(getFecha_Nac()).append("], ");
        sb.append("usuario").append(getUsuario()).append("], ");
        sb.append("imagen").append(getImg()).append("], ");
        sb.append("perfil_ID").append(getPerfil_ID()).append("], ");

        regresa  = sb.toString();
        return regresa;

    }



}
