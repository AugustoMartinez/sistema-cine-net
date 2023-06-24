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
import excepciones.CampoVacioException;
import excepciones.DiaNoValidoException;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.Persistencia;
import validacion.Validaciones;

/**
 *
 * @author Hoid
 */
public class RegistroFuncion extends javax.swing.JFrame {

    /**
     * Creates new form RegistroFuncion
     */
    public RegistroFuncion() {
        initComponents();
        actualizarListPeliculas();
        actualizarListSalas();
        actualizarListHorarios();
        jCalendar1.setBackground(new Color(9, 35, 52));
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

        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel14 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        listPelicula = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listSala = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        listHorario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCalendar1.setBackground(new java.awt.Color(17, 61, 88));
        jCalendar1.setForeground(new java.awt.Color(9, 35, 52));
        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(17, 61, 88));
        jCalendar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jCalendar1.setSundayForeground(new java.awt.Color(170, 34, 45));
        jCalendar1.setWeekdayForeground(new java.awt.Color(216, 220, 255));
        jCalendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCalendar1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCalendar1MousePressed(evt);
            }
        });
        jPanel1.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 500, 400));

        jPanel14.setBackground(new java.awt.Color(170, 34, 45));

        btnVolver.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(216, 220, 255));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, 60));

        jPanel15.setBackground(new java.awt.Color(170, 34, 45));

        btnAgregar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(216, 220, 255));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregar.setText("Agregar función.");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 220, 60));

        jPanel2.setBackground(new java.awt.Color(17, 61, 88));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listPelicula.setBackground(new java.awt.Color(17, 61, 88));
        listPelicula.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        listPelicula.setForeground(new java.awt.Color(216, 220, 255));
        listPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPeliculaActionPerformed(evt);
            }
        });
        jPanel2.add(listPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 400, 60));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(216, 220, 255));
        jLabel1.setText("Pelicula:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 36));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(216, 220, 255));
        jLabel2.setText("Sala:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 36));

        listSala.setBackground(new java.awt.Color(17, 61, 88));
        listSala.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        listSala.setForeground(new java.awt.Color(216, 220, 255));
        listSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSalaActionPerformed(evt);
            }
        });
        jPanel2.add(listSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 400, 60));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(216, 220, 255));
        jLabel3.setText("Horario:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        listHorario.setBackground(new java.awt.Color(17, 61, 88));
        listHorario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        listHorario.setForeground(new java.awt.Color(216, 220, 255));
        listHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listHorarioActionPerformed(evt);
            }
        });
        jPanel2.add(listHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 400, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 640, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed

        Funcion funcion = new Funcion();
        Sala sala = Cine.retornaSala(listSala.getSelectedItem().toString());
        Pelicula peli = Cine.retornaPelicula(listPelicula.getSelectedItem().toString());

        if (retornaHorario() != null && sala != null && peli != null) {
            funcion.setNombre(listPelicula.getSelectedItem().toString());
            funcion.setHorario(retornaHorario());
            funcion.setPelicula(peli);
            try {
                Validaciones.validarDiaFuncion(jCalendar1.getDate());
                funcion.setDia(convertirASoloDia(jCalendar1.getDate()));
                funcion.setSala((Sala) sala.clone());
                Cine.getListaFunciones().add(funcion);
                Persistencia.actualizarFunciones();
                JOptionPane.showMessageDialog(null, "Función creada exitosamente!");
                actualizarListSalas();
                actualizarListHorarios();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(RegistroFuncion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DiaNoValidoException ex) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un día válido");
            }
        }
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

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        // TODO add your handling code here:
        jPanel14.setBackground(new Color(204, 40, 54));
        btnVolver.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        // TODO add your handling code here:
        jPanel14.setBackground(new Color(170, 34, 45));
        btnVolver.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        // TODO add your handling code here:
        jPanel15.setBackground(new Color(204, 40, 54));
        btnAgregar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
        jPanel15.setBackground(new Color(170, 34, 45));
        btnAgregar.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnAgregarMouseEntered

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

    private Horario retornaHorario() {
        
        try {
            Validaciones.validarCampo(listHorario.getSelectedItem().toString());
            String str = listHorario.getSelectedItem().toString();
            for (Horario e : Horario.values()) {
                if (e.getHorario().equals(str)) {
                    return e;
                }
            }
        } catch (NullPointerException | CampoVacioException e) {
            JOptionPane.showMessageDialog(null, "No hay más horarios disponibles para el día seleccionado.");
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listHorario;
    private javax.swing.JComboBox<String> listPelicula;
    private javax.swing.JComboBox<String> listSala;
    // End of variables declaration//GEN-END:variables
}
