/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author solmedina
 */
public class ViewFormularioAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewFormularioAlumno
     */
    public ViewFormularioAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jlFormularioAlumno = new javax.swing.JLabel();
        jtfLegajo = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jbtmGuardar = new javax.swing.JButton();
        JbtmNuevo = new javax.swing.JButton();
        jbtmSalir = new javax.swing.JButton();
        jlLegajo = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();

        escritorio.setBackground(new java.awt.Color(51, 51, 51));

        jlFormularioAlumno.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jlFormularioAlumno.setForeground(new java.awt.Color(0, 153, 255));
        jlFormularioAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormularioAlumno.setText("Formulario de Alumnos");

        jbtmGuardar.setBackground(java.awt.Color.darkGray);
        jbtmGuardar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbtmGuardar.setText("Guardar");
        jbtmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtmGuardarActionPerformed(evt);
            }
        });

        JbtmNuevo.setBackground(java.awt.Color.darkGray);
        JbtmNuevo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        JbtmNuevo.setText("Nuevo");

        jbtmSalir.setBackground(java.awt.Color.darkGray);
        jbtmSalir.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbtmSalir.setText("Salir");
        jbtmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtmSalirActionPerformed(evt);
            }
        });

        jlLegajo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jlLegajo.setText("Legajo:");

        jlApellido.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jlApellido.setText("Apellido:");

        jlNombre.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jlNombre.setText("Nombre:");

        escritorio.setLayer(jlFormularioAlumno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtfLegajo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtfApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtfNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbtmGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(JbtmNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbtmSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jlLegajo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jlApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jlNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jlFormularioAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                                .addComponent(jlLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                                .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jbtmGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JbtmNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtmSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFormularioAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtmGuardar)
                    .addComponent(JbtmNuevo)
                    .addComponent(jbtmSalir))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtmGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtmGuardarActionPerformed

    private void jbtmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtmSalirActionPerformed
        // SALIR DE LA VENTANA
        
        dispose();
    }//GEN-LAST:event_jbtmSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtmNuevo;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jbtmGuardar;
    private javax.swing.JButton jbtmSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlFormularioAlumno;
    private javax.swing.JLabel jlLegajo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfLegajo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
