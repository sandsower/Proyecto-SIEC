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
public class PruebasIndividuo {
    public static void main(String[] args) {
        ObtenerIndividuo obt = new ObtenerIndividuo();
        int i = 0;
        //1-Carrera
        i++;
        System.out.println("Prueba #"+i);
        TcCarrera carrera = obt.obtenerCarrera(2);
        System.out.println(carrera.toString());
        //2-Categoria
        i++;
        System.out.println("Prueba #"+i);
        TcCategorias categoria =obt.obtenerCategoria(2);
        System.out.println(categoria.toString());
        //3-Competencia
        i++;
        System.out.println("Prueba #"+i);
        TcCompetencias competencia = obt.obtenerCompetencia(4);
        System.out.println(competencia.toString());
        //4-Criterio
        i++;
        System.out.println("Prueba #"+i);
        TcCriterios criterio = obt.obtenerCriterio(3);
        System.out.println(criterio.toString());
        //5-Departamento
        i++;
        System.out.println("Prueba #"+i);
        TcDepartamentos departamento = obt.obtenerDepartamento(2);
        System.out.println(departamento.toString());
        //6-EvaluacionNivel
        i++;
        System.out.println("Prueba #"+i);
        TcEvaluacionNivel evaluacion = obt.obtenerEvaluacionNivel(2);
        System.out.println(evaluacion.toString());
        //7-Grupo
        i++;
        System.out.println("Prueba #"+i);
        TcGrupo grupo = obt.obtenerGrupo(4);
        System.out.println(grupo.toString());
        //8-Materias
        i++;
        System.out.println("Prueba #"+i);
        TcMaterias materia = obt.obtenerMateria(3);
        System.out.println(materia.toString());
        //9-Perfil
        i++;
        System.out.println("Prueba #"+i);
        TcPerfil perfil = obt.obtenerPerfil(5);
        System.out.println(perfil.toString());
        //10-Reportes
        i++;
        System.out.println("Prueba #"+i);
        TcReportes reporte = obt.obtenerReporte(4);
        System.out.println(reporte.toString());
        //11-Tipo_Evaluacion
        i++;
        System.out.println("Prueba #"+i);
        TcTipoEvaluacion tipoEvaluacion = obt.obtenerTipoEvaluacion(3);
        System.out.println(tipoEvaluacion.toString());
        //12a-Alumnos - ID
        i++;
        System.out.println("Prueba #"+i);
        TrAlumnos alum = obt.obtenerAlumnobyID(12);
        System.out.println(alum.toString());
        //12b-Alumnos - Matricula
        i++;
        System.out.println("Prueba #"+i);
        TrAlumnos alumno = obt.obtenerAlumnobyMatricula("UP080394");
        System.out.println(alumno.toString());
        //13 - Comentario_DPA_Estrategia esta tabla ya no existe
//        i++;
//        System.out.println("Prueba #"+i);
//        TrComentarioDPAEstrategia dpaEstrategia= obt.obtenerComentarioDPAEstrategia(1);
//        System.out.println(dpaEstrategia.toString());

        //14-Usuario // error al convertir la fecha a String en el constructor
        i++;
        System.out.println("Prueba #"+i);
        TrUsuario usuario=obt.obtenerUsuario(7);
        System.out.println(usuario.toString());
        //15-Sesion_Rechazada
        i++;
        System.out.println("Prueba #"+i);
        TrPreSesionRechazada sRechazada=obt.obtenerPreSesionRechazada(5);
        System.out.println(sRechazada.toString());
        //16-Sesion
        i++;
        System.out.println("Prueba #"+i);
        TrPreSesion sesion=obt.obtenerPreSesion(6);
        System.out.println(sesion.toString());
        //17-Maestros
        i++;
        System.out.println("Prueba #"+i);
        TrMaestros maestros=obt.obtenerMaestro(6);
        System.out.println(maestros.toString());
        //18-Maestro_Materia_Grupo_Sesion
        i++;
        System.out.println("Prueba #"+i);
        TrSesion mGS=obt.obtenerSesion(5);
        System.out.println(mGS.toString());
        //19-Maestro_Materia_Grupo
        i++;
        System.out.println("Prueba #"+i);
        TrMaestroMateriaGrupo mMG=obt.obtenerMaestroMateriaGrupo(9);
        System.out.println(mMG.toString());
        //20-Maestro_Materia (borrada)
        i++;
        System.out.println("Prueba #"+i);
        //21-Parcial_Acumulativa
        i++;
        System.out.println("Prueba #"+i);
        TrEvaluacionParcialAcumulativa ePA=obt.obtenerEvaluacionParcialAcumulativa(14);
        System.out.println(ePA.toString());
        //22-Evaluacion_Parcial
        i++;
        System.out.println("Prueba #"+i);
        TrEvaluacionParcial eP=obt.obtenerEvaluacionParcial(12);
        System.out.println(eP.toString());
        //23-Evaluacion_Acumulativa
        i++;
        System.out.println("Prueba #"+i);
        TrEvaluacionAcumulativa eA=obt.obtenerEvaluacionAcumulativa(4);
        System.out.println(eA.toString());
        //24-Estrategias
        i++;
        System.out.println("Prueba #"+i);
        TrEstrategias estrategias=obt.obtenerEstrategia(16);
        System.out.println(estrategias.toString());
        //25-Criterio_Competencia
        i++;
        System.out.println("Prueba #"+i);
        TrCriterioCompetencia criterioCompetencia = obt.obtenerCriterioCompetencia(2);
        System.out.println(criterioCompetencia.toString());
    }

}

