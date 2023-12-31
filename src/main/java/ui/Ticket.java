package ui;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ticket extends javax.swing.JFrame {

    private String nombre;
    private String ticket;
    private String tipo;
    private String fecha;
    private String hora;
    private String butacas;
    private String precio;
    private String sala;
    private String poster;

    /**
     * Creates new form Ticket
     *
     * @param nombre
     * @param ticket
     * @param sala
     * @param tipo
     * @param fecha
     * @param hora
     * @param precio
     * @param butacas
     * @param poster
     */

    public Ticket(String nombre, String ticket, String tipo, String fecha, String hora, String butacas, String precio, String sala, String poster) {
        initComponents();
        this.nombre = nombre;
        this.ticket = ticket;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.butacas = butacas;
        this.precio = precio;
        this.poster = poster;
        this.sala = sala;
        mostrarTicket();
    }

    private void generarPDF() {
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Ticket.pdf"));
            documento.open();

            Image img = null;

            try {
                img = Image.getInstance(poster);
                img.scaleAbsolute(150, 250);
                img.setAlignment(Element.ALIGN_CENTER);
            } catch (BadElementException | IOException e) {
                System.out.println(e.getMessage());
            }

            Paragraph titulo = new Paragraph("Ticket n°" + ticket);
            titulo.setAlignment(1);
            documento.add(new Paragraph(titulo));
            documento.add(img);
            documento.add(new Paragraph("\n"));

            PdfPTable tabla = new PdfPTable(2);

            tabla.addCell("Nombre");
            tabla.addCell(nombre);

            tabla.addCell("Tipo");
            tabla.addCell(tipo);

            tabla.addCell("Fecha");
            tabla.addCell(fecha);

            tabla.addCell("Horario");
            tabla.addCell(hora);

            tabla.addCell("Total");
            tabla.addCell("$" + precio);

            documento.add(tabla);

            documento.add(new Paragraph("Butacas: "));
            documento.add(new Paragraph(butacas));

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado en el escritorio");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtSala = new javax.swing.JLabel();
        lblTicket = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        btnCancelarReserva = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(20, 71, 103));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrecio.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(216, 220, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("Precio");
        jPanel2.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 240, 130));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(216, 220, 255));
        jLabel1.setText("Butacas reservadas.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 400, 31));

        lblHorario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(216, 220, 255));
        lblHorario.setText("horario");
        jPanel2.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 410, 37));

        lblFecha.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(216, 220, 255));
        lblFecha.setText("fecha");
        jPanel2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 400, 37));

        lblTipo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(216, 220, 255));
        lblTipo.setText("tipo");
        jPanel2.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 40));

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(216, 220, 255));
        lblNombre.setText("nombre");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, 37));

        txtSala.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txtSala.setForeground(new java.awt.Color(216, 220, 255));
        txtSala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSala.setText("jLabel2");
        jPanel2.add(txtSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 140, 50));

        lblTicket.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblTicket.setForeground(new java.awt.Color(216, 220, 255));
        lblTicket.setText("Ticket");
        jPanel2.add(lblTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 50));

        jSeparator1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 426, 12));

        jSeparator3.setBackground(new java.awt.Color(9, 35, 52));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 426, 12));

        jSeparator4.setBackground(new java.awt.Color(9, 35, 52));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 426, 12));

        jPanel5.setBackground(new java.awt.Color(170, 34, 45));

        btnCancelarReserva.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnCancelarReserva.setForeground(new java.awt.Color(216, 220, 255));
        btnCancelarReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelarReserva.setText("Salir");
        btnCancelarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarReservaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarReservaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, 110, 50));

        jScrollPane1.setBackground(new java.awt.Color(20, 71, 103));
        jScrollPane1.setForeground(new java.awt.Color(216, 220, 255));
        jScrollPane1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(20, 71, 103));
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txtArea.setForeground(new java.awt.Color(216, 220, 255));
        txtArea.setLineWrap(true);
        txtArea.setRows(5);
        txtArea.setWrapStyleWord(true);
        txtArea.setBorder(null);
        txtArea.setDisabledTextColor(new java.awt.Color(216, 220, 255));
        txtArea.setFocusable(false);
        jScrollPane1.setViewportView(txtArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 370, 280));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 427, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarReservaMouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(204, 40, 54));
        btnCancelarReserva.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCancelarReservaMouseEntered

    private void btnCancelarReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarReservaMouseExited
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(170, 34, 45));
        btnCancelarReserva.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnCancelarReservaMouseExited

    private void btnCancelarReservaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarReservaMousePressed
        // TODO add your handling code here:
        generarPDF();
        MenuCliente cliente = new MenuCliente();
        cliente.setVisible(true);
        this.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarReservaMousePressed

    /**
     * @param args the command line arguments
     */
    private void mostrarTicket() {
        lblNombre.setText("Nombre: " + nombre);
        lblTipo.setText("Tipo: " + tipo);
        lblFecha.setText("Fecha: " + fecha);
        lblHorario.setText("Horario: " + hora);
        lblPrecio.setText("Total: $" + precio);
        lblTicket.setText("Ticket n°" + ticket);
        txtArea.setText(butacas);
        txtSala.setText(sala);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTicket;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JLabel txtSala;
    // End of variables declaration//GEN-END:variables
}
