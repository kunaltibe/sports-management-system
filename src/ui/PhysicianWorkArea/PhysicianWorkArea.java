/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PhysicianWorkArea;

import business.Business.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.PhysicianOrganization;
import Project.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.PlayerWorkRequest;
import business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apoorvdhaygude
 */
public class PhysicianWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private MainSystem system;
    PhysicianOrganization doctorOrganization;

    /**
     * Creates new form DoctorWorkArea
     */
    public PhysicianWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        
         populateDoctorTable();
        
    }
    //populate doctor table with the request assigned to it.
       public void populateDoctorTable(){

         DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : system.getOrgWorkQueue().getWorkRequestList()){
           if(work instanceof PlayerWorkRequest){
               if((work.getStatus().equalsIgnoreCase("Assigned To Physician"))||(work.getStatus().equalsIgnoreCase("Physician assigned to this Request"))){
                   
               
            Object[] row = new Object[10];
            row[0] = work.getSender().getEmployee().getPersonName();
            row[1] = work.getSubject();
            row[2] = ((PlayerWorkRequest) work).getPosition();
            row[3] = ((PlayerWorkRequest) work).getCountry();
            row[4] = ((PlayerWorkRequest) work).getAge();
            row[5] = work.getRequestDate();
            row[6] = work;
            row[7] = work.getReciever();
            
            model.addRow(row);
           }
        }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblT = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        lbl1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1500, 650));

        jPanel2.setBackground(new java.awt.Color(243, 235, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 650));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        lblT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblT.setForeground(new java.awt.Color(255, 255, 255));
        lblT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblT.setText("Physician Work Area");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAssign.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(153, 0, 153));
        btnAssign.setText("Acknowledge");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnComplete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(153, 0, 153));
        btnComplete.setText("Pass Health check");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        tblRequests.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player Name", "Sport", "Position", "Country", "Age", "Date", "Status", "Change Maker"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequests);

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl1.setText("Welcome Physician!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297)
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(208, 208, 208))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lbl1)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(220, 220, 220))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1399, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //assign the request to doctor
    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            PlayerWorkRequest cswr = (PlayerWorkRequest) tblRequests.getValueAt(selectedRow, 6);
            if(cswr.getStatus().equalsIgnoreCase("Assigned To Physician")){
            cswr.setStatus("Physician assigned to this Request");
            cswr.setReciever(account);

            populateDoctorTable();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
       
    }//GEN-LAST:event_btnAssignActionPerformed
    //complete the assigned request
    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            PlayerWorkRequest p = (PlayerWorkRequest) tblRequests.getValueAt(selectedRow, 6);
            if(p.getStatus().equalsIgnoreCase("Physician assigned to this Request")){
            p.setStatus("Health check passed");
            p.setReciever(account);
            JOptionPane.showMessageDialog(null, "You have completed the request successfully");
            populateDoctorTable();
             }
             else{
                  JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
             }

        }  
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnComplete;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblT;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}
