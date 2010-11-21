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
 * @author Sandsower
 */
public class ObtenerIndividuo {

    private Connection con;

    public ObtenerIndividuo() {
        ConexionBD nuevaConexion = new ConexionBD();
        nuevaConexion.conectarBD("root", "root");
        this.setCon(nuevaConexion.getCon());
    }

    public TcCarrera obtenerCarrera(int id) {
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcCarrera car = null;
            //SQL query command
            String SQL = "SELECT * FROM tc_carrera WHERE Carrera_ID=".toLowerCase() + id;
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
            String SQL = "SELECT * FROM Tc_Categorias WHERE Categoria_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                cat = new TcCategorias(rs.getInt("Categoria_ID"),rs.getString("Des_categoria"), rs.getString("Descripcion"), rs.getInt("Orden"));
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
            String SQL = "SELECT * FROM Tc_Competencias WHERE Competencia_ID=".toLowerCase()+id;
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
            String SQL = "SELECT * FROM Tc_Criterios WHERE Criterio_ID=".toLowerCase()+id;
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
            String SQL = "SELECT * FROM Tc_Departamentos WHERE Departamento_ID=".toLowerCase()+id;
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
            String SQL = "SELECT * FROM tc_grupo WHERE GRUPO_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                grp = new TcGrupo(rs.getInt("GRUPO_ID"), rs.getString("DES_GRUPO"), rs.getInt("CARRERA_ID"), rs.getString("GRADO"));
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
            String SQL = "SELECT * FROM Tc_Materias WHERE Materias_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mat = new TcMaterias(rs.getInt("Materias_ID"), rs.getString("Des_Materias"), rs.getInt("Departamento_ID"));
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
            String SQL = "SELECT * FROM Tc_Reportes WHERE Reportes_ID=".toLowerCase()+id;
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
            String SQL = "SELECT * FROM Tc_Tipo_Evaluacion WHERE Tipo_Evaluacion_ID=".toLowerCase()+id;
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
            String SQL = "SELECT * FROM Tr_Alumnos WHERE Alumnos_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                alm = new TrAlumnos(rs.getInt("Alumnos_ID"), rs.getString("Matricula"), rs.getInt("Usuario_ID"), rs.getInt("Carrera_ID"));
            }
            return alm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrAlumnos obtenerAlumnobyUsuarioID (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrAlumnos alm = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Alumnos WHERE Usuario_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                alm = new TrAlumnos(rs.getInt("Alumnos_ID"), rs.getString("Matricula"), rs.getInt("Usuario_ID"), rs.getInt("Carrera_ID"));
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
            String SQL = "SELECT * FROM Tr_Alumnos WHERE Matricula='".toLowerCase()+matricula+"'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                alm = new TrAlumnos(rs.getInt("Alumnos_ID"), rs.getString("Matricula"), rs.getInt("Usuario_ID"), rs.getInt("Carrera_ID"));
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
            String SQL = "SELECT * FROM Tr_Comentario_Dpa_Estrategia WHERE Coment_Estra_DPA_ID=".toLowerCase()+id;
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
            String SQL = "SELECT * FROM Tr_Criterio_Competencia WHERE Criterio_Competencia_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ccm = new TrCriterioCompetencia(rs.getInt("Criterio_ID"), rs.getInt("Criterio_Competencia_ID"), rs.getInt("Competencia_ID"), rs.getString("Ponderacion_Criterio"));
            }
            return ccm;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrGrupoAlumno obtenerGrupoAlumno(int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrGrupoAlumno gra = null;
            String SQL = "SELECT * FROM tr_grupo_alumno WHERE GRUPO_ALUMNO_ID=".toLowerCase() + id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                gra = new TrGrupoAlumno(rs.getInt("GRUPO_ALUMNO_ID"), rs.getInt("GRUPO_ID"), rs.getInt("ALUMNOS_ID"));
            }
            return gra;
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerIndividuo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public TrEstrategias obtenerEstrategia (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrEstrategias est = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Estrategias WHERE Estrategia_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                est = new TrEstrategias(rs.getInt("Estrategia_ID"), rs.getString("Fecha_Inicio_Registro"), rs.getString("Mensaje"), rs.getString("Fecha_Cambio"));
            }
            return est;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrEvaluacionAcumulativa obtenerEvaluacionAcumulativa (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrEvaluacionAcumulativa eva = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Acumulativa WHERE Evaluacion_Acumulativa_ID=".toLowerCase()+id;
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
            String SQL = "SELECT * FROM Tr_Evaluacion_Parcial WHERE Evaluacion_Parcial_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                evp = new TrEvaluacionParcial(rs.getInt("Evaluacion_Parcial_ID"), rs.getInt("Calificacion"), rs.getInt("Parcial"),rs.getInt("Evaluacion_Nivel_ID"), rs.getInt("Tipo_Evaluacion_ID"), rs.getInt("Sesion_ID"), rs.getInt("Alumnos_ID"));
            }
            return evp;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrEvaluacionParcial obtenerEvaluacionParcialFilter (int idSesion, int tipo, int idAlumno){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrEvaluacionParcial evp = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Evaluacion_Parcial WHERE Sesion_ID=".toLowerCase()+idSesion+" AND Tipo_Evaluacion_ID=".toLowerCase()+tipo+" AND Alumnos_ID=".toLowerCase()+idAlumno;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                evp = new TrEvaluacionParcial(rs.getInt("Evaluacion_Parcial_ID"), rs.getInt("Calificacion"), rs.getInt("Parcial"),rs.getInt("Evaluacion_Nivel_ID"), rs.getInt("Tipo_Evaluacion_ID"), rs.getInt("Sesion_ID"), rs.getInt("Alumnos_ID"));
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
            String SQL = "SELECT * FROM Tr_Evaluacion_Parcial_Acumulativa WHERE Evaluacion_Parcial_Acumulativa_ID=".toLowerCase()+id;
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

    public TrMaestroMateriaGrupo obtenerMaestroMateriaGrupo (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrMaestroMateriaGrupo mmg = null;
            //SQL query command
            String SQL = "SELECT * FROM tr_maestro_grupo_materia WHERE MATERIA_GRUPO_MAESTRO_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmg = new TrMaestroMateriaGrupo(rs.getInt("MATERIA_GRUPO_MAESTRO_ID"), rs.getInt("Grupo_ID"), rs.getInt("Maestro_ID"),rs.getInt("Materias_ID"));
            }
            return mmg;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

    public TrSesion obtenerSesion (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrSesion mmgs = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Sesion WHERE Sesion_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                mmgs = new TrSesion(rs.getInt("Sesion_ID"),rs.getInt("PreSesion_ID"), rs.getInt("Materia_Grupo_Maestro_ID"),rs.getInt("estado"));
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
            String SQL = "SELECT * FROM Tr_Maestros WHERE Maestro_ID=".toLowerCase()+id;
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

    public TrMaestros obtenerMaestrobyUsuario_ID(int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrMaestros mae = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_Maestros WHERE Usuario_ID=".toLowerCase()+id;
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

     public TrPreSesion obtenerPreSesion (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrPreSesion ses = null;
            //SQL query command
            String SQL = "SELECT * FROM Tr_PreSesion WHERE PreSesion_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ses = new TrPreSesion(rs.getInt("PreSesion_ID"), rs.getString("mensaje"), rs.getInt("Estado"),rs.getInt("Criterio_Competencia_Id"), rs.getString("Ponderacion"));
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
            String SQL = "SELECT * FROM Tr_Usuario WHERE Usuario_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                usr = new TrUsuario(rs.getInt("Usuario_ID"), rs.getString("Nombres"), rs.getString("Apellido_Paterno"),rs.getString("Apellido_Materno"), rs.getString("Fecha_Nac").toString(), rs.getString("Usuario"),rs.getString("Imagen"), rs.getInt("Perfil_ID"));
            }
            return usr;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public TrPreSesionRechazada obtenerPreSesionRechazada (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrPreSesionRechazada ser = null;
            //SQL query command
            String SQL = "SELECT * FROM tr_presesion_rechazada WHERE SESION_RECHAZADA_ID=".toLowerCase()+id;
            stmt = con.createStatement();
                rs = stmt.executeQuery(SQL);
            while(rs.next()){
                ser = new TrPreSesionRechazada(rs.getInt("Sesion_Rechazada_ID"), rs.getString("Mensaje"), rs.getInt("PreSesion_Id"));
            }
            return ser;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

     public TcEvaluacionNivel obtenerEvaluacionNivel (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcEvaluacionNivel evn = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Evaluacion_Nivel WHERE Evaluacion_Nivel_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                evn = new TcEvaluacionNivel(rs.getInt("Evaluacion_Nivel_ID"), rs.getString("Des_Evaluacion"));
            }
            return evn;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }
     
     public TcPerfil obtenerPerfil (int id){
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TcPerfil per = null;
            //SQL query command
            String SQL = "SELECT * FROM Tc_Perfil WHERE Perfil_ID=".toLowerCase()+id;
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                per = new TcPerfil(rs.getInt("Perfil_ID"), rs.getString("Des_Perfil"));
            }
            return per;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        }
        return null;
    }

// Esta tabla ya no existe
//    public static void main(String[] args) {
//        ObtenerIndividuo obt = new ObtenerIndividuo();
//        TrEstrategias estr = obt.obtenerEstrategia(1);
//        System.out.println(estr.toString());
//        TrComentarioDPAEstrategia cde = obt.obtenerComentarioDPAEstrategia(1);
//        System.out.println(cde.toString());
//    }

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


     public TrUsuario Login (String username, String password){
         String SQL = null;
        try {
            Statement stmt = null;
            ResultSet rs = null;
            TrUsuario usr = null;
            //SQL query command
            SQL = String.format("SELECT * FROM tr_usuario WHERE USUARIO = '%s' AND PASSWORD = '%s'",username,password);

            System.out.println("SQL Exception: "+ SQL);
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while(rs.next()){
                usr = new TrUsuario(rs.getInt("Usuario_ID"), rs.getString("Nombres"), rs.getString("Apellido_Paterno"),rs.getString("Apellido_Materno"), rs.getString("Fecha_Nac").toString(), rs.getString("Usuario"),rs.getString("Imagen"), rs.getInt("Perfil_ID"));
            }
            return usr;
        } catch (SQLException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        } catch (NullPointerException e){
            System.out.println("Exception: "+ e.toString());
        }
        return null;
    }
}

