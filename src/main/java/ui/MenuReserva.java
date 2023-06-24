/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Funcion;
import cine.cinelugar.Pelicula;
import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author horus
 */
public class MenuReserva extends javax.swing.JFrame {

    /**
     * Creates new form MenuReserva
     */
    public MenuReserva() {
        initComponents();
        actualizarListPeliculas();
        actualizarListaFunciones();
        iniciar();
    }

    private void actualizarListPeliculas() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        listPeliculas.setModel(model);
        for (Pelicula pelicula : Cine.getListaPeliculas()) {
            if (!pelicula.isBaja()) {
                model.addElement(pelicula.getNombre());
            }
        }
    }

    public void iniciar() {
        lblImagen.setHorizontalAlignment(JLabel.CENTER);
        lblImagen.setBorder(new LineBorder(Color.black, 0, true));

        try {
            Image img = new ImageIcon(Cine.retornaPelicula(listPeliculas.getSelectedItem().toString()).getRutaImagen()).getImage();
            ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(imgIcon);
        } catch (Exception e) {
            System.out.println("Problemas al cargar la imagen");
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
        lblImagen = new javax.swing.JLabel();
        listPeliculas = new javax.swing.JComboBox<>();
        lblPeliculas = new javax.swing.JLabel();
        lblFunciones = new javax.swing.JLabel();
        listFunciones = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSeleccionarButacas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 450, 660));

        listPeliculas.setBackground(new java.awt.Color(17, 61, 88));
        listPeliculas.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        listPeliculas.setForeground(new java.awt.Color(216, 220, 255));
        listPeliculas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPeliculasActionPerformed(evt);
            }
        });
        jPanel1.add(listPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 520, 60));

        lblPeliculas.setBackground(new java.awt.Color(17, 61, 88));
        lblPeliculas.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblPeliculas.setForeground(new java.awt.Color(216, 220, 255));
        lblPeliculas.setText("Seleccione la película:");
        jPanel1.add(lblPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 330, 50));

        lblFunciones.setBackground(new java.awt.Color(17, 61, 88));
        lblFunciones.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblFunciones.setForeground(new java.awt.Color(216, 220, 255));
        lblFunciones.setText("Seleccione la función:");
        jPanel1.add(lblFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 310, -1));

        listFunciones.setBackground(new java.awt.Color(17, 61, 88));
        listFunciones.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        listFunciones.setForeground(new java.awt.Color(216, 220, 255));
        listFunciones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        listFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFuncionesActionPerformed(evt);
            }
        });
        jPanel1.add(listFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 520, 60));

        jPanel2.setBackground(new java.awt.Color(17, 61, 88));

        btnSeleccionarButacas.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnSeleccionarButacas.setForeground(new java.awt.Color(216, 220, 255));
        btnSeleccionarButacas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSeleccionarButacas.setText("SELECCIONE BUTACAS");
        btnSeleccionarButacas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSeleccionarButacasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSeleccionarButacasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSeleccionarButacasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSeleccionarButacas, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSeleccionarButacas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 520, 60));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 120, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPeliculasActionPerformed
        // TODO add your handling code here:
        iniciar();
        actualizarListaFunciones();
    }//GEN-LAST:event_listPeliculasActionPerformed

    private void listFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFuncionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listFuncionesActionPerformed

    private void btnSeleccionarButacasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionarButacasMouseEntered
        jPanel2.setBackground(new Color(26, 95, 137));
        btnSeleccionarButacas.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSeleccionarButacasMouseEntered

    private void btnSeleccionarButacasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionarButacasMouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(17, 61, 88));
        btnSeleccionarButacas.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnSeleccionarButacasMouseExited

    private void btnSeleccionarButacasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionarButacasMousePressed
        try {
            Funcion funcion = Cine.retornaFuncion(listFunciones.getSelectedItem().toString());
            ReservaButaca reservaButaca = new ReservaButaca(funcion);
            reservaButaca.setVisible(true);
            reservaButaca.setLocationRelativeTo(null);
            this.dispose();
        } catch (NullPointerException n){
            JOptionPane.showMessageDialog(null,"No hay funciones disponibles");
        }
    }//GEN-LAST:event_btnSeleccionarButacasMousePressed

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
        MenuCliente cliente = new MenuCliente();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(MenuReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuReserva().setVisible(true);
            }
        });
    }

    private void actualizarListaFunciones() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        listFunciones.setModel(model);

        String peliculaSeleccionada = listPeliculas.getSelectedItem().toString();
        Pelicula pelicula = Cine.retornaPelicula(peliculaSeleccionada);
        String str = pelicula.getNombre();

        for (Funcion funcion : Cine.getListaFunciones()) {
            Boolean ocupada = funcion.getSala().salaOcupada();
            if (!ocupada && funcion.getPelicula().getNombre().equals(str)) {
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                model.addElement(funcion.getNombre() + " | " + format.format(funcion.getDia()) + " | " + funcion.getHorario().getHorario());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnSeleccionarButacas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFunciones;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPeliculas;
    private javax.swing.JComboBox<String> listFunciones;
    private javax.swing.JComboBox<String> listPeliculas;
    // End of variables declaration//GEN-END:variables
}
