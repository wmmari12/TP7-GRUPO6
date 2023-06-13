
package vistas2;

import tp7.grupo6.*;
import AccesoADatos.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewFormCargaDeNotas extends javax.swing.JInternalFrame {
    
      private AlumnoData alumnoData=new AlumnoData();
      private InscripcionData inscripcionData=new InscripcionData();
      private List<Alumno> alumnos;
      private List<Inscripcion> insc;
      
    
    public ViewFormCargaDeNotas() {
        initComponents();
        
        cargaAlumnos();
    }
    
    private void cargaAlumnos(){

        jcbAlumno.removeAllItems();
        this.alumnos= alumnoData.listarAlumno();
        for(Alumno alum: alumnos){
            if(alum.isEstado()==true){
            jcbAlumno.addItem(alum);
            }
        }
    }
    
//  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCargaNotasTit = new javax.swing.JLabel();
        jlAlumno = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setTitle("Carga de Notas");

        jlCargaNotasTit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCargaNotasTit.setText("-CARGA DE NOTAS-");

        jlAlumno.setText("Alumno");

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
                "ID MATERIA", "MATERIA", "NOTA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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
                        .addGap(113, 113, 113)
                        .addComponent(jlAlumno)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jlCargaNotasTit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(133, 133, 133)
                                .addComponent(btnsalir))
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
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAlumno))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnsalir))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        for (int i = 0; i < jTable1.getRowCount(); i++)
        {
            int idAlumno = ((Alumno) jcbAlumno.getSelectedItem()).getIdAlumno();
            int idMateria = Integer.parseInt(jTable1.getValueAt(i, 0).toString());
            double nota = Double.parseDouble(jTable1.getValueAt(i, 2).toString());
            
            inscripcionData.actualizarNota(idAlumno, idMateria, nota);
//            
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
       
       try{
        
        insc=inscripcionData.obtenerInscripcionesPorAlumno(((Alumno) jcbAlumno.getSelectedItem()).getIdAlumno());
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        if(!insc.isEmpty()){
            
        for (Inscripcion insc : insc){
            
            modelo.addRow(new Object[]{insc.getMateria().getIdMateria(),insc.getMateria().getNombre(),insc.getNota()});
                    }
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al cargar los alumnos en la tabla1: "+ex.getMessage());
        }
        
    }//GEN-LAST:event_jcbAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlCargaNotasTit;
    // End of variables declaration//GEN-END:variables

}

