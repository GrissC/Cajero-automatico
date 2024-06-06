/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cajeroautomatico;

/**
 * La clase Idioma.
 * En esta clase se podrá seleccionar el idioma en la aplicación del cajero automático entre español, inglés y quechua.
 */
public class Idioma extends javax.swing.JFrame {

    /**
     * Constructor que inicializa los componentes de la interfaz gráfica.
     */
    public Idioma() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btbEspaniol = new javax.swing.JButton();
        btnIngles = new javax.swing.JButton();
        btnQuechua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 51, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RobotBank");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btbEspaniol.setBackground(new java.awt.Color(153, 51, 255));
        btbEspaniol.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        btbEspaniol.setForeground(new java.awt.Color(255, 255, 255));
        btbEspaniol.setText("ESPAÑOL");
        btbEspaniol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbEspaniolMouseClicked(evt);
            }
        });

        btnIngles.setBackground(new java.awt.Color(153, 51, 255));
        btnIngles.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        btnIngles.setForeground(new java.awt.Color(255, 255, 255));
        btnIngles.setText("ENGLISH");
        btnIngles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInglesMouseClicked(evt);
            }
        });
        btnIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInglesActionPerformed(evt);
            }
        });

        btnQuechua.setBackground(new java.awt.Color(153, 51, 255));
        btnQuechua.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        btnQuechua.setForeground(new java.awt.Color(255, 255, 255));
        btnQuechua.setText("QUECHUA");
        btnQuechua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuechuaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btbEspaniol, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuechua, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btbEspaniol)
                .addGap(35, 35, 35)
                .addComponent(btnIngles)
                .addGap(29, 29, 29)
                .addComponent(btnQuechua)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     /**
     * Evento de clic para el botón de Español.
     * Cambia el idioma de la aplicación a español.
     *
     * @param evt El evento de clic del mouse.
     */
    private void btbEspaniolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbEspaniolMouseClicked
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btbEspaniolMouseClicked

    
    /**
     * Evento de clic para el botón de Inglés.
     * Cambia el idioma de la aplicación a inglés.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void btnInglesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInglesMouseClicked
        InicioIngles inicioIngles = new InicioIngles();
        inicioIngles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInglesMouseClicked

    
    /**
     * Evento de clic para el botón de Quechua.
     * Cambia el idioma de la aplicación a quechua.
     * 
     * @param evt El evento de clic del mouse.
     */
    private void btnQuechuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuechuaMouseClicked
        InicioQuechua inicioQuechua = new InicioQuechua();
        inicioQuechua.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuechuaMouseClicked

    
    
    private void btnInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInglesActionPerformed

    
     /**
     * Método principal para ejecutar la clase Idioma.
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
            java.util.logging.Logger.getLogger(Idioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Idioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Idioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Idioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Idioma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbEspaniol;
    private javax.swing.JButton btnIngles;
    private javax.swing.JButton btnQuechua;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
