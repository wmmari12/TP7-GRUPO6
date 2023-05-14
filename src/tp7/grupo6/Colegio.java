/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.grupo6;

import java.util.HashSet;

public class Colegio {

    
    public static void main(String[] args) {

        
        Alumno alumno = new Alumno(123, "juan", "juan");
        Materia materia = new Materia(1, "matematica", 1);
        alumno.agregarMateria(materia);
        System.out.println(alumno.cantidadMaterias());
        
        
    }
    
}
