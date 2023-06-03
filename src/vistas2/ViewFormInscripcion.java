
package vistas2;

import AccesoADatos.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tp7.grupo6.*;

public class ViewFormInscripcion extends javax.swing.JInternalFrame {
    
    private InscripcionData inscripcionData = new InscripcionData();
    private AlumnoData alumnoData = new AlumnoData();
    private DefaultTableModel modelo = new DefaultTableModel();

    
    
    public ViewFormInscripcion() {
        
        initComponents();
        cargarAlumnos();
        armarCabecera();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jcbAlumnos = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setTitle("Formulario de Inscripción");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("-FORMULARIO DE INSCRIPCIÓN-");

        jLabel2.setText("Alumno");

        jLabel3.setText("LISTADO DE MATERIAS");

        jrbInscriptas.setText("Inscriptas");
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.setText("No Inscriptas");
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtMaterias);
        if (jtMaterias.getColumnModel().getColumnCount() > 0) {
            jtMaterias.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jtMaterias.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jtMaterias.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jtMaterias.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setText("Anular Inscripcion");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jrbInscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbNoInscriptas))
                                .addComponent(jLabel1))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addComponent(jbInscribir)
                            .addGap(18, 18, 18)
                            .addComponent(jbAnular)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnSalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel3)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbInscriptas)
                    .addComponent(jrbNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbtnSalir))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        // TODO add your handling code here:
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
            JOptionPane.showMessageDialog(this, "Usted debe seleccionar una materia");
        }
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        // TODO add your handling code here:
        
        //si no se selecciona ninguna materia devuelve un valor -1
        int filaSelec=jtMaterias.getSelectedRow();
        if (filaSelec !=-1){
            
            Alumno alumnoSeleccionado=(Alumno) jcbAlumnos.getSelectedItem();
//            
            int idM=(Integer)modelo.getValueAt(filaSelec, 0);//porque era un object
            inscripcionData.borrarInscripcionMateriaAlumno(alumnoSeleccionado.getIdAlumno(), idM);
            borrarFilas();
            llenarTabla();
        }else{
            JOptionPane.showMessageDialog(this, "Usted debe seleccionar una materia");
        }
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        // TODO add your handling code here:
        jrbInscriptas.setSelected(true);
        jrbNoInscriptas.setSelected(false);
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);
        borrarFilas();
        llenarTabla();
        
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAlumnosActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbtnSalir;
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
        }    }

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

    private void borrarFilas() {
        int filas=modelo.getRowCount()-1;//le pide al modelo la cantidad de filas menos 1 ya que va de 0
        
        for (int i = filas; i >=0; i--)
        {
            modelo.removeRow(i);
        }    }
}
