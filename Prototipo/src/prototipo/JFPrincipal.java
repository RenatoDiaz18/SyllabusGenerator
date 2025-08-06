package prototipo;

import Clases.Escuela;
import Clases.Facultades;
import Clases.Silabo;
import javax.swing.DefaultComboBoxModel;

public class JFPrincipal extends javax.swing.JFrame {

    private Facultades facultades = new Facultades();
    private Escuela escuelas = new Escuela();
    private DefaultComboBoxModel<String> modeloEscuelas = new DefaultComboBoxModel<>();
    private JFGenerador padre;
    private Silabo silabo;
    int xMouse, yMouse;

    public JFPrincipal(JFGenerador padre, Silabo silabo) {
        initComponents();
        this.padre = padre;
        this.silabo = silabo;
        cboEscuelas.setModel(modeloEscuelas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblExit1 = new javax.swing.JLabel();
        dpContenedor = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        Lupa = new javax.swing.JButton();
        cboEscuelas = new javax.swing.JComboBox<>();
        txtFacultad1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblIconImagotipo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIconClose = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        lblExit1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblExit1.setForeground(new java.awt.Color(255, 0, 51));
        lblExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit1.setText("x");
        lblExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExit1MouseEntered(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        dpContenedor.setBackground(new java.awt.Color(255, 255, 255));
        dpContenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dpContenedor.setForeground(new java.awt.Color(0, 0, 0));
        dpContenedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dpContenedorMouseDragged(evt);
            }
        });
        dpContenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dpContenedorMousePressed(evt);
            }
        });

        Lupa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        Lupa.setBorder(null);
        Lupa.setBorderPainted(false);
        Lupa.setContentAreaFilled(false);
        Lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lupa.setFocusPainted(false);
        Lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaActionPerformed(evt);
            }
        });

        cboEscuelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboEscuelas.setModel(this.modeloEscuelas);
        cboEscuelas.setToolTipText("");
        cboEscuelas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        txtFacultad1.setEditable(false);
        txtFacultad1.setBackground(new java.awt.Color(255, 255, 255));
        txtFacultad1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFacultad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        txtFacultad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultad1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SF UI  Text Med", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SELECCIONE ESCUELA");

        jLabel7.setFont(new java.awt.Font("SF UI  Text Med", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SELECCIONE FACULTAD");

        lblIconImagotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagotipo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nuevo silabo ");

        lblIconClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icons/Icon_Close.png"))); // NOI18N
        lblIconClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIconClose.setFocusable(false);
        lblIconClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconCloseMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIconCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblIconCloseMouseReleased(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(0, 102, 204));
        btnSiguiente.setFont(new java.awt.Font("SF UI  Text Med", 1, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SF UI  Text Med", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("SELECCIONAR PROGRAMA DE ESTUDIOS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dpContenedor.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(Lupa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(cboEscuelas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(txtFacultad1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(lblIconImagotipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(lblIconClose, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(btnSiguiente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpContenedorLayout = new javax.swing.GroupLayout(dpContenedor);
        dpContenedor.setLayout(dpContenedorLayout);
        dpContenedorLayout.setHorizontalGroup(
            dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconClose))
            .addGroup(dpContenedorLayout.createSequentialGroup()
                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dpContenedorLayout.createSequentialGroup()
                                .addComponent(txtFacultad1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dpContenedorLayout.createSequentialGroup()
                                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dpContenedorLayout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(dpContenedorLayout.createSequentialGroup()
                                            .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(17, 17, 17))
                                        .addComponent(cboEscuelas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
                                .addGap(0, 15, Short.MAX_VALUE))))
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblIconImagotipo)))
                .addGap(37, 37, 37))
        );
        dpContenedorLayout.setVerticalGroup(
            dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(dpContenedorLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblIconImagotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lupa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFacultad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboEscuelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(dpContenedorLayout.createSequentialGroup()
                .addComponent(lblIconClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpContenedor, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExit1MouseClicked

    private void lblExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MouseEntered

    }//GEN-LAST:event_lblExit1MouseEntered

    private void dpContenedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dpContenedorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dpContenedorMousePressed

    private void dpContenedorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dpContenedorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_dpContenedorMouseDragged

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        silabo.setFacultad(this.txtFacultad1.getText());
        silabo.setEscuelaProfesional(this.cboEscuelas.getSelectedItem().toString());
        //silabo guarda programa de estudio 

        padre.setBanderaLlenadoCompleto(true);
        padre.mostrarPanelInicio();
        padre.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void lblIconCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconCloseMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIconCloseMouseReleased

    private void lblIconCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconCloseMousePressed

    }//GEN-LAST:event_lblIconCloseMousePressed

    private void lblIconCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconCloseMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_lblIconCloseMouseClicked

    private void txtFacultad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultad1ActionPerformed

    private void LupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaActionPerformed
        JDFacultades frm = new JDFacultades(null, true);

        this.txtFacultad1.setText("");
        String seleccionado = frm.buscar();
        frm.setLocationRelativeTo(null);

        if (seleccionado != null) {
            this.txtFacultad1.setText(seleccionado);
        }

        int indiceFacultad = -1;

        for (int i = 0; i < this.facultades.getFacultades().length; i++) {
            if (this.facultades.getFacultades()[i].equalsIgnoreCase(txtFacultad1.getText())) {
                indiceFacultad = i;
                break;
            }
        }

        modeloEscuelas.removeAllElements();
        if (indiceFacultad >= 0) {
            String[] escuelasFacultad = this.escuelas.getEscuelas(indiceFacultad);
            for (String escuela : escuelasFacultad) {
                this.modeloEscuelas.addElement(escuela);
                this.cboEscuelas.setSelectedIndex(-1);
            }
        }
    }//GEN-LAST:event_LupaActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Silabo silabo = new Silabo();
                JFGenerador generador = new JFGenerador(silabo);
                new JFPrincipal(generador, silabo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lupa;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cboEscuelas;
    private javax.swing.JDesktopPane dpContenedor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExit1;
    private javax.swing.JLabel lblIconClose;
    private javax.swing.JLabel lblIconImagotipo;
    private javax.swing.JTextField txtFacultad1;
    // End of variables declaration//GEN-END:variables



}
