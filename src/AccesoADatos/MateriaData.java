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
import tp7.grupo6.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();

    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO `materia`(`idMateria`, `nombre`, `año`, `estado`) VALUES (?,?,?,?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, materia.getIdMateria());
            ps.setString(2, materia.getNombre());
            ps.setInt(3, materia.getAnio());
            ps.setBoolean(4, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
            {
                //probar
                JOptionPane.showMessageDialog(null, "Materia cargada con exito");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex);
        }
    }

    public Materia buscarMateria(int id) {

        Materia materia = new Materia();
        String sql = "SELECT `idMateria`, `nombre`, `año`, `estado` FROM `materia` WHERE idMateria=?";
        PreparedStatement ps = null;

        try
        {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                {
                    materia.setIdMateria(id);
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnio(rs.getInt("año"));
                    materia.setEstado(rs.getBoolean("estado"));
                } else
                {
                    JOptionPane.showMessageDialog(null, "No se encontro la materia");
                }
                ps.close();
            } catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
            }
            return materia;
        
//
//
//    public void eliminarMateria(int id) {
//
//    }
//
//    public void modificarMateria(Materia materia) {
//
//    }
//
//    public List<Materia> listarMaterias() {
//        List<Materia> materias = new ArrayList<>();
//
//        return materias;
   }
}
