
package cajeroautomatico;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import javax.swing.*;

public class MenuQuechua extends javax.swing.JFrame {

    private String nombreCompleto;
    private String numeroCuenta;
    private String tipoMonedaSeleccionado;
    private double balance;

    public MenuQuechua() {
        initComponents();
    }

    public MenuQuechua(String nombreCompleto, String numeroCuenta, String tipoMonedaSeleccionado, double balance) {
        initComponents();
        this.nombreCompleto = nombreCompleto;
        this.numeroCuenta = numeroCuenta;
        this.tipoMonedaSeleccionado = tipoMonedaSeleccionado;
        this.balance = balance;
        NombreCompletoLabel.setText(nombreCompleto);
        CuentaNumero.setText(numeroCuenta);
        BalanceLabel.setText(String.valueOf(balance));
        TipoMoneda.setSelectedItem(tipoMonedaSeleccionado);
    }


    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TipoMoneda = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Deposito = new javax.swing.JButton();
        Retiro = new javax.swing.JButton();
        Transfe = new javax.swing.JButton();
        Historial = new javax.swing.JButton();
        CambioContraseña = new javax.swing.JButton();
        NombreCompletoLabel = new javax.swing.JLabel();
        CuentaNumero = new javax.swing.JLabel();
        BalanceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setText("Ruwasqaykita akllay");

        TipoMoneda.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        TipoMoneda.setForeground(new java.awt.Color(255, 0, 0));
        TipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bs.", "$.", "€." }));
        TipoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoMonedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(TipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("Lliw Ruraqpa Suti:");

        Deposito.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Deposito.setText("Qullqi churay");
        Deposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositoMouseClicked(evt);
            }
        });
        Deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositoActionPerformed(evt);
            }
        });

        Retiro.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Retiro.setText("Retirokuna");
        Retiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroMouseClicked(evt);
            }
        });

        Transfe.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Transfe.setText("Alambrewan apachiy");
        Transfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransfeMouseClicked(evt);
            }
        });
        Transfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransfeActionPerformed(evt);
            }
        });

        Historial.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Historial.setText("Hapichiy");
        Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialMouseClicked(evt);
            }
        });
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });

        CambioContraseña.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CambioContraseña.setText("Contraseña Nisqa Tikray");
        CambioContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambioContraseñaMouseClicked(evt);
            }
        });
        CambioContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioContraseñaActionPerformed(evt);
            }
        });

        NombreCompletoLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        NombreCompletoLabel.setForeground(new java.awt.Color(255, 0, 51));

        CuentaNumero.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CuentaNumero.setForeground(new java.awt.Color(255, 0, 51));
        CuentaNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BalanceLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        BalanceLabel.setForeground(new java.awt.Color(255, 0, 0));
        BalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Deposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(CambioContraseña)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Transfe)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(171, 171, 171))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(Retiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Historial)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Retiro)
                            .addComponent(Historial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CambioContraseña)
                            .addComponent(Deposito))
                        .addGap(39, 39, 39)))
                .addComponent(Transfe)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void DepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositoMouseClicked
        DepositoQuechua depositoQuechua = new DepositoQuechua(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        depositoQuechua.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DepositoMouseClicked

    private void DepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositoActionPerformed

    private void RetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroMouseClicked
        RetiroQuechua retiroQuechua = new RetiroQuechua(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        retiroQuechua.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetiroMouseClicked

    private void TransfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransfeMouseClicked
        TransferenciaQuechua transferenciaQuechua = new TransferenciaQuechua(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        transferenciaQuechua.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_TransfeMouseClicked

    private void CambioContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambioContraseñaMouseClicked
        CambiarPINQuechua cambiarPINQuechua = new CambiarPINQuechua(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        cambiarPINQuechua.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CambioContraseñaMouseClicked

    private void HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialMouseClicked
        //
    }//GEN-LAST:event_HistorialMouseClicked

    private void TipoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMonedaActionPerformed
        tipoMonedaSeleccionado = (String) TipoMoneda.getSelectedItem();
        actualizarDatosCuenta();
    }//GEN-LAST:event_TipoMonedaActionPerformed

    private void TransfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransfeActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        HistorialQuechua historialQuechua = new HistorialQuechua(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        historialQuechua.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistorialActionPerformed

    private void CambioContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioContraseñaActionPerformed
        
    }//GEN-LAST:event_CambioContraseñaActionPerformed

    
    private void actualizarDatosCuenta() {
        // Ruta de la carpeta del usuario
        String rutaCarpetaUsuario = "Cuentas/" + nombreCompleto;
        
        // Leer archivos en la carpeta del usuario
        File carpetaUsuario = new File(rutaCarpetaUsuario);
        File[] archivos = carpetaUsuario.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    File cuentaEnFile = new File(archivo, "cuentasEn.txt");
                    if (cuentaEnFile.exists()) {
                        try {
                            List<String> lineas = Files.readAllLines(cuentaEnFile.toPath());
                            if (lineas.size() >= 1) {
                                String tipoMoneda = lineas.get(0).trim();
                                if (tipoMoneda.equals(tipoMonedaSeleccionado)) {
                                    numeroCuenta = archivo.getName();
                                    balance = Double.parseDouble(Files.readAllLines(new File(archivo, "balance.txt").toPath()).get(0).trim());
                                    CuentaNumero.setText(numeroCuenta);
                                    BalanceLabel.setText(String.valueOf(balance));
                                    break;
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
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
            java.util.logging.Logger.getLogger(MenuQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuQuechua("Juan Perez", "12345", "Bs.", 1000.00).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JButton CambioContraseña;
    private javax.swing.JLabel CuentaNumero;
    private javax.swing.JButton Deposito;
    private javax.swing.JButton Historial;
    private javax.swing.JLabel NombreCompletoLabel;
    private javax.swing.JButton Retiro;
    private javax.swing.JComboBox<String> TipoMoneda;
    private javax.swing.JButton Transfe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
