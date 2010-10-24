/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;
import clases.*;
import MovimientosBD.*;
/**
 *
 * @author Jane
 */
public class Pruebas {
    public static void main(String[] args) {
        ObtenerIndividuo obt = new ObtenerIndividuo();

        TcCarrera carrera = obt.obtenerCarrera(2);
        System.out.print(carrera.toString());

        TcCategorias categoria =obt.obtenerCategoria(2);
        System.out.print(categoria.toString());

        TcCompetencias competencia = obt.obtenerCompetencia(4);
        System.out.print(competencia.toString());

        TcCriterios criterio = obt.obtenerCriterio(3);
        System.out.print(criterio.toString());

        TcDepartamentos departamento = obt.obtenerDepartamento(2);
        System.out.print(departamento.toString());

        TcEvaluacionNivel evaluacion = obt.obtenerEvaluacionNivel(2);
        System.out.print(evaluacion.toString());

        TcGrupo grupo = obt.obtenerGrupo(3);
        System.out.print(grupo.toString());

        TcMaterias materia = obt.obtenerMateria(3);
        System.out.print(materia.toString());

        TcPerfil perfil = obt.obtenerPerfil(5);
        System.out.print(perfil.toString());

        TcReportes reporte = obt.obtenerReporte(4);
        System.out.print(reporte.toString());

        TcTipoEvaluacion tipoEvaluacion = obt.obtenerTipoEvaluacion(3);
        System.out.print(tipoEvaluacion.toString());

        TrAlumnos alum = obt.obtenerAlumnobyID(2);
        System.out.print(alum.toString());

        TrAlumnos alumno = obt.obtenerAlumnobyMatricula("UP080605");
        System.out.print(alumno.toString());

        TrComentarioDPAEstrategia dpaEstrategia= obt.obtenerComentarioDPAEstrategia(1);
        System.out.print(dpaEstrategia.toString());
    }

}
