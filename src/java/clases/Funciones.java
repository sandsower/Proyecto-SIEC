/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author maria.teran
 */
public class Funciones {
    public String getContexto(HttpServletRequest rqt) {
        return rqt.getContextPath().equals("/")? "": rqt.getContextPath();
  }; // getContexto

}
