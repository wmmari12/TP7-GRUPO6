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
    
      private AlumnoData alumnoData=new AlumnoData();
//    private InscripcionData inscripcionData=new InscripcionData();
//    private List<Alumno> listaAlumnos;
      DefaultTableModel modelo= new DefaultTableModel();
      private InscripcionData inscripcionData=new InscripcionData();
      private MateriaData materiaData=new MateriaData();
      private List<Materia> listaMaterias;
    
    public ViewFormCargaDeNotas() {
        initComponents();
        
        cargaAlumnos();
        mofCabecera();
    }
    
    private void cargaAlumnos(){

        jcbAlumno.removeAllItems();
        List<Alumno> alumnos= alumnoData.listarAlumno();
        for(Alumno item: alumnos){
            jcbAlumno.addItem(item);
        }
        
//        jcbMaterias.removeAllItems();
//        
//        List<Alumno> alumnos= alumnoData.listarAlumno();
//        for(Alumno item: alumnos){
//            jcbMaterias.addItem(item);
//        }
    }
    
    private void mofCabecera(){
        ArrayList<Object> titulos = new ArrayList();
        titulos.add("Id Alumno");
        titulos.add("Apellido");
        titulos.add("Nombre");
        titulos.add("Nota");
        for (Object titulo : titulos)
        {
            modelo.addColumn(titulo);
        }
        jTable1.setModel(modelo);
        
    }
    private void borraFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {

                modelo.removeRow(i);
            }
        }
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Carga de Notas");

        jlCargaNotasTit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCargaNotasTit.setText("-CARGA DE NOTAS-");

        jlAlumno.setText("Materias");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

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
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cargar nota");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnsalir)
                                .addGap(46, 46, 46))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnsalir))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        // TODO add your handling code here:
//            Alumno alumSelec=(Alumno) jcbAlumno.getSelectedItem();
//            List <Inscripcion>inscripciones=inscripcionData.obtenerInscripcionesPorAlumno(alumSelec.getIdAlumno());
//            Materia materiaSeleccionada=(Materia)jcbMaterias.getSelectedItem();
//            List<Alumno> alumnos=inscripcionData.obtenerAlumnosXMateria(materiaSeleccionada.getIdMateria());
//            
//            for(Alumno alu: alumnos){
//                modelo.addRow(new Object[] {alu.getIdAlumno(),alu.getApellido(),alu.getNombre()});
//            }
        
        borraFilasTabla();
        Alumno alumSelec=(Alumno) jcbAlumno.getSelectedItem();
        List <Inscripcion>inscripciones=inscripcionData.obtenerInscripcionesPorAlumno(alumSelec.getIdAlumno());
        System.out.println(inscripciones+"entro");
        for (Inscripcion insc : inscripciones){
            
            modelo.addRow(new Object[]{insc.getMateria().getIdMateria(),insc.getMateria().getNombre(),insc.getNota()});
        }
        
//        inscripciones=inscripcionData.obtenerInscripcionesPorAlumno(alumSelec.getIdAlumno());
//        modelo=(DefaultTableModel)jTable1.getModel();
//        modelo.setRowCount(0);
//        if(!inscripciones.isEmpty()){
//            for (Inscripcion inscripcion : inscripciones)
//            {
//                modelo.addRow(new Object[]{inscripcion.getMateria().getIdMateria(), inscripcion.getMateria().getNombre(), inscripcion.getNota()});
//            }
//        }
        
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlCargaNotasTit;
    // End of variables declaration//GEN-END:variables

}

