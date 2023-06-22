/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.Costos;
import cine.cinelugar.Cine;
import cine.cinelugar.Funcion;
import cine.cinelugar.Pelicula;
import cine.cinelugar.Reserva;
import cine.user.Cliente;
import cine.user.Sesion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import persistencia.Persistencia;

/**
 *
 * @author Hoid
 */
public class ConfirmarReserva extends javax.swing.JFrame {

    private Funcion funcion;
    private LinkedList<String> butacasReservadas;
    private Cliente usuario;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form ConfirmarReserva
     */
    public ConfirmarReserva(Funcion e,LinkedList<String> butacasReservadas) {
        initComponents();
        this.funcion=e;
        this.butacasReservadas=butacasReservadas;
        mostrarReserva();
    }

    public ConfirmarReserva() {
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
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblButacasReservadas = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setText("nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 202, 37));

        lblTipo.setText("tipo");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 49, 202, 37));

        lblFecha.setText("fecha");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 92, 202, 37));

        lblHorario.setText("horario");
        jPanel1.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 135, 202, 37));

        jLabel1.setText("Butacas reservadas.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 178, 183, 31));

        lblPrecio.setFont(new java.awt.Font("JetBrains Mono NL Medium", 0, 24)); // NOI18N
        lblPrecio.setText("Precio");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 325, 103));

        lblButacasReservadas.setText("Butacas");
        jPanel1.add(lblButacasReservadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, 237, 147));

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 150, 75));

        btnReserva.setText("Confirmar reserva");
        btnReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReservaMousePressed(evt);
            }
        });
        jPanel1.add(btnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 145, 76));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 250, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservaMousePressed
        // TODO add your handling code here:
        funcion.setSala(funcion.getSalaCopia());
        Integer numTicket = this.generarNumeroEntero();
        Reserva reserva = new Reserva(funcion.getNombre(), this.butacasReservadas, numTicket, funcion.getSala().getNombre());
        Cliente user = Cine.retornaClientePorEmail(Sesion.getEmailLogeado());
        user.agregarReserva(reserva);
        Cine.reemplazarCliente(user);
        Persistencia.actualizarUsuarios();
        Persistencia.actualizarFunciones();
        JOptionPane.showMessageDialog(null, "Muchas gracias por su reserva!");
        
        Ticket ticket=new Ticket(funcion.getPelicula().getNombre(), numTicket.toString(), seleccionarTipo(), format.format(funcion.getDia()), funcion.getHorario().getHorario(), agregarButacas(), generarCosto().toString());
        ticket.setVisible(true);
        ticket.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReservaMousePressed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
        MenuCliente cliente = new MenuCliente();
        cliente.setVisible(true);
        this.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void mostrarReserva(){
        String tipo = seleccionarTipo();
        
        lblNombre.setText(funcion.getPelicula().getNombre());
        lblTipo.setText("Tipo: "+tipo);
        lblFecha.setText("Dia: "+format.format(funcion.getDia()));
        lblHorario.setText("Horario: "+funcion.getHorario().getHorario());
        lblPrecio.setText("Total: $" + generarCosto());
        lblButacasReservadas.setText(agregarButacas());
        cargarFotito();
    }
    
    private String agregarButacas() {
        String texto="";

        for (int i = 0; i < butacasReservadas.size(); i++) {
            texto += ("Butaca n°" + (i + 1) + " " + butacasReservadas.get(i) + "<br>");
        }

        return "<html>" + texto + "</html>";
    }
    
    private String seleccionarTipo(){
        for (String key : funcion.getPelicula().getTipo().keySet()) {
            if(funcion.getNombre().contains(key)){
                return key;
            }
        }
        return null;
    }

    private void cargarFotito(){
        final String imgCineDir = funcion.getPelicula().getRutaImagen();
        lblImagen.setHorizontalAlignment(JLabel.CENTER);
        lblImagen.setBorder(new LineBorder(Color.black, 2, true));
        try {
            Image img = new ImageIcon(funcion.getPelicula().getRutaImagen()).getImage();
            ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(imgIcon);
        } catch (Exception e) {
            System.out.println("Algo se rompio al leer los datos de la Pelicula");
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(ConfirmarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmarReserva().setVisible(true);
            }
        });
    }
    
    private int generarNumeroEntero() {
        Random random = new Random();
        int min = 1000000;
        int max = Integer.MAX_VALUE;
        int numero = random.nextInt(max - min + 1) + min;
        return numero;
    }
    private Integer generarCosto(){
        int costo=0;
        
        for(Costos e: Costos.values()){
            if(funcion.getNombre().contains(e.getTipo())){
                costo=e.getCosto();
            }
        }
        
        return costo*butacasReservadas.size();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblButacasReservadas;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables
}
