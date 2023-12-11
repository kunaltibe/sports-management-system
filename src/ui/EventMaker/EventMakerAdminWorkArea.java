/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EventMaker;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author apoorvdhaygude
 */
public class EventMakerAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form EventMakerAdminWorkArea
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private MainSystem system;
    
    public EventMakerAdminWorkArea(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
       
        this.enterprise=enterprise;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUserAccount = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1500, 650));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tournament Event Maker Organization");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );

        lblT.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblT.setText("Welcome, Tournament Event Maker Admin");

        jPanel3.setOpaque(false);

        btnManageEmployee.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnManageEmployee.setText("Add Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });

        btnManageUserAccount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnManageUserAccount.setText(" User Account");
        btnManageUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnManageUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblT, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblT)
                .addGap(65, 65, 65)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
        ManageEmployee manageEmployeeJPanel = new ManageEmployee(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("MakerManageEmployee", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccount muajp = new ManageUserAccount(userProcessContainer, enterprise);
        userProcessContainer.add("MakerManageUserAccount", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageUserAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblT;
    // End of variables declaration//GEN-END:variables
}
