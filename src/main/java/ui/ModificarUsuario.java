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
import javax.swing.JOptionPane;
import persistencia.Persistencia;
import validacion.Validaciones;

/**
 *
 * @author dolor
 */
public class ModificarUsuario extends javax.swing.JFrame {

    Cliente cliente;

    /**
     * Creates new form ModificarUsuario
     */
  

    public ModificarUsuario(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        cargarDatos();
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
        lblGuardarCambios = new javax.swing.JLabel();
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

        lblGuardarCambios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblGuardarCambios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardarCambios.setText("Guardar cambios");
        lblGuardarCambios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarCambiosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblGuardarCambiosMousePressed(evt);
            }
        });
        Background.add(lblGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblGuardarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarCambiosMouseClicked
       
    }//GEN-LAST:event_lblGuardarCambiosMouseClicked

    private void lblGuardarCambiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarCambiosMousePressed
         // TODO add your handling code here:
        String emailViejo = cliente.getEmail();
        Boolean flag = false;
        try {
            Validaciones.validarNombre(txtNombre.getText());
            Validaciones.validarApellido(txtApellido.getText());
            Validaciones.validarEmail(txtEmail.getText());
            Validaciones.validarPassword(txtPassword.getText());
            this.cliente.setNombre(txtNombre.getText());
            this.cliente.setApellido(txtApellido.getText());
            this.cliente.setEmail(txtEmail.getText());
            this.cliente.setPassword(new String(txtPassword.getPassword()));

            for (int i = 0; i < Cine.getListaUsuarios().size() && flag == false; i++) {
                if (Cine.getListaUsuarios().get(i).getEmail().equals(emailViejo)) {
                    if (Cine.getListaUsuarios().get(i) instanceof Cliente) {
                        //flag=true;
                        Cine.getListaUsuarios().set(i, cliente);
                        Persistencia.actualizarUsuarios(); 
                        JOptionPane.showMessageDialog(null, "Datos guardados correctamente!");
                        MenuCliente mc = new MenuCliente(txtEmail.getText());
                        mc.setVisible(true);    
                        this.dispose();
                    }
                }
            }
        } catch (CampoVacioException | EmailException | LetrasException | LongitudPasswordException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_lblGuardarCambiosMousePressed

    
    
    
    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
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
 
            }//Evaluar excepcion de persistencia
        } catch (CampoVacioException | EmailException | LetrasException | LongitudPasswordException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMousePressed
        // TODO add your handling code here:
        MenuCliente mc = new MenuCliente(txtEmail.getText());
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMousePressed

    
    private void cargarDatos() {
        txtNombre.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtEmail.setText(cliente.getEmail());
        txtPassword.setText(cliente.getPassword());
        txtEmail.setEditable(false);
        txtEmail.setSelectionStart(0);
        txtEmail.setSelectionEnd(0);
    }
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGuardarCambios;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
