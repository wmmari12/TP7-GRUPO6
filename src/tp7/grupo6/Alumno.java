
package tp7.grupo6;

import java.time.LocalDate;
import java.util.HashSet;


public class Alumno {
    
    private int idAlummno;
    private String dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private boolean estado;
    
    //los 3 constructores vacios con id y sin id, y vacio

    public Alumno() {
    }

    public Alumno(String dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public Alumno(int id_alummno, String dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.idAlummno = id_alummno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getId_alummno() {
        return idAlummno;
    }

    public void setId_alummno(int id_alummno) {
        this.idAlummno = id_alummno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    //sobreescribir tostring, losmismo en inscripcion y alumno

    @Override
    public String toString() {
        return  dni + " " + apellido + " " + nombre + " ";
    }
    
}
