/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MovimientosBD;

import clases.*;
import java.sql.*;

/**
 *
 * @author Sandsower
 */
public class ObtenerIndividuo {

    private Connection con;

    public ObtenerIndividuo() {
        ConexionBD nuevaConexion = new ConexionBD();
        nuevaConexion.conectarBD("root", "13450811");
        this.setCon(nuevaConexion.getCon());
    }

    public TcCarrera obtenerCarrera(int id) {
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcCarrera car = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Carrera WHERE Carrera_ID=" + id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                car = new TcCarrera(rs.getInt("Carrera_ID"), rs.getString("Des_Carrera"));
            }
            return car;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.toString());
        }
        return null;
    }
    
    public TcCategorias obtenerCategoria (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcCategorias cat = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Categoria WHERE Categoria_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cat = new TcCategorias(rs.getInt("Categoria_ID"),rs.getString("Des_categoria"), rs.getString("Descripcion"), rs.getInt("Order"));
            }
            return cat;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TcCompetencias obtenerCompetencia (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcCompetencias com = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Competencias WHERE Competencia_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                com = new TcCompetencias(rs.getInt("Competencia_ID"), rs.getString("Des_Competencia"), rs.getString("Descripcion"), rs.getInt("Categoria_ID"));
            }
            return com;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TcCriterios obtenerCriterio (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcCriterios cri = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Criterios WHERE Criterio_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cri = new TcCriterios(rs.getInt("Criterio_ID"), rs.getString("Des_Criterio"), rs.getString("Descripcion"));
            }
            return cri;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public TcDepartamentos obtenerDepartamento (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcDepartamentos dep = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Departamentos WHERE Departamento_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                dep = new TcDepartamentos(rs.getInt("Departamento_ID"), rs.getString("Des_Departamento"));
            }
            return dep;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public TcGrupo obtenerGrupo (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcGrupo grp = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Grupo WHERE Grupo_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                grp = new TcGrupo(rs.getInt("Grupo_ID"), rs.getString("Des_Grupo"), rs.getInt("Carrera_ID"), rs.getString("Cuatrimestre"), rs.getString("Letra"));
            }
            return grp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }


    public TcMaterias obtenerMateria (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcMaterias mat = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Materias WHERE Materias_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mat = new TcMaterias(rs.getInt("Materias_ID"), rs.getString("Des_Materias"), rs.getInt("Departamento"));
            }
            return mat;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TcReportes obtenerReporte (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcReportes rep = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Reportes WHERE Reportes_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                rep = new TcReportes(rs.getInt("Reportes_ID"), rs.getString("Des_Reportes"), rs.getInt("Perfil_ID"));
            }
            return rep;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TcTipoEvaluacion obtenerTipoEvaluacion (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcTipoEvaluacion tev = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Tipo_Evaluacion WHERE Tipo_Evaluacion_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                tev = new TcTipoEvaluacion(rs.getInt("Tipo_Evaluacion_ID"), rs.getString("Des_Tipo_Evaluacion"));
            }
            return tev;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrAlumnos obtenerAlumnobyID (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrAlumnos alm = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Alumnos WHERE Alumnos_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                alm = new TrAlumnos(rs.getInt("Alumnos_ID"), rs.getString("Matricula"), rs.getInt("Usuario_ID"), rs.getInt("Grupo_ID"), rs.getInt("Carrera_ID"));
            }
            return alm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrAlumnos obtenerAlumnobyMatricula (String matricula){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrAlumnos alm = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Alumnos WHERE Matricula="+matricula;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                alm = new TrAlumnos(rs.getInt("Alumnos_ID"), rs.getString("Matricula"), rs.getInt("Usuario_ID"), rs.getInt("Grupo_ID"), rs.getInt("Carrera_ID"));
            }
            return alm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrComentarioDPAEstrategia obtenerComentarioDPAEstrategia (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrComentarioDPAEstrategia cde = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Comentario_Pda_Estrategia WHERE Coment_Estra_DPA_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cde = new TrComentarioDPAEstrategia(rs.getInt("Coment_Estra_DPA_ID"), rs.getInt("Estrategia_ID"));
            }
            return cde;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
    public TrCriterioCompetencia obtenerCriterioCompetencia (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrCriterioCompetencia ccm = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Criterio_Competencia WHERE Criterio_Competencia_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ccm = new TrCriterioCompetencia(rs.getInt("Criterio_ID"), rs.getString("Des_Criterio"), rs.getString("Descripcion"));
            }
            return ccm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrEstrategias obtenerEstrategia (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrEstrategias est = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Comentario_Pda_Estrategia WHERE Coment_Estra_DPA_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                est = new TrEstrategias(rs.getInt("Estrategia_ID"), rs.getString("Fecha_Inicio_Registro"), rs.getString("Mensaje"), rs.getString("Maestro_ID"), rs.getInt("Maestros_Maestro_ID"), rs.getInt("Evaluacion"));
            }
            return est;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrEvaluacionAcumulativa obtenerEvaluacionAcumulativa (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrEvaluacionAcumulativa eva = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Acumulativa WHERE Tr_Evaluacion_Acumulativa_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                eva = new TrEvaluacionAcumulativa(rs.getInt("Evaluacion_Acumulativa_ID"), rs.getInt("Parcial"), rs.getInt("Calificacion"));
            }
            return eva;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrEvaluacionParcial obtenerEvaluacionParcial (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrEvaluacionParcial evp = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Parcial WHERE Tr_Evaluacion_Parcial_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                evp = new TrEvaluacionParcial(rs.getInt("Evaluacion_Parcial_ID"), rs.getInt("Calificacion"), rs.getInt("Parcial"),rs.getInt("Evaluacion_Nivel_ID"), rs.getInt("Tipo_Evaluacion_ID"), rs.getInt("Maestro_Materia_Grupo_Sesion_ID"), rs.getInt("Alumnos_ID"));
            }
            return evp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrEvaluacionParcialAcumulativa obtenerEvaluacionParcialAcumulativa (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrEvaluacionParcialAcumulativa epa = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Parcial_Acumulativa WHERE Tr_Evaluacion_Parcial_Acumulativa_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                epa = new TrEvaluacionParcialAcumulativa(rs.getInt("Evaluacion_Parcial_Acumulativa_ID"), rs.getInt("Evaluacion_Parcial_ID"), rs.getInt("Evaluacion_Acumulativa_ID"));
            }
            return epa;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrMaestroMateria obtenerMaestroMateria (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrMaestroMateria mma = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestro_Materia WHERE Tr_Maestro_Materia_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mma = new TrMaestroMateria(rs.getInt("Maestro_Materia_ID"), rs.getInt("Materia_ID"), rs.getInt("Maestro_ID"));
            }
            return mma;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrMaestroMateriaGrupo obtenerMaestroMateriaGrupo (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrMaestroMateriaGrupo mmg = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestro_Materia_Grupo WHERE Tr_Maestro_Materia_Grupo_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmg = new TrMaestroMateriaGrupo(rs.getInt("Maestro_Materia_Grupo_ID"), rs.getInt("Grupo_ID"), rs.getInt("Maestro_Materia_ID"));
            }
            return mmg;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrMaestroMateriaGrupoSesion obtenerMaestroMateriaGrupoSesion (int id){
        try {
            ConexionBD nuevaConexion = new ConexionBD();
            nuevaConexion.conectarBD("root", "13450811");
            Connection con = nuevaConexion.getCon();
            Statement stmt = null;
            ResultSet rs = null;
            TrMaestroMateriaGrupoSesion mmgs = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestro_Materia_Grupo_Sesion WHERE Tr_Maestro_Materia_Grupo_Sesion_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmgs = new TrMaestroMateriaGrupoSesion(rs.getInt("Maestro_Materia_Grupo_Sesion_ID"),rs.getInt("Sesion_ID"), rs.getInt("Maestro_Materia_Grupo_ID"));
            }
            return mmgs;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrMaestros obtenerMaestro (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrMaestros mae = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Carrera WHERE Carrera_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mae = new TrMaestros(rs.getInt("Maestro_ID"), rs.getString("Codigo"), rs.getInt("Usuario_ID"));
            }
            return mae;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public TrSesion obtenerSesion (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrSesion ses = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Sesion WHERE Sesion_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ses = new TrSesion(rs.getInt("Sesion_ID"), rs.getString("mensaje"), rs.getInt("Estado"), rs.getInt("Criterio_Competencia_ID"), rs.getInt("Sesion_Rechazada_ID"), rs.getString("Ponderacion"));
            }
            return ses;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public TrUsuario obtenerUsuario (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrUsuario usr = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Usuario WHERE Tr_Usuario_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                usr = new TrUsuario(rs.getInt("Usuario_ID"), rs.getString("Nombres"), rs.getString("Apellidos"), rs.getString("Fecha_Nac"), rs.getString("Usuario"), rs.getString("Password"), rs.getInt("Perfil_ID"));
            }
            return usr;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public TrSesionRechazada obtenerSesionRechazada (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrSesionRechazada ser = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Sesion_Rechazada WHERE Sesion_Rechazada_ID="+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ser = new TrSesionRechazada(rs.getInt("Sesion_Rechazada_ID"), rs.getString("Mensaje"));
            }
            return ser;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public static void main(String[] args) {
        ObtenerIndividuo obt = new ObtenerIndividuo();
        TrEstrategias estr = obt.obtenerEstrategia(1);
        System.out.println(estr.toString());
        TrComentarioDPAEstrategia cde = obt.obtenerComentarioDPAEstrategia(1);
        System.out.println(cde.toString());
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }
}