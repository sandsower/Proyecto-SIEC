/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MovimientosBD;

import clases.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HANNA
 */
public class ObtenerConjunto {

     private Connection con;

    public ObtenerConjunto() {
         ConexionBD nuevaConexion = new ConexionBD();
        nuevaConexion.conectarBD("root", "root");
        this.setCon(nuevaConexion.getCon());
    }

    public ArrayList obtenerGrupoAlumnos(){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList gra = new ArrayList();
            String SQL = "SELECT * FROM tr_grupo_alumno".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                gra.add(new TrGrupoAlumno(rs.getInt("GRUPO_ALUMNO_ID"), rs.getInt("GRUPO_ID"), rs.getInt("ALUMNOS_ID")));
            }
            return gra;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.toString());
        }
        return null;
    }

    public ArrayList obtenerGrupoAlumnosbyGrupo(int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList gra = new ArrayList();
            String SQL = "SELECT * FROM tr_grupo_alumno WHERE GRUPO_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                gra.add(new TrGrupoAlumno(rs.getInt("GRUPO_ALUMNO_ID"), rs.getInt("GRUPO_ID"), rs.getInt("ALUMNOS_ID")));
            }
            return gra;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.toString());
        }
        return null;
    }

    public ArrayList obtenerGrupoAlumnosbyAlumno(int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList gra = new ArrayList();
            String SQL = "SELECT * FROM tr_grupo_alumno WHERE ALUMNOS_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                gra.add(new TrGrupoAlumno(rs.getInt("GRUPO_ALUMNO_ID"), rs.getInt("GRUPO_ID"), rs.getInt("ALUMNOS_ID")));
            }
            return gra;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.toString());
        }
        return null;
    }
    
    public ArrayList obtenerCarreras() {
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList car = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Carrera".toLowerCase();
            stmt = getCon().createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                car.add(new TcCarrera(rs.getInt("Carrera_ID"), rs.getString("Des_Carrera")));
            }
            return car;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.toString());
        }
        return null;
    }
    
       public ArrayList obtenerCategorias (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList cat = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Categorias".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cat.add(new TcCategorias(rs.getInt("Categoria_ID"),rs.getString("Des_categoria"), rs.getString("Descripcion"), rs.getInt("Orden")));
            }
            return cat;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerCompetencias (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList com = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Competencias".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                com.add(new TcCompetencias(rs.getInt("Competencia_ID"), rs.getString("Des_Competencia"), rs.getString("Descripcion"), rs.getInt("Categoria_ID")));
            }
            return com;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerCriterios (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList cri = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Criterios".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cri.add(new TcCriterios(rs.getInt("Criterio_ID"), rs.getString("Des_Criterio"), rs.getString("Descripcion")));
            }
            return cri;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public ArrayList obtenerDepartamentos (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList dep = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Departamentos".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                dep.add(new TcDepartamentos(rs.getInt("Departamento_ID"), rs.getString("Des_Departamento")));
            }
            return dep;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public ArrayList obtenerGrupos (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList grp = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Grupo".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                grp.add(new TcGrupo(rs.getInt("GRUPO_ID"), rs.getString("DES_GRUPO"), rs.getInt("CARRERA_ID"), rs.getString("GRADO")));
            }
            return grp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }


    public ArrayList obtenerMaterias (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mat = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Materias ".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mat.add(new TcMaterias(rs.getInt("Materias_ID"), rs.getString("Des_Materias"), rs.getInt("Departamento_ID")));
            }
            return mat;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
        public ArrayList obtenerMateriasbyIDMaestro(int id_maestro){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mat = new ArrayList();
            //SQL query command
            String SQL = "SELECT  DISTINCT  mat.* FROM tc_materias AS mat, tr_maestros AS m, tr_maestro_grupo_materia AS gmm WHERE gmm.MAESTRO_ID = m.MAESTRO_ID AND mat.MATERIAS_ID = gmm.MATERIAS_ID AND gmm.MAESTRO_ID = "+id_maestro;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mat.add(new TcMaterias(rs.getInt("Materias_ID"), rs.getString("Des_Materias"), rs.getInt("Departamento_ID")));
            }
            return mat;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
  

    public ArrayList obtenerReportes (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList rep = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Reportes".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                rep.add(new TcReportes(rs.getInt("Reportes_ID"), rs.getString("Des_Reportes"), rs.getInt("Perfil_ID")));
            }
            return rep;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerTipoEvaluacions (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList tev = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Tipo_Evaluacion".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                tev.add(new TcTipoEvaluacion(rs.getInt("Tipo_Evaluacion_ID"), rs.getString("Des_Tipo_Evaluacion")));
            }
            return tev;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerAlumnos (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList alm = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Alumnos".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                TrAlumnos alum = new TrAlumnos(rs.getInt("Alumnos_ID"), rs.getString("Matricula"), rs.getInt("Usuario_ID"), rs.getInt("Carrera_ID"));
                alm.add(alum);
            }
            return alm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
        public ArrayList obtenerAlumnosbyIdGrupoIdMateria (int idGrupo, int idMateria){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList alm = new ArrayList();
            StringBuilder q = new StringBuilder();
            q.append(" SELECT ");
            q.append(" a.*");
            q.append(" FROM ");
            q.append(" tr_grupo_alumno AS ga, ");
            q.append(" tr_materia_maestro_grupo_alumno AS gmma, ");
            q.append(" tr_alumnos AS a, ");
            q.append(" tc_grupo AS g, ");
            q.append(" tr_usuario AS u, ");
            q.append(" tr_maestro_grupo_materia AS gmm ");
            q.append(" WHERE ");
            q.append(" ga.ALUMNOS_ID = a.ALUMNOS_ID AND  ");
            q.append(" ga.GRUPO_ID = g.GRUPO_ID AND ");
            q.append(" u.USUARIO_ID = a.USUARIO_ID AND ");
            q.append(" gmma.tr_grupo_alumno_GRUPO_ALUMNO_ID = ga.GRUPO_ALUMNO_ID AND ");
            q.append(" gmm.MATERIA_GRUPO_MAESTRO_ID = gmma.MATERIA_GRUPO_MAESTRO_ID AND ");
            q.append(" gmm.MATERIAS_ID = ");
            q.append(idMateria);
            q.append(" AND ");
            q.append(" gmm.GRUPO_ID = ");
            q.append(idGrupo);
            //SQL query command
            String SQL = q.toString();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                TrAlumnos alum = new TrAlumnos(rs.getInt("Alumnos_ID"), rs.getString("Matricula"), rs.getInt("Usuario_ID"), rs.getInt("Carrera_ID"));
                alm.add(alum);
            }
            return alm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
   
    public ArrayList obtenerComentarioDPAEstrategias (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList cde = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Comentario_Dpa_Estrategia".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cde.add(new TrComentarioDPAEstrategia(rs.getInt("Coment_Estra_DPA_ID"), rs.getInt("Estrategia_ID")));
            }
            return cde;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
    public ArrayList obtenerCriterioCompetencias (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList ccm = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Criterio_Competencia".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ccm.add(new TrCriterioCompetencia(rs.getInt("Criterio_ID"), rs.getInt("Criterio_Competencia_ID"), rs.getInt("Competencia_ID"), rs.getString("Ponderacion_Criterio")));
            }
            return ccm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
    
    public ArrayList obtenerCriterioCompetenciasbyCompetenciaID (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList ccm = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Criterio_Competencia where Competencia_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ccm.add(new TrCriterioCompetencia(rs.getInt("Criterio_ID"), rs.getInt("Criterio_Competencia_ID"), rs.getInt("Competencia_ID"), rs.getString("Ponderacion_Criterio")));
            }
            return ccm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerEstrategias (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList est = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Estrategias".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                est.add(new TrEstrategias(rs.getInt("Estrategia_ID"), rs.getString("Fecha_Inicio_Registro"), rs.getString("Mensaje"), rs.getString("Fecha_Cambio")));
            }
            return est;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerEvaluacionesAcumulativas (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList eva = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Acumulativa".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                eva.add(new TrEvaluacionAcumulativa(rs.getInt("Evaluacion_Acumulativa_ID"), rs.getInt("Parcial"), rs.getInt("Calificacion")));
            }
            return eva;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerEvaluacionesParciales (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList evp = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Parcial".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                evp.add(new TrEvaluacionParcial(rs.getInt("Evaluacion_Parcial_ID"), rs.getInt("Calificacion"), rs.getInt("Parcial"),rs.getInt("Evaluacion_Nivel_ID"), rs.getInt("Tipo_Evaluacion_ID"), rs.getInt("Sesion_ID"), rs.getInt("Alumnos_ID")));
            }
            return evp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerEvaluacionesParcialesAcumulativas (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList epa = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Parcial_Acumulativa".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                epa.add(new TrEvaluacionParcialAcumulativa(rs.getInt("Evaluacion_Parcial_Acumulativa_ID"), rs.getInt("Evaluacion_Parcial_ID"), rs.getInt("Evaluacion_Acumulativa_ID")));
            }
            return epa;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerMaestrosMateriasGrupos (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mmg = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM tr_maestro_grupo_materia".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmg.add(new TrMaestroMateriaGrupo(rs.getInt("MATERIA_GRUPO_MAESTRO_ID"), rs.getInt("Grupo_ID"), rs.getInt("Maestro_ID"),rs.getInt("Materias_ID")));
            }
            return mmg;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerMaestrosMateriasGruposbyGrupo (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mmg = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestro_Grupo_Materia where Grupo_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmg.add(new TrMaestroMateriaGrupo(rs.getInt("MATERIA_GRUPO_MAESTRO_ID"), rs.getInt("Grupo_ID"), rs.getInt("Maestro_ID"),rs.getInt("Materias_ID")));
            }
            return mmg;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
    public ArrayList obtenerMaestrosMateriasGruposbyMaestro (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mmg = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestro_Grupo_Materia where MAESTRO_ID = ".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            
            while(rs.next()){
                mmg.add(new TrMaestroMateriaGrupo(rs.getInt("MATERIA_GRUPO_MAESTRO_ID"),
                        rs.getInt("Grupo_ID"), rs.getInt("Maestro_ID"),rs.getInt("Materias_ID")));
            }
            return mmg;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerMaestrosMateriasGruposbyMateria (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mmg = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestro_Materia_Grupo where Materias_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmg.add(new TrMaestroMateriaGrupo(rs.getInt("MATERIA_GRUPO_MAESTRO_ID"), rs.getInt("Grupo_ID"), rs.getInt("Maestro_ID"),rs.getInt("Materias_ID")));
            }
            return mmg;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    

    public ArrayList obtenerMaestrosMateriasGruposbyGrupoANDMaestro (int idGrupo, int idMaestro){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mmg = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestro_Grupo_Materia where Grupo_ID=".toLowerCase()+idGrupo+" AND Maestro_ID=".toLowerCase()+idMaestro;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmg.add(new TrMaestroMateriaGrupo(rs.getInt("MATERIA_GRUPO_MAESTRO_ID"), rs.getInt("Grupo_ID"), rs.getInt("Maestro_ID"),rs.getInt("Materias_ID")));
            }
            return mmg;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerSesiones (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mmgs = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Sesion".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmgs.add(new TrSesion(rs.getInt("Sesion_ID"),rs.getInt("PreSesion_ID"), rs.getInt("Materia_Grupo_Maestro_ID"),rs.getInt("estado")));
            }
            return mmgs;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
    
    public ArrayList obtenerSesionesbyMaeMatGrpID (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mmgs = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Sesion where MATERIA_GRUPO_MAESTRO_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmgs.add(new TrSesion(rs.getInt("Sesion_ID"),rs.getInt("PreSesion_ID"), rs.getInt("Materia_Grupo_Maestro_ID"),rs.getInt("estado")));
            }
            return mmgs;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerMaestros (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList mae = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestros".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mae.add(new TrMaestros(rs.getInt("Maestro_ID"), rs.getString("Codigo"), rs.getInt("Usuario_ID")));
            }
            return mae;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public ArrayList obtenerPreSesiones (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList ses = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_PreSesion".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ses.add(new TrPreSesion(rs.getInt("PreSesion_ID"), rs.getString("mensaje"), rs.getInt("Estado"),rs.getInt("Criterio_Competencia_Id"), rs.getString("Ponderacion")));
            }
            return ses;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public ArrayList obtenerPreSesionesbyCriterioCompetenciaID (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList ses = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_PreSesion where Criterio_Competencia_Id=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ses.add(new TrPreSesion(rs.getInt("PreSesion_ID"), rs.getString("mensaje"), rs.getInt("Estado"),rs.getInt("Criterio_Competencia_Id"), rs.getString("Ponderacion")));
            }
            return ses;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public ArrayList obtenerUsuarios (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList usr = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_Usuario".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                usr.add(new TrUsuario(rs.getInt("Usuario_ID"), rs.getString("Nombres"), rs.getString("Apellido_Paterno"),rs.getString("Apellido_Materno"), rs.getString("Fecha_Nac").toString(), rs.getString("Usuario"),rs.getString("Imagen"), rs.getInt("Perfil_ID")));
            }
            return usr;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public ArrayList obtenerPreSesionesRechazadas (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList ser = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tr_PreSesion_Rechazada".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ser.add(new TrPreSesionRechazada(rs.getInt("Sesion_Rechazada_ID"), rs.getString("Mensaje"), rs.getInt("PreSesion_Id")));
            }
            return ser;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public ArrayList obtenerEvaluacionesNiveles (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList evn = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Evaluacion_Nivel".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                evn.add(new TcEvaluacionNivel(rs.getInt("Evaluacion_Nivel_ID"), rs.getString("Des_Evaluacion")));
            }
            return evn;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public ArrayList obtenerPerfiles (){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList per = new ArrayList();
            //SQL query command
            String SQL = "SELECT * FROM Tc_Perfil".toLowerCase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                per.add(new TcPerfil(rs.getInt("Perfil_ID"), rs.getString("Des_Perfil")));
            }
            return per;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public ArrayList obtenerMenu (int perfil){
         String SQL="";
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList per = new ArrayList();
            //SQL query command
            SQL = "SELECT * FROM tl_menu WHERE tc_perfil_PERFIL_ID =  "+perfil;
            System.out.print(SQL);
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                per.add(new Tl_Menu(rs.getInt("id_menu"), rs.getString("menu")
                        ,rs.getString("url"), rs.getString("img"), perfil));
            }
            return per;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

        public ArrayList getCarrerasGruposByIdMaestro(int idMaestro) {
            String SQL;
        try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList car = new ArrayList();
            //SQL query command
            SQL = String.format("SELECT c.* FROM tc_carrera c, tc_grupo g, tr_maestro_grupo_materia mgm WHERE mgm.MAESTRO_ID = %d AND mgm.GRUPO_ID = g.GRUPO_ID AND g.CARRERA_id = c.CARRERA_ID", idMaestro);
            System.out.println(SQL);
            stmt = getCon().createStatement();
            rs = stmt.executeQuery(SQL);
            CarreraGrupo cg = null;
            while (rs.next()) {
                cg = new CarreraGrupo(idMaestro, new TcCarrera(rs.getInt("Carrera_ID"), rs.getString("Des_Carrera")));
                cg.setGrupos(this.obtenerGruposByIDCarrera(rs.getInt("Carrera_ID")));
                car.add(cg);

            }
            return car;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.toString());
        }
        return null;
    }

     public ArrayList obtenerGruposByIDCarrera (int idCarrera){
        String SQL;
         try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList grp = new ArrayList();
            //SQL query command
            SQL = String.format("SELECT * FROM tc_grupo WHERE CARRERA_ID = %d", idCarrera);
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                grp.add(new TcGrupo(rs.getInt("GRUPO_ID"), rs.getString("DES_GRUPO"), rs.getInt("CARRERA_ID"), rs.getString("GRADO")));
            }
            return grp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
       public ArrayList obtenerGruposByIDMateria (int idMateria){
        String SQL;
         try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList grp = new ArrayList();
            //SQL query command
            SQL = String.format("SELECT g.*  FROM tc_grupo AS g, tr_maestro_grupo_materia AS gmm WHERE g.GRUPO_ID = gmm.GRUPO_ID AND gmm.MATERIAS_ID = %d", idMateria);
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                grp.add(new TcGrupo(rs.getInt("GRUPO_ID"), rs.getString("DES_GRUPO"), rs.getInt("CARRERA_ID"), rs.getString("GRADO")));
            }
            return grp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }



     public ArrayList getMateriasByMaestroIDGrupoID (int idMaestro, int idGrupo){
        String SQL;
         try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList grp = new ArrayList();
            //SQL query command
            SQL = String.format("SELECT DISTINCT m.* FROM tc_materias m, tc_grupo g, tr_maestro_grupo_materia mgm WHERE mgm.MAESTRO_ID = %d AND mgm.GRUPO_ID = %d AND mgm.MATERIAS_ID = m.MATERIAS_ID" , idMaestro,idGrupo);
            System.out.print(SQL);
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                grp.add(new TcMaterias(rs.getInt("MATERIAS_ID"), rs.getString("DES_MATERIAS"), rs.getInt("DEPARTAMENTO_ID")));
            }
            return grp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
