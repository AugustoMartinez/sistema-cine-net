/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Pelicula;
import cine.cinelugar.Sala;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import cine.Horario;
import cine.cinelugar.Funcion;
import cine.user.Sesion;
import com.toedter.calendar.JCalendar;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.Persistencia;

/**
 *
 * @author Hoid
 */
public class RegistroFuncion extends javax.swing.JFrame {
    Funcion funcion;
    /**
     * Creates new form RegistroFuncion
     */
    public RegistroFuncion() {
        initComponents();
        actualizarListPeliculas();
        this.funcion=new Funcion();
        
        actualizarListSalas();
        actualizarListHorarios();

        //System.out.println(Cine.getListaFunciones());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listPelicula = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        listSala = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        listHorario = new javax.swing.JComboBox<>();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        btnAgregar = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        listPelicula.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        listPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPeliculaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel1.setText("Pelicula:");

        listSala.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        listSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSalaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel2.setText("Sala:");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel3.setText("Horario:");

        listHorario.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        listHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listHorarioActionPerformed(evt);
            }
        });

        jCalendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCalendar1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCalendar1MousePressed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        btnAgregar.setText("Agregar función.");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(listSala, 0, 303, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(listPelicula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addComponent(listHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listSala, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnVolver))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        
        if (retornaHorario() != null && retornaSala() != null && retornaPelicula() != null) {
            this.funcion.setNombre(listPelicula.getSelectedItem().toString());
            this.funcion.setHorario(retornaHorario());
            this.funcion.setPelicula(retornaPelicula());
            this.funcion.setDia(convertirASoloDia(jCalendar1.getDate()));
            this.funcion.setSala(Cine.retornaSalaCopia(retornaSala()));
            this.funcion.setSalaCopia(Cine.retornaSalaCopia(funcion.getSala()));
            Cine.getListaFunciones().add(funcion);
            Persistencia.actualizarFunciones();
            JOptionPane.showMessageDialog(null, "Función creada exitosamente!");
            actualizarListSalas();
            actualizarListHorarios();
        }
        
        this.dispose();
        RegistroFuncion reg = new RegistroFuncion();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
        if (Sesion.getTipo().equals("Admin")) {
            this.dispose();
            MenuAdmin admin = new MenuAdmin();
            admin.setVisible(true);
        } else if (Sesion.getTipo().equals("Gerente")) {
            this.dispose();
            MenuGerente gerente = new MenuGerente();
            gerente.setVisible(true);
        }
    }//GEN-LAST:event_btnVolverMousePressed

    private void listHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listHorarioActionPerformed

    private void listPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPeliculaActionPerformed
        // TODO add your handling code here:

        actualizarListSalas();
        actualizarListHorarios();

    }//GEN-LAST:event_listPeliculaActionPerformed

    private void jCalendar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendar1MousePressed
        // TODO add your handling code here:
        //actualizarListHorarios();
    }//GEN-LAST:event_jCalendar1MousePressed

    private void jCalendar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendar1MouseEntered
        // TODO add your handling code here:

        actualizarListSalas();
        actualizarListHorarios();

    }//GEN-LAST:event_jCalendar1MouseEntered

    private void listSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listSalaActionPerformed
        // TODO add your handling code here:
        actualizarListHorarios();
    }//GEN-LAST:event_listSalaActionPerformed

    private Date convertirASoloDia(Date fecha) {
        fecha = jCalendar1.getDate();

        // Obtener solo la fecha sin la hora
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date fechaSinHora = calendar.getTime();

        return fechaSinHora;
    }

    private void actualizarListPeliculas() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        listPelicula.setModel(model);
        for (Pelicula e : Cine.getListaPeliculas()) {
            if (!e.isBaja()) {
                Iterator<Map.Entry<String, Boolean>> iterator = e.getTipo().entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, Boolean> entry = iterator.next();
                    String key = entry.getKey();
                    Boolean value = entry.getValue();
                    if (value == true) {
                        model.addElement(e.getNombre() + " " + key);
                    }
                }
            }
        }
    }

    private void actualizarListSalas() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        listSala.setModel(model);
        for (Sala algo : Cine.getListaSalas()) {
            if (listPelicula.getSelectedItem().toString().contains("2D ATMOS") && algo.getAtmos() == true) {
                model.addElement(algo.getNombre());
            } else if (listPelicula.getSelectedItem().toString().contains("2D ATMOS") && algo.getAtmos() == false) {

            } else if (listPelicula.getSelectedItem().toString().contains("3D ATMOS") && algo.getAtmos() == true) {
                model.addElement(algo.getNombre());
            } else if (listPelicula.getSelectedItem().toString().contains("3D ATMOS") && algo.getAtmos() == false) {

            } else if (algo.getAtmos() == false) {
                model.addElement(algo.getNombre());
            }
        }
    }

    private void actualizarListHorarios() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        listHorario.setModel(model); // Establecer el modelo del JComboBox
        listHorario.removeAllItems();


        if (!Cine.getListaFunciones().isEmpty()) {
            LinkedHashMap<Horario, Boolean> horariosDisponibles = new LinkedHashMap<>();
            horariosDisponibles.put(Horario.MAÑANA, true);
            horariosDisponibles.put(Horario.MEDIODIA, true);
            horariosDisponibles.put(Horario.TARDE, true);
            horariosDisponibles.put(Horario.TARDENOCHE, true);
            horariosDisponibles.put(Horario.NOCHE, true);
            horariosDisponibles.put(Horario.MEDIANOCHE, true);
            String str = listSala.getSelectedItem().toString();
            for (Funcion e : Cine.getListaFunciones()) {
                if (e.getDia().equals(convertirASoloDia(jCalendar1.getDate()))) {
                    if (e.getSala().getNombre().equals(str)) {
                        horariosDisponibles.replace(e.getHorario(), false);
                    }
                }
            }
            for (Horario key : horariosDisponibles.keySet()) {
                boolean value = horariosDisponibles.get(key);
                // Realizar operaciones con la clave y el valor
                if (value == true) {
                    model.addElement(key.getHorario());
                }
            }
        } else { // Si la lista de funciones está vacía, agregar todos los horarios al modelo
            for (Horario f : Horario.values()) {
                model.addElement(f.getHorario());
            }
        }
        
        
        
        
        
        
        
        
        
    }

    private Funcion retornaFuncion() {
        String str = listPelicula.getSelectedItem().toString();
        for (Funcion e : Cine.getListaFunciones()) {
            if (e.getDia().equals(convertirASoloDia(jCalendar1.getDate()))) {
                if (e.getNombre().equals(str)) {
                    return e;
                }
            }
        }
        return null;
    }

    private Horario retornaHorario() {
        String str = listHorario.getSelectedItem().toString();
        for (Horario e : Horario.values()) {
            if (e.getHorario().equals(str)) {
                return e;
            }
        }
        return null;
    }

    private Pelicula retornaPelicula() {
        String str = listPelicula.getSelectedItem().toString();
        for (Pelicula e : Cine.getListaPeliculas()) {
            if (str.contains(e.getNombre())) {
                return e;
            }
        }
        return null;
    }

    private Sala retornaSala() {
        String str = listSala.getSelectedItem().toString();
        for (Sala e : Cine.getListaSalas()) {
            if (str.equals(e.getNombre())) {
                if (!e.getDisponible()) {
                    return e;
                } else {
                    JOptionPane.showMessageDialog(null, "La sala seleccionada no está disponible");
                    return null;
                }
            }
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(RegistroFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroFuncion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnVolver;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> listHorario;
    private javax.swing.JComboBox<String> listPelicula;
    private javax.swing.JComboBox<String> listSala;
    // End of variables declaration//GEN-END:variables
}
