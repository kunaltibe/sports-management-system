/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CoachWorkArea;

import business.Business.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.Organization;
import Project.Organization.CoachOrganization;
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
public class CoachWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private MainSystem system;
    CoachOrganization policeOrganization;
    /**
     * Creates new form PoliceWorkArea
     */
    public CoachWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        
         populatePoliceTable();
         populatePlayersTable();
    }

    //victim request to police is populated here
    public void populatePoliceTable(){

        DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : system.getOrgWorkQueue().getWorkRequestList()){
           if(work instanceof PlayerWorkRequest){
               if((work.getStatus().equalsIgnoreCase("Assigned To Coach"))||(work.getStatus().equalsIgnoreCase("Health check passed")||(work.getStatus().equalsIgnoreCase("Coach assigned to this Request")))){
                   
               
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
    
    public void populatePlayersTable(){
        DefaultTableModel model = (DefaultTableModel) selectedPlayers.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : system.getOrgWorkQueue().getWorkRequestList()){
           if(work instanceof PlayerWorkRequest){
               if((work.getStatus().equalsIgnoreCase("Selected"))){
                   
               
            Object[] row = new Object[10];
            row[0] = work.getSender().getEmployee().getPersonName();
            row[1] = work.getSubject();
            row[2] = ((PlayerWorkRequest) work).getPosition();
            row[3] = ((PlayerWorkRequest) work).getCountry();
            row[4] = ((PlayerWorkRequest) work).getAge();
            row[5] = work.getRequestDate();
            
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
        jLabel1 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        lbl1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedPlayers = new javax.swing.JTable();
        selectedP = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1500, 650));

        jPanel2.setBackground(new java.awt.Color(243, 235, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Coach Work Area");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAssign.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnAssign.setText("Acknowledge");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnComplete.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnComplete.setText("Complete");
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
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequests);
        if (tblRequests.getColumnModel().getColumnCount() > 0) {
            tblRequests.getColumnModel().getColumn(6).setHeaderValue("Status");
            tblRequests.getColumnModel().getColumn(7).setHeaderValue("Change Maker");
        }

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl1.setText("Welcome Coach!");

        selectedPlayers.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        selectedPlayers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player Name", "Sport", "Position", "Country", "Age", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(selectedPlayers);

        selectedP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        selectedP.setText("Selected Players");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedP)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //assign to myself i.e police
    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            PlayerWorkRequest cswr = (PlayerWorkRequest) tblRequests.getValueAt(selectedRow, 6);
            if(cswr.getStatus().equalsIgnoreCase("Assigned To Coach")){ 
            cswr.setStatus("Coach assigned to this Request");
            cswr.setReciever(account);

            populatePoliceTable();
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
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            PlayerWorkRequest p = (PlayerWorkRequest) tblRequests.getValueAt(selectedRow, 6);
             if(p.getStatus().equalsIgnoreCase("Coach assigned to this Request")){ 
            p.setStatus("Selected");
            p.setReciever(account);
            
            populatePlayersTable();
            JOptionPane.showMessageDialog(null, "You have completed the request successfully");
            populatePoliceTable();
             }
             else{
                  JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
             }
        }  
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel selectedP;
    private javax.swing.JTable selectedPlayers;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables
}
