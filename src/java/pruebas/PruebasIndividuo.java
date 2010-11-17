/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;
import json.*;
/**
 *
 * @author Jane
 */
public class PruebasIndividuo {
    public static void main(String[] args) throws JSONException {
    String s = "[0.1,0.3]";
          JSONArray  a = new JSONArray(s);
            System.out.println(a.toString());
    }

}
