
package vistas2;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import tp7.grupo6.Alumno;
import tp7.grupo6.Inscripcion;
import tp7.grupo6.Materia;

public class ViewFormInscripcion extends javax.swing.JInternalFrame {
    
    private ArrayList<Inscripcion> listaInscripcion;
    private ArrayList<Materia> listaMaterias;
    private ArrayList<Materia> listaNoMaterias;
    private ArrayList<Alumno> listaAlumnos;
    private InscripcionData inscripcionData;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private DefaultTableModel modelo;
    
    
    public ViewFormInscripcion() {
        initComponents();
        alumnoData = new AlumnoData();
        listaAlumnos = (ArrayList<Alumno>)alumnoData.listarAlumno();
        modelo = new DefaultTableModel();
        
        cargaAlumnos();
        tituloDeTabla();
        inscripcionData = new InscripcionData();
        materiaData = new MateriaData();
        
        
        
        
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
        jbtnInscribir = new javax.swing.JButton();
        jbtnAnularInscripcion = new javax.swing.JButton();
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

        jbtnInscribir.setText("Inscribir");
        jbtnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInscribirActionPerformed(evt);
            }
        });

        jbtnAnularInscripcion.setText("Anular Inscripcion");
        jbtnAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAnularInscripcionActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
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
                            .addComponent(jbtnInscribir)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnAnularInscripcion)
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
                    .addComponent(jbtnInscribir)
                    .addComponent(jbtnAnularInscripcion)
                    .addComponent(jbtnSalir))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargaAlumnos(){
        for(Alumno item: listaAlumnos){
            jcbAlumnos.addItem(item);
        }
    }
    public void tituloDeTabla(){
        
        ArrayList<String> filaTitulo = new ArrayList();
        filaTitulo.add("ID");
        filaTitulo.add("Nombre");
        filaTitulo.add("Año");
       
        for (Object object : filaTitulo)
        {
            modelo.addColumn(object);      
        }
        jTable1.setModel(modelo);
    }
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jrbInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        jbtnInscribir.setEnabled(true);
        jbtnAnularInscripcion.setEnabled(false);
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jbtnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInscribirActionPerformed
        // TODO add your handling code here:
        int filaSelec = jTable1.getSelectedRow();
        if(filaSelec!= -1){
            Alumno alumno = (Alumno)jcbAlumnos.getSelectedItem();
            
            int idMateria = (Integer)modelo.getValueAt(filaSelec, 0);
            String nomMateria = (String)modelo.getValueAt(filaSelec, 1);
            int anio = (Integer)modelo.getValueAt(filaSelec, 2);
            boolean estado= (boolean) modelo.getValueAt(filaSelec, 3);
            Materia materia = new Materia(idMateria, nomMateria, anio,true);
            
            Inscripcion inscripcion = new Inscripcion(0,alumno,materia);
            
            inscripcionData.guardarInscripcion(inscripcion);
            
//            borrarFilaTabla();
        }
    }//GEN-LAST:event_jbtnInscribirActionPerformed

    private void jbtnAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnularInscripcionActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTable1.getSelectedRow();
        if(filaSeleccionada!= -1){
            Alumno a = (Alumno)jcbAlumnos.getSelectedItem();
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada,0);
            inscripcionData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jbtnAnularInscripcionActionPerformed

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jrbNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        jbtnAnularInscripcion.setEnabled(true);
        jbtnInscribir.setEnabled(false);
        
    }//GEN-LAST:event_jrbInscriptasActionPerformed
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for (int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    private void cargaDatosNoInscriptas(){
        
        Alumno actual = (Alumno)jcbAlumnos.getSelectedItem();
        listaNoMaterias = (ArrayList) inscripcionData.obtenerMateriasNoCursadas(actual.getIdAlumno());
        for(Materia m: listaNoMaterias){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnio()});
        }
    }
    
    private void cargaDatosInscriptas(){
        Alumno actual = (Alumno)jcbAlumnos.getSelectedItem();
        listaMaterias = (ArrayList) inscripcionData.obtenerMateriasCursadas(actual.getIdAlumno());
        for(Materia m: listaMaterias){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnio()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAnularInscripcion;
    private javax.swing.JButton jbtnInscribir;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
}
