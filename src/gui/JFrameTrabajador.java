
package gui;

public class JFrameTrabajador extends javax.swing.JFrame {

    public JFrameTrabajador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtHorasTrabajdas = new javax.swing.JTextField();
        txtTarifaHoraria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtLimpiar = new javax.swing.JButton();
        txtSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 36, 90, 24));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 84, 61, -1));

        jLabel3.setText("Horas Trabajadas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 124, 138, -1));

        jLabel4.setText("Tarifa Horaria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 164, 103, -1));

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 201, -1, -1));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 37, 96, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 81, 96, -1));
        getContentPane().add(txtHorasTrabajdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 121, 96, -1));
        getContentPane().add(txtTarifaHoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 161, 96, -1));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 453, 128));

        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(txtLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 201, -1, -1));

        txtSalir.setText("Salir");
        txtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalirActionPerformed(evt);
            }
        });
        getContentPane().add(txtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 201, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

    int codigo = Integer.parseInt(txtcodigo.getText());
    String nombre = txtnombre.getText();
    int horas = Integer.parseInt(txtHorasTrabajdas.getText());
    double tarifa = Double.parseDouble(txtTarifaHoraria.getText());

    Trabajador trabajador = new Trabajador();

    trabajador.setCodigo(codigo);
    trabajador.setNombre(nombre);
    trabajador.setHorasTrabajadas(horas);
    trabajador.setTarifaHoraria(tarifa);
    
    double sueldoBruto = trabajador.calcularSueldoBruto();
    double descuento = trabajador.calcularDescuento();
    double sueldoNeto = trabajador.calcularSueldoNeto();

    txtArea.setText("Código: " + codigo + "\n");
    txtArea.append("Nombre: " + nombre + "\n");
    txtArea.append("Horas Trabajadas: " + horas + "\n");
    txtArea.append("Tarifa Horaria: " + tarifa + "\n");
    txtArea.append("Sueldo Bruto: " + sueldoBruto + "\n");
    txtArea.append("Descuento: " + descuento + "\n");
    txtArea.append("Sueldo Neto: " + sueldoNeto + "\n");
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
       txtcodigo.setText("");
    txtnombre.setText("");
    txtHorasTrabajdas.setText("");
    txtTarifaHoraria.setText("");
    txtArea.setText("");
    }//GEN-LAST:event_txtLimpiarActionPerformed

    private void txtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_txtSalirActionPerformed

    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(JFrameTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtHorasTrabajdas;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JButton txtSalir;
    private javax.swing.JTextField txtTarifaHoraria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
