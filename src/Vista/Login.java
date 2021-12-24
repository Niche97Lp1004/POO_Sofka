/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Clases.usuario;
import Conexion.conexion;
import javax.swing.JOptionPane;
/**
 *
 * @author jaira
 */
public class Login extends javax.swing.JFrame {
   

    /**
     * Creates new form Login
     */
    public Login() {
       
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

        ModLabel = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        USERTextField = new javax.swing.JTextField();
        PASSTextField = new javax.swing.JTextField();
        LOGButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        ModLabel.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        ModLabel.setText("MODO ADMINISTRADOR");

        UserLabel.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        UserLabel.setText("USUARIO:");

        PassLabel.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        PassLabel.setText("CONTRASEÑA:");

        USERTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERTextFieldActionPerformed(evt);
            }
        });

        PASSTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSTextFieldActionPerformed(evt);
            }
        });

        LOGButton.setBackground(new java.awt.Color(0, 153, 255));
        LOGButton.setText("INGRESAR");
        LOGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGButtonActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(255, 51, 51));
        BackButton.setText("ATRAS");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(ModLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserLabel)
                            .addComponent(PassLabel))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(USERTextField)
                            .addComponent(PASSTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LOGButton)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(ModLabel)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLabel)
                    .addComponent(USERTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabel)
                    .addComponent(PASSTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LOGButton)
                    .addComponent(BackButton))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PASSTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSTextFieldActionPerformed

    private void USERTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USERTextFieldActionPerformed

    private void LOGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGButtonActionPerformed
        
       usuario NU = new usuario();
  
        NU.setUsuari(USERTextField.getText());
        NU.setContraseña(PASSTextField.getText());

        if (NU.getUsuari().isEmpty() || NU.getContraseña().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha ingresado nada", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else {
            try {

                Connection con = conexion.getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT count(1) AS registros FROM tablausuario");
                ResultSet reg = pstm.executeQuery();
                reg.next();
                reg.getInt("registros");
                reg.close();
            } catch (SQLException e) {
                System.out.println(e);
            }

            String usuario = USERTextField.getText();
            String contraseña = PASSTextField.getText();
            try {
                Connection con = conexion.getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT usuario,contraseña FROM tablausuario WHERE Usuario = '" + usuario + "' AND Contraseña = '" + contraseña + "'");

                ResultSet res = pstm.executeQuery();

                while (res.next()) {
                    usuario = res.getString("usuario");
                    contraseña = res.getString("contraseña");

                    if (usuario.equals(USERTextField.getText()) && contraseña.equals(PASSTextField.getText())) {

                        Admin accsele = new Admin();
                        dispose();
                        accsele.setVisible(true);
                        res.close();

                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña están errados", "ERROR", JOptionPane.ERROR_MESSAGE);
                        USERTextField.setText("");
                        PASSTextField.setText("");

                    }

                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_LOGButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Inicio acc = new Inicio(); 
        dispose();
        acc.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton LOGButton;
    private javax.swing.JLabel ModLabel;
    private javax.swing.JTextField PASSTextField;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JTextField USERTextField;
    private javax.swing.JLabel UserLabel;
    // End of variables declaration//GEN-END:variables
}
