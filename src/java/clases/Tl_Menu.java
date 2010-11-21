/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author vieyra
 */
public class Tl_Menu {

    private int id_menu;
    private String menu;
    private String url;
    private String img;
    private int id_perfil;

    public Tl_Menu(){

    }
    public Tl_Menu(int id_menu, String menu, String url, String img, int id_perfil ){
        this.setId_menu(id_menu);
        this.setId_perfil(id_perfil);
        this.setImg(img);
        this.setMenu(menu);
        this.setUrl(url);
    }


    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
