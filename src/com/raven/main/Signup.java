/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.main;

import com.raven.dao.UserDAO;
import com.raven.model.User;
import java.awt.Color;

/**
 *
 * @author dothinhtpr247gmai.com
 */
public class Signup extends javax.swing.JFrame {
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+";
    public String phoneNumerPattern = "^[0-9]{10}$";
    public Signup() {
        initComponents();
//        setBackground(new Color(0,0,0,0));
        setColorbSignup(false);
        
    }
    
    public void setColorbSignup(boolean validate){
        if (validate == true){
            bSignUp.setEnabled(true);
            bSignUp.setForeground(Color.green);
        }
        else{
            bSignUp.setEnabled(false);
            bSignUp.setForeground(Color.RED);
        }
    }
    
    public void clear(){
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtConfirm.setText("");
        setColorbSignup(false);
    }
    
    public void validateFields(){
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String confirm = String.valueOf(txtConfirm.getPassword());
        String email = txtEmail.getText();
        String phoneNumber = txtPhone.getText();
        if (!username.equals("") && !password.equals("") && password.equals(confirm)
                && phoneNumber.matches(phoneNumerPattern) && email.matches(emailPattern)) {
            setColorbSignup(true);
        }   
        else
            setColorbSignup(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundSignup1 = new com.raven.component.BackgroundSignup();
        panel = new javax.swing.JPanel();
        txtUsername = new com.raven.swing.TextField();
        txtPhone = new com.raven.swing.TextField();
        txtEmail = new com.raven.swing.TextField();
        txtPassword = new com.raven.swing.PasswordField();
        txtConfirm = new com.raven.swing.PasswordField();
        bSignUp = new com.raven.swing.ButtonEffect();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bExit = new com.raven.swing.Button();
        footerLoginfail1 = new com.raven.component.footer();
        jLabel3 = new javax.swing.JLabel();
        lbSignin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundSignup1.setBlur(panel);

        panel.setOpaque(false);

        txtUsername.setHint("User name");
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        txtPhone.setHint("Phone");
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });

        txtEmail.setHint("E-mail");
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtPassword.setHint("Password");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        txtConfirm.setHint("Confirm Password");
        txtConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmKeyReleased(evt);
            }
        });

        bSignUp.setForeground(new java.awt.Color(255, 255, 255));
        bSignUp.setText("SIGN UP");
        bSignUp.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        bSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(bSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome!");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create your account");

        bExit.setBackground(new java.awt.Color(33, 33, 33));
        bExit.setForeground(new java.awt.Color(255, 255, 255));
        bExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/exit-30.png"))); // NOI18N
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        footerLoginfail1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Do you have a account?");

        lbSignin.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        lbSignin.setForeground(new java.awt.Color(255, 255, 255));
        lbSignin.setText("Sign in here");
        lbSignin.setName("Sign up here"); // NOI18N
        lbSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSigninMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSigninMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSigninMouseExited(evt);
            }
        });

        javax.swing.GroupLayout footerLoginfail1Layout = new javax.swing.GroupLayout(footerLoginfail1);
        footerLoginfail1.setLayout(footerLoginfail1Layout);
        footerLoginfail1Layout.setHorizontalGroup(
            footerLoginfail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLoginfail1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        footerLoginfail1Layout.setVerticalGroup(
            footerLoginfail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLoginfail1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(footerLoginfail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbSignin))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundSignup1Layout = new javax.swing.GroupLayout(backgroundSignup1);
        backgroundSignup1.setLayout(backgroundSignup1Layout);
        backgroundSignup1Layout.setHorizontalGroup(
            backgroundSignup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundSignup1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSignup1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(backgroundSignup1Layout.createSequentialGroup()
                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(footerLoginfail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundSignup1Layout.setVerticalGroup(
            backgroundSignup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSignup1Layout.createSequentialGroup()
                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(footerLoginfail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSignup1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundSignup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    private void lbSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSigninMouseClicked
        // TODO add your handling code here:
        System.out.println("com.raven.main.Login.lbSignupMouseClicked()");
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_lbSigninMouseClicked

    private void lbSigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSigninMouseEntered
        // TODO add your handling code here:
        String underlineTxt = "<HTML><u>"+lbSignin.getText()+"</u></HTML>";
        lbSignin.setText(underlineTxt);
    }//GEN-LAST:event_lbSigninMouseEntered

    private void lbSigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSigninMouseExited
        // TODO add your handling code here:
        lbSignin.setText(lbSignin.getName());
    }//GEN-LAST:event_lbSigninMouseExited

    private void txtConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmKeyReleased
        // TODO add your handling code here:
        String pass = String.valueOf(txtPassword.getPassword());
        String confirm = String.valueOf(txtConfirm.getPassword());
        if (pass.equals(confirm))
            txtConfirm.correct();
        else
            txtConfirm.fail();
        validateFields();
    }//GEN-LAST:event_txtConfirmKeyReleased

    private void bSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSignUpActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setUserName(txtUsername.getText());
        user.setPhoneNumber(txtPhone.getText());
        user.seteMail(txtEmail.getText());
        user.setPassword(String.valueOf(txtPassword.getPassword()));    
        bSignUp.setEnabled(true);
        UserDAO.save(user); 
        new Login().setVisible(true);
        setVisible(false);
        clear();
    }//GEN-LAST:event_bSignUpActionPerformed

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        // TODO add your handling code here
        validateFields();
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPhoneKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button bExit;
    private com.raven.swing.ButtonEffect bSignUp;
    private com.raven.component.BackgroundSignup backgroundSignup1;
    private com.raven.component.footer footerLoginfail1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbSignin;
    private javax.swing.JPanel panel;
    private com.raven.swing.PasswordField txtConfirm;
    private com.raven.swing.TextField txtEmail;
    private com.raven.swing.PasswordField txtPassword;
    private com.raven.swing.TextField txtPhone;
    private com.raven.swing.TextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
