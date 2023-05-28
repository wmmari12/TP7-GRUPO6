ackage Vistas;

import mainprincipal.Alumno;
import mainprincipal.Materia;
import java.util.HashSet;
import tp7.grupo6.Inscripcion;


public class MenuPrincipal extends javax.swing.JFrame {


   
    public MenuPrincipal() {
        initComponents();
        this.setSize(1000, 800);

    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mInscribir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Principal");

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumnos");

        mAlumno.setText("Agregar Alumnos");
        mAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(mAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");

        mMaterias.setText("Agregar Materia");
        mMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(mMaterias);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inscripcion");

        mInscribir.setText("Inscribir");
        mInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInscribirActionPerformed(evt);
            }
        });
        jMenu3.add(mInscribir);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir del sistema");

        mSalir.setText("salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jMenu4.add(mSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnoActionPerformed
        javax.swing.JInternalFrame ventana=new FormAlum();
        Escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mAlumnoActionPerformed

    private void mMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMateriasActionPerformed
        FormMat ventana=new FormMat();
        Escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mMateriasActionPerformed

    private void mInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInscribirActionPerformed
        Inscripcion ventana=new Inscripcion();
        Escritorio.add(ventana);
        ventana.set(true);
    }//GEN-LAST:event_mInscribirActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mAlumno;
    private javax.swing.JMenuItem mInscribir;
    private javax.swing.JMenuItem mMaterias;
    private javax.swing.JMenuItem mSalir;
    

    static class Listas{
        static HashSet<Alumno> alumnos = new HashSet<>();
        static HashSet<Materia> materias = new HashSet<>();
    }
}