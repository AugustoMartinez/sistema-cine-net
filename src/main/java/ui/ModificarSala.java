/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Sala;
import cine.user.Sesion;
import excepciones.CampoVacioException;
import excepciones.SoloNumerosException;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import persistencia.Persistencia;

/**
 *
 * @author Diego
 */
public class ModificarSala extends javax.swing.JFrame {

    int largoBoton = 50;
    int anchoBoton = 25;
    int ejeX = 200;
    int ejeY = 70;
    public Sala sala = new Sala();

    /**
     * Creates new form ModificarSala
     */
    public ModificarSala(Sala sala) {
        initComponents();
        this.sala = sala;
        setLocationRelativeTo(null);
        botones();
        lblNombreSala.setText(sala.getNombre());
        if (sala.getAtmos()) {
            checkAtmos.setSelected(true);
        }
    }

    public ModificarSala() {
    }

    public JToggleButton[][] jtBotones = new JToggleButton[sala.getFilas()][sala.getColumnas()];

    public void botones() {
        jtBotones = new JToggleButton[sala.getFilas()][sala.getColumnas()];
        for (int i = 0; i < sala.getFilas(); i++) {
            for (int j = 0; j < sala.getColumnas(); j++) {
                jtBotones[i][j] = new JToggleButton();
                jtBotones[i][j].setBounds(ejeX, ejeY, largoBoton, anchoBoton);
                //jtBotones[i][j].setFont hay que hacer esto
                AccionBotones accion = new AccionBotones();
                jtBotones[i][j].addActionListener(accion);
                if (sala.getButacas()[i][j].isExiste() == true) {
                    jtBotones[i][j].setSelected(true);
                    ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-selected.png");
                    Image imagenButaca = iconoButaca.getImage();
                    ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(35, 25, Image.SCALE_DEFAULT));
                    jtBotones[i][j].setIcon(iconoButacaAgrandado);
                    jtBotones[i][j].setIcon(iconoButacaAgrandado);
                    jtBotones[i][j].setOpaque(false);
                    jtBotones[i][j].setContentAreaFilled(false);
                    jtBotones[i][j].setBorderPainted(false);
                } else {
                    ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-available.png");
                            Image imagenButaca = iconoButaca.getImage();
                            ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(35, 25, Image.SCALE_DEFAULT));
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setOpaque(false);
                            jtBotones[i][j].setContentAreaFilled(false);
                            jtBotones[i][j].setBorderPainted(false);
                }

                pnlBotones.add(jtBotones[i][j]);
                ejeX += 55;//separacion ejeX

            }
            ejeX = 200; //reseteo la poss inicial
            ejeY += 30; //separacion ejeY
        }
    }

    public class AccionBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < sala.getFilas(); i++) {
                for (int j = 0; j < sala.getColumnas(); j++) {
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
                            sala.getButacas()[i][j].setExiste(true);
                            sala.setCapacidad(sala.getCapacidad() + 1);
                            //aumentar contador para comparar con cantidad de boletos
                        } else {
                            ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-available.png");
                            Image imagenButaca = iconoButaca.getImage();
                            ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(35, 25, Image.SCALE_DEFAULT));
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setOpaque(false);
                            jtBotones[i][j].setContentAreaFilled(false);
                            jtBotones[i][j].setBorderPainted(false);
                            sala.getButacas()[i][j].setExiste(false);
                            sala.setCapacidad(sala.getCapacidad() - 1);
                            //disminuir contador
                        }
                    }
                }
            }
        }
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
        lblNombreSala = new javax.swing.JLabel();
        checkAtmos = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones.setBackground(new java.awt.Color(9, 35, 52));

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1240, 470));

        lblNombreSala.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblNombreSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        checkAtmos.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        checkAtmos.setForeground(new java.awt.Color(216, 220, 255));
        checkAtmos.setText("ATMOS");
        checkAtmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAtmosActionPerformed(evt);
            }
        });
        jPanel1.add(checkAtmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, 110, 40));

        jPanel2.setBackground(new java.awt.Color(20, 71, 103));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(20, 71, 103));
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(170, 34, 45));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(216, 220, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar Sala");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, -1, -1));

        jPanel4.setBackground(new java.awt.Color(170, 34, 45));

        lblVolver.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblVolver.setForeground(new java.awt.Color(216, 220, 255));
        lblVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolver.setText("Atras");
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkAtmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAtmosActionPerformed

    }//GEN-LAST:event_checkAtmosActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        String nombreviejo = sala.getNombre();
        if (sala.getCapacidad() > 0) {
            if (checkAtmos.isSelected()) {
                sala.setAtmos(true);
            } else {
                sala.setAtmos(false);
            }
            boolean flag = false;
            for (int i = 0; i < Cine.getListaSalas().size() && flag == false; i++) {
                if (Cine.getListaSalas().get(i).getNombre().equals(nombreviejo)) {
                    Cine.getListaSalas().set(i, sala);
                    flag = true;
                }
            }
            Persistencia.actualizarSalas();
            JOptionPane.showMessageDialog(null, "Sala modificada exitosamente!" + sala.toString());
            lblVolverMousePressed(evt);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "La sala debe tener 1 asiento o mas!" + sala.toString());
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void lblVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMousePressed
        // TODO add your handling code here:
        if (Sesion.getTipo().equals("Admin")) {
            this.dispose();
            MenuAdmin admin = new MenuAdmin();
            admin.setVisible(true);
        } else if (Sesion.getTipo().equals("Gerente")) {
            this.dispose();
            MenuGerente gerente = new MenuGerente();
            gerente.setVisible(true);
        }
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
            java.util.logging.Logger.getLogger(ModificarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ModificarSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkAtmos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblNombreSala;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables
}
