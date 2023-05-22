
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tp7.grupo6.Materia;

public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        
        con = Conexion.getConexion();
        
    }
    
    public void guardarMateria(Materia materia){
        
        String sql ="INSERT INTO `materia`(`idMateria`, `nombre`, `año`, `estado`) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, materia.getIdMateria());
            ps.setString(2, materia.getNombre());
            ps.setInt(3, materia.getAnio());
            ps.setBoolean(4, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Materia cargada con exito");
            }
        }catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex);
        }
    }
    public List<Materia> listarMaterias(){
        List<Materia> materias=new ArrayList<>();
        
        
        
        return  materias;
    }
    
    public void buscarMateria(int id){
        
    }
    
    public void borrarMateria(int id){
        
    }
    
    public void actualizarMateria(Materia materia){
        
    }
}
