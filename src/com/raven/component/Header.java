package com.raven.component;

import com.raven.model.User;
import java.awt.event.ActionListener;

public class Header extends javax.swing.JPanel {
    private User user = null;

//    public void updateProfile(){
//        lbUserName.setText(this.userName);
//        lbRole.setText(this.role);
//    }
    public void showProfile(){
        lbUserName.setText(this.user.getUserName());
        lbRole.setText(this.user.getRole());
        repaint();
    }

    public Header(User user) {
        initComponents();
        setOpaque(true);
        this.user = user;
        showProfile();
    }
    
    public User getUser(){
        return this.user;
    }
   

    public void addMenuEvent(ActionListener event) {
        cmdMenu.addActionListener(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMenu = new com.raven.swing.Button();
        pic = new com.raven.swing.ImageAvatar();
        lbUserName = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        cmdMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/profile.jpg"))); // NOI18N

        lbUserName.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(127, 127, 127));
        lbUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUserName.setText("NPQThien");
        lbUserName.setName("userName"); // NOI18N
        lbUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUserNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbUserNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbUserNameMouseExited(evt);
            }
        });

        lbRole.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        lbRole.setForeground(new java.awt.Color(127, 127, 127));
        lbRole.setText("Admin");
        lbRole.setName("role"); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRole)
                    .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(lbRole))
                    .addComponent(cmdMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbUserNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserNameMouseEntered
        // TODO add your handling code here:
        String txt = "<HTML><u>"+user.getUserName()+"</u></HTML>";
        lbUserName.setText(txt);
        
    }//GEN-LAST:event_lbUserNameMouseEntered

    private void lbUserNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserNameMouseExited
        // TODO add your handling code here:
        lbUserName.setText(user.getUserName());

    }//GEN-LAST:event_lbUserNameMouseExited

    private void lbUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbUserNameMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button cmdMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUserName;
    private com.raven.swing.ImageAvatar pic;
    // End of variables declaration//GEN-END:variables
}
