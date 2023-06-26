/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.user.Cliente;
import cine.user.Sesion;
import cine.user.Usuario;
import java.awt.Color;
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
        btnGenerarReserva = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnMisReservas = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnDarBaja = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnEditarDatos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbSalir = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblUserImg = new javax.swing.JLabel();
        lblNombreUser = new javax.swing.JLabel();
        lblNombreUser1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(17, 61, 88));

        btnGenerarReserva.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        btnGenerarReserva.setForeground(new java.awt.Color(216, 220, 255));
        btnGenerarReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenerarReserva.setText("Generar reserva");
        btnGenerarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarReservaMouseExited(evt);
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
                    .addComponent(btnGenerarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnGenerarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 640, 90));

        jPanel3.setBackground(new java.awt.Color(17, 61, 88));

        btnMisReservas.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        btnMisReservas.setForeground(new java.awt.Color(216, 220, 255));
        btnMisReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMisReservas.setText("Mis reservas");
        btnMisReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMisReservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMisReservasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMisReservasMousePressed(evt);
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
                    .addComponent(btnMisReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnMisReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 640, 90));

        jPanel5.setBackground(new java.awt.Color(17, 61, 88));

        btnDarBaja.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        btnDarBaja.setForeground(new java.awt.Color(216, 220, 255));
        btnDarBaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDarBaja.setText("Darse de baja");
        btnDarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDarBajaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDarBajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDarBajaMouseExited(evt);
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
                    .addComponent(btnDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        jPanel4.setBackground(new java.awt.Color(17, 61, 88));

        btnEditarDatos.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        btnEditarDatos.setForeground(new java.awt.Color(216, 220, 255));
        btnEditarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditarDatos.setText("Editar datos del usuario");
        btnEditarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarDatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarDatosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarDatosMouseExited(evt);
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
                    .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 640, 90));

        jPanel6.setBackground(new java.awt.Color(139, 34, 45));

        lbSalir.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbSalir.setForeground(new java.awt.Color(216, 220, 255));
        lbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalir.setText("Salir");
        lbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbSalirMousePressed(evt);
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

        jPanel8.setBackground(new java.awt.Color(170, 34, 45));

        btnSalir.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(216, 220, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("X");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 40));

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
            System.out.println("Error al cargar Imagen");
        }
    }

    private void btnEditarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarDatosMouseClicked
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


    }//GEN-LAST:event_btnEditarDatosMouseClicked

    private void btnGenerarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReservaMouseClicked
        // TODO add your handling code here:
        MenuReserva menuReserva = new MenuReserva();
        menuReserva.setVisible(true);
        menuReserva.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGenerarReservaMouseClicked

    private void btnDarBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDarBajaMouseClicked
        // TODO add your handling code here:
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
    }//GEN-LAST:event_btnDarBajaMouseClicked

    private void btnMisReservasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisReservasMousePressed
        // TODO add your handling code here:
        Persistencia.actualizarUsuarios();
        for (int i = 0; i < Cine.getListaUsuarios().size(); i++) {
            if (Cine.getListaUsuarios().get(i) instanceof Cliente) {
                if (Cine.getListaUsuarios().get(i).getEmail().equals(email)) {
                    MisReservas misReservas = new MisReservas((Cliente) Cine.getListaUsuarios().get(i));
                    misReservas.setVisible(true);
                    misReservas.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }

    }//GEN-LAST:event_btnMisReservasMousePressed

    private void lbSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMousePressed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbSalirMousePressed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(204, 40, 54));
        btnSalir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(170, 34, 45));
        btnSalir.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnGenerarReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReservaMouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(33, 119, 171));
        btnGenerarReserva.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenerarReservaMouseEntered

    private void btnGenerarReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarReservaMouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(17, 61, 88));
        btnGenerarReserva.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnGenerarReservaMouseExited

    private void btnMisReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisReservasMouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(17, 61, 88));
        btnMisReservas.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnMisReservasMouseExited

    private void btnMisReservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisReservasMouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(33, 119, 171));
        btnMisReservas.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnMisReservasMouseEntered

    private void btnEditarDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarDatosMouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(33, 119, 171));
        btnEditarDatos.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEditarDatosMouseEntered

    private void btnEditarDatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarDatosMouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(17, 61, 88));
        btnEditarDatos.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnEditarDatosMouseExited

    private void btnDarBajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDarBajaMouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(33, 119, 171));
        btnDarBaja.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnDarBajaMouseEntered

    private void btnDarBajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDarBajaMouseExited
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(17, 61, 88));
        btnDarBaja.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnDarBajaMouseExited

    private void lbSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseEntered
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(113, 26, 35));
        lbSalir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lbSalirMouseEntered

    private void lbSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMouseExited
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(139, 34, 45));
        btnDarBaja.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_lbSalirMouseExited

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
    private javax.swing.JLabel btnDarBaja;
    private javax.swing.JLabel btnEditarDatos;
    private javax.swing.JLabel btnGenerarReserva;
    private javax.swing.JLabel btnMisReservas;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbSalir;
    private javax.swing.JLabel lblNombreUser;
    private javax.swing.JLabel lblNombreUser1;
    private javax.swing.JLabel lblUserImg;
    // End of variables declaration//GEN-END:variables
}
