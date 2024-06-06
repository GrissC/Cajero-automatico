
package cajeroautomatico;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class RetiroQuechua extends javax.swing.JFrame {

    private String nombreCompleto;
    private String numeroCuenta;
    private String tipoMonedaSeleccionado;
    private double balance;
    public RetiroQuechua() {
        initComponents();
    }

    public RetiroQuechua(String nombreCompleto, String numeroCuenta, String tipoMonedaSeleccionado, double balance) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCuenta = numeroCuenta;
        this.tipoMonedaSeleccionado = tipoMonedaSeleccionado;
        this.balance = balance;
        initComponents();
        actualizarInfoCuenta();
    }

    private void actualizarInfoCuenta() {
        NombreCompletoLabel.setText(nombreCompleto);
        CuentaNumero.setText(numeroCuenta);
        BalanceLabel.setText(String.valueOf(balance));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CantidadRetiro = new javax.swing.JTextField();
        Retiro = new javax.swing.JButton();
        BalLbl = new javax.swing.JLabel();
        AtrasR = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NombreCompletoLabel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CuentaNumero = new javax.swing.JTextField();
        BalanceLabel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RobotBank");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Retirokuna");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Saldoyki:");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setText("Chanin:");

        CantidadRetiro.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CantidadRetiro.setForeground(new java.awt.Color(255, 0, 51));
        CantidadRetiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Retiro.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Retiro.setText("RETIRAR");
        Retiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroMouseClicked(evt);
            }
        });

        BalLbl.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(255, 0, 0));

        AtrasR.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        AtrasR.setForeground(new java.awt.Color(153, 51, 255));
        AtrasR.setText("kutichiy");
        AtrasR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasRMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 255));
        jLabel7.setText("Hunt’asqa suti:");

        NombreCompletoLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        NombreCompletoLabel.setForeground(new java.awt.Color(255, 0, 51));
        NombreCompletoLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 51, 255));
        jLabel8.setText("Bancopi cuenta yupay:");

        CuentaNumero.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CuentaNumero.setForeground(new java.awt.Color(255, 0, 51));
        CuentaNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BalanceLabel.setEditable(false);
        BalanceLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        BalanceLabel.setForeground(new java.awt.Color(204, 0, 51));
        BalanceLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CantidadRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BalLbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Retiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                .addComponent(AtrasR)))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CantidadRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Retiro)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AtrasR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasRMouseClicked
        new MenuQuechua(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasRMouseClicked

    private void RetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroMouseClicked
        double cantidad = Double.parseDouble(CantidadRetiro.getText());
        if (cantidad > balance) {
            JOptionPane.showMessageDialog(this, "Mana aypashka kullki", "pantay", JOptionPane.ERROR_MESSAGE);
        } else {
            balance -= cantidad;
            BalanceLabel.setText(String.valueOf(balance));
            actualizarBalanceEnArchivo();
            registrarTransaccion("Retiro", cantidad);
            JOptionPane.showMessageDialog(this, "Allin qullqi hurquy", "allinmi", JOptionPane.INFORMATION_MESSAGE);
            Borrar();
        }
    }//GEN-LAST:event_RetiroMouseClicked
    private void Borrar() {
        CantidadRetiro.setText("");
    }
    
    protected void registrarTransaccion(String tipo, double monto) {
        String rutaCarpetaUsuario = "Cuentas/" + nombreCompleto + "/" + numeroCuenta;
        File historialFile = new File(rutaCarpetaUsuario, "historial.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(historialFile, true))) {
            writer.write(tipo + "," + monto);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void actualizarBalanceEnArchivo() {
        String rutaCarpetaUsuario = "Cuentas/" + nombreCompleto + "/" + numeroCuenta;
        File balanceFile = new File(rutaCarpetaUsuario, "balance.txt");
        try {
            Files.write(balanceFile.toPath(), String.valueOf(balance).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetiroQuechua("Juan Perez", "12345", "Bs.", 1000.00).setVisible(true);
      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtrasR;
    private javax.swing.JLabel BalLbl;
    private javax.swing.JTextField BalanceLabel;
    private javax.swing.JTextField CantidadRetiro;
    private javax.swing.JTextField CuentaNumero;
    private javax.swing.JTextField NombreCompletoLabel;
    private javax.swing.JButton Retiro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
