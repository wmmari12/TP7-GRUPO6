package AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
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
import tp7.grupo6.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();

    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO `materia`(`nombre`, `año`, `estado`) VALUES (?,?,?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
            {
                materia.setIdMateria(rs.getInt(1));//probar
                JOptionPane.showMessageDialog(null, "Materia cargada con exito");
            }else{
                JOptionPane.showMessageDialog(null, "Materia no pudo ser agregada");
            }
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }

    public Materia buscarMateria(int id) {

        Materia materia=null;
        String sql = "SELECT `idMateria`, `nombre`, `año`, `estado` FROM `materia` WHERE idMateria=?";
        PreparedStatement ps = null;

        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                materia= new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                System.out.println("Materia encontrada");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se encontro la materia");
            }
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
        }
        return materia;
    }

    public void eliminarMateria(int id) {

        try
        {
            String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1)
            {
                JOptionPane.showMessageDialog(null, "La materia ha sido eliminada");
            }else{
                JOptionPane.showMessageDialog(null, "La materia NO ha sido eliminada");
            }
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+ex.getMessage());
        }
    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE `materia` SET `nombre`=?,`año`=?,`estado`=? WHERE idMateria=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            
            int fila = ps.executeUpdate();
            if (fila == 1)
            {
                JOptionPane.showMessageDialog(null, "La materia ha sido modificada");
            }else{
                System.out.println("No se encontro la materia");
            }
            
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }

    }

    public List<Materia> listarMaterias() {
        
        List<Materia> materias = new ArrayList<>();
        
        try{
            String sql= "SELECT * from materia WHERE estado=1";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Materia materia = new Materia();//creamos un alumno y seteamos sus valores con los obtenidos de la BD
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno"+ex.getMessage());
        }
        return materias;
}
}
