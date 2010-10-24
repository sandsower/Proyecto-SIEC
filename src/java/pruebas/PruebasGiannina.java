
package pruebas;

import MovimientosBD.ObtenerIndividuo;
import clases.*;



public class PruebasGiannina
{


public static void main(String[] args)

{

        ObtenerIndividuo obt = new ObtenerIndividuo();
        TcCarrera carrera = obt.obtenerCarrera(2);
        System.out.println(carrera.toString());


        TcCategorias categoria =obt.obtenerCategoria(2);
        System.out.println(categoria.toString());

        TrUsuario usuario=obt.obtenerUsuario(3);
        System.out.println(usuario.toString());

        TrSesionRechazada sRechazada=obt.obtenerSesionRechazada(2);
        System.out.println(sRechazada.toString());

        TrSesion sesion=obt.obtenerSesion(1);
        System.out.println(sesion.toString());

        TrMaestros maestros=obt.obtenerMaestro(4);
        System.out.println(maestros.toString());

        TrMaestroMateriaGrupoSesion mGS=obt.obtenerMaestroMateriaGrupoSesion(1);
        System.out.println(mGS.toString());

        TrMaestroMateriaGrupo mMG=obt.obtenerMaestroMateriaGrupo(2);
        System.out.println(mMG.toString());


        TrMaestroMateria mM=obt.obtenerMaestroMateria(3);
        System.out.println(mM.toString());

        TrEvaluacionParcialAcumulativa ePA=obt.obtenerEvaluacionParcialAcumulativa(2);
        System.out.println(ePA.toString());

        TrEvaluacionParcial eP=obt.obtenerEvaluacionParcial(3);
        System.out.println(eP.toString());

        TrEvaluacionAcumulativa eA=obt.obtenerEvaluacionAcumulativa(4);
        System.out.println(eA.toString());
        
        TrEstrategias estrategias=obt.obtenerEstrategia(12);
        System.out.println(estrategias.toString());
}

}
