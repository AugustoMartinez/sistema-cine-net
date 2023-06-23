/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.user.Cliente;
import cine.user.Gerente;
import excepciones.CampoVacioException;
import excepciones.EmailException;
import excepciones.LetrasException;
import excepciones.LongitudPasswordException;
import java.awt.Color;
import javax.swing.JOptionPane;
import persistencia.Persistencia;
import validacion.Validaciones;

/**
 *
 * @author Hoid
 */
public class RegistroGerente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroGerente
     */
    public RegistroGerente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background1 = new javax.swing.JPanel();
        lblNombre1 = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblTituloRegistrar1 = new javax.swing.JLabel();
        lblObligatorios1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);

        Background1.setBackground(new java.awt.Color(9, 35, 52));
        Background1.setMaximumSize(new java.awt.Dimension(1280, 720));
        Background1.setMinimumSize(new java.awt.Dimension(800, 500));
        Background1.setPreferredSize(new java.awt.Dimension(1280, 720));
        Background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(216, 220, 255));
        lblNombre1.setText("Nombre");
        Background1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 200, -1, 50));

        lblApellido1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lblApellido1.setForeground(new java.awt.Color(216, 220, 255));
        lblApellido1.setText("Apellido");
        Background1.add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 270, -1, 50));

        lblEmail1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lblEmail1.setForeground(new java.awt.Color(216, 220, 255));
        lblEmail1.setText("Email");
        Background1.add(lblEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 350, -1, 50));

        lblPassword1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(216, 220, 255));
        lblPassword1.setText("Contraseña");
        Background1.add(lblPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 410, 110, 50));

        txtNombre.setBackground(new java.awt.Color(17, 61, 88));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(216, 220, 255));
        Background1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 200, 300, 45));

        txtApellido.setBackground(new java.awt.Color(17, 61, 88));
        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(216, 220, 255));
        Background1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 270, 300, 45));

        txtEmail.setBackground(new java.awt.Color(17, 61, 88));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(216, 220, 255));
        Background1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 340, 300, 50));

        txtPassword.setBackground(new java.awt.Color(17, 61, 88));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(216, 220, 255));
        Background1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 410, 300, 45));

        lblTituloRegistrar1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTituloRegistrar1.setForeground(new java.awt.Color(216, 220, 255));
        lblTituloRegistrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegistrar1.setText("MENÚ REGISTRO GERENTE");
        Background1.add(lblTituloRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 670, 60));

        lblObligatorios1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblObligatorios1.setForeground(new java.awt.Color(216, 220, 255));
        lblObligatorios1.setText("(*)Campos Obligatorios");
        Background1.add(lblObligatorios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("*");
        Background1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("*");
        Background1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("*");
        Background1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("*");
        Background1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, 50));

        jPanel2.setBackground(new java.awt.Color(170, 34, 45));

        btnRegistrar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(216, 220, 255));
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setText("REGISTRARSE");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 200, 45));

        jPanel3.setBackground(new java.awt.Color(170, 34, 45));

        btnExit.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(216, 220, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("VOLVER");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 130, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        // TODO add your handling code here:
        MenuAdmin admin = new MenuAdmin();
        admin.setVisible(true);
        admin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnExitMousePressed

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(170, 34, 45));
        btnExit.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(204, 40, 54));
        btnExit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMousePressed

        try {
            Gerente gerente = new Gerente();
            Validaciones.validarNombre(txtNombre.getText());
            Validaciones.validarApellido(txtApellido.getText());
            Validaciones.validarEmail(txtEmail.getText());
            Validaciones.validarPassword(txtPassword.getText());
            gerente.setNombre(txtNombre.getText());
            gerente.setApellido(txtApellido.getText());
            gerente.setEmail(txtEmail.getText());
            gerente.setPassword(new String(txtPassword.getPassword()));
            if (Cine.buscarUsuarioPorEmail(gerente.getEmail()) == true) {
                JOptionPane.showMessageDialog(null, "El email ya se encuentra registrado");
            } else {
                Cine.getListaUsuarios().add(gerente);
                Persistencia.actualizarUsuarios();
                JOptionPane.showMessageDialog(null, "Registro exitoso!");
                MenuAdmin adm = new MenuAdmin();
                adm.setVisible(true);
                this.dispose();
            }//Evaluar excepcion de persistencia
        } catch (CampoVacioException | EmailException | LetrasException | LongitudPasswordException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarMousePressed

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(170, 34, 45));
        btnRegistrar.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        jPanel2.setBackground(new Color(204, 40, 54));
        btnRegistrar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRegistrarMouseEntered

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
            java.util.logging.Logger.getLogger(RegistroGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background1;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblObligatorios1;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblTituloRegistrar1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
