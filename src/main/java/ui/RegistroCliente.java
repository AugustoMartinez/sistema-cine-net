/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.user.Cliente;
import excepciones.CampoVacioException;
import excepciones.EmailException;
import excepciones.LetrasException;
import excepciones.LongitudPasswordException;
import java.io.IOException;
import javax.swing.JOptionPane;
import validacion.Validaciones;
import persistencia.Persistencia;

/**
 *
 * @author Diego
 */
public class RegistroCliente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroCliente
     */
    public RegistroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblRegistrarse = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setMaximumSize(new java.awt.Dimension(800, 500));
        Background.setMinimumSize(new java.awt.Dimension(800, 500));
        Background.setPreferredSize(new java.awt.Dimension(800, 500));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNombre.setText("Nombre");
        Background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblApellido.setText("Apellido");
        Background.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblEmail.setText("Email");
        Background.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPassword.setText("Password");
        Background.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 310, -1));

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Background.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 310, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Background.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 310, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        Background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 310, -1));

        lblRegistrarse.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblRegistrarse.setText("Registrarse");
        lblRegistrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRegistrarseMousePressed(evt);
            }
        });
        Background.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        lblVolver.setText("Volver");
        lblVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVolverMousePressed(evt);
            }
        });
        Background.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(816, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegistrarseMouseClicked

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblRegistrarseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMousePressed
        // TODO add your handling code here:
        try {
            Cliente cliente = new Cliente();
            Validaciones.validarNombre(txtNombre.getText());
            Validaciones.validarApellido(txtApellido.getText());
            Validaciones.validarEmail(txtEmail.getText());
            Validaciones.validarPassword(txtPassword.getText());
            cliente.setNombre(txtNombre.getText());
            cliente.setApellido(txtApellido.getText());
            cliente.setEmail(txtEmail.getText());
            cliente.setPassword(new String(txtPassword.getPassword()));
            if (Cine.buscarUsuarioPorEmail(cliente.getEmail()) == true) {
                JOptionPane.showMessageDialog(null, "El email ya se encuentra registrado");
            } else {
                Cine.getListaUsuarios().add(cliente);
                Persistencia.actualizarUsuarios();
                JOptionPane.showMessageDialog(null, "Registro exitoso!");
                new Login().setVisible(true);
                this.dispose();
            }//Evaluar excepcion de persistencia
        } catch (CampoVacioException | EmailException | LetrasException | LongitudPasswordException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_lblRegistrarseMousePressed

    private void lblVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMousePressed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMousePressed

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
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
