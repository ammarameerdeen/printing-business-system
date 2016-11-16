/*
 * copyright Ammar Bin Ameerdeen
 * All rights reserved
 */
package printare_system;

import java.awt.Color;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.java.balloontip.BalloonTip;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Ammar Bin Ameerdeen
 */
public class CreateNewPrintOrder extends IMSFrame {
    private int jobs;
    Database database ;
    int orderId ;
    Frame main;
    
    /**
     * Creates new form Template_printare
     */
    public CreateNewPrintOrder(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
        database = new Database();
        database.connect();
        main = parent;
        
        jobs=1;
        orderId = loadOrderId() + 1;
        
        JobId.setText(""+orderId+"");
        updateMaterialsTable();
        loadMaterialTypes();
     
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
        
        AutoCompleteDecorator.decorate(materialType);
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
        jPanel2 = new javax.swing.JPanel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        width = new javax.swing.JTextField();
        createPrintJob1 = new javax.swing.JButton();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        height = new javax.swing.JTextField();
        JobId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialTable = new javax.swing.JTable();
        remove = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addMaterialToTheJob = new javax.swing.JButton();
        quantity = new javax.swing.JTextField();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        materialType = new javax.swing.JComboBox();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        materialStock = new javax.swing.JTable();
        makeOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(253, 239, 196));

