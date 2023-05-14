/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.grupo6.vistas;

import tp7.grupo6.Alumno;

/**
 *
 * @author solmedina
 */
public class Menu extends javax.swing.JFrame {
//public static Alumno alumno=new Alumno();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAltaMaterias = new javax.swing.JMenuItem();
        jMenuItemAltaAlumno = new javax.swing.JMenuItem();
        jMenuItemFormulario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menu principal");

        jMenuItemAltaMaterias.setText("Alta de Materias");
        jMenuItemAltaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaMateriasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAltaMaterias);

        jMenuItemAltaAlumno.setText("Alta de Alumnos");
        jMenuItemAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAltaAlumno);

        jMenuItemFormulario.setText("Formulario de Inscripción");
        jMenuItemFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormularioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFormulario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAltaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaMateriasActionPerformed
        //Formulario Materias
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormularioMaterias vfm=new ViewFormularioMaterias();//crer nueva ventana
        vfm.setVisible(true);//hacerla visible
        escritorio.add(vfm);//agregarla al escritorio
        escritorio.moveToFront(vfm);//llevarla al frente
    }//GEN-LAST:event_jMenuItemAltaMateriasActionPerformed

    private void jMenuItemAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaAlumnoActionPerformed
         //Formulario alumno
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormularioAlumno vfa=new ViewFormularioAlumno();//crer nueva ventana
        vfa.setVisible(true);//hacerla visible
        escritorio.add(vfa);//agregarla al escritorio
        escritorio.moveToFront(vfa);//llevarla al frente
    }//GEN-LAST:event_jMenuItemAltaAlumnoActionPerformed

    private void jMenuItemFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormularioActionPerformed
        // Formlario inscripcion
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormularioInscripcion vfi=new ViewFormularioInscripcion();//crer nueva ventana
        vfi.setVisible(true);//hacerla visible
        escritorio.add(vfi);//agregarla al escritorio
        escritorio.moveToFront(vfi);//llevarla al frente
    }//GEN-LAST:event_jMenuItemFormularioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAltaAlumno;
    private javax.swing.JMenuItem jMenuItemAltaMaterias;
    private javax.swing.JMenuItem jMenuItemFormulario;
    // End of variables declaration//GEN-END:variables
}
