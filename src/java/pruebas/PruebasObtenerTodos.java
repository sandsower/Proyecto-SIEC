/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import MovimientosBD.ObtenerConjunto;
import java.util.ArrayList;

/**
 *
 * @author sands
 */
public class PruebasObtenerTodos {
    
    public static void main(String[] args) {
        ArrayList resultados = null;
        ObtenerConjunto obt = new ObtenerConjunto();
        int i = 0;

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerAlumnos();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerCarreras();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerCategorias();
        System.out.println(resultados.size());

//        i++;
//        System.out.println("Prueba #"+i);
//        resultados = obt.obtenerComentarioDPAEstrategias();
//        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerCompetencias();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerCriterios();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerCriterioCompetencias();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerDepartamentos();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerEstrategias();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerEvaluacionesAcumulativas();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerEvaluacionesNiveles();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerEvaluacionesParciales();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerEvaluacionesParcialesAcumulativas();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerGrupos();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerMaestros();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerMaestrosMateriasGrupos();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerSesiones();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerMaterias();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerPerfiles();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerReportes();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerPreSesionesRechazadas();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerPreSesiones();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerTipoEvaluacions();
        System.out.println(resultados.size());

        i++;
        System.out.println("Prueba #"+i);
        resultados = obt.obtenerUsuarios();
        System.out.println(resultados.size());
    }
 
}
