/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Pelicula;
import cine.user.Gerente;
import cine.user.Usuario;
import javax.swing.DefaultComboBoxModel;
import persistencia.Persistencia;

/**
 *
 * @author Diego
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizarListPeliculas();
        actualizarGerentes();
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
        btnCerrarSesion = new javax.swing.JLabel();
        btnAgregarPelicula1 = new javax.swing.JLabel();
        listPeliculas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnModificarPelicula = new javax.swing.JLabel();
        btnBajaPelicula = new javax.swing.JLabel();
        btnAgregarGerente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listGerentes = new javax.swing.JComboBox<>();
        btnModificarGerente = new javax.swing.JLabel();
        btnBajaGerente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        btnCerrarSesion.setText("Cerrar sesión.");
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
        });

        btnAgregarPelicula1.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        btnAgregarPelicula1.setText("Agregar Película");
        btnAgregarPelicula1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarPelicula1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarPelicula1MousePressed(evt);
            }
        });

        listPeliculas.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel1.setText("Modificar cartelera");

        btnModificarPelicula.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        btnModificarPelicula.setText("Modificar");
        btnModificarPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificarPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarPeliculaMousePressed(evt);
            }
        });

        btnBajaPelicula.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        btnBajaPelicula.setText("Dar baja");
        btnBajaPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBajaPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBajaPeliculaMousePressed(evt);
            }
        });

        btnAgregarGerente.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        btnAgregarGerente.setText("Agregar Gerente");
        btnAgregarGerente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarGerenteMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel2.setText("Modificar gerente");

        listGerentes.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N

        btnModificarGerente.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        btnModificarGerente.setText("Modificar");
        btnModificarGerente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificarGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarGerenteMousePressed(evt);
            }
        });

        btnBajaGerente.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        btnBajaGerente.setText("Dar baja");
        btnBajaGerente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBajaGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBajaGerenteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarPelicula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBajaPelicula))
                    .addComponent(btnAgregarPelicula1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listGerentes, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarGerente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBajaGerente)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAgregarPelicula1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPelicula)
                    .addComponent(btnBajaPelicula))
                .addGap(56, 56, 56)
                .addComponent(btnAgregarGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listGerentes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarGerente)
                    .addComponent(btnBajaGerente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        Persistencia.actualizarPeliculas();
        Persistencia.actualizarUsuarios();
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMousePressed

    private void btnAgregarPelicula1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPelicula1MousePressed
        RegistroPelicula reg = new RegistroPelicula();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgregarPelicula1MousePressed

    private void btnModificarPeliculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarPeliculaMousePressed

        for (Pelicula e : Cine.getListaPeliculas()) {
            if (e.getNombre().equals(listPeliculas.getSelectedItem())) {
                this.dispose();
                ModificarPelicula mod = new ModificarPelicula(e);
                mod.setVisible(true);
                mod.setLocationRelativeTo(null);
            }
        }
        //btnModificarPelicula mod = new ModificarPelicula()
    }//GEN-LAST:event_btnModificarPeliculaMousePressed

    private void btnBajaPeliculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaPeliculaMousePressed
        if (listPeliculas.getSelectedItem() != null) {
            for (Pelicula e : Cine.getListaPeliculas()) {
                if (e.getNombre().equals(listPeliculas.getSelectedItem())) {
                    e.setBaja(true);
                }
            }
        }
        actualizarListPeliculas();
    }//GEN-LAST:event_btnBajaPeliculaMousePressed

    private void btnAgregarGerenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarGerenteMousePressed
        // TODO add your handling code here:
        RegistroGerente reg = new RegistroGerente();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarGerenteMousePressed

    private void btnModificarGerenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarGerenteMousePressed
        String nombre;
        for(int i=0; i<Cine.getListaUsuarios().size(); i++){
            if (Cine.getListaUsuarios().get(i) instanceof Gerente) {
                nombre= Cine.getListaUsuarios().get(i).getNombre() + " " + Cine.getListaUsuarios().get(i).getApellido();
                if (nombre.equals(listGerentes.getSelectedItem())) {
                    ModificarGerente mod = new ModificarGerente(((Gerente) Cine.getListaUsuarios().get(i)));
                    mod.setVisible(true);
                    mod.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }
        
        
        
    }//GEN-LAST:event_btnModificarGerenteMousePressed

    private void btnBajaGerenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaGerenteMousePressed

        String nombre;      
        // FUNCIÓN FEA
        for(int i=0; i<Cine.getListaUsuarios().size(); i++){
            if (Cine.getListaUsuarios().get(i) instanceof Gerente) {
                nombre= Cine.getListaUsuarios().get(i).getNombre() + " " + Cine.getListaUsuarios().get(i).getApellido();
                if (nombre.equals(listGerentes.getSelectedItem())) {
                    System.out.println("HOLA");
                    ((Gerente) Cine.getListaUsuarios().get(i)).setAdmin(false);
                }
            }
        }
        actualizarGerentes();
    }//GEN-LAST:event_btnBajaGerenteMousePressed

    private void actualizarListPeliculas() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        listPeliculas.setModel(model);
        for (Pelicula e : Cine.getListaPeliculas()) {
            if (!e.isBaja()) {
                model.addElement(e.getNombre());
            }
        }
    }

    private void actualizarGerentes() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        listGerentes.setModel(model);
        for (Usuario e : Cine.getListaUsuarios()) {
            if (e instanceof Gerente) {
                if (((Gerente) e).getIsAdmin()==true) {
                    model.addElement(e.getNombre() + " " + e.getApellido());
                }
            }
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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarGerente;
    private javax.swing.JLabel btnAgregarPelicula1;
    private javax.swing.JLabel btnBajaGerente;
    private javax.swing.JLabel btnBajaPelicula;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnModificarGerente;
    private javax.swing.JLabel btnModificarPelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listGerentes;
    private javax.swing.JComboBox<String> listPeliculas;
    // End of variables declaration//GEN-END:variables
}
