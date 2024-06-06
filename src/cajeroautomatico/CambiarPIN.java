
package cajeroautomatico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * La clase CambiarPIN.
 * Permite cambiar el PIN de la cuenta del usuario.
 */
public class CambiarPIN extends javax.swing.JFrame {

    private String nombreCompleto;
    private String numeroCuenta;
    private String tipoMonedaSeleccionado;
    private double balance;

    /**
     * Constructor que inicializa los componentes con los detalles del usuario.
     * 
     * @param nombreCompleto El nombre completo del usuario.
     * @param numeroCuenta El número de cuenta del usuario.
     * @param tipoMonedaSeleccionado La moneda de la cuenta del usuario.
     * @param balance El saldo de la cuenta del usuario.
     */
    public CambiarPIN(String nombreCompleto, String numeroCuenta, String tipoMonedaSeleccionado, double balance) {
        initComponents();
        this.nombreCompleto = nombreCompleto;
        this.numeroCuenta = numeroCuenta;
        this.tipoMonedaSeleccionado = tipoMonedaSeleccionado;
        this.balance = balance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cambiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nuevoPIN = new javax.swing.JPasswordField();
        confirmarPIN = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cambiar.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        cambiar.setText("CAMBIAR");
        cambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarMouseClicked(evt);
            }
        });
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setText("Nuevo PIN:");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 255));
        jLabel6.setText("CAMBIAR PIN");

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RobotBank");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(196, 196, 196))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 51, 255));
        jLabel8.setText("Confirmar PIN:");

        nuevoPIN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nuevoPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nuevoPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPINActionPerformed(evt);
            }
        });

        confirmarPIN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        confirmarPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(183, 183, 183))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevoPIN, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(confirmarPIN))
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(cambiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(cambiar)
                .addContainerGap(47, Short.MAX_VALUE))
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

    
    /**
     * Evento de cambio de PIN.
     * Verifica que los campos no estén vacíos y que los PIN coincidan antes de realizar el cambio.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void cambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarMouseClicked
        String nombreCompleto = obtenerNombreCompleto(); // Obtener el nombre completo del usuario de alguna manera

    String nuevoPinTxt = new String(nuevoPIN.getPassword());
    String confirmarPinTxt = new String(confirmarPIN.getPassword());

    // Verificar si los campos están vacíos
    if (nombreCompleto.isEmpty() || nuevoPinTxt.isEmpty() || confirmarPinTxt.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
    } else if (!nuevoPinTxt.equals(confirmarPinTxt)) {
        // Verificar si los PIN coinciden
        JOptionPane.showMessageDialog(this, "Los PIN no coinciden");
    } else {
        // Si los PIN coinciden, ingresar la dirección donde se guardo el proyecto
        try {
            String rutaPin = "DIRECCIÓN DEL PROYECTO\\CajeroAutomatico\\Cuentas\\Cuentas\\" + nombreCompleto + "\\pin.txt";

            File pinFile = new File(rutaPin);
            if (!pinFile.exists()) {
                JOptionPane.showMessageDialog(this, "El archivo PIN no existe para este usuario");
                return;
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pinFile))) {
                writer.write(nuevoPinTxt); // Escribir el nuevo PIN en el archivo
            }

            JOptionPane.showMessageDialog(this, "PIN cambiado exitosamente");
            limpiarCampos();
            volverAlInicio();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cambiar el PIN: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_cambiarMouseClicked

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarActionPerformed

    private void nuevoPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoPINActionPerformed
    
    
    /**
     * Obtiene el nombre completo del usuario.
     * 
     * @return El nombre completo del usuario.
     */
    private String obtenerNombreCompleto() {
    return nombreCompleto;
    }
    
    
    /**
     * Limpia los campos de entrada del PIN.
     */
    private void limpiarCampos() {
        nuevoPIN.setText("");
        confirmarPIN.setText("");
    }
    
    
    /**
     * Vuelve a la pantalla de inicio.
     */
    private void volverAlInicio(){
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }
    
    
    
    /**
     * Método principal para ejecutar la clase CambiarPIN.
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiar;
    private javax.swing.JPasswordField confirmarPIN;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField nuevoPIN;
    // End of variables declaration//GEN-END:variables
}
