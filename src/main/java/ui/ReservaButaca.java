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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.JToggleButton;
import persistencia.Persistencia;

/**
 *
 * @author Hoid
 */
public class ReservaButaca extends javax.swing.JFrame {

    private Funcion funcion;
    private int filas;
    private int columnas;
    private int largoBoton = 50;
    private int anchoBoton = 25;
    private int ejeX = 20;
    private int ejeY = 20;
    public Sala sala;
    private static int cantidadButacasCompradas;

    /**
     * Creates new form ReservaButaca
     */
    public ReservaButaca(Funcion e) {
        initComponents();
        this.funcion = e;
        this.filas=e.getSalaCopia().getFilas();
        this.columnas=e.getSalaCopia().getColumnas();
        this.sala = e.getSalaCopia();
        botones();
        ReservaButaca.cantidadButacasCompradas=0;
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
        lblVolver = new javax.swing.JLabel();
        btnReservar = new javax.swing.JLabel();
        lblNombreSala = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 124, 1240, 460));

        lblVolver.setText("Volver");
        lblVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVolverMousePressed(evt);
            }
        });
        jPanel1.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 20));

        btnReservar.setText("Reserva");
        btnReservar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReservarMousePressed(evt);
            }
        });
        jPanel1.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 100, 40));

        lblNombreSala.setText("jLabel1");
        jPanel1.add(lblNombreSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMousePressed

        for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                   if (jtBotones[i][j].isSelected()) {
                        jtBotones[i][j].setEnabled(true);
                        jtBotones[i][j].setSelected(false);
                   }
                }
        }
        funcion=null;
        MenuReserva cliente = new MenuReserva();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblVolverMousePressed

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
                    if(funcion.getSala().getButacas()[i][j].isOcupada()){
                        jtBotones[i][j].setEnabled(false);
                        jtBotones[i][j].setBackground(Color.RED);
                    }else{
                        jtBotones[i][j].setSelected(false);
                        jtBotones[i][j].setBackground(Color.GRAY);
                    }
                }else{
                    jtBotones[i][j].setVisible(false);
                } 

                pnlBotones.add(jtBotones[i][j]);
                ejeX += 55;//separacion ejeX

            }
            ejeX = 20; //reseteo la poss inicial
            ejeY += 30; //separacion ejeY
        }
    }
    public static void aumentarButacas(){
        ReservaButaca.cantidadButacasCompradas++;
    }
    public static void disminuirButacas(){
        ReservaButaca.cantidadButacasCompradas--;
    }
    
    private int generarNumeroEntero() {
        Random random = new Random();
        int min = 1000000;
        int max = Integer.MAX_VALUE;
        int numero = random.nextInt(max - min + 1) + min;
        return numero;
    }

    public class AccionBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (e.getSource().equals(jtBotones[i][j])) {
                        if (jtBotones[i][j].isSelected()) {
                            jtBotones[i][j].setBackground(Color.GREEN);
                            sala.getButacas()[i][j].setOcupada(true);
                            //aumentar contador para comparar con cantidad de boletos
                            ReservaButaca.aumentarButacas();
                        } else {
                            jtBotones[i][j].setBackground(Color.GRAY);
                            sala.getButacas()[i][j].setOcupada(false);
                            ReservaButaca.disminuirButacas();
                            //disminuir contador
                        }
                    }
                }
            }
        }
    }
    
    private LinkedList<String> retornaButacas(){
        LinkedList<String> butacas = new LinkedList<>();
        //jtBotones = new JToggleButton[filas][columnas];
        for(int i = 0; i < filas; i ++){
            for(int j = 0; j < columnas; j++){
                if(jtBotones[i][j].isSelected()){
                    butacas.add("Fila: " + i + " Columna: "+ j);
                }
            }
        }
        return butacas;
    }
    
    private void btnReservarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservarMousePressed
        LinkedList<String> butacas = retornaButacas();
        Integer numTicket=this.generarNumeroEntero();
        funcion.setSalaCopia(this.sala);
        Reserva reserva = new Reserva(funcion, butacas, numTicket, this.sala);
        Cliente user = Cine.retornaClientePorEmail(Sesion.emailLogeado);
        user.agregarReserva(reserva);
        Cine.reemplazarCliente(user);
        Persistencia.actualizarUsuarios();
        Persistencia.actualizarFunciones();
        MenuReserva rem = new MenuReserva();
        rem.setVisible(true);
        rem.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReservarMousePressed

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
    private javax.swing.JLabel btnReservar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreSala;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables
}