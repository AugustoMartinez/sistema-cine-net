/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Pelicula;
import cine.cinelugar.Sala;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import persistencia.Persistencia;

/**
 *
 * @author Diego
 */
public class MenuGerente extends javax.swing.JFrame {

    /**
     * Creates new form MenuGerente
     */
    public MenuGerente() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizarListPeliculas();
        actualizarListSalas();
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
        btnCerrar = new javax.swing.JButton();
        btnCrearFuncion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCargarPelicula = new javax.swing.JButton();
        listPeliculas = new javax.swing.JComboBox<>();
        btnModificarPelicula1 = new javax.swing.JButton();
        btnDarBajaPelicula = new javax.swing.JButton();
        btnAgregarSala = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        listSalas = new javax.swing.JComboBox<>();
        btnModificarSala = new javax.swing.JButton();
        btnDarBajaSala = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 45, 39));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(191, 4, 38));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar Sesion");
        btnCerrar.setFocusable(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, 41));

        btnCrearFuncion.setBackground(new java.awt.Color(51, 255, 204));
        btnCrearFuncion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearFuncion.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearFuncion.setText("Crear Funcion");
        btnCrearFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFuncionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 620, -1, 41));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificaciones Peliculas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 230, 36));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menu Gerente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        btnCargarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCargarPelicula.setText("Agregar pelicula");
        btnCargarPelicula.setFocusable(false);
        btnCargarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPeliculaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 40));

        listPeliculas.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jPanel1.add(listPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 345, 40));

        btnModificarPelicula1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificarPelicula1.setText("Modificar");
        btnModificarPelicula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPelicula1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarPelicula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, 40));

        btnDarBajaPelicula.setBackground(new java.awt.Color(61, 0, 0));
        btnDarBajaPelicula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDarBajaPelicula.setForeground(new java.awt.Color(204, 204, 204));
        btnDarBajaPelicula.setText("Dar de baja");
        btnDarBajaPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBajaPeliculaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDarBajaPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, 40));

        btnAgregarSala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgregarSala.setText("Agregar sala");
        btnAgregarSala.setFocusable(false);
        btnAgregarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, 40));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificaciones Sala");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 230, 36));

        listSalas.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jPanel1.add(listSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 345, 40));

        btnModificarSala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificarSala.setText("Modificar");
        btnModificarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSalaActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, -1, 40));

        btnDarBajaSala.setBackground(new java.awt.Color(61, 0, 0));
        btnDarBajaSala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDarBajaSala.setForeground(new java.awt.Color(204, 204, 204));
        btnDarBajaSala.setText("Dar de baja");
        btnDarBajaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBajaSalaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDarBajaSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, -1, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 1070, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        Persistencia.actualizarPeliculas();
        Persistencia.actualizarUsuarios();
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCrearFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFuncionActionPerformed
        // TODO add your handling code here:
        RegistroFuncion reg = new RegistroFuncion();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCrearFuncionActionPerformed

    private void btnCargarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPeliculaActionPerformed
        // TODO add your handling code here:
        RegistroPelicula reg = new RegistroPelicula();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCargarPeliculaActionPerformed

    private void btnModificarPelicula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPelicula1ActionPerformed
        // TODO add your handling code here:
        for (Pelicula e : Cine.getListaPeliculas()) {
            if (e.getNombre().equals(listPeliculas.getSelectedItem())) {
                this.dispose();
                ModificarPelicula mod = new ModificarPelicula(e);
                mod.setVisible(true);
                mod.setLocationRelativeTo(null);
            }
        }
    }//GEN-LAST:event_btnModificarPelicula1ActionPerformed

    private void btnDarBajaPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaPeliculaActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "¿Desea dar de baja la película?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            String nombre = listSalas.getSelectedItem().toString();
            if (listPeliculas.getSelectedItem() != null) {
                for (int i = 0; i < Cine.getListaPeliculas().size(); i++) {
                    if (Cine.getListaPeliculas().get(i).getNombre().equals(listPeliculas.getSelectedItem())) {
                        Cine.getListaPeliculas().remove(i);
                    }
                }
            }
            actualizarListPeliculas();
        }
    }//GEN-LAST:event_btnDarBajaPeliculaActionPerformed

    private void btnAgregarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalaActionPerformed
        // TODO add your handling code here:
        new CreacionSala().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarSalaActionPerformed

    private void btnModificarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSalaActionPerformed
        // TODO add your handling code here:
        for (Sala e : Cine.getListaSalas()) {
            if (e.getNombre().equals(listSalas.getSelectedItem())) {
                this.dispose();
                ModificarSala algo = new ModificarSala(e);
                algo.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnModificarSalaActionPerformed

    private void btnDarBajaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaSalaActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "¿Desea dar de baja la sala?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            String nombre = listSalas.getSelectedItem().toString();
            for (int i = 0; i < Cine.getListaSalas().size(); i++) {
                for (Sala sala : Cine.getListaSalas()) {
                    if (sala.getNombre().equals(nombre)) {
                        Cine.getListaSalas().remove(i);
                    }
                }
            }
            actualizarSalas();
            Persistencia.actualizarSalas();
        }
    }//GEN-LAST:event_btnDarBajaSalaActionPerformed

    private void actualizarListPeliculas() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        listPeliculas.setModel(model);
        for (Pelicula e : Cine.getListaPeliculas()) {
            if (!e.isBaja()) {
                model.addElement(e.getNombre());
            }
        }
    }

    private void actualizarListSalas() {
        DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>();
        listSalas.setModel(model2);
        for (Sala e : Cine.getListaSalas()) {

            model2.addElement(e.getNombre());

        }
    }

    private void actualizarSalas() {
        DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>();
        listSalas.setModel(model2);
        for (Sala e : Cine.getListaSalas()) {
            if (!e.getBaja()) {
                model2.addElement(e.getNombre());
            }
        }
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
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarSala;
    private javax.swing.JButton btnCargarPelicula;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrearFuncion;
    private javax.swing.JButton btnDarBajaPelicula;
    private javax.swing.JButton btnDarBajaSala;
    private javax.swing.JButton btnModificarPelicula1;
    private javax.swing.JButton btnModificarSala;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listPeliculas;
    private javax.swing.JComboBox<String> listSalas;
    // End of variables declaration//GEN-END:variables
}
