/*
 * INTEGRANTES

 */
package tp7.grupo6;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;

public class Colegio {

    
    public static void main(String[] args) {
        
        //public Alumno(int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado)
       Alumno alumno=new Alumno(33888469,"Flores", "Mariana",LocalDate.of(1989, 06, 12),true);
//        AlumnoData alumnoData=new AlumnoData();
//        
//        alumnoData.guardarAlumno(alumno);
        
        //String nombre, int anio, boolean estado
        Materia materia=new Materia(6,"Web 3",3,true);
        MateriaData materiaData=new MateriaData();
        //materiaData.guardarMateria(materia);
//        System.out.println(materiaData.listarMaterias());
        Inscripcion inscripcion=new Inscripcion(0.0,alumno,materia);
        InscripcionData insc=new InscripcionData();
        insc.guardarInscripcion(inscripcion);
        
 
//        HashSet <Materia> materia= new HashSet<>();
//        Materia materia1 = new Materia(1, "Ingles I", 1);
//        Materia materia2 = new Materia(2, "Matemáticas", 1);
//        Materia materia3 = new Materia(3, "Laboratorio I", 1);
//        
//        Alumno alumno1 = new Alumno(1001, "López", "Martin");
//        Alumno alumno2 = new Alumno(1002, "Martinez", "Brenda");
//        //Inscribir a López en las 3 materias.
//        alumno1.agregarMateria(materia1);
//        alumno1.agregarMateria(materia2);
//        alumno1.agregarMateria(materia3);
//        
//        //Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
//        alumno2.agregarMateria(materia1);
//        alumno2.agregarMateria(materia2);
//        alumno2.agregarMateria(materia3);
//        alumno2.agregarMateria(materia3);
//        
//        System.out.println("La cantidad de materia del alumno "+alumno1.getApellido()+" son: "+alumno1.cantidadMaterias());
//        System.out.println("La cantidad de materia del alumno "+alumno2.getApellido()+" son: "+alumno2.cantidadMaterias());
        
        
    }
    
}
