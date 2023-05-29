/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlado;

import tp7.grupo6.Inscripcion;
import com.sun.org.apache.xerces.internal.xs.XSConstants;
import java.awt.Menu;
import static java.awt.SystemColor.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tp7.grupo6.Alumno;
import tp7.grupo6.Colegio;
import tp7.grupo6.Materia;
import vistas2.ViewFormAlumnos;
import vistas2.ViewFormCargaDeNotas;
import vistas2.ViewFormInscripcion;
import vistas2.ViewFormListadoAlum_x_Materia;
import vistas2.ViewFormMaterias;

/**
 *
 * @author usuario
 */
public class Controlador implements ActionListener{

    private Menu mn;
    private ViewFormAlumnos vfa;
    private ViewFormCargaDeNotas vfn;
    private ViewFormInscripcion vfi;
    private ViewFormListadoAlum_x_Materia vfaxm;
    private ViewFormMaterias vfms;
    private Alumno alu;
    
    private Inscripcion inscri;
    private Materia materia;
    
    public Controlador(Menu menu , ViewFormAlumnos vfa ,ViewFormCargaDeNotas vfcdn ,ViewFormInscripcion vfi, ViewFormListadoAlum_x_Materia vflam,ViewFormMaterias vfm,Alumno alumno , Inscripcion inscrip, Materia materia ){
        
      this.mn = menu; 
      this.vfa = vfa;
      this.vfn = vfcdn;
      this.vfi = vfi;
      this.vfaxm = vflam;
      this.vfms = vfm;
      this.alu = alumno;
      
      this.inscri = inscrip;
      this.materia = materia;
     this.mn.addActionListener(this);
   
    } 

    public Controlador(lavista.Menu mn, ViewFormAlumnos vfa, ViewFormCargaDeNotas vfcn, ViewFormInscripcion vfi, ViewFormListadoAlum_x_Materia vfaxm, ViewFormMaterias vfmate, Alumno alumno, Inscripcion inscrip, Materia materia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public void actionPerformed(ActionEvent e){
        
       alu.setNombre(alu.getNombre());
       alu.setApellido(alu.getApellido());
       alu.setDni(alu.getDni());
       
       materia.setAnio(materia.getAnio());
       materia.setEstado(materia.isEstado());
       materia.setIdMateria(materia.getIdMateria());
       materia.setNombre(materia.getNombre());
       
       inscri.setIdInscripcion(inscri.getIdInscripcion());
       inscri.setAlumno(alu);
       inscri.setMateria(materia);
       inscri.setNota(inscri.getNota());
//..............mn
    }
    
  
    
}