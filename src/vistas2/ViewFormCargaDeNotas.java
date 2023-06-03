
package vistas2;

import tp7.grupo6.*;
import AccesoADatos.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewFormCargaDeNotas extends javax.swing.JInternalFrame {
    
      private AlumnoData alumnoData=new AlumnoData();

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
        

    }
    
    private void mofCabecera(){
        ArrayList<Object> titulos = new ArrayList();
        titulos.add("Alumno");
        titulos.add("Materia");
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
        btnGuardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jtfNota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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
                "Title 1", "Title 2", "Title 3"
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

        jtfNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNotaActionPerformed(evt);
            }
        });

        jLabel1.setText("Cargar nota");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNota, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir)
                        .addGap(46, 46, 46)))
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
                    .addComponent(jtfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
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
        
        try{
        int id=(int) (modelo.getValueAt(jTable1.getSelectedRow(),0));
        Alumno alum=alumnoData.buscarAlumno(id);
        double nota=(double) Double.parseDouble(jtfNota.getText());
        Materia mat=(Materia)jcbAlumno.getSelectedItem();
        inscripcionData.actualizarNota(alum.getIdAlumno(), mat.getIdMateria(), nota);
        
        cargaAlumnos();
        JOptionPane.showMessageDialog(this, "Nota cargada con exito");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al Cargar la nota"+ex);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
       
        
        borraFilasTabla();
        try{
        Alumno alumSelec=(Alumno) jcbAlumno.getSelectedItem();
        List <Inscripcion>inscripciones=inscripcionData.obtenerInscripcionesPorAlumno(alumSelec.getIdAlumno());
        System.out.println(inscripciones+"entro");
        for (Inscripcion insc : inscripciones){
            
            modelo.addRow(new Object[]{insc.getAlumno().getApellido(),insc.getMateria().getNombre(),insc.getNota()});
            //modelo.addRow(new Object[]{insc.getMateria().getIdMateria(),insc.getMateria().getNombre(),insc.getNota()});
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error al cargar los alumnos en la tabla: "+ex);
        }
        

        
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jtfNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlCargaNotasTit;
    private javax.swing.JTextField jtfNota;
    // End of variables declaration//GEN-END:variables

}

