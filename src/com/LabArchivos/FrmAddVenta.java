/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LabArchivos;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class FrmAddVenta extends javax.swing.JFrame {

    /**
     * Creates new form FrmAddVenta
     */
    public FrmAddVenta() {
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
        txtMarca = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
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
        jLabel6.setText("Registrar Venta");
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
        jLabel8.setText("Tipo de Auto");
        Bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(102, 102, 102));
        txtMarca.setText("Ingrese el nombre de la marca del auto.");
        txtMarca.setBorder(null);
        txtMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMarcaMousePressed(evt);
            }
        });
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        Bg.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 280, -1));
        Bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 280, 10));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Código");
        Bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigo.setText("Digite el código del auto.");
        txtCodigo.setBorder(null);
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoMousePressed(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        Bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, -1));
        Bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 280, 10));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Monto de la venta");
        Bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        txtMonto.setBackground(new java.awt.Color(255, 255, 255));
        txtMonto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(102, 102, 102));
        txtMonto.setText("Ingrese el monto de la venta.");
        txtMonto.setBorder(null);
        txtMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMontoMousePressed(evt);
            }
        });
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        Bg.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 280, -1));
        Bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, 10));

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
        Bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 170, -1));

        btnRegistrar.setBackground(new java.awt.Color(22, 117, 185));
        btnRegistrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        Bg.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        if(txtCedula.getText().equals("Digite el número de cédula del empleado.")){
            txtCedula.setText("");
            txtCedula.setForeground(Color.black);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
        if(txtMarca.getText().isEmpty()){
            txtMarca.setText("Ingrese el nombre de la marca del auto.");
            txtMarca.setForeground(Color.gray);
        }
        if(txtCodigo.getText().isEmpty()){
            txtCodigo.setText("Digite el código del auto.");
            txtCodigo.setForeground(Color.gray);
        }
        if(txtMonto.getText().isEmpty()){
            txtMonto.setText("Ingrese el monto de la venta.");
            txtMonto.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if(txtNombre.getText().equals("Ingrese nombre y apellidos del empleado.")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtMarca.getText().isEmpty()){
            txtMarca.setText("Ingrese el nombre de la marca del auto.");
            txtMarca.setForeground(Color.gray);
        }
        if(txtCodigo.getText().isEmpty()){
            txtCodigo.setText("Digite el código del auto.");
            txtCodigo.setForeground(Color.gray);
        }
        if(txtMonto.getText().isEmpty()){
            txtMonto.setText("Ingrese el monto de la venta.");
            txtMonto.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaMousePressed
        if(txtMarca.getText().equals("Ingrese el nombre de la marca del auto.")){
            txtMarca.setText("");
            txtMarca.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
        if(txtCodigo.getText().isEmpty()){
            txtCodigo.setText("Digite el código del auto.");
            txtCodigo.setForeground(Color.gray);
        }
        if(txtMonto.getText().isEmpty()){
            txtMonto.setText("Ingrese el monto de la venta.");
            txtMonto.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtMarcaMousePressed

    private void txtCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMousePressed
        if(txtCodigo.getText().equals("Digite el código del auto.")){
            txtCodigo.setText("");
            txtCodigo.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtMarca.getText().isEmpty()){
            txtMarca.setText("Ingrese el nombre de la marca del auto.");
            txtMarca.setForeground(Color.gray);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
        if(txtMonto.getText().isEmpty()){
            txtMonto.setText("Ingrese el monto de la venta.");
            txtMonto.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCodigoMousePressed

    private void txtMontoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMontoMousePressed
        if(txtMonto.getText().equals("Ingrese el monto de la venta.")){
            txtMonto.setText("");
            txtMonto.setForeground(Color.black);
        }
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Digite el número de cédula del empleado.");
            txtCedula.setForeground(Color.gray);
        }
        if(txtMarca.getText().isEmpty()){
            txtMarca.setText("Ingrese el nombre de la marca del auto.");
            txtMarca.setForeground(Color.gray);
        }
        if(txtCodigo.getText().isEmpty()){
            txtCodigo.setText("Digite el código del auto.");
            txtCodigo.setForeground(Color.gray);
        }
        if(txtNombre.getText().isEmpty()){
            txtNombre.setText("Ingrese nombre y apellidos del empleado.");
            txtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtMontoMousePressed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCajasDeTexto();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Obtener datos del formulario
        String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        String marca = txtMarca.getText();
        String monto = txtMonto.getText();
        String codigo = txtCodigo.getText();
        double montoVenta = Double.parseDouble(monto);
        ArrayList<String> registrosEmpleados = new ArrayList<>();
        //Validar que no hayan campos vacíos
        if(nombre.isEmpty() || cedula.isEmpty() || marca.isEmpty() || monto.isEmpty() || codigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            //Validar que el campo cédula y monto sean secuencias de número positivos
            if(!cedula.matches("^[1-9][0-9]*$") || !monto.matches("^[1-9][0-9]*$")){
                JOptionPane.showMessageDialog(null, "El campo cédula y monto deben ser números", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                //Validar que la cedula digitada esté en el archivo de empleados y que el nombre corresponda a dicha cédula
                if(!UtilityClass.cedulaExistente(cedula)){
                    JOptionPane.showMessageDialog(null, "No existe un empleado con el número de documento ingresado", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(!UtilityClass.cedulaNombre(cedula, nombre)){
                        JOptionPane.showMessageDialog(null, "No existe un empleado con el número de documento y nombre ingresado.", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                        //Validar que el código ingresado no exista en el archivo ventas
                        if(UtilityClass.codigoExistente(codigo)){
                            JOptionPane.showMessageDialog(null, "El código ingresado ya está registrado en el archivo de ventas", "Error", JOptionPane.ERROR_MESSAGE);
                        }else{
                            //Ya con todos los datos validados, se realiza el registro en el archivo ventas
                            try{
                                FileWriter outFile = new FileWriter("Ventas.txt", true);
                                PrintWriter register_ventas = new PrintWriter(outFile);
                                register_ventas.println(codigo+"\t"+nombre+"\t"+cedula+"\t"+marca+"\t"+monto);
                                limpiarCajasDeTexto();
                                register_ventas.close();
                                JOptionPane.showMessageDialog(null, "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                if(montoVenta>=30000000){
                                    try{
                                    //Una vez se haya registrado la venta, se procede a actualizar el salario más comisión del empleado si la venta mayor a 30000000
                                    FileReader fileReader = new FileReader("Empleados.txt");
                                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                                    String linea;
                                    while ((linea = bufferedReader.readLine()) != null) {
                                        String[] partes = linea.split("\t"); 
                                        if (partes.length >= 1 && partes[0].equals(cedula)) {
                                            // Calcular el salario más comisión y actualiza el campo en  la linea
                                            Double salario = Double.parseDouble(partes[5]);
                                            Double salarioComision = salario + (montoVenta*0.02);
                                            partes[6] = salarioComision.toString();
                                        }
                                        registrosEmpleados.add(String.join("\t", partes));
                                    }

                                    bufferedReader.close();

                                    FileWriter fileWriter = new FileWriter("Empleados.txt", false);
                                    PrintWriter printWriter = new PrintWriter(fileWriter);

                                    for (String nuevaLinea : registrosEmpleados) {
                                        printWriter.println(nuevaLinea);
                                    }

                                    printWriter.close();
                                }catch(IOException ex){
                                    ex.printStackTrace();
                                    JOptionPane.showMessageDialog(null, "No fue posible actualizar el salario del empleado", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                                }
                            }catch(IOException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Error al registrar la venta", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
   private void limpiarCajasDeTexto(){
        txtNombre.setText("Ingrese nombre y apellidos del empleado.");
        txtCedula.setText("Digite el número de cédula del empleado.");
        txtMarca.setText("Ingrese el nombre de la marca del auto.");
        txtCodigo.setText("Digite el código del auto.");
        txtMonto.setText("Ingrese el monto de la venta.");
        txtCedula.setForeground(Color.gray);
        txtNombre.setForeground(Color.gray);
        txtMarca.setForeground(Color.gray);
        txtCodigo.setForeground(Color.gray);
        txtMonto.setForeground(Color.gray);
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
            java.util.logging.Logger.getLogger(FrmAddVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
