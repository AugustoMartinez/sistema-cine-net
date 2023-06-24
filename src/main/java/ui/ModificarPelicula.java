/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Pelicula;
import excepciones.CampoVacioException;
import excepciones.SoloNumerosException;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import persistencia.Persistencia;
import validacion.Validaciones;
import cine.user.Sesion;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Hoid
 */
public class ModificarPelicula extends javax.swing.JFrame {

    /**
     * Creates new form ModificarPelicula
     */
    private Pelicula pelicula;
    public static final String RUTA_DESTINO = "src\\main\\images\\";

    public ModificarPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
        initComponents();
        cargarDatos();
        txtNombre.setBorder(new LineBorder(new Color(255, 255, 255, 0), 2));
        txtDuracion.setBorder(new LineBorder(new Color(255, 255, 255, 0), 2));
        txtSinopsis.setBorder(new LineBorder(new Color(255, 255, 255, 0), 2));
        dateFecha.setBorder(new LineBorder(new Color(255, 255, 255, 0), 2));
    }

    public void iniciar() {
        lblImagen.setHorizontalAlignment(JLabel.CENTER);
        lblImagen.setBorder(new LineBorder(Color.black, 2, true));
        try {
            Image img = new ImageIcon(pelicula.getRutaImagen()).getImage();
            ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(imgIcon);
        } catch (Exception e) {
            System.out.println("Algo se rompio al leer los datos de la Pelicula");
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
        lblNombre = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblSinopsis = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopsis = new javax.swing.JTextArea();
        listGenero = new javax.swing.JComboBox<>();
        listClas = new javax.swing.JComboBox<>();
        dateFecha = new com.toedter.calendar.JDateChooser();
        check2d = new javax.swing.JCheckBox();
        check2dAtmos = new javax.swing.JCheckBox();
        check3d = new javax.swing.JCheckBox();
        check3dAtmos = new javax.swing.JCheckBox();
        lblImagen = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        lblTextImagen = new javax.swing.JLabel();
        lblEstreno1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTituloRegistrar1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnLimpiarCampos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(216, 220, 255));
        lblNombre.setText("Titulo:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 40));

        lblGenero.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(216, 220, 255));
        lblGenero.setText("Genero:");
        jPanel1.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 100, 40));

        lblDuracion.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(216, 220, 255));
        lblDuracion.setText("Duracion:");
        jPanel1.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, 40));

        lblClasificacion.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblClasificacion.setForeground(new java.awt.Color(216, 220, 255));
        lblClasificacion.setText("Clasificacion:");
        jPanel1.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 170, 40));

        lblTipo.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(216, 220, 255));
        lblTipo.setText("Tipo de pelicula");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 200, 40));

        lblSinopsis.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblSinopsis.setForeground(new java.awt.Color(216, 220, 255));
        lblSinopsis.setText("Sinopsis:");
        jPanel1.add(lblSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 40));

        txtNombre.setBackground(new java.awt.Color(20, 71, 103));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(216, 220, 255));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 290, 40));

        txtDuracion.setBackground(new java.awt.Color(20, 71, 103));
        txtDuracion.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        txtDuracion.setForeground(new java.awt.Color(216, 220, 255));
        txtDuracion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDuracionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDuracionFocusLost(evt);
            }
        });
        jPanel1.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 80, 40));

        txtSinopsis.setBackground(new java.awt.Color(20, 71, 103));
        txtSinopsis.setColumns(20);
        txtSinopsis.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        txtSinopsis.setForeground(new java.awt.Color(216, 220, 255));
        txtSinopsis.setLineWrap(true);
        txtSinopsis.setRows(5);
        txtSinopsis.setWrapStyleWord(true);
        txtSinopsis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSinopsisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSinopsisFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtSinopsis);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 500, 210));

        listGenero.setBackground(new java.awt.Color(20, 71, 103));
        listGenero.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        listGenero.setForeground(new java.awt.Color(216, 220, 255));
        listGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Aventura", "Comedia", "Documental", "Drama", "Horror", "Suspenso" }));
        listGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(listGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, 40));

        listClas.setBackground(new java.awt.Color(20, 71, 103));
        listClas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        listClas.setForeground(new java.awt.Color(216, 220, 255));
        listClas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G", "PG13", "R", "NC17" }));
        jPanel1.add(listClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 130, 40));

        dateFecha.setBackground(new java.awt.Color(20, 71, 103));
        dateFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateFechaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFechaFocusLost(evt);
            }
        });
        jPanel1.add(dateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 230, 40));

        check2d.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check2d.setForeground(new java.awt.Color(216, 220, 255));
        check2d.setText("2D");
        jPanel1.add(check2d, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        check2dAtmos.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check2dAtmos.setForeground(new java.awt.Color(216, 220, 255));
        check2dAtmos.setText("2D Atmos");
        jPanel1.add(check2dAtmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        check3d.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check3d.setForeground(new java.awt.Color(216, 220, 255));
        check3d.setText("3D");
        check3d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check3dMousePressed(evt);
            }
        });
        jPanel1.add(check3d, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        check3dAtmos.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check3dAtmos.setForeground(new java.awt.Color(216, 220, 255));
        check3dAtmos.setText("3D Atmos");
        check3dAtmos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check3dAtmosMousePressed(evt);
            }
        });
        jPanel1.add(check3dAtmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 320, 490));

        btnCargar.setBackground(new java.awt.Color(20, 71, 103));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(216, 220, 255));
        btnCargar.setText("Cargar Imagen");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 130, 40));

        lblTextImagen.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblTextImagen.setForeground(new java.awt.Color(216, 220, 255));
        lblTextImagen.setText("Cargar Imagen de cartelera");
        jPanel1.add(lblTextImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, 40));

        lblEstreno1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblEstreno1.setForeground(new java.awt.Color(216, 220, 255));
        lblEstreno1.setText("Fecha de estreno:");
        jPanel1.add(lblEstreno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 200, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("(minutos)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        lblTituloRegistrar1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTituloRegistrar1.setForeground(new java.awt.Color(216, 220, 255));
        lblTituloRegistrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRegistrar1.setText("MODIFICAR PELICULA");
        jPanel1.add(lblTituloRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 520, 60));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 120, 45));

        jPanel4.setBackground(new java.awt.Color(170, 34, 45));

        btnLimpiarCampos.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnLimpiarCampos.setForeground(new java.awt.Color(216, 220, 255));
        btnLimpiarCampos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiarCampos.setText("LIMPIAR");
        btnLimpiarCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarCamposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarCamposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimpiarCamposMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 120, 45));

        jPanel5.setBackground(new java.awt.Color(10, 165, 13));

        btnModificar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(216, 220, 255));
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificar.setText("MODIFICAR");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 140, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void listGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listGeneroActionPerformed

    private void check3dMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check3dMousePressed
        // TODO add your handling code here:
        check2d.setSelected(!check3d.isSelected());
    }//GEN-LAST:event_check3dMousePressed

    private void check3dAtmosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check3dAtmosMousePressed
        // TODO add your handling code here:
        check2dAtmos.setSelected(!check3dAtmos.isSelected());
    }//GEN-LAST:event_check3dAtmosMousePressed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        String rutaDest = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, JFIF, PNG & GIF", "jpg", "png", "gif", "jfif");
        jFileChooser.setFileFilter(filtrado);

        int respuesta = jFileChooser.showOpenDialog(this);

        try {
            if (respuesta == jFileChooser.APPROVE_OPTION) {
                rutaDest = RUTA_DESTINO + jFileChooser.getSelectedFile().getName();
                
                Path Destino = Paths.get(rutaDest);
                String origin = jFileChooser.getSelectedFile().getPath();
                
                Path Origen = Paths.get(origin);
                Files.copy(Origen, Destino, StandardCopyOption.REPLACE_EXISTING);
                
                pelicula.setRutaImagen(rutaDest);
                
                Image img = new ImageIcon(pelicula.getRutaImagen()).getImage();
                ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
                lblImagen.setIcon(imgIcon);
            }
        } catch (IOException e) {
            System.out.println("Fallo la carga de datos de las imagenes");
        }
    }//GEN-LAST:event_btnCargarActionPerformed

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
        if (Sesion.getTipo().equals("Admin")) {
            this.dispose();
            MenuAdmin admin = new MenuAdmin();
            admin.setVisible(true);
        } else if (Sesion.getTipo().equals("Gerente")) {
            this.dispose();
            MenuGerente gerente = new MenuGerente();
            gerente.setVisible(true);
        }
    }//GEN-LAST:event_btnExitMousePressed

    private void btnLimpiarCamposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCamposMouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(204, 40, 54));
        btnExit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLimpiarCamposMouseEntered

    private void btnLimpiarCamposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCamposMouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(170, 34, 45));
        btnExit.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnLimpiarCamposMouseExited

    private void btnLimpiarCamposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCamposMousePressed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtDuracion.setText("");
        txtSinopsis.setText("");
        check3d.setSelected(false);
        check3dAtmos.setSelected(false);
        check2d.setSelected(false);
        check2dAtmos.setSelected(false);
        dateFecha.setDate(null);
    }//GEN-LAST:event_btnLimpiarCamposMousePressed

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(13, 210, 17));
        btnModificar.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(10, 165, 13));
        btnModificar.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        // TODO add your handling code here:
        try {
            String nombreViejo = pelicula.getNombre();
            Boolean flag = false;
            Validaciones.validarCampo(txtNombre.getText());
            Validaciones.validarCampo(txtSinopsis.getText());
            Validaciones.validarCampo(dateFecha.getDateFormatString());
            Validaciones.validarNumeros(txtDuracion.getText());

            this.pelicula.setNombre(txtNombre.getText());
            this.pelicula.setDuracion(Integer.valueOf(txtDuracion.getText()));
            this.pelicula.setGenero(listGenero.getSelectedItem().toString());
            this.pelicula.setClasificacion(listClas.getSelectedItem().toString());
            this.pelicula.setDescripcion(txtSinopsis.getText());
            this.pelicula.setFechaEstreno((Date) dateFecha.getDate());
            if (check3d.isSelected()) {
                pelicula.getTipo().replace("3D", true);
            }
            if (check2d.isSelected()) {
                pelicula.getTipo().replace("2D", true);
            }
            if (check3dAtmos.isSelected()) {
                pelicula.getTipo().replace("3D ATMOS", true);
            }
            if (check2dAtmos.isSelected()) {
                pelicula.getTipo().replace("2D ATMOS", true);
            }
            for (int i = 0; i < Cine.getListaPeliculas().size() && flag == false; i++) {
                if (Cine.getListaPeliculas().get(i).getNombre().equals(nombreViejo)) {
                    Cine.getListaPeliculas().set(i, pelicula);
                    flag = true;
                }
            }
            Persistencia.actualizarPeliculas();

            JOptionPane.showMessageDialog(null, "Pelicula agregada exitosamente!\n" + pelicula.toString());
        } catch (CampoVacioException | SoloNumerosException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarMousePressed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        txtNombre.setBorder(new LineBorder(new Color(44, 117, 160), 2, true));
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        txtNombre.setBorder(new LineBorder(new Color(17, 61, 88), 2, true));
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtDuracionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuracionFocusGained
        // TODO add your handling code here:
        txtDuracion.setBorder(new LineBorder(new Color(44, 117, 160), 2, true));
    }//GEN-LAST:event_txtDuracionFocusGained

    private void txtDuracionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuracionFocusLost
        // TODO add your handling code here:
        txtDuracion.setBorder(new LineBorder(new Color(17, 61, 88), 2, true));
    }//GEN-LAST:event_txtDuracionFocusLost

    private void txtSinopsisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSinopsisFocusGained
        // TODO add your handling code here:
        txtSinopsis.setBorder(new LineBorder(new Color(44, 117, 160), 2, true));
    }//GEN-LAST:event_txtSinopsisFocusGained

    private void txtSinopsisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSinopsisFocusLost
        // TODO add your handling code here:
        txtSinopsis.setBorder(new LineBorder(new Color(17, 61, 88), 2, true));
    }//GEN-LAST:event_txtSinopsisFocusLost

    private void dateFechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFechaFocusGained
        // TODO add your handling code here:
        dateFecha.setBorder(new LineBorder(new Color(44, 117, 160), 2, true));
    }//GEN-LAST:event_dateFechaFocusGained

    private void dateFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFechaFocusLost
        // TODO add your handling code here:
        dateFecha.setBorder(new LineBorder(new Color(17, 61, 88), 2, true));
    }//GEN-LAST:event_dateFechaFocusLost

    private void cargarDatos() {
        //===========================
        txtDuracion.setText(String.valueOf(pelicula.getDuracion()));
        txtNombre.setText(pelicula.getNombre());
        txtSinopsis.setText(pelicula.getDescripcion());
        listGenero.setSelectedItem(pelicula.getGenero());
        listClas.setSelectedItem(pelicula.getClasificacion());
        iniciar();
        if (pelicula.getFechaEstreno() != null) {
            dateFecha.setDate(pelicula.getFechaEstreno());
        }

        for (Map.Entry<String, Boolean> entry : pelicula.getTipo().entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            if (key.equals("2D")) {
                if (value) {
                    check2d.setSelected(true);
                }
            }
            if (key.equals("3D")) {
                if (value) {
                    check3d.setSelected(true);
                }
            }
            if (key.equals("2D ATMOS")) {
                if (value) {
                    check2dAtmos.setSelected(true);
                }
            }
            if (key.equals("3D ATMOS")) {
                if (value) {
                    check3dAtmos.setSelected(true);
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnCargar;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnLimpiarCampos;
    private javax.swing.JLabel btnModificar;
    private javax.swing.JCheckBox check2d;
    private javax.swing.JCheckBox check2dAtmos;
    private javax.swing.JCheckBox check3d;
    private javax.swing.JCheckBox check3dAtmos;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblEstreno1;
    private javax.swing.JLabel lblGenero;
    private static javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSinopsis;
    private javax.swing.JLabel lblTextImagen;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTituloRegistrar1;
    private javax.swing.JComboBox<String> listClas;
    private javax.swing.JComboBox<String> listGenero;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSinopsis;
    // End of variables declaration//GEN-END:variables
}
