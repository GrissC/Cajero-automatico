
package cajeroautomatico;

import java.io.*;
import java.nio.file.*;
import java.util.List;

/**
 * La clase Menu. 
 * Muestra el menú principal con opciones para diferentes transacciones como depósitos, retiros, transferencias, ver historial de transacciones y cambiar el pin.
 */
public class Menu extends javax.swing.JFrame {

    private String nombreCompleto;
    private String numeroCuenta;
    private String tipoMonedaSeleccionado;
    private double balance;

    /**
     * Constructor que inicializa los componentes de la interfaz gráfica.
     */
    public Menu() {
        initComponents();
    }

    /**
     * Constructor que inicializa los componentes con los detalles del usuario.
     *
     * @param nombreCompleto Nombre completo del usuario.
     * @param numeroCuenta Número de cuenta del usuario.
     * @param tipoMonedaSeleccionado Tipo de moneda de la cuenta del usuario.
     * @param balance Saldo de la cuenta del usuario.
     */
    public Menu(String nombreCompleto, String numeroCuenta, String tipoMonedaSeleccionado, double balance) {
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
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setText("Seleccione su transacción");

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
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(TipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("Nombre Completo de Usuario:");

        Deposito.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Deposito.setText("DEPOSITO");
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
        Retiro.setText("RETIRO");
        Retiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroMouseClicked(evt);
            }
        });

        Transfe.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Transfe.setText("TRANSFERENCIA");
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
        Historial.setText("HISTORIAL ");
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
        CambioContraseña.setText("CAMBIAR PIN");
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

        btnInicio.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        btnInicio.setText("CERRAR SESIÓN");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(Deposito)
                        .addGap(140, 140, 140)
                        .addComponent(CambioContraseña))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Transfe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Retiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Historial)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(Retiro)
                        .addGap(12, 12, 12)
                        .addComponent(Deposito)
                        .addGap(15, 15, 15)
                        .addComponent(Transfe)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Historial)
                        .addGap(32, 32, 32)
                        .addComponent(CambioContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInicio)
                        .addGap(19, 19, 19))))
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
    
    
    /**
     * Evento de clic para el botón de Depósito. 
     * Ingresa a la ventana de Depósito.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void DepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositoMouseClicked
        Deposito deposito = new Deposito(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        deposito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DepositoMouseClicked

    private void DepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositoActionPerformed

    
    /**
     * Evento de clic para el botón de Retiro. 
     * Ingresa a la ventana de Retiro.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void RetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroMouseClicked
        Retiro retiro = new Retiro(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        retiro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetiroMouseClicked

    
    /**
     * Evento de clic para el botón de Transferencia. 
     * Ingresa a la ventana de Transferencia.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void TransfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransfeMouseClicked
        Transferencia transferencia = new Transferencia(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        transferencia.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_TransfeMouseClicked

    
    /**
     * Evento de clic para el botón Cambiar Pin. 
     * Ingresa a la ventana de Cambiar Pin.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void CambioContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambioContraseñaMouseClicked
        CambiarPIN cambio = new CambiarPIN(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CambioContraseñaMouseClicked

    
    /**
     * Evento de clic para el botón de Historial. 
     * Ingresa a la ventana de Historial.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialMouseClicked
        Historial historial = new Historial(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistorialMouseClicked

    
    /**
     * Evento de cambio en el JComboBox de tipo de moneda.
     * Actualiza los datos de la cuenta seleccionada.
     * 
     * @param evt El evento de acción del JComboBox.
     */
    private void TipoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMonedaActionPerformed
        tipoMonedaSeleccionado = (String) TipoMoneda.getSelectedItem();
        actualizarDatosCuenta();
    }//GEN-LAST:event_TipoMonedaActionPerformed

    
    private void TransfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransfeActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        
    }//GEN-LAST:event_HistorialActionPerformed

    private void CambioContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioContraseñaActionPerformed
        
    }//GEN-LAST:event_CambioContraseñaActionPerformed

    
    /**
     * Evento de clic para el botón de Cerrar sesión.
     * Vuelve a la ventana de Inicio.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioMouseClicked

    
    /**
     * Actualiza los datos de la cuenta seleccionada.
     */
    private void actualizarDatosCuenta() {
        String rutaCarpetaUsuario = "Cuentas/" + nombreCompleto;

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
     * Método principal para ejecutar la clase Menu.
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu("Juan Perez", "12345", "Bs.", 1000.00).setVisible(true);
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
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
