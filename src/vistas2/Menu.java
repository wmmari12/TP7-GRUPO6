
package vistas2;

import tp7.grupo6.Materia;

public class Menu extends javax.swing.JFrame {

    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemFormMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemFormAlumnos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemManejoInscripciones = new javax.swing.JMenuItem();
        jMenuNotas = new javax.swing.JMenu();
        jMenuItemManipularNotas = new javax.swing.JMenuItem();
        jMenuListadoAlumXmateria = new javax.swing.JMenu();
        jMenuItemListadoAlumnos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Materias");

        jMenuItemFormMaterias.setText("Formulario de Materias");
        jMenuItemFormMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemFormMaterias);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Alumnos");

        jMenuItemFormAlumnos.setText("Formulario de Alumnos");
        jMenuItemFormAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormAlumnosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemFormAlumnos);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Inscripciones");

        jMenuItemManejoInscripciones.setText("Manejo de Inscripciones");
        jMenuItemManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemManejoInscripciones);

        jMenuBar2.add(jMenu4);

        jMenuNotas.setText("Carga de Notas");
        jMenuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNotasActionPerformed(evt);
            }
        });

        jMenuItemManipularNotas.setText("Manipulacion de Notas");
        jMenuItemManipularNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManipularNotasActionPerformed(evt);
            }
        });
        jMenuNotas.add(jMenuItemManipularNotas);

        jMenuBar2.add(jMenuNotas);

        jMenuListadoAlumXmateria.setText("Consultas");
        jMenuListadoAlumXmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListadoAlumXmateriaActionPerformed(evt);
            }
        });

        jMenuItemListadoAlumnos.setText("Listado de Alumnos x Materia");
        jMenuItemListadoAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListadoAlumnosActionPerformed(evt);
            }
        });
        jMenuListadoAlumXmateria.add(jMenuItemListadoAlumnos);

        jMenuBar2.add(jMenuListadoAlumXmateria);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemFormMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormMaterias vfm=new ViewFormMaterias();//crer nueva ventana
        vfm.setVisible(true);//hacerla visible
        escritorio.add(vfm);//agregarla al escritorio
        escritorio.moveToFront(vfm);//llevarla al frente
    }//GEN-LAST:event_jMenuItemFormMateriasActionPerformed

    private void jMenuItemManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManejoInscripcionesActionPerformed
        // TODO add your handling code here:
//        escritorio.removeAll();//removemos todo
//        escritorio.repaint();
//        InscripcionesView vfi= new InscripcionesView();//crer nueva ventana
//        vfi.setVisible(true);//hacerla visible
//        escritorio.add(vfi);//agregarla al escritorio
//        escritorio.moveToFront(vfi);//llevarla al frente
        

        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormInscripcion vfi= new ViewFormInscripcion();//crer nueva ventana
        vfi.setVisible(true);//hacerla visible
        escritorio.add(vfi);//agregarla al escritorio
        escritorio.moveToFront(vfi);//llevarla al frente
    }//GEN-LAST:event_jMenuItemManejoInscripcionesActionPerformed

    private void jMenuItemFormAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormAlumnos vfa= new ViewFormAlumnos();//crer nueva ventana
        vfa.setVisible(true);//hacerla visible
        escritorio.add(vfa);//agregarla al escritorio
        escritorio.moveToFront(vfa);//llevarla al frente
    }//GEN-LAST:event_jMenuItemFormAlumnosActionPerformed

    private void jMenuItemManipularNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManipularNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormCargaDeNotas vfcn= new ViewFormCargaDeNotas();//crer nueva ventana
        vfcn.setVisible(true);//hacerla visible
        escritorio.add(vfcn);//agregarla al escritorio
        escritorio.moveToFront(vfcn);//llevarla al frente
    }//GEN-LAST:event_jMenuItemManipularNotasActionPerformed

    private void jMenuItemListadoAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListadoAlumnosActionPerformed
       //ES ESTE EL MENU ITEM
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormListadoAlumno vfla= new ViewFormListadoAlumno();//crer nueva ventana
        vfla.setVisible(true);//hacerla visible
        escritorio.add(vfla);//agregarla al escritorio
        escritorio.moveToFront(vfla);//llevarla al frente
    }//GEN-LAST:event_jMenuItemListadoAlumnosActionPerformed

    private void jMenuListadoAlumXmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListadoAlumXmateriaActionPerformed
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormListadoAlumno vfla= new ViewFormListadoAlumno();//crer nueva ventana
        vfla.setVisible(true);//hacerla visible
        escritorio.add(vfla);//agregarla al escritorio
        escritorio.moveToFront(vfla);//llevarla al frente

    }//GEN-LAST:event_jMenuListadoAlumXmateriaActionPerformed

    private void jMenuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNotasActionPerformed
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewFormCargaDeNotas vfc= new ViewFormCargaDeNotas();//crer nueva ventana
        vfc.setVisible(true);//hacerla visible
        escritorio.add(vfc);//agregarla al escritorio
        escritorio.moveToFront(vfc);//llevarla al frente
    }//GEN-LAST:event_jMenuNotasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemFormAlumnos;
    private javax.swing.JMenuItem jMenuItemFormMaterias;
    private javax.swing.JMenuItem jMenuItemListadoAlumnos;
    private javax.swing.JMenuItem jMenuItemManejoInscripciones;
    private javax.swing.JMenuItem jMenuItemManipularNotas;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuListadoAlumXmateria;
    private javax.swing.JMenu jMenuNotas;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
