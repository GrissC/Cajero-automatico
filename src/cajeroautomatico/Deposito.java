
package cajeroautomatico;

import javax.swing.*;
import java.io.*;
import java.nio.file.*;

/**
 * La clase Deposito.
 * Permite depositar dinero en la cuenta del usuario.
 */
public class Deposito extends javax.swing.JFrame {

    private String nombreCompleto;
    private String numeroCuenta;
    private String tipoMonedaSeleccionado;
    private double balance;

    /**
     * Constructor que inicializa los componentes de la interfaz gráfica.
     */
    public Deposito() {
        initComponents();
    }

    /**
     * Constructor que inicializa los componentes con los detalles del usuario.
     * 
     * @param nombreCompleto El nombre completo del usuario.
     * @param numeroCuenta El número de cuenta del usuario.
     * @param tipoMonedaSeleccionado El tipo de moneda de la cuenta.
     * @param balance El saldo de la cuenta.
     */
    public Deposito(String nombreCompleto, String numeroCuenta, String tipoMonedaSeleccionado, double balance) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCuenta = numeroCuenta;
        this.tipoMonedaSeleccionado = tipoMonedaSeleccionado;
        this.balance = balance;
        initComponents();
        actualizarInfoCuenta();
    }

    /**
     * Actualiza la información de la cuenta.
     */
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
        jLabel5 = new javax.swing.JLabel();
        CantidadRetiro = new javax.swing.JTextField();
        Inicio = new javax.swing.JButton();
        AtrasD = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NombreCompletoLabel = new javax.swing.JTextField();
        CuentaNumero = new javax.swing.JTextField();
        BalanceLabel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RobotBank");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DEPOSITAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setText("Monto:");

        CantidadRetiro.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CantidadRetiro.setForeground(new java.awt.Color(255, 0, 51));
        CantidadRetiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Inicio.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        Inicio.setText("DEPOSITAR");
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        AtrasD.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        AtrasD.setForeground(new java.awt.Color(153, 51, 255));
        AtrasD.setText("Atras");
        AtrasD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasDMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 51, 255));
        jLabel8.setText("Numero de cuenta:");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 255));
        jLabel7.setText("Nombre completo:");

        NombreCompletoLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        NombreCompletoLabel.setForeground(new java.awt.Color(255, 0, 51));
        NombreCompletoLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreCompletoLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCompletoLabelActionPerformed(evt);
            }
        });

        CuentaNumero.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CuentaNumero.setForeground(new java.awt.Color(255, 0, 51));
        CuentaNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BalanceLabel.setEditable(false);
        BalanceLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        BalanceLabel.setForeground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Su balance:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(Inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AtrasD)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CantidadRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AtrasD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Inicio)
                        .addGap(16, 16, 16))))
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
     * Evento de depósito de dinero.
     * Realiza la operación de depósito y actualiza el balance.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        double cantidad = Double.parseDouble(CantidadRetiro.getText());
        balance = balance + cantidad;
        BalanceLabel.setText(String.valueOf(balance));
        actualizarBalanceEnArchivo();
        registrarTransaccion("Deposito", cantidad);
        JOptionPane.showMessageDialog(this, "Deposito exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        Borrar();
    }//GEN-LAST:event_InicioMouseClicked

    
    /**
     * Borra el campo de cantidad de depósito.
     */
    private void Borrar(){       
        CantidadRetiro.setText("");        
    }   
    
    /**
     * Actualiza el balance de la cuenta.
     */
    private void actualizarBalanceEnArchivo() {
        String rutaCarpetaUsuario = "Cuentas/" + nombreCompleto + "/" + numeroCuenta;
        File balanceFile = new File(rutaCarpetaUsuario, "balance.txt");
        try {
            Files.write(balanceFile.toPath(), String.valueOf(balance).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Registra una transacción en el archivo de historial.
     * 
     * @param tipo El tipo de transacción.
     * @param monto El monto de la transacción.
     */
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

    
    
    /**
     * Evento de clic para el botón de atrás.
     * Vuelve al menú principal.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void AtrasDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasDMouseClicked
        new Menu(nombreCompleto, numeroCuenta, tipoMonedaSeleccionado, balance).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasDMouseClicked

    private void NombreCompletoLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCompletoLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCompletoLabelActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioActionPerformed

     
    /**
     * Método principal para ejecutar la clase Deposito.
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposito("Juan Perez", "12345", "Bs.", 1000.00).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtrasD;
    private javax.swing.JTextField BalanceLabel;
    private javax.swing.JTextField CantidadRetiro;
    private javax.swing.JTextField CuentaNumero;
    private javax.swing.JButton Inicio;
    private javax.swing.JTextField NombreCompletoLabel;
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