//METODOS PARA OBTENER ESTRATEGIAS
       public ArrayList obtenerEstrategiasGrupales (int idm, int idma, int idg){
         StringBuilder q = new StringBuilder();
           try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList est= new ArrayList();
            //SQL query command
            q.append(" SELECT ");
            q.append(" e.* ");
            q.append(" FROM ");
            q.append(" tr_estra_mgm AS egmm, ");
            q.append(" tr_estrategias AS e, ");
            q.append(" tr_maestro_grupo_materia AS gmm ");
            q.append(" WHERE ");
            q.append(" egmm.ESTRATEGIA_ID = e.ESTRATEGIA_ID AND ");
            q.append(" egmm.MATERIA_GRUPO_MAESTRO_ID = gmm.MATERIA_GRUPO_MAESTRO_ID AND ");
            q.append(" gmm.GRUPO_ID =  ");
            q.append(idg);
            q.append(" AND ");
            q.append(" gmm.MATERIAS_ID =  ");
            q.append(idm);
            q.append(" AND ");
            q.append(" gmm.MAESTRO_ID =  ");
            q.append(idma);
            
            stmt = con.createStatement();
            rs = stmt.executeQuery(q.toString());
            while(rs.next()){
                est.add(new TrEstrategias(rs.getInt("ESTRATEGIA_ID"), rs.getString("FECHA_INICIO_REGISTRO"), rs.getString("MENSAJE"), rs.getString("FECHA_CAMBIO")));
            }
            return est;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

         public ArrayList obtenerEstrategiasAlumnos (int idm, int idma, int idg){
         StringBuilder q = new StringBuilder();
           try {
            Statement stmt = null;
            ResultSet rs = null;
            ArrayList aest= new ArrayList();
            q.append(" SELECT ");
            q.append(" ga.ALUMNOS_ID, ");
            q.append(" e.ESTRATEGIA_ID, ");
            q.append(" a.USUARIO_ID ");
            q.append(" FROM ");
            q.append(" tr_est_alumno AS ea, ");
            q.append(" tr_alumnos AS a, ");
            q.append(" tr_estrategias AS e, ");
            q.append(" tr_maestro_grupo_materia AS gmm, ");
            q.append(" tr_materia_maestro_grupo_alumno AS gmma, ");
            q.append(" tr_grupo_alumno AS ga ");
            q.append(" WHERE ");
            q.append(" ea.ESTRATEGIA_ID = e.ESTRATEGIA_ID AND ");
            q.append(" ea.MGMA_ID = gmma.materia_maestro_grupo_alumno_id AND ");
            q.append(" gmma.MATERIA_GRUPO_MAESTRO_ID = gmm.MATERIA_GRUPO_MAESTRO_ID AND ");
            q.append(" gmma.tr_grupo_alumno_GRUPO_ALUMNO_ID = ga.GRUPO_ALUMNO_ID AND ");
            q.append(" gmm.GRUPO_ID = ga.GRUPO_ID AND ");
            q.append(" ga.ALUMNOS_ID = a.ALUMNOS_ID AND ");
            q.append(" gmm.MATERIAS_ID =  ");
            q.append(idm);
            q.append(" AND ");
            q.append(" gmm.MAESTRO_ID =  ");
            q.append(idma);
            q.append(" AND ");
            q.append(" gmm.GRUPO_ID =  ");
            q.append(idg);

            stmt = con.createStatement();
            rs = stmt.executeQuery(q.toString());
            while(rs.next()){
                aest.add(new TrEstrategiaAlumno(rs.getInt("ESTRATEGIA_ID"),rs.getInt("ALUMNOS_ID"), rs.getInt("USUARIO_ID")));
            }
            return aest;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }




    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;

    }

    public static void main(String []args)
    {
        ObtenerConjunto on = new ObtenerConjunto();
        System.out.print(((ArrayList<TrEstrategiaAlumno>)on.obtenerEstrategiasAlumnos(4, 1, 4)).get(0).getUsuario_id());
    }
}
