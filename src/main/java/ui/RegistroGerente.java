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

        Background = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblTituloRegistrar = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        lblObligatorios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        Background.setBackground(new java.awt.Color(51, 45, 39));
        Background.setMaximumSize(new java.awt.Dimension(1280, 720));
        Background.setMinimumSize(new java.awt.Dimension(800, 500));
        Background.setPreferredSize(new java.awt.Dimension(1280, 720));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        Background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, 50));

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido");
        Background.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, 50));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        Background.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, 50));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña");
        Background.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, 50));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 310, 50));

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Background.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 310, 50));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Background.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 310, 50));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 310, 50));

        lblTituloRegistrar.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        lblTituloRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloRegistrar.setText("Registrar nuevo gerente");
        Background.add(lblTituloRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        btnVolver.setBackground(new java.awt.Color(227, 2, 36));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setFocusable(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        Background.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 40));

        btnRegistrarse.setBackground(new java.awt.Color(7, 10, 82));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(204, 204, 204));
        btnRegistrarse.setText("Registrar");
        btnRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 330, 55));

        lblObligatorios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblObligatorios.setForeground(new java.awt.Color(204, 204, 204));
        lblObligatorios.setText("(*)Campos Obligatorios");
        Background.add(lblObligatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("*");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 410, -1, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("*");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("*");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("*");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 340, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        MenuAdmin admin = new MenuAdmin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObligatorios;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTituloRegistrar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