        backgroundPanel.setBackground(new java.awt.Color(20, 214, 42));
        backgroundPanel.setName("backgroundPanel"); // NOI18N
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setText("Print Order");
        title.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        title.setName("title"); // NOI18N
        backgroundPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 42, -1, -1));

        centerPanel.setName("centerPanel"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Print JOb", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jXLabel6.setText("Order id");
        jXLabel6.setName("jXLabel6"); // NOI18N

        jXLabel7.setText("Width");
        jXLabel7.setName("jXLabel7"); // NOI18N

        width.setName("width"); // NOI18N
        width.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                widthFocusLost(evt);
            }
        });

        createPrintJob1.setBackground(Theme.BUTTON_COLOR);
        createPrintJob1.setText("Create print Job");
        createPrintJob1.setName("createPrintJob1"); // NOI18N
        createPrintJob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPrintJob1ActionPerformed(evt);
            }
        });

        jXLabel8.setText("Height");
        jXLabel8.setName("jXLabel8"); // NOI18N

        height.setName("height"); // NOI18N
        height.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                heightFocusLost(evt);
            }
        });

        JobId.setEditable(false);
        JobId.setName("JobId"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(jXLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(createPrintJob1))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(184, 184, 184)
                                .add(height, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jXLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jXLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(JobId)
                            .add(width, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(JobId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(width, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(height, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 28, Short.MAX_VALUE)
                .add(createPrintJob1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        materialTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Name", "Quantity"
            }
        ));
        materialTable.setName("materialTable"); // NOI18N
        jScrollPane1.setViewportView(materialTable);

        remove.setBackground(Theme.BUTTON_COLOR);
        remove.setText("Remove Material");
        remove.setName("remove"); // NOI18N
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Materials to the Job", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        addMaterialToTheJob.setBackground(Theme.BUTTON_COLOR);
        addMaterialToTheJob.setText("Add material to the Job");
        addMaterialToTheJob.setEnabled(false);
        addMaterialToTheJob.setName("addMaterialToTheJob"); // NOI18N
        addMaterialToTheJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMaterialToTheJobActionPerformed(evt);
            }
        });

        quantity.setName("quantity"); // NOI18N
        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFocusLost(evt);
            }
        });

        jXLabel2.setText("Material type");
        jXLabel2.setName("jXLabel2"); // NOI18N

        jXLabel3.setText("Quantity");
        jXLabel3.setName("jXLabel3"); // NOI18N

        materialType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "database error" }));
        materialType.setName("materialType"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jXLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jXLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 98, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(materialType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(addMaterialToTheJob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(materialType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 44, Short.MAX_VALUE)
                .add(addMaterialToTheJob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jXLabel4.setForeground(Theme.FONT_COLOR);
        jXLabel4.setText("Available Material stock");
        jXLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jXLabel4.setName("jXLabel4"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        materialStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Name", "Quantity"
            }
        ));
        materialStock.setName("materialStock"); // NOI18N
        jScrollPane2.setViewportView(materialStock);

        makeOrder.setBackground(Theme.BUTTON_COLOR);
        makeOrder.setText("Make Order");
        makeOrder.setName("makeOrder"); // NOI18N
        makeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeOrderActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout centerPanelLayout = new org.jdesktop.layout.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(centerPanelLayout.createSequentialGroup()
                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(centerPanelLayout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, centerPanelLayout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(30, 30, 30)
                        .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .add(centerPanelLayout.createSequentialGroup()
                                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jXLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(remove))
                                .add(0, 0, Short.MAX_VALUE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, centerPanelLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(makeOrder)))
                .addContainerGap())
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(centerPanelLayout.createSequentialGroup()
                .add(30, 30, 30)
                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(centerPanelLayout.createSequentialGroup()
                        .add(jXLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(centerPanelLayout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(remove))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(10, 10, 10)
                .add(makeOrder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        backgroundPanel.add(centerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 106, -1, -1));

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
        vOut.validateIntTextBox(quantity);
        return vOut.valid;
    }
     
     /*
     if (!validateInputA()){
            return ;
        }
     */
    private void addMaterialToTheJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMaterialToTheJobActionPerformed
        // add details to the table
     if (!validateInput()){
            return ;
        }
        
     // check if there is enough resources
        try {
         String query = "SELECT `stock` FROM `material_detail` WHERE `name` = '"+materialType.getSelectedItem()+"'";
         ResultSet rs = database.statement.executeQuery(query);
         rs.next();
         int stock = rs.getInt("stock");
         if (stock < Integer.parseInt(quantity.getText())){
             BalloonTip balloonTip = new BalloonTip(quantity, "Only "+stock+" units available");
            Animate a = new Animate(balloonTip);
            a.start();
            quantity.setText(""+stock+"");
            return;
         }
         
        }catch (SQLException e){
            e.printStackTrace();
            return;
        }
     
        DefaultTableModel tableModel = (DefaultTableModel) materialTable.getModel();
        Vector productDetails = new Vector();

        
        productDetails.add(materialType.getSelectedItem());
        productDetails.add(quantity.getText());

        tableModel.addRow(productDetails);

        materialTable.setModel(tableModel);
        
        updateMaterialsTable();
        
    }//GEN-LAST:event_addMaterialToTheJobActionPerformed

     
     /*
     if (!validateInputA()){
            return ;
        }
     */
    private void makeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeOrderActionPerformed
        try {
        if (materialTable.getRowCount()<=0){
            return ;
        }
            
        // create an order
        String entry= "INSERT INTO `order` (`customer_id`,`status`,`business_name`) VALUES ('1','pending','print')";
        database.statement.executeUpdate(entry);
            // create a print job
        entry = "INSERT INTO `print_order` (`order_id`,`width`,`height`) VALUES('"+loadOrderId()+"','"+width.getText()+"','"+height.getText()+"')";
        database.statement.executeUpdate(entry);
      
        // load all the material of the order to material print table
        // then update the product table
        for (int rows = 0; rows < materialTable.getRowCount(); rows++){
            String materialType = (String) materialTable.getValueAt(rows, 0);
            Float quantity = (Float) Float.parseFloat((String) materialTable.getValueAt(rows, 1));
            
            entry = "INSERT INTO `material_print` (`quantity`,`material_name`,`print_order_id`) VALUES('"+quantity+"','"+materialType+"','"+loadPrintOrderId()+"')";
            System.out.println(entry);
            database.statement.executeUpdate(entry);
            
            
            //get the stock and update
            String query = "SELECT `stock` FROM `material_detail` WHERE `name` ='"+materialType+"'";
            ResultSet rs = database.statement.executeQuery(query);
            rs.next();
            int currentStock = rs.getInt("stock");
            // update material detail table
            String update = "UPDATE `material_detail` SET `stock`="+(currentStock-quantity)+" WHERE `name`='"+materialType+"'";
            database.statement.executeUpdate(update);
            
        }
        updateMaterialsTable();
        
        main.setVisible(true);
        dispose();
        
        } catch(SQLException e){
        e.printStackTrace();
        }
          
    }//GEN-LAST:event_makeOrderActionPerformed

    
        public boolean validateInputA(){
        ValidateOut vOut= new ValidateOut();
        vOut.validateIntTextBox(width);
        vOut.validateIntTextBox(height);
        return vOut.valid;
    }
        
        
     
     /*
     if (!validateInputA()){
            return ;
        }
     */
        
    public void updateMaterialsTable(){
        try{
        String query = "SELECT * FROM `material_detail`";
        ResultSet rs = database.statement.executeQuery(query);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        
        // add columns to table model
        tableModel.addColumn("Material Name");
        tableModel.addColumn("Stock Available");
        
        // add rows
        Vector rows = new Vector();
        while(rs.next()){
            rows.add(rs.getString("name"));
            rows.add(rs.getString("stock"));
            
            tableModel.addRow(rows);
            // nullify the vector
            rows = new Vector();
        }
        
        materialStock.setModel(tableModel);
        }catch(SQLException ex){
        ex.printStackTrace();
        }
    }
    private void createPrintJob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPrintJob1ActionPerformed
        if (!validateInputA()){
            return ;
        }
        addMaterialToTheJob.setEnabled(true);
    }//GEN-LAST:event_createPrintJob1ActionPerformed

    private void widthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_widthFocusLost
          ValidateOut vOut = new ValidateOut();
       vOut.validateFloatTextBox((JTextField) evt.getComponent());
    }//GEN-LAST:event_widthFocusLost

    private void heightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightFocusLost
          ValidateOut vOut = new ValidateOut();
       vOut.validateFloatTextBox((JTextField) evt.getComponent());
    }//GEN-LAST:event_heightFocusLost

    private void quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusLost
          ValidateOut vOut = new ValidateOut();
       vOut.validateFloatTextBox((JTextField) evt.getComponent());
    }//GEN-LAST:event_quantityFocusLost

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        ((DefaultTableModel) materialTable.getModel()).removeRow(materialTable.getSelectedRow());
    }//GEN-LAST:event_removeActionPerformed

    private int loadOrderId(){
        int id = 1;

        try {
        String query = "SELECT max(`id`) FROM `order`";
        ResultSet rs = database.statement.executeQuery(query);

        rs.next();
        id = rs.getInt("max(`id`)");
    
        } catch(SQLException e){
            e.printStackTrace();
        }

        return id;
    }
    
    private int loadPrintOrderId(){
        int id = 1;

        try {
        String query = "SELECT max(`id`) FROM `print_order`";
        ResultSet rs = database.statement.executeQuery(query);

        rs.next();
        id = rs.getInt("max(`id`)");
    
        } catch(SQLException e){
            e.printStackTrace();
        }

        return id;
    }
    
    private void loadMaterialTypes(){
        try {
        String query ="SELECT `name` FROM `material_detail`";
        ResultSet rs = database.statement.executeQuery(query);
        
        Vector materials = new Vector();
        while(rs.next()){
            materials.add(rs.getString("name"));
        }

        materialType.setModel(new DefaultComboBoxModel(materials));
        } catch ( SQLException e){
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
            java.util.logging.Logger.getLogger(CreateNewPrintOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewPrintOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewPrintOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewPrintOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateNewPrintOrder dialog = new CreateNewPrintOrder(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField JobId;
    public javax.swing.JButton addMaterialToTheJob;
    public org.jdesktop.swingx.JXPanel backgroundPanel;
    public javax.swing.JPanel centerPanel;
    public javax.swing.JButton createPrintJob1;
    public javax.swing.JTextField height;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public org.jdesktop.swingx.JXLabel jXLabel2;
    public org.jdesktop.swingx.JXLabel jXLabel3;
    public org.jdesktop.swingx.JXLabel jXLabel4;
    public org.jdesktop.swingx.JXLabel jXLabel6;
    public org.jdesktop.swingx.JXLabel jXLabel7;
    public org.jdesktop.swingx.JXLabel jXLabel8;
    public javax.swing.JButton makeOrder;
    public javax.swing.JTable materialStock;
    public javax.swing.JTable materialTable;
    public javax.swing.JComboBox materialType;
    public javax.swing.JTextField quantity;
    public javax.swing.JButton remove;
    public org.jdesktop.swingx.JXLabel title;
    public javax.swing.JTextField width;
    // End of variables declaration//GEN-END:variables
}
