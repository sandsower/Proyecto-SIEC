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
        nuevaConexion.conectarBD("root", "13450811");
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
                ses.add(new TrPreSesion(rs.getInt("PreSesion_ID"), rs.getString("mensaje"), rs.getInt("Estado"), rs.getInt("Ponderacion"), rs.getString("Criterio_Competencia_Id")));
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
            String SQL = "SELECT * FROM Tr_PreSesion where criterio_competencia_criterio_competencia_id=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ses.add(new TrPreSesion(rs.getInt("PreSesion_ID"), rs.getString("mensaje"), rs.getInt("Estado"), rs.getInt("Criterio_Competencia_Criterio_Competencia_ID"), rs.getString("Ponderacion")));
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

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

}
