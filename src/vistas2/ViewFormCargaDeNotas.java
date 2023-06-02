/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas2;

import tp7.grupo6.*;
import AccesoADatos.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ViewFormCargaDeNotas extends javax.swing.JInternalFrame {
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Inscripcion> listado;
    private AlumnoData alumnoData;
    private InscripcionData inscData;
    private MateriaData matData;
    
    private DefaultTableModel model;
    
    public ViewFormCargaDeNotas() {
        initComponents();
        Alumno alu= new Alumno();
        listaAlumnos = new ArrayList();
        model = new DefaultTableModel();
        
        cargaAlumnos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCargaNotasTit = new javax.swing.JLabel();
        jlAlumno = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnGuardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setTitle("Carga de Notas");

        jlCargaNotasTit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCargaNotasTit.setText("-CARGA DE NOTAS-");

        jlAlumno.setText("Alumno");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbtnGuardar.setText("Guardar");

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jlAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jlCargaNotasTit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jbtnGuardar)
                        .addGap(71, 71, 71)
                        .addComponent(btnsalir)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlCargaNotasTit)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlumno)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(btnsalir))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlCargaNotasTit;
    // End of variables declaration//GEN-END:variables
private void cargaAlumnos(){
    
        List<Alumno> alumnos= alumnoData.listarAlumno();
        for(Alumno item: alumnos){
            jcbAlumno.addItem(item);
        }
    }
 
public void tituloDeTabla(){
        
        ArrayList<String> filaTitulo = new ArrayList();
        filaTitulo.add("ID");
        filaTitulo.add("Materia");
        filaTitulo.add("Nota");
       
        for (Object object : filaTitulo)
        {
            model.addColumn(object);      
        }
        jTable1.setModel(model);
    }
}
