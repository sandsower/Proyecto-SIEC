/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MovimientosBD;

import clases.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sands
 */
public class InsertarNuevo {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public InsertarNuevo() {
        ConexionBD nuevaConexion = new ConexionBD();
        //TODO: Cambiar contraseña
        nuevaConexion.conectarBD("root", "55785018");
        this.setCon(nuevaConexion.getCon());
    }

    public boolean insertarNuevaEvaluacionParcial(TrEvaluacionParcial eva){
        Statement stmt = null;
        try {
            String SQL = "insert into Tr_Evaluacion_Parcial(Calificacion,Parcial,Evaluacion_Nivel_ID,Tipo_Evaluacion_ID,Sesion_ID,Alumnos_ID) ".toLowerCase()
                    + "VALUES("+eva.getCalificacion()+","+eva.getParcial()+","+eva.getEvaluacion_nivel_ID()+","+eva.getTipo_evaluacion_ID()+","+eva.getMaestro_materia_grupo_sesion_ID()+","+eva.getAlumnos_ID()+")" ;
            stmt = con.createStatement();
            stmt.execute(SQL);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InsertarNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean insertarEstrategia(TrEstrategias es, int idg, int idm, int idmaestro)
    {
        Statement stmt = null;
        try {
            StringBuilder q = new StringBuilder();
            q.append("insert into tr_estrategias values( ");
            q.append(" null, '");
            q.append( es.getFecha_Inicio_Registro() );
            q.append("' , '");
            q.append(es.getMensaje());
            q.append("' , '");
            q.append(es.getFecha_fin());
            q.append("' ) ");
            stmt = con.createStatement();
            stmt.execute(q.toString());

            q = new StringBuilder();
            q.append(" SELECT MATERIA_GRUPO_MAESTRO_ID ");
            q.append(" FROM tr_maestro_grupo_materia ");
            q.append(" WHERE ");
            q.append(" GRUPO_ID = ");
            q.append(idg);
            q.append(" AND ");
            q.append(" MATERIAS_ID = ");
            q.append(idm);
            q.append(" AND ");
            q.append(" MAESTRO_ID =  ");
            q.append(idmaestro);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(q.toString());
            rs.next();
            int idgmm=rs.getInt("MATERIA_GRUPO_MAESTRO_ID");
            
            q = new StringBuilder();
            q.append(" SELECT ESTRATEGIA_ID  ");
            q.append(" FROM tr_estrategias  ");
            q.append(" WHERE  ");
            q.append("  FECHA_INICIO_REGISTRO =  '");
            q.append(es.getFecha_Inicio_Registro());
            q.append("' AND  ");
            q.append(" MENSAJE= '");
            q.append(es.getMensaje());
            q.append("' AND  ");
            q.append(" FECHA_CAMBIO =  '");
            q.append(es.getFecha_fin());
            q.append("'");
            rs = stmt.executeQuery(q.toString());
            rs.next();
            int idmen =rs.getInt("ESTRATEGIA_ID");

            q = new StringBuilder();
            q.append(" INSERT INTO tr_estra_mgm  ");
            q.append(" VALUES  ");
            q.append(" ( NULL ,  ");
            q.append(idmen);
            q.append(" ,  ");
            q.append(idgmm);
            q.append(" )  ");
            stmt = con.createStatement();
            stmt.execute(q.toString());
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InsertarNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public boolean insertarEstrategiaAlumnos(TrEstrategias es, int idg, int idm, int idma, int idal)
    {
        Statement stmt = null;
        try {
            StringBuilder q = new StringBuilder();
            q.append("insert into tr_estrategias values( ");
            q.append(" null, '");
            q.append( es.getFecha_Inicio_Registro() );
            q.append("' , '");
            q.append(es.getMensaje());
            q.append("' , '");
            q.append(es.getFecha_fin());
            q.append("' ) ");
            stmt = con.createStatement();
            stmt.execute(q.toString());

            q = new StringBuilder();
            q.append(" SELECT MATERIA_GRUPO_MAESTRO_ID ");
            q.append(" FROM tr_maestro_grupo_materia ");
            q.append(" WHERE ");
            q.append(" GRUPO_ID = ");
            q.append(idg);
            q.append(" AND ");
            q.append(" MATERIAS_ID = ");
            q.append(idm);
            q.append(" AND ");
            q.append(" MAESTRO_ID =  ");
            q.append(idma);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(q.toString());
            rs.next();
            int idgmm=rs.getInt("MATERIA_GRUPO_MAESTRO_ID");
            System.out.println(idgmm);

            q = new StringBuilder();
            q.append(" SELECT ESTRATEGIA_ID  ");
            q.append(" FROM tr_estrategias  ");
            q.append(" WHERE  ");
            q.append("  FECHA_INICIO_REGISTRO =  '");
            q.append(es.getFecha_Inicio_Registro());
            q.append("' AND  ");
            q.append(" MENSAJE= '");
            q.append(es.getMensaje());
            q.append("' AND  ");
            q.append(" FECHA_CAMBIO =  '");
            q.append(es.getFecha_fin());
            q.append("'");
            rs = stmt.executeQuery(q.toString());
            rs.next();
            int idmen =rs.getInt("ESTRATEGIA_ID");
            System.out.println(idmen);

            q = new StringBuilder();
            q.append(" SELECT GRUPO_ALUMNO_ID  ");
            q.append(" FROM  ");
            q.append(" tr_grupo_alumno  ");
            q.append(" WHERE  ");
            q.append("  GRUPO_ID =  ");
            q.append(idg);
            q.append(" AND  ");
            q.append(" ALUMNOS_ID =  ");
            q.append(idal);
            rs = stmt.executeQuery(q.toString());
            rs.next();
            int idga =rs.getInt("GRUPO_ALUMNO_ID");
            System.out.println(idga);

            q = new StringBuilder();
            q.append(" SELECT materia_maestro_grupo_alumno_id  ");
            q.append(" FROM tr_materia_maestro_grupo_alumno  ");
            q.append(" WHERE  ");
            q.append("  MATERIA_GRUPO_MAESTRO_ID =  ");
            q.append(idgmm);
            q.append(" AND  ");
            q.append(" tr_grupo_alumno_GRUPO_ALUMNO_ID =  ");
            q.append(idga);
            rs = stmt.executeQuery(q.toString());
            rs.next();
            int idgmma =rs.getInt("materia_maestro_grupo_alumno_id");
            System.out.println(idgmma);
            
            q = new StringBuilder();
            q.append(" INSERT INTO tr_est_alumno  ");
            q.append(" VALUES  ");
            q.append(" ( NULL ,  ");
            q.append(idmen);
            q.append(" ,  ");
            q.append(idgmma);
            q.append(" )  ");
            stmt = con.createStatement();
            stmt.execute(q.toString());
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InsertarNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public int insertarPresesion(int idCompetenciaCriterio)
    {
         String SQL;
         ObtenerIndividuo obin = new ObtenerIndividuo();
         SQL = String.format("INSERT INTO tr_presesion VALUES (NULL, ' ', 0,'1', %d)", obin.obtenerCriterioCompetenciaByCompetenciaID(idCompetenciaCriterio).getCriterioCompetencia_ID());
         int r = 0;
         try{
         Statement stmt = null;
         ResultSet rs = null;
            stmt = con.createStatement();
            stmt.execute(SQL);
            rs = stmt.executeQuery("SELECT PRESESION_ID from tr_presesion ORDER BY PRESESION_ID DESC");
            rs.next();
            r = rs.getInt("PRESESION_ID");
         }catch(SQLException e){
             System.out.print(SQL);
         }catch(NullPointerException es){
             System.out.print(SQL);
         }
         return r;
    }
     public void insertarSesion(int idPresesion, int idMgm)
    {
         String SQL;
         Statement stmt = null;
         ResultSet rs = null;
         SQL = String.format("INSERT INTO tr_sesion VALUES (NULL, %d, %d, true)", idMgm, idPresesion);
         try{
            stmt = con.createStatement();
            stmt.execute(SQL);
         }catch(SQLException e){
             System.out.print("Error al crear la sesion" + SQL);
         }catch(NullPointerException es){
             System.out.print(SQL);
         }
    }

     public static void main(String [] args)
    {
        InsertarNuevo in= new InsertarNuevo();
        System.out.print( in.insertarEstrategiaAlumnos(
                        new TrEstrategias(0,"2010-10-10","nee","2010-10-10")
                        , 7, 1,  1, 6
                        ));
     }
}
