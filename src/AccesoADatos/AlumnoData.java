package AccesoADatos;

import tp7.grupo6.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {

        con = Conexion.getConexion();

    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//localDate a Date
            ps.setBoolean(5, alumno.isEstado()); // if reducido
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
            {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
            } else
            {
                JOptionPane.showMessageDialog(null, "El alumno no fue añadido.");
            }

            ps.close();

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex);
        }

    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = new Alumno();
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno=? AND estado = 1";//creamos la consulta a enviar
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setInt(1, id);//1 es el primer atributo que buscamos con where y id es el valor a buscar
            ResultSet rs = ps.executeQuery();//guardamos el resultado obtenido de la base de datos

            if (rs.next())
            {//se posiciona en la primer fila de la busqueda
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setEstado(rs.getBoolean("estado"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            } else
            {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
        return alumno;
    }

    public Alumno modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimiento=? WHERE idAlumno=?";//
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            
        ps.close();//cerramos la conexion
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
    }
    return alumno;

}

}