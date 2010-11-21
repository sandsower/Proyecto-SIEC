/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.ArrayList;

/**
 *
 * @author lugubrenator
 */
public class CarreraGrupo {
    private TcCarrera carrera;
    private int idMaestro;
    private ArrayList grupos;

    public CarreraGrupo(int idMaestro, TcCarrera carrera){
        this.carrera =carrera;
        this.idMaestro = idMaestro;
    }

    public ArrayList getGrupos()
    {
        return grupos;
    }

    public void setGrupos(ArrayList grupos){
        this.grupos = grupos;
    }

    public int getCarrera_ID(){
        return carrera.getCarrera_ID();
    }
    public TcCarrera getCarrera(){
        return carrera;
    }

    public String getDes_Carrera(){
        return carrera.getDes_Carrera();
    }
}
