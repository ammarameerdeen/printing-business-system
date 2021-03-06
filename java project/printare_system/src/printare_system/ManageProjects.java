/*
 * copyright Ammar Bin Ameerdeen
 * All rights reserved
 */
package printare_system;

import java.awt.Color;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ammar Bin Ameerdeen
 */
public class ManageProjects extends IMSFrame{

    Database database;
    Common common ;
    boolean update ;
    public Frame main ;
    public ManageProjects(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
        update = false; 
        main = parent ;
        common = new Common();
        database = new Database();
        database.connect();
        
        Theme theme = new Theme();
        theme.setTheme(this);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        super.windowClosing(e);
                        main.setVisible(true);                        
                        dispose();
                    }
                });
        
        updateProjectTable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = getBackgroundPanel();
        title = getFrameTitle();
        centerPanel = getCenterPanel();
        jPanel1 = new javax.swing.JPanel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        accumulatedCost = new javax.swing.JTextField();
        projectAction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        projectName = new javax.swing.JTextField();
        expectedRevenue = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        startingDate = new com.toedter.calendar.JDateChooser();
        finishingDate = new com.toedter.calendar.JDateChooser();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jLabel3 = new javax.swing.JLabel();
        amountReceived = new javax.swing.JTextField();
        completed = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectTable = new javax.swing.JTable();
        editMode = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(20, 214, 42));
        backgroundPanel.setName("backgroundPanel"); // NOI18N
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setText("Project Management");
        title.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        title.setName("title"); // NOI18N
        backgroundPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 42, -1, -1));

        centerPanel.setName("centerPanel"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Project Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jXLabel3.setText("Project Name");
        jXLabel3.setName("jXLabel3"); // NOI18N

        jXLabel4.setText("Expected revenue");
        jXLabel4.setName("jXLabel4"); // NOI18N

        accumulatedCost.setName("accumulatedCost"); // NOI18N
        accumulatedCost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                accumulatedCostFocusLost(evt);
            }
        });

        projectAction.setBackground(Theme.BUTTON_COLOR);
        projectAction.setText("Create Project");
        projectAction.setName("projectAction"); // NOI18N
        projectAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectActionActionPerformed(evt);
            }
        });

        jLabel1.setText("Accumulated cost");
        jLabel1.setName("jLabel1"); // NOI18N

        projectName.setName("projectName"); // NOI18N

        expectedRevenue.setName("expectedRevenue"); // NOI18N
        expectedRevenue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                expectedRevenueFocusLost(evt);
            }
        });

        jLabel2.setText("Starting Date");
        jLabel2.setName("jLabel2"); // NOI18N

        startingDate.setName("startingDate"); // NOI18N

        finishingDate.setName("finishingDate"); // NOI18N

        jXLabel2.setText("Finishing Date");
        jXLabel2.setName("jXLabel2"); // NOI18N

        jLabel3.setText("Amount Received");
        jLabel3.setName("jLabel3"); // NOI18N

        amountReceived.setName("amountReceived"); // NOI18N
        amountReceived.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountReceivedFocusLost(evt);
            }
        });

        completed.setText("Completed");
        completed.setName("completed"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jXLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel1)
                                    .add(jXLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel2)
                                    .add(jLabel3))
                                .add(28, 28, 28)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(startingDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(finishingDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(amountReceived, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, accumulatedCost)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, expectedRevenue)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(projectName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(22, 22, 22))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jXLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(projectAction, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(completed)
                        .add(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(projectName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(expectedRevenue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(accumulatedCost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(startingDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(jXLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(finishingDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(30, 30, 30)
                        .add(jLabel3))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(amountReceived, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(31, 31, 31)
                .add(completed)
                .add(18, 18, Short.MAX_VALUE)
                .add(projectAction, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        projectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project Name", "Expected Reveunue", "Cost Incrurred", "Starting Date", "Finishing Date", "Status", "Amount Recieved"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        projectTable.setName("projectTable"); // NOI18N
        projectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(projectTable);

        editMode.setText("Edit Project(s)");
        editMode.setName("editMode"); // NOI18N
        editMode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                editModeStateChanged(evt);
            }
        });
        editMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editModeActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout centerPanelLayout = new org.jdesktop.layout.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(centerPanelLayout.createSequentialGroup()
                .add(45, 45, 45)
                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(editMode)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, centerPanelLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(editMode)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 415, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        backgroundPanel.add(centerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 103, -1, -1));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public boolean validateInput(){
        ValidateOut vOut= new ValidateOut();
        vOut.validateDate(startingDate);
        vOut.validateDate(finishingDate);
        vOut.validateFloatTextBox(expectedRevenue);
        vOut.validateFloatTextBox(accumulatedCost);
        vOut.validateFloatTextBox(amountReceived);
        return vOut.valid;
    }
     
     /*
     if (!validateInputA()){
            return ;
        }
     */
    private void projectActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectActionActionPerformed
        if (!validateInput()){
            return ;
        }
        
        if(!update){
        try {
        String start = common.getFormatDate(startingDate.getDate());
        String finish = common.getFormatDate(finishingDate.getDate());
        String status = "pending";
        if (completed.isSelected()){
            status = "completed";
        }
        String query = "INSERT INTO `project` (`name`,`starting_date`,`finishing_date`,`status`,`revenue`,`amount_recieved`,`cost`) VALUES ('"+projectName.getText()+"','"+start+"','"+finish+"','"+status+"','"+expectedRevenue.getText()+"','"+amountReceived.getText()+"','"+accumulatedCost.getText()+"')";
        System.out.println(query);
        database.statement.executeUpdate(query);

        
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        }
        else{
            // update the table
        String start = common.getFormatDate(startingDate.getDate());
        String finish = common.getFormatDate(finishingDate.getDate());
        String status = "pending";
        
        if (completed.isSelected()){
            status = "completed";
        }
        try {
            
        
        String query = "UPDATE `project` SET `starting_date` = '"+start+"',`finishing_date`='"+finish+"',`status`='"+status+"',`revenue`='"+expectedRevenue.getText()+"',`amount_recieved`='"+amountReceived.getText()+"',`cost`='"+accumulatedCost.getText()+"' WHERE `name`='"+projectName.getText()+"'";
        System.out.println(query);
        database.statement.executeUpdate(query);
        
        } catch (SQLException e) {
        e.printStackTrace();
        }
        
        }
        updateProjectTable();
        
    }//GEN-LAST:event_projectActionActionPerformed

    private void editModeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_editModeStateChanged
        // if selected enable edit mode
        if(editMode.isSelected()){
            update = true ;
            // change the Button
            projectAction.setBackground(Color.orange);
            projectAction.setText("Update Project");
            projectName.setEnabled(false);
            
        }
        else{
            update = false ;
            projectAction.setBackground(new Color(127,175,126));
            projectAction.setText("Create Project");
            projectName.setEnabled(true);
            
        }
    }//GEN-LAST:event_editModeStateChanged

    private void projectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTableMouseClicked
        // update the table contents to the form
        if (!editMode.isSelected()){
            return; 
        }
        int row = projectTable.getSelectedRow();
        projectName.setText((String) projectTable.getValueAt(row, 0));
        expectedRevenue.setText((String) projectTable.getValueAt(row, 1));
        accumulatedCost.setText((String) projectTable.getValueAt(row, 2));

        if (projectTable.getValueAt(row,5).equals("pending")){
                    completed.setSelected(false);
        }else {
                    completed.setSelected(true);
        }
        
        amountReceived.setText((String) projectTable.getValueAt(row, 6));
    }//GEN-LAST:event_projectTableMouseClicked

    private void expectedRevenueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expectedRevenueFocusLost
         ValidateOut vOut = new ValidateOut();
       vOut.validateFloatTextBox((JTextField) evt.getComponent());
    }//GEN-LAST:event_expectedRevenueFocusLost

    private void accumulatedCostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accumulatedCostFocusLost
         ValidateOut vOut = new ValidateOut();
       vOut.validateFloatTextBox((JTextField) evt.getComponent());
    }//GEN-LAST:event_accumulatedCostFocusLost

    private void amountReceivedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountReceivedFocusLost
          ValidateOut vOut = new ValidateOut();
       vOut.validateFloatTextBox((JTextField) evt.getComponent());
    }//GEN-LAST:event_amountReceivedFocusLost

    private void editModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editModeActionPerformed

    public void updateProjectTable(){
        try {
        DefaultTableModel tableModel = new DefaultTableModel();
        
        String query = "SELECT `name`,`revenue`, `cost`,`starting_date`,`finishing_date`,`status`,`amount_recieved` FROM `project`";
        ResultSet rs = database.statement.executeQuery(query);

        tableModel.addColumn("Project Name");
        tableModel.addColumn("Revenue");
        tableModel.addColumn("Cost");
        tableModel.addColumn("Starting Date");
        tableModel.addColumn("Finishing Date");
        tableModel.addColumn("Status");
        tableModel.addColumn("Amount Recieved");

        while(rs.next()){
        // add row by row
        Vector projectDetails = new Vector();

        projectDetails.add(rs.getString("name"));
        projectDetails.add(rs.getString("revenue"));
        projectDetails.add(rs.getString("cost"));
        projectDetails.add(rs.getString("starting_date"));
        projectDetails.add(rs.getString("finishing_date"));
        projectDetails.add(rs.getString("status"));
        projectDetails.add(rs.getString("amount_recieved"));

        tableModel.addRow(projectDetails);

        }

        projectTable.setModel(tableModel);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    
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
            java.util.logging.Logger.getLogger(ManageProjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageProjects dialog = new ManageProjects(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField accumulatedCost;
    public javax.swing.JTextField amountReceived;
    public org.jdesktop.swingx.JXPanel backgroundPanel;
    public javax.swing.JPanel centerPanel;
    public javax.swing.JCheckBox completed;
    public javax.swing.JCheckBox editMode;
    public javax.swing.JTextField expectedRevenue;
    public com.toedter.calendar.JDateChooser finishingDate;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public org.jdesktop.swingx.JXLabel jXLabel2;
    public org.jdesktop.swingx.JXLabel jXLabel3;
    public org.jdesktop.swingx.JXLabel jXLabel4;
    public javax.swing.JButton projectAction;
    public javax.swing.JTextField projectName;
    public javax.swing.JTable projectTable;
    public com.toedter.calendar.JDateChooser startingDate;
    public org.jdesktop.swingx.JXLabel title;
    // End of variables declaration//GEN-END:variables
}
