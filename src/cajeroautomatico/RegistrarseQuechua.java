
package cajeroautomatico;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

public class RegistrarseQuechua extends javax.swing.JFrame {


    public RegistrarseQuechua() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CuentaNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CuentaNombre = new javax.swing.JTextField();
        CuentaEn = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        PIN = new javax.swing.JPasswordField();
        CuentaBalance = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Atras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bancopi cuentata ruway");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("Hunt’asqa suti:");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Bancopi cuenta yupay:");

        CuentaNumero.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CuentaNumero.setForeground(new java.awt.Color(255, 0, 51));
        CuentaNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 255));
        jLabel4.setText("Bancopi yupay in:");

        CuentaNombre.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CuentaNombre.setForeground(new java.awt.Color(255, 0, 51));
        CuentaNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CuentaEn.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        CuentaEn.setMaximumRowCount(3);
        CuentaEn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bs.", "$.", "€.", " ", " " }));

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 255));
        jLabel6.setText("Kichana:");

        registrar.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        registrar.setText("REGISTRAR");
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        PIN.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        PIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CuentaBalance.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        CuentaBalance.setForeground(new java.awt.Color(255, 0, 51));
        CuentaBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 255));
        jLabel7.setText("Hayka qullqiykita qillqay:");

        Atras.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        Atras.setForeground(new java.awt.Color(153, 51, 255));
        Atras.setText("kutichiy");
        Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(Atras)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CuentaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CuentaBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PIN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CuentaNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(CuentaEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CuentaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CuentaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuentaBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PIN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuentaEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrar)
                    .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        
    }//GEN-LAST:event_registrarActionPerformed
    private void Borrar(){
        CuentaEn.setSelectedIndex(-1);
        CuentaNombre.setText("");
        CuentaNumero.setText("");
        PIN.setText("");
        CuentaBalance.setText("");
    }     
    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        String cuentaNombre = CuentaNombre.getText();
        String cuentaNumero = CuentaNumero.getText();
        String cuentaPIN = PIN.getText();
        String cuentaEn = CuentaEn.getSelectedItem().toString();
        String cuentaBalance = CuentaBalance.getText();
        
        if (cuentaNombre.isEmpty() || cuentaNumero.isEmpty() || cuentaPIN.isEmpty() || cuentaEn.isEmpty() || cuentaBalance.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ama hina kaspa, llapa chakrakunata hunt'achiy.", "Pantay", JOptionPane.ERROR_MESSAGE);
            return;
        }

        File userDir = new File("Cuentas/" + cuentaNombre);
        if (!userDir.exists()) {
            userDir.mkdirs();
        }

        // Verificar número de cuentas existentes
        String[] existingAccounts = userDir.list((dir, name) -> new File(dir, name).isDirectory());
        if (existingAccounts != null && existingAccounts.length >= 3) {
            JOptionPane.showMessageDialog(rootPane, "Ñam bancopi aswan achka cuentakuna permitisqaña kanki.", "Pantay", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Guardar PIN en la carpeta del usuario si no existe
        File pinFile = new File(userDir, "pin.txt");
        if (!pinFile.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pinFile))) {
                writer.write(cuentaPIN);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File cuentaDir = new File(userDir, cuentaNumero);
        if (!cuentaDir.exists()) {
            cuentaDir.mkdirs();
        }

        File nombreFile = new File(cuentaDir, "nombre.txt");
        File numeroFile = new File(cuentaDir, "cuentaNumero.txt");
        File balanceFile = new File(cuentaDir, "balance.txt");
        File cuentaEnFile = new File(cuentaDir, "cuentasEn.txt");

        try (BufferedWriter nombreWriter = new BufferedWriter(new FileWriter(nombreFile));
             BufferedWriter numeroWriter = new BufferedWriter(new FileWriter(numeroFile));
             BufferedWriter balanceWriter = new BufferedWriter(new FileWriter(balanceFile));
             BufferedWriter cuentaEnWriter = new BufferedWriter(new FileWriter(cuentaEnFile))) {
             
            nombreWriter.write(cuentaNombre);
            numeroWriter.write(cuentaNumero);
            balanceWriter.write(cuentaBalance);
            cuentaEnWriter.write(cuentaEn);
            
            JOptionPane.showMessageDialog(rootPane, "Bancopi cuenta allinta registrasqa.");
            Borrar();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Bancopi cuentata registraspa pantasqa.", "Pantay", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrarMouseClicked

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        new InicioQuechua().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasMouseClicked

    private String[] getOpcionesSeleccionadas() {
        List<String> opciones = new ArrayList<>();
        opciones.add(CuentaEn.getSelectedItem().toString());
        return opciones.toArray(new String[0]);
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarseQuechua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atras;
    private javax.swing.JTextField CuentaBalance;
    private javax.swing.JComboBox<String> CuentaEn;
    private javax.swing.JTextField CuentaNombre;
    private javax.swing.JTextField CuentaNumero;
    private javax.swing.JPasswordField PIN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
