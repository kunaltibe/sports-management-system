/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EventMakerWorkArea;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.EventMaker.EventMaker;
import Project.Organization.EventMakerOrganization;
import Project.Organization.Organization;
import Project.UserAccount.UserAccount;
import Project.WorkQueue.PlayerWorkRequest;
import Project.WorkQueue.WorkRequestQueue;
import Project.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kunaltibe
 */
public class EventMakerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form EventMakerWorkArea
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private MainSystem system;
    EventMaker em;
    
    public EventMakerWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        btnScheduler.setVisible(false);
        
        for (EventMaker eventmaker : ((EventMakerOrganization)organization).getChangemakerlist().getChangeMakerDirectory()) {
            if (account.getEmployee().getPersonName().equals(eventmaker.getEventMakerName())) {
                 em=eventmaker;
            }
        }
        if (em.getEventMakerWorkQueue() == null) {
            WorkRequestQueue w = new WorkRequestQueue();
            em.setEventMakerWorkQueue(w);
        }
        
        populateTableWorkQueue();
    }
    //populate all the requests from victim work request queue
    public void populateTableWorkQueue(){
         DefaultTableModel model = (DefaultTableModel) tblEvent.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest work : system.getOrgWorkQueue().getWorkRequestList()){
           if(work instanceof PlayerWorkRequest){ 
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvent = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnAssignTo = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelPosition = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        countryTxt = new javax.swing.JTextArea();
        sportTxt = new javax.swing.JTextField();
        positionTxt = new javax.swing.JTextField();
        labelSport = new javax.swing.JLabel();
        labelCountry = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCoach = new javax.swing.JButton();
        btnHealth = new javax.swing.JButton();
        btnSelector = new javax.swing.JButton();
        btnScheduler = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 235, 255));
        setPreferredSize(new java.awt.Dimension(1500, 650));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        lblT.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblT.setForeground(new java.awt.Color(255, 255, 255));
        lblT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblT.setText("Tournament Manager Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblT)
                .addGap(0, 0, 0))
        );

        tblEvent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Player Name", "Sport", "Position", "Country", "Age", "Date", "Status", "Event Maker"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEvent);

        btnView.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAssignTo.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnAssignTo.setText("Acknowledge");
        btnAssignTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToActionPerformed(evt);
            }
        });

        btnComplete.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        labelPosition.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        labelPosition.setText("Position");

        countryTxt.setEditable(false);
        countryTxt.setColumns(20);
        countryTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        countryTxt.setRows(5);
        jScrollPane2.setViewportView(countryTxt);

        sportTxt.setEditable(false);
        sportTxt.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        sportTxt.setForeground(new java.awt.Color(153, 0, 153));
        sportTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportTxtActionPerformed(evt);
            }
        });

        positionTxt.setEditable(false);
        positionTxt.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        positionTxt.setForeground(new java.awt.Color(153, 0, 153));

        labelSport.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        labelSport.setText("Sport");

        labelCountry.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        labelCountry.setText("Country");

        labelAge.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        labelAge.setText("Age");

        ageTxt.setEditable(false);
        ageTxt.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        ageTxt.setForeground(new java.awt.Color(153, 0, 153));

        labelName.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        labelName.setText("Name");

        nameTxt.setEditable(false);
        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSport, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSport, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);

        jPanel3.setOpaque(false);

        btnCoach.setText("Coach Department");
        btnCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoachActionPerformed(evt);
            }
        });

        btnHealth.setText("Health Department");
        btnHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthActionPerformed(evt);
            }
        });

        btnSelector.setText("Selection Department");
        btnSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectorActionPerformed(evt);
            }
        });

        btnScheduler.setText("Scheduling Department");
        btnScheduler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchedulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnScheduler, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCoach, btnHealth, btnScheduler, btnSelector});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnScheduler, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCoach, btnHealth, btnScheduler, btnSelector});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAssignTo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAssignTo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //assign the request to me
    private void btnAssignToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            PlayerWorkRequest cswr = (PlayerWorkRequest) tblEvent.getValueAt(selectedRow, 6);
            
            if(cswr.getStatus().equalsIgnoreCase("Requested")){

            cswr.setStatus("Pending");
            cswr.setReciever(account);

            populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnAssignToActionPerformed
    //view the request 
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            
            
            PlayerWorkRequest p = (PlayerWorkRequest) tblEvent.getValueAt(selectedRow, 6);
            
            sportTxt.setText(p.getSubject());
            countryTxt.setText(p.getCountry());
            positionTxt.setText(p.getPosition());
            ageTxt.setText(String.valueOf(p.getAge()));
            for (WorkRequest work : system.getOrgWorkQueue().getWorkRequestList()){
           if(work instanceof PlayerWorkRequest){
            nameTxt.setText(work.getSender().getEmployee().getPersonName());
           }
        }
        }
    }//GEN-LAST:event_btnViewActionPerformed
    //complete the assigned request
    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "To allocate the account, please choose the row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            PlayerWorkRequest p = (PlayerWorkRequest) tblEvent.getValueAt(selectedRow, 6);
           
            if(p.getStatus().equalsIgnoreCase("Selected")||p.getStatus().equalsIgnoreCase("Rejected")){


                    p.setStatus("Complete");
                    JOptionPane.showMessageDialog(null, "You have completed the request successfully");
                    populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnCompleteActionPerformed
    //assign request to NGO
    private void btnSchedulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchedulerActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please choose the row to forward request to Scheduler ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            

            PlayerWorkRequest cswr = (PlayerWorkRequest) tblEvent.getValueAt(selectedRow, 6);
            if(cswr.getStatus().equals("Pending")){
                cswr.setStatus("Assigned To Scheduler");
                JOptionPane.showMessageDialog(null, "This request is already assigned to Scheduler", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(cswr.getStatus().equals("Assigned To Scheduler")){
                JOptionPane.showMessageDialog(null, "This request is already assigned to Scheduler", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
            if(cswr.getStatus().equalsIgnoreCase("Requested")){
            cswr.setStatus("Assigned To Scheduler");
            populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            }
            
        }
    }//GEN-LAST:event_btnSchedulerActionPerformed
    //assign request to healthcare
    private void btnHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please choose the row to forward request to the Physician", "Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            
            PlayerWorkRequest cswr = (PlayerWorkRequest) tblEvent.getValueAt(selectedRow, 6);
            if(cswr.getStatus().equals("Assigned To Physician")){
                JOptionPane.showMessageDialog(null, "This request is already assigned to Physician", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else{
                
            if(cswr.getStatus().equalsIgnoreCase("Health check required")){
                JOptionPane.showMessageDialog(null, "Assigned To Physician");
                cswr.setStatus("Assigned To Physician");

            populateTableWorkQueue();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
            }
    } 
        }
    }//GEN-LAST:event_btnHealthActionPerformed
    //assign request to police
    private void btnCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoachActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please choose the row to forward request to Coach", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            PlayerWorkRequest cswr = (PlayerWorkRequest) tblEvent.getValueAt(selectedRow, 6);
            if(cswr.getStatus().equals("Assigned To Coach")){
                JOptionPane.showMessageDialog(null, "This request is already assigned to Coach", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
               if(cswr.getStatus().equalsIgnoreCase("Health check passed")){ 
            JOptionPane.showMessageDialog(null, "Assigned To Coach", "Warning", JOptionPane.WARNING_MESSAGE);
            cswr.setStatus("Assigned To Coach");
            populateTableWorkQueue();
            }
               else{
                   JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
               }
            }
            
        }
    }//GEN-LAST:event_btnCoachActionPerformed
    //assign request to fire department
    private void btnSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectorActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please choose the row to forward request to Selector", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            PlayerWorkRequest sel = (PlayerWorkRequest) tblEvent.getValueAt(selectedRow, 6);
            if(sel.getStatus().equals("Assigned to Selector")){
                JOptionPane.showMessageDialog(null, "This request is already assigned Selector", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(sel.getStatus().equalsIgnoreCase("Pending")){ 
                   
                JOptionPane.showMessageDialog(null, "Assigned to Selector", "Warning", JOptionPane.WARNING_MESSAGE);
                sel.setStatus("Assigned to Selector");
                populateTableWorkQueue();
            }
                else{
                     JOptionPane.showMessageDialog(null, "Wrong Request", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSelectorActionPerformed

    private void sportTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sportTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton btnAssignTo;
    private javax.swing.JButton btnCoach;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnHealth;
    private javax.swing.JButton btnScheduler;
    private javax.swing.JButton btnSelector;
    private javax.swing.JButton btnView;
    private javax.swing.JTextArea countryTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPosition;
    private javax.swing.JLabel labelSport;
    private javax.swing.JLabel lblT;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField positionTxt;
    private javax.swing.JTextField sportTxt;
    private javax.swing.JTable tblEvent;
    // End of variables declaration//GEN-END:variables
}
