/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.grupo6.vistas;

/**
 *
 * @author solmedina
 */
public class ViewFormularioInscripcion extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewFormularioInscripcion
     */
    public ViewFormularioInscripcion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jlFormularioInscripcion = new javax.swing.JLabel();
        jlElijaMateria = new javax.swing.JLabel();
        cbMaterias = new javax.swing.JComboBox<>();
        cbAlumno = new javax.swing.JComboBox<>();
        jlElijaAlumnos = new javax.swing.JLabel();
        jbtnInscribir = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jlFormularioInscripcion.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        jlFormularioInscripcion.setForeground(new java.awt.Color(0, 153, 255));
        jlFormularioInscripcion.setText("Formulario de Inscripción:");

        jlElijaMateria.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jlElijaMateria.setText("Elija una Materia:");

        cbMaterias.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        cbMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbAlumno.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        cbAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlElijaAlumnos.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jlElijaAlumnos.setText("Elija un Alumno:");

        jbtnInscribir.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbtnInscribir.setText("Inscribir");

        jbtnSalir.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jbtnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFormularioInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlElijaMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jlElijaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSalir))
                            .addComponent(cbAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFormularioInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlElijaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlElijaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnInscribir)
                    .addComponent(jbtnSalir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAlumno;
    private javax.swing.JComboBox<String> cbMaterias;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton jbtnInscribir;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlElijaAlumnos;
    private javax.swing.JLabel jlElijaMateria;
    private javax.swing.JLabel jlFormularioInscripcion;
    // End of variables declaration//GEN-END:variables
}
