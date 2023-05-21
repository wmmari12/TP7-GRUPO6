/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.grupo6;

/**
 *
 * @author solmedina
 */
public class Inscripcion {
    private int id_inscripcion;
    private double nota;
    private Alumno alumno;
    private Materia materia;
    //los 3 constructores

    public Inscripcion() {
    }

    public Inscripcion(double nota, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(int id_inscripcion, double nota, Alumno alumno, Materia materia) {
        this.id_inscripcion = id_inscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }
    
}
