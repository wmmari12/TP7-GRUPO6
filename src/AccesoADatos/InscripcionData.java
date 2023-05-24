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
import tp7.grupo6.Alumno;
import tp7.grupo6.Inscripcion;
import tp7.grupo6.Materia;

public class InscripcionData {

    private Connection con = null;

    private MateriaData matData;
    private AlumnoData alumData;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    private Materia nuevaMateria(int id) {
        // permite reestructurar un objeto materia desde un id
        MateriaData materia = new MateriaData();
        return materia.buscarMateria(id);
    }

    private Alumno nuevoAlumno(int id) {
        // permite reestructurar un objeto materia desde un id
        AlumnoData alumno = new AlumnoData();
        return alumno.buscarAlumno(id);
    }

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO `inscripcion`(`nota`, `idAlumno`, `idMateria`) VALUES (?,?,?)";

        try
        {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            System.out.println("inscripcion existosa");
            if (rs.next())
            {
                insc.setIdInscripcion(rs.getInt(1));//probar
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");
            } else
            {
                JOptionPane.showMessageDialog(null, "El alumno no fue inscripto.");
            }
            con.close();

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar inscripcion.BD");
        }

    }
//    

    public List<Inscripcion> obtenerInscripciones() {

        List<Inscripcion> inscripciones = new ArrayList<>();

        try
        {
            String sql = "SELECT * FROM `inscripcion'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                
                Alumno a=nuevoAlumno(rs.getInt("idAlumno"));
                insc.setAlumno(a);
                
                Materia m=nuevaMateria(rs.getInt("idMateria"));
                insc.setMateria(m);
                
                insc.setNota(rs.getInt("nota"));
                inscripciones.add(insc);
            }

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }

        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        
        List<Inscripcion> inscripciones = new ArrayList<>();

        try
        {
            String sql = "SELECT * FROM `inscripcion' WHERE idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                
                Alumno a=nuevoAlumno(rs.getInt("idAlumno"));
                insc.setAlumno(a);
                
                Materia m=nuevaMateria(rs.getInt("idMateria"));
                insc.setMateria(m);
                
                insc.setNota(rs.getInt("nota"));
                inscripciones.add(insc);
            }

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripciones");
        }

        return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> materias = new ArrayList<>();

        try
        {
            String sql = "SELECT materia.* FROM `inscripcion' WHERE idAlumno=? AND estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                
                Alumno a=nuevoAlumno(rs.getInt("idAlumno"));
                insc.setAlumno(a);
                
                Materia m=nuevaMateria(rs.getInt("idMateria"));
                insc.setMateria(m);
                
                insc.setNota(rs.getInt("nota"));
                materias.add(insc);
            }

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }

        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id){
         List<Materia> materias = new ArrayList<>();

        try
        {
            String sql = "SELECT materia.* FROM `inscripcion' WHERE idAlumno=? AND estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                
                Alumno a=nuevoAlumno(rs.getInt("idAlumno"));
                insc.setAlumno(a);
                
                Materia m=nuevaMateria(rs.getInt("idMateria"));
                insc.setMateria(m);
                
                insc.setNota(rs.getInt("nota"));
                inscripciones.add(insc);
            }

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }

        return materias;
    }
    

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        try
        {
            String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();
            if (fila == 2)
            {
                JOptionPane.showMessageDialog(null, "La inscripcion ha sido borrada.");
            }
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        
        try{
            String sql="UPDATE `inscripcion` SET `nota`=? WHERE idAlumno=? AND idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, "La nota ha sido modificada");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la inscripcion solicitada!");
            }
              
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno7");
        }
        
        
        
        
    }

//    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
//        
//    }
}
