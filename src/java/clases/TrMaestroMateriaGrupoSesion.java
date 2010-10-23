
package clases;

import MovimientosBD.ConexionBD;
import java.sql.*;


public class TrMaestroMateriaGrupoSesion {

    private int maestroMateriaGrupoSesion_ID;
    private int sesionSesion_ID;
    private int maeMatGrp_ID;


    public TrMaestroMateriaGrupoSesion( int maestroMateriaGrupoSesion_ID,int sesionSesion_ID, int maeMatGrp_ID)
    {
       this.setMaeMatGrp_ID(maeMatGrp_ID);
       this.setMaestroMateriaGrupoSesion_ID(maestroMateriaGrupoSesion_ID);
       this.setSesionSesion_ID(sesionSesion_ID);
    }

    /**
     * @return the maestroMateriaGrupoSesion_ID
     */
    public int getMaestroMateriaGrupoSesion_ID() {
        return maestroMateriaGrupoSesion_ID;
    }

    /**
     * @param maestroMateriaGrupoSesion_ID the maestroMateriaGrupoSesion_ID to set
     */
    public void setMaestroMateriaGrupoSesion_ID(int maestroMateriaGrupoSesion_ID) {
        this.maestroMateriaGrupoSesion_ID = maestroMateriaGrupoSesion_ID;
    }

    /**
     * @return the sesionSesion_ID
     */
    public int getSesionSesion_ID() {
        return sesionSesion_ID;
    }

    /**
     * @param sesionSesion_ID the sesionSesion_ID to set
     */
    public void setSesionSesion_ID(int sesionSesion_ID) {
        this.sesionSesion_ID = sesionSesion_ID;
    }

    /**
     * @return the maeMatGrp_ID
     */
    public int getMaeMatGrp_ID() {
        return maeMatGrp_ID;
    }

    /**
     * @param maeMatGrp_ID the maeMatGrp_ID to set
     */
    public void setMaeMatGrp_ID(int maeMatGrp_ID) {
        this.maeMatGrp_ID = maeMatGrp_ID;
    }

    public TrMaestroMateriaGrupoSesion obtenerMaestroMateriaGrupo (int id){
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
}
