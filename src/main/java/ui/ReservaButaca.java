/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.Costos;
import cine.cinelugar.Butaca;
import cine.cinelugar.Cine;
import cine.cinelugar.Funcion;
import cine.cinelugar.Reserva;
import cine.cinelugar.Sala;
import cine.user.Cliente;
import cine.user.Sesion;
import cine.user.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import persistencia.Persistencia;

public class ReservaButaca extends javax.swing.JFrame {

    private Funcion funcion;
    private int filas;
    private int columnas;
    private int largoBoton = 40;
    private int anchoBoton = 30;
    private int ejeX = 10;
    private int ejeY = 20;
    private static int cantidadButacasCompradas;

    public ReservaButaca(Funcion e) {
        initComponents();
        this.funcion = e;
        this.filas = e.getSala().getFilas();
        this.columnas = e.getSala().getColumnas();
        lblNombreFuncion.setText(funcion.getNombre());
        botones();
        ReservaButaca.cantidadButacasCompradas = 0;
    }

    public ReservaButaca() {
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
        pnlBotones = new javax.swing.JPanel();
        lblNombreFuncion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnReserva = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones.setBackground(new java.awt.Color(9, 35, 52));

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 124, 740, 500));

        lblNombreFuncion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblNombreFuncion.setForeground(new java.awt.Color(216, 220, 255));
        lblNombreFuncion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreFuncion.setText("jLabel1");
        jPanel1.add(lblNombreFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 6, 740, 50));

        jPanel2.setBackground(new java.awt.Color(20, 71, 103));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(216, 220, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PANTALLA");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 16));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

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
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 120, 45));

        jPanel4.setBackground(new java.awt.Color(170, 34, 45));

        btnReserva.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnReserva.setForeground(new java.awt.Color(216, 220, 255));
        btnReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReserva.setText("CONTINUAR");
        btnReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReservaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReservaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, 320, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JToggleButton[][] jtBotones = new JToggleButton[filas][columnas];

    public void botones() {
        jtBotones = new JToggleButton[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                jtBotones[i][j] = new JToggleButton();
                jtBotones[i][j].setBounds(ejeX, ejeY, largoBoton, anchoBoton);

                AccionBotones accion = new AccionBotones();
                jtBotones[i][j].addActionListener(accion);
                if (funcion.getSala().getButacas()[i][j].isExiste() == true) {
                    if (funcion.getSala().getButacas()[i][j].isOcupada()) {

                        ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-unavailable.png");
                        Image imagenButaca = iconoButaca.getImage();
                        ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(35, 25, Image.SCALE_DEFAULT));
                        jtBotones[i][j].setDisabledIcon(iconoButacaAgrandado);
                        jtBotones[i][j].setOpaque(false);
                        jtBotones[i][j].setContentAreaFilled(false);
                        jtBotones[i][j].setBorderPainted(false);
                        jtBotones[i][j].setEnabled(false);
                    } else {

                        ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-available.png");
                        Image imagenButaca = iconoButaca.getImage();
                        ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(35, 25, Image.SCALE_DEFAULT));
                        jtBotones[i][j].setIcon(iconoButacaAgrandado);
                        jtBotones[i][j].setIcon(iconoButacaAgrandado);
                        jtBotones[i][j].setOpaque(false);
                        jtBotones[i][j].setContentAreaFilled(false);
                        jtBotones[i][j].setBorderPainted(false);
                        jtBotones[i][j].setSelected(false);
                    }
                } else {
                    jtBotones[i][j].setVisible(false);
                }

                pnlBotones.add(jtBotones[i][j]);
                ejeX += 40;//separacion ejeX

            }
            ejeX = 10; //reseteo la poss inicial
            ejeY += 45; //separacion ejeY
        }
    }

    public static void aumentarButacas() {
        ReservaButaca.cantidadButacasCompradas++;
    }

    public static void disminuirButacas() {
        ReservaButaca.cantidadButacasCompradas--;
    }

    public class AccionBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (e.getSource().equals(jtBotones[i][j])) {
                        if (jtBotones[i][j].isSelected()) {

                            ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-selected.png");
                            Image imagenButaca = iconoButaca.getImage();
                            ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(45, 30, Image.SCALE_DEFAULT));
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setOpaque(false);
                            jtBotones[i][j].setContentAreaFilled(false);
                            jtBotones[i][j].setBorderPainted(false);
                            ReservaButaca.aumentarButacas();
                        } else {

                            ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-available.png");
                            Image imagenButaca = iconoButaca.getImage();
                            ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(45, 30, Image.SCALE_DEFAULT));
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setOpaque(false);
                            jtBotones[i][j].setContentAreaFilled(false);
                            jtBotones[i][j].setBorderPainted(false);
                            ReservaButaca.disminuirButacas();
                            //disminuir contador
                        }
                    }
                }
            }
        }
    }

    private LinkedList<String> retornaButacas() {
        LinkedList<String> butacas = new LinkedList<>();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (jtBotones[i][j].isSelected()) {
                    butacas.add("Fila: " + i + " Columna: " + j);
                }
            }
        }
        return butacas;
    }

    private void btnReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservaMouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(204, 40, 54));
        btnReserva.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnReservaMouseEntered

    private void btnReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservaMouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(170, 34, 45));
        btnReserva.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnReservaMouseExited

    private void btnReservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservaMousePressed
        // TODO add your handling code here:
        LinkedList<String> butacas = retornaButacas();
        if (butacas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No selecciono ninguna butaca");
        } else {
            ConfirmarReserva confirmar = new ConfirmarReserva(funcion, butacas, jtBotones);
            confirmar.setVisible(true);
            confirmar.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnReservaMousePressed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(204, 40, 54));
        btnExit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(170, 34, 45));
        btnExit.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        // TODO add your handling code here:
        MenuReserva menuReserva = new MenuReserva();
        menuReserva.setVisible(true);
        menuReserva.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnExitMousePressed

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
            java.util.logging.Logger.getLogger(ReservaButaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaButaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaButaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaButaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaButaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblNombreFuncion;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables
}
