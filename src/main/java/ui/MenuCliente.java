/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.user.Cliente;
import persistencia.Persistencia;

/**
 *
 * @author Diego
 */
public class MenuCliente extends javax.swing.JFrame {

    String email;

    /**
     * Creates new form MenuCliente
     */
    public MenuCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        Persistencia.actualizarUsuarios();
    }

    public MenuCliente(String email) {
        initComponents();
        this.email = email;
        this.setLocationRelativeTo(null);
        Persistencia.actualizarUsuarios();
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
        lbSalir = new javax.swing.JLabel();
        lbGenerarReserva = new javax.swing.JLabel();
        lbEditarDatos = new javax.swing.JLabel();
        jLbMisReservas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalir.setText("Salir");
        lbSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSalirMouseClicked(evt);
            }
        });
        jPanel1.add(lbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, 30));

        lbGenerarReserva.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbGenerarReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGenerarReserva.setText("Generar reserva");
        lbGenerarReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lbGenerarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 280, 90));

        lbEditarDatos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbEditarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditarDatos.setText("Editar datos del usuario");
        lbEditarDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbEditarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditarDatosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbEditarDatosMousePressed(evt);
            }
        });
        jPanel1.add(lbEditarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 280, 90));

        jLbMisReservas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLbMisReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbMisReservas.setText("Mis reservas");
        jLbMisReservas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLbMisReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 280, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbSalirMouseClicked

    private void lbEditarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditarDatosMouseClicked
        // TODO add your handling code here:

        for (int i = 0; i < Cine.getListaUsuarios().size(); i++) {
            if (Cine.getListaUsuarios().get(i) instanceof Cliente) {

                if (Cine.getListaUsuarios().get(i).getEmail().equals(email)) {
                    ModificarUsuario modificarUser = new ModificarUsuario(((Cliente) Cine.getListaUsuarios().get(i)));
                    modificarUser.setVisible(true);
                    modificarUser.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }


    }//GEN-LAST:event_lbEditarDatosMouseClicked

    private void lbEditarDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditarDatosMousePressed

    }//GEN-LAST:event_lbEditarDatosMousePressed

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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLbMisReservas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEditarDatos;
    private javax.swing.JLabel lbGenerarReserva;
    private javax.swing.JLabel lbSalir;
    // End of variables declaration//GEN-END:variables
}
