/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.ArrayList;

/**
 *
 * @author vieyra
 */
public class CompetenciasCategorias {

    private TcCategorias categorias;
    private ArrayList competencias;

    public String getDes_Categoria(){

         return categorias.getDes_categoria();
     }
     public int getCategoriaID(){
         
         return categorias.getCategoria_ID();
     }

    public TcCategorias getCategorias() {
        return categorias;
    }

    public void setCategorias(TcCategorias categorias) {
        this.categorias = categorias;
    }

    public ArrayList getCompetencias() {
        return competencias;
    }

    public void setCompetencias(ArrayList competencias) {
        this.competencias = competencias;
    }

    public CompetenciasCategorias(TcCategorias categorias){
        this.categorias =  categorias;
    }


}
