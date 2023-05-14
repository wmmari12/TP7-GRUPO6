
package tp7.grupo6;

import java.util.HashSet;


public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    HashSet <Materia> materia;

    public Alumno() {
    }

    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materia=new HashSet();
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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
    
    public void agregarMateria(Materia m){
        
        if(materia.add(m)){
            System.out.println("Inscripcion correcta.");
        }else {
            System.out.println("Usted ya se encuentra inscripto en la materia.");
        }
        
    }
    public int cantidadMaterias(){
        
        return materia.size();
    }
    
}
