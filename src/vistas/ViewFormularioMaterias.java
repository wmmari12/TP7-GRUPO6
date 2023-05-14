/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import tp7.grupo6.Colegio;
import tp7.grupo6.Materia;
import static vistas.Menu.materias;
/**
 *
 * @author solmedina
 */
public class ViewFormularioMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewFormularioMaterias
     */
    public ViewFormularioMaterias() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jlFormularioMaterias = new javax.swing.JLabel();
        jtfIdMateria = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfAnio = new javax.swing.JTextField();
        jlCodigoDeMateria = new javax.swing.JLabel();
        jlNombreAlQuePertenece = new javax.swing.JLabel();
        jlAño = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jDesktopPane3.setBackground(new java.awt.Color(51, 51, 51));

        jlFormularioMaterias.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        jlFormularioMaterias.setForeground(new java.awt.Color(0, 153, 255));
        jlFormularioMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormularioMaterias.setText("Formulario de Materias");

        jtfIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdMateriaActionPerformed(evt);
            }
        });

        jlCodigoDeMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCodigoDeMateria.setText("Codigo de Materia :");

        jlNombreAlQuePertenece.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlNombreAlQuePertenece.setText("Nombre :");

        jlAño.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlAño.setText("Año :");

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnNuevo.setText("Nuevo");

        jbtnSalir.setText("Salir");

        jDesktopPane3.setLayer(jlFormularioMaterias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jtfIdMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jtfNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jtfAnio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jlCodigoDeMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jlNombreAlQuePertenece, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jlAño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jbtnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jbtnNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jbtnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlCodigoDeMateria)
                    .addComponent(jlNombreAlQuePertenece, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfNombre)
                    .addComponent(jtfAnio)
                    .addComponent(jtfIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlFormularioMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlFormularioMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlCodigoDeMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfIdMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlNombreAlQuePertenece, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnNuevo)
                    .addComponent(jbtnSalir))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdMateriaActionPerformed
        
    }//GEN-LAST:event_jtfIdMateriaActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        //Boton Guardar
        int idMateria = Integer.parseInt(jtfIdMateria.getText());
        String nombre = jtfNombre.getText();
        int anio = Integer.parseInt(jtfAnio.getText());
        Materia mat = new Materia(idMateria,nombre,anio);
        materias.put(idMateria, mat);
    }//GEN-LAST:event_jbtnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlAño;
    private javax.swing.JLabel jlCodigoDeMateria;
    private javax.swing.JLabel jlFormularioMaterias;
    private javax.swing.JLabel jlNombreAlQuePertenece;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfIdMateria;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}