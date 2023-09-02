/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LabArchivos;

import java.awt.Color;

/**
 *
 * @author ashle
 */
public class FrmAddEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form FrmAddEmpleado
     */
    public FrmAddEmpleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("S.A.");
        Bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Automóviles del Caribe");
        Bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/car.png"))); // NOI18N
        Bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 90, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/BgMenu.jpg"))); // NOI18N
        Bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 240, 520));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/favicon (1).png"))); // NOI18N
        jLabel6.setText("Registrar Empleado");
        Bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Automóviles del Caribe S.A.");
        Bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Número de Documento");
        Bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtCedula.setText("Digite el número de cédula del empleado.");
        txtCedula.setBorder(null);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        Bg.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, -1));
        Bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre Completo");
        Bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("Ingrese nombres y apellidos del empleado.");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        Bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, -1));
        Bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 280, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cargo");
        Bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtCargo.setBackground(new java.awt.Color(255, 255, 255));
        txtCargo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCargo.setForeground(new java.awt.Color(102, 102, 102));
        txtCargo.setText("Ingrese el cargo del empleado.");
        txtCargo.setBorder(null);
        txtCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCargoMousePressed(evt);
            }
        });
        Bg.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 280, -1));
        Bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 280, 10));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Teléfono");
        Bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setText("Digite el teléfono de contacto del empleado.");
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        Bg.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, -1));
        Bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 280, 10));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha de Ingreso");
        Bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setText("Digite la fecha de ingreso DD/MM/AAAA.");
        txtFecha.setBorder(null);
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        Bg.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 280, -1));
        Bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, 10));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Salario Fijo");
        Bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        txtSalario.setBackground(new java.awt.Color(255, 255, 255));
        txtSalario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(102, 102, 102));
        txtSalario.setText("Ingrese el salario fijo del empleado");
        txtSalario.setBorder(null);
        txtSalario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSalarioMousePressed(evt);
            }
        });
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        Bg.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 280, -1));
        Bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 280, 10));

        btnLimpiar.setBackground(new java.awt.Color(189, 231, 247));
        btnLimpiar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setText("Limpiar cajas de texto");
        btnLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        Bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 170, -1));

        btnRegistrar.setBackground(new java.awt.Color(22, 117, 185));
        btnRegistrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setFocusPainted(false);
        Bg.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txtNombre.setText("Ingrese nombre y apellidos del empleado.");
       txtCedula.setText("Digite el número de cédula del empleado.");
       txtCargo.setText("Ingrese el cargo del empleado.");
       txtTelefono.setText("Digite el teléfono de contacto del empleado.");
       txtFecha.setText("Digite la fecha de ingreso DD/MM/AAAA.");
       txtSalario.setText("Ingrese el salario fijo del empleado.");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        if(txtCedula.getText().equals("Digite el número de cédula del empleado.")){
            txtCedula.setText("");
            txtCedula.setForeground(Color.black);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del empleado.");
            txtCargo.setForeground(Color.gray);
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Digite el teléfono de contacto del empleado.");
            txtTelefono.setForeground(Color.gray);
        }
        if(txtFecha.getText().isEmpty()){
            txtFecha.setText("Digite la fecha de ingreso DD/MM/AAAA.");
            txtFecha.setForeground(Color.gray);
        }
        if(txtSalario.getText().isEmpty()){
            txtSalario.setText("Ingrese el salario fijo del empleado.");
            txtSalario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if(txtNombre.getText().equals("Ingrese nombre y apellidos del empleado.")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del empleado.");
            txtCargo.setForeground(Color.gray);
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Digite el teléfono de contacto del empleado.");
            txtTelefono.setForeground(Color.gray);
        }
        if(txtFecha.getText().isEmpty()){
            txtFecha.setText("Digite la fecha de ingreso DD/MM/AAAA.");
            txtFecha.setForeground(Color.gray);
        }
        if(txtSalario.getText().isEmpty()){
            txtSalario.setText("Ingrese el salario fijo del empleado.");
            txtSalario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtCargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCargoMousePressed
        if(txtCargo.getText().equals("Ingrese el cargo del empleado.")){
            txtCargo.setText("");
            txtCargo.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Digite el teléfono de contacto del empleado.");
            txtTelefono.setForeground(Color.gray);
        }
        if(txtFecha.getText().isEmpty()){
            txtFecha.setText("Digite la fecha de ingreso DD/MM/AAAA.");
            txtFecha.setForeground(Color.gray);
        }
        if(txtSalario.getText().isEmpty()){
            txtSalario.setText("Ingrese el salario fijo del empleado.");
            txtSalario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCargoMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        if(txtTelefono.getText().equals("Digite el teléfono de contacto del empleado.")){
            txtTelefono.setText("");
            txtTelefono.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del empleado.");
            txtCargo.setForeground(Color.gray);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
        if(txtFecha.getText().isEmpty()){
            txtFecha.setText("Digite la fecha de ingreso DD/MM/AAAA.");
            txtFecha.setForeground(Color.gray);
        }
        if(txtSalario.getText().isEmpty()){
            txtSalario.setText("Ingrese el salario fijo del empleado.");
            txtSalario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
        if(txtFecha.getText().equals("Digite la fecha de ingreso DD/MM/AAAA.")){
            txtFecha.setText("");
            txtFecha.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del empleado.");
            txtCargo.setForeground(Color.gray);
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Digite el teléfono de contacto del empleado.");
            txtTelefono.setForeground(Color.gray);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
        if(txtSalario.getText().isEmpty()){
            txtSalario.setText("Ingrese el salario fijo del empleado.");
            txtSalario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFechaMousePressed

    private void txtSalarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalarioMousePressed
        if(txtSalario.getText().equals("Ingrese el salario fijo del empleado.")){
            txtSalario.setText("");
            txtSalario.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtCargo.getText().isEmpty()){
            txtCargo.setText("Ingrese el cargo del empleado.");
            txtCargo.setForeground(Color.gray);
        }
        if(txtTelefono.getText().isEmpty()){
            txtTelefono.setText("Digite el teléfono de contacto del empleado.");
            txtTelefono.setForeground(Color.gray);
        }
        if(txtFecha.getText().isEmpty()){
            txtFecha.setText("Digite la fecha de ingreso DD/MM/AAAA.");
            txtFecha.setForeground(Color.gray);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtSalarioMousePressed

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
            java.util.logging.Logger.getLogger(FrmAddEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}