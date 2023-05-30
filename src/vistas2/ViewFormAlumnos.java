/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas2;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import tp7.grupo6.Alumno;

public class ViewFormAlumnos extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData = null;

    /**
     * Crea nuevo FormularioAlumno
     */
    public ViewFormAlumnos() {
        initComponents();
        this.alumnoData = new AlumnoData();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlLegajo = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfLegajo = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jbtnBuscar = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jbtnActualizar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("-ALUMNOS-");

        jlLegajo.setText("Id Alumno");

        jlApellido.setText("Apellido");

        jlNombre.setText("Nombre");

        jLabel2.setText("Fecha Nac");

        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoActionPerformed(evt);
            }
        });

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jCheckBoxEstado.setText("Estado activo");
        jCheckBoxEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnBorrar.setText("Borrar");
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI");

        jtfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlLegajo)
                            .addComponent(jlApellido)
                            .addComponent(jlNombre)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfApellido)
                            .addComponent(jtfNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfLegajo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfDni)
                                .addGap(1, 1, 1)))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxEstado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jdcFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLegajo)
                            .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnBuscar))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlApellido)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jCheckBoxEstado)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnBorrar)
                    .addComponent(jbtnActualizar)
                    .addComponent(jbtnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        try
        {
            //Obtenemos los datos ingresados por el usuario
            String nombre = jtfNombre.getText();
            String apellido = jtfApellido.getText();
            int dni = Integer.parseInt(jtfDni.getText());
            Boolean estado = jCheckBoxEstado.isSelected();
            //Obtenemos la fecha del jCalendar y la pasamos a LocalDate
            Date date = jdcFechaNac.getDate();
            LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//          
            //Construye nuevo alumno y lo guarda en la BD

            Alumno alumno = new Alumno(dni, apellido, nombre, fecha, estado);
            alumnoData.guardarAlumno(alumno);

            jtfLegajo.setText(alumno.getIdAlumno() + "");
            jbtnBorrar.setEnabled(true);

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Datos invalidos, verifique su entrada " + ex.getMessage());
            jtfDni.requestFocus();
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDniActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        // TODO add your handling code here:
        try
        {
            int id=Integer.parseInt(jtfLegajo.getText());
            Alumno alumno = new Alumno();
            alumno=alumnoData.buscarAlumno(id);
            jtfApellido.setText(alumno.getApellido());
            jtfNombre.setText(alumno.getNombre());
            jtfDni.setText(alumno.getDni()+"");
            jdcFechaNac.setDate(java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            jbtnLimpiar.setEnabled(true);
            jbtnActualizar.setEnabled(true);
            jbtnGuardar.setEnabled(false);
            alumnoData.eliminarAlumno(id);
            limpiar();

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Datos invalidos, verifique su entrada " + ex.getMessage());
            jtfDni.requestFocus();
        }
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        jtfDni.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        jCheckBoxEstado.setSelected(false);
        jdcFechaNac.setDate(null);
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidoActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // BUSCAR POR ID
        try
        {
            int id=Integer.parseInt(jtfLegajo.getText());
            Alumno alumno = new Alumno();
            alumno=alumnoData.buscarAlumno(id);
            jtfApellido.setText(alumno.getApellido());
            jtfNombre.setText(alumno.getNombre());
            jtfDni.setText(alumno.getDni()+"");
            jdcFechaNac.setDate(java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            jbtnLimpiar.setEnabled(true);
            jbtnActualizar.setEnabled(true);
            jbtnGuardar.setEnabled(false);
            limpiar();

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Datos invalidos, verifique su entrada " + ex.getMessage());
            jtfDni.requestFocus();
        }
        
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
        // TODO add your handling code here:
        int id = -1;
        try {
            id = Integer.parseInt(jtfLegajo.getText());
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "Usted debe ingresar un número");
            jtfLegajo.requestFocus();
        }
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        int dni = -1;
        try {
            dni = Integer.parseInt(jtfDni.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Usted debe ingresar un número");
            jtfDni.requestFocus();

        }
        Date date = jdcFechaNac.getDate();
        LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        boolean estado = jCheckBoxEstado.isSelected();
        Alumno alumno = new Alumno(dni, apellido, nombre, fecha, estado);
        alumnoData.modificarAlumno(alumno);
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    public void limpiar(){
        jtfDni.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        jCheckBoxEstado.setSelected(false);
        jdcFechaNac.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnActualizar;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlLegajo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfLegajo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
