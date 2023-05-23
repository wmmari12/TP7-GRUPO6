package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tp7.grupo6.Inscripcion;
import tp7.grupo6.Materia;

public class InscripcionData {

    private Connection con = null;

    private MateriaData matData;
    private AlumnoData alumData;

    public InscripcionData() {
    }

    public void guardarInscripcion(Inscripcion insc) {
        //double nota, Alumno alumno, Materia materia
        String sql = "INSERT INTO `inscripcion`(`nota`, `idAlumno`, `idMateria`) VALUES (?,?,?)";

        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            int filas=ps.executeUpdate();
//            int filas = ps.getGeneratedKeys();
            System.out.println("inscripcion existosa");
            if (filas==1)
            {
                //insc.setIdInscripcion(rs.getInt());//probar
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");
            } else
            {
                JOptionPane.showMessageDialog(null, "El alumno no fue inscripto.");
            }
            
            
        } catch (SQLException ex)
        {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//    
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones=new ArrayList<>();
        
        
        
        
        
        
        return inscripciones;
    }
//    
//    public List<Inscripcion> obtenerInscripcionesPorAlumno(){
//        
//    }
//    
//    public List<Materia> obtenerMateriasCursadas(int id){
//        
//    }
//    
//    public List<Materia> obtenerMateriasNoCursadas(int id){
//        
//    }
//    
//    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
//        
//    }
//    
//    public void actualizarNota(int idAlumno, int idMateria,double nota){
//        
//    }
//    
//    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
//        
// }
}
