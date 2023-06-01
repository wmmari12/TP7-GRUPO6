/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas2;

import AccesoADatos.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tp7.grupo6.*;

public class InscripcionesView extends javax.swing.JInternalFrame {

    private InscripcionData inscripcionData = new InscripcionData();
    private AlumnoData alumnoData = new AlumnoData();
    private DefaultTableModel modelo = new DefaultTableModel();

    public InscripcionesView() {
        initComponents();
        cargarAlumnos();
        armarCabecera();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jrbInscriptas.setText("Materias Inscriptas");
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.setText("Materias No Inscriptas");
        jrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptasActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMaterias);

        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setText("Anular Inscripcion");
        jbAnular.setEnabled(false);
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jrbInscriptas)
                                .addGap(18, 18, 18)
                                .addComponent(jrbNoInscriptas)
                                .addGap(61, 61, 61))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jbInscribir)
                        .addGap(36, 36, 36)
                        .addComponent(jbAnular)
                        .addGap(44, 44, 44)
                        .addComponent(jbSalir)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscriptas)
                    .addComponent(jrbNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbSalir))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        // 
        jrbInscriptas.setSelected(true);
        jrbNoInscriptas.setSelected(false);
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        // 
        
        jrbInscriptas.setSelected(false);
        jrbNoInscriptas.setSelected(true);
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        
        Alumno alumnoSeleccionado=(Alumno) jcbAlumnos.getSelectedItem();
        //si no se selecciona ninguna materia devuelve un valor -1
        int filaSelec=jtMaterias.getSelectedRow();
        if (filaSelec !=-1){
//            
            int idM=(Integer)modelo.getValueAt(filaSelec, 0);//porque era un object
            Materia mat=new Materia();
            mat.setIdMateria(idM);
            Inscripcion insc=new Inscripcion(0,alumnoSeleccionado, mat);
            inscripcionData.guardarInscripcion(insc);
            borrarFilas();
        }else{
            JOptionPane.showMessageDialog(this, "Usted debe seleccionnar una materia");
        }
        
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        // TODO add your handling code here:
        Alumno alumnoSeleccionado=(Alumno) jcbAlumnos.getSelectedItem();
        //si no se selecciona ninguna materia devuelve un valor -1
        int filaSelec=jtMaterias.getSelectedRow();
        if (filaSelec !=-1){
//            
            int idM=(Integer)modelo.getValueAt(filaSelec, 0);//porque era un object
            inscripcionData.borrarInscripcionMateriaAlumno(alumnoSeleccionado.getIdAlumno(), filaSelec);
            borrarFilas();
        }else{
            JOptionPane.showMessageDialog(this, "Usted debe seleccionnar una materia");
        }
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void borrarFilas(){
        int filas=modelo.getRowCount()-1;//le pide al modelo la cantidad de filas menos 1 ya que va de 0
        
        for (int i = filas; i >=0; i--)
        {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() {
        List<Alumno> alumnos = alumnoData.listarAlumno();
        for (Alumno alumno : alumnos)//recorre la lista y los agrega de a uno
        {
            jcbAlumnos.addItem(alumno);
        }
    }

    private void armarCabecera() {
        ArrayList<Object> titulos = new ArrayList();
        titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Año");
        for (Object titulo : titulos)
        {
            modelo.addColumn(titulo);
        }
        jtMaterias.setModel(modelo);
    }

    private void llenarTabla() {
        //primero debemos tener el id del alumno
        Alumno alumno = (Alumno) jcbAlumnos.getSelectedItem();
        //int idALumno=(Integer) jcbAlumnos.getSelectdItem();
        if (jrbNoInscriptas.isSelected())
        {

            List<Materia> materias = inscripcionData.obtenerMateriasNoCursadas(alumno.getIdAlumno());
            //mandamos la lista a la tabla 
            for (Materia materia : materias)
            {
                //se crea el objeto de a uno agregandolo a las filas
                modelo.addRow(new Object[]
                {
                    materia.getIdMateria(), materia.getNombre(), materia.getAnio()
                });

            }
        } else
        {
            List<Materia> materias = inscripcionData.obtenerMateriasCursadas(alumno.getIdAlumno());
            //mandamos la lista a la tabla 
            for (Materia materia : materias)
            {
                //se crea el objeto de a uno agregandolo a las filas
                modelo.addRow(new Object[]
                {
                    materia.getIdMateria(), materia.getNombre(), materia.getAnio()
                });
            }
        }
    }

}
