/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.user.Cliente;
import cine.user.Sesion;
import cine.user.Usuario;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import persistencia.Persistencia;

/**
 *
 * @author Diego
 */
public class MenuCliente extends javax.swing.JFrame {

    private String email;
    private final String imgUser = "src\\main\\images\\user.png";
    /**
     * Creates new form MenuCliente
     */
    public MenuCliente() {
        initComponents();
        this.email = Sesion.getEmailLogeado();
        Persistencia.actualizarUsuarios();
        iniciar();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbGenerarReserva = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLbMisReservas = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbDarBaja = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbEditarDatos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbSalir = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblUserImg = new javax.swing.JLabel();
        lblNombreUser = new javax.swing.JLabel();
        lblNombreUser1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(17, 61, 88));

        lbGenerarReserva.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbGenerarReserva.setForeground(new java.awt.Color(216, 220, 255));
        lbGenerarReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGenerarReserva.setText("Generar reserva");
        lbGenerarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGenerarReservaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbGenerarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbGenerarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 640, 90));

        jPanel3.setBackground(new java.awt.Color(17, 61, 88));

        jLbMisReservas.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLbMisReservas.setForeground(new java.awt.Color(216, 220, 255));
        jLbMisReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbMisReservas.setText("Mis reservas");
        jLbMisReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLbMisReservasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLbMisReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLbMisReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 640, 90));

        jPanel5.setBackground(new java.awt.Color(17, 61, 88));

        lbDarBaja.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbDarBaja.setForeground(new java.awt.Color(216, 220, 255));
        lbDarBaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDarBaja.setText("Darse de baja");
        lbDarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDarBajaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbDarBajaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        jPanel4.setBackground(new java.awt.Color(17, 61, 88));

        lbEditarDatos.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbEditarDatos.setForeground(new java.awt.Color(216, 220, 255));
        lbEditarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEditarDatos.setText("Editar datos del usuario");
        lbEditarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditarDatosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbEditarDatosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 640, 90));

        jPanel6.setBackground(new java.awt.Color(17, 61, 88));

        lbSalir.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbSalir.setForeground(new java.awt.Color(216, 220, 255));
        lbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalir.setText("Salir");
        lbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 640, 90));

        jPanel7.setBackground(new java.awt.Color(216, 220, 255));

        lblUserImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNombreUser.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblNombreUser.setForeground(new java.awt.Color(17, 61, 88));
        lblNombreUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNombreUser1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblNombreUser1.setForeground(new java.awt.Color(17, 61, 88));
        lblNombreUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreUser1.setText("¡Bienvenido!");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUserImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lblUserImg, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreUser1)
                .addGap(18, 18, 18)
                .addComponent(lblNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
        private void iniciar() {
        lblUserImg.setHorizontalAlignment(JLabel.CENTER);

        try {
            Image img = new ImageIcon(imgUser).getImage();
            ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
            lblUserImg.setIcon(imgIcon);
            Usuario user = Cine.retornaClientePorEmail(email);
            lblNombreUser.setText(user.getNombre() + " " + user.getApellido());
            this.repaint();
        } catch (Exception e) {
            System.out.println("Error al cargar Imagenes");
        }
    }
    
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

    private void lbGenerarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGenerarReservaMouseClicked
        // TODO add your handling code here:
        MenuReserva menuReserva = new MenuReserva();
        menuReserva.setVisible(true);
        menuReserva.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lbGenerarReservaMouseClicked

    private void lbDarBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDarBajaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbDarBajaMouseClicked

    private void lbDarBajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDarBajaMousePressed
         int option = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea darse de baja?", "Confirmación", JOptionPane.YES_NO_OPTION);
        
         if (option == JOptionPane.YES_OPTION) {
         
            for (int i = 0; i < Cine.getListaUsuarios().size(); i++) {
                if (Cine.getListaUsuarios().get(i) instanceof Cliente) {
                    if (Cine.getListaUsuarios().get(i).getEmail().equals(email)) {
                        Cine.getListaUsuarios().remove(i);
                        System.out.println("entro");
                        JOptionPane.showMessageDialog(null, "Se dio de baja correctamente!");
                        Login log = new Login();
                        log.setVisible(true);    
                        this.dispose();

                    }
                }
            }
            Persistencia.actualizarUsuarios();
        }
    }//GEN-LAST:event_lbDarBajaMousePressed

    private void jLbMisReservasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMisReservasMousePressed
        // TODO add your handling code here:
        Persistencia.actualizarUsuarios();
        for (int i = 0; i < Cine.getListaUsuarios().size(); i++) {
            if (Cine.getListaUsuarios().get(i) instanceof Cliente) {
                if (Cine.getListaUsuarios().get(i).getEmail().equals(email)) {
                    MisReservas misReservas = new MisReservas((Cliente)Cine.getListaUsuarios().get(i));
                    misReservas.setVisible(true);
                    misReservas.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }
        
    }//GEN-LAST:event_jLbMisReservasMousePressed

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbDarBaja;
    private javax.swing.JLabel lbEditarDatos;
    private javax.swing.JLabel lbGenerarReserva;
    private javax.swing.JLabel lbSalir;
    private javax.swing.JLabel lblNombreUser;
    private javax.swing.JLabel lblNombreUser1;
    private javax.swing.JLabel lblUserImg;
    // End of variables declaration//GEN-END:variables
}
