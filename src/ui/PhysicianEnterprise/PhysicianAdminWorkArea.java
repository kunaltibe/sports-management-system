/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PhysicianEnterprise;


import Project.MainSystem;
import Project.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author apoorvdhaygude
 */
public class PhysicianAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form EventMakerAdminWorkArea
     */
    private JPanel userProcessContainer;
    private MainSystem system;
    private Enterprise enterprise;
    
    public PhysicianAdminWorkArea(JPanel userProcessContainer,Enterprise enterprise, MainSystem ecosystem) {
        initComponents();
        this.enterprise=enterprise;
        this.userProcessContainer=userProcessContainer;
        this.system=system;
       
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
        lblT = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUserAccount = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1500, 650));

        jPanel1.setBackground(new java.awt.Color(243, 235, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 43));

        lblT.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblT.setForeground(new java.awt.Color(255, 255, 255));
        lblT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblT.setText("Physician Enterprise");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblT, javax.swing.GroupLayout.PREFERRED_SIZE, 1673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 510, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl1.setText("Welcome Physician Admin!");

        jPanel3.setOpaque(false);

        btnManageEmployee.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnManageEmployee.setText("Add");
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

        btnManageOrganization.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnManageOrganization.setText("Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnManageUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 2183, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbl1)
                .addGap(78, 78, 78)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2189, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
        ManageEmployee mngEmp = new ManageEmployee(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageEmployee", mngEmp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccount mngUser = new ManageUserAccount(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccount", mngUser);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserAccountActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        ManageOrganization mngOrg = new ManageOrganization(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageOrganization", mngOrg);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUserAccount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblT;
    // End of variables declaration//GEN-END:variables
}
