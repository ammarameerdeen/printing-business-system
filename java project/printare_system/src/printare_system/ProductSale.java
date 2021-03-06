/*
 * copyright Ammar Bin Ameerdeen
 * All rights reserved
 */
package printare_system;

import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.java.balloontip.BalloonTip;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Ammar Bin Ameerdeen
 */
public class ProductSale extends IMSFrame {
    private int productInList;
    private Database database;
    Frame main;
    
    /**
     * Creates new form Template_printare
     */
    public ProductSale(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
        productInList=0;
        database = new Database();
        database.connect();
        
        main = parent ;
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        super.windowClosing(e);
                        main.setVisible(true);                        
                        dispose();
                    }
                });
        
        // set ui
        resetProductTable();
        loadProductList();
        Common c = new Common();
        customerId.setModel(c.getComboBoxModel("customer", "id"));
        
        Theme theme = new Theme();
        theme.setTheme(this);
        
        AutoCompleteDecorator.decorate(productType);
        AutoCompleteDecorator.decorate(customerId);
        
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
        viewStock = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        customerId = new javax.swing.JComboBox();
        customerNameLabel = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new org.jdesktop.swingx.JXTable();
        completeSale = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jLabel1 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        productType = new javax.swing.JComboBox();
        addToTable = new javax.swing.JButton();
        pricePerUnit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(20, 214, 42));
        backgroundPanel.setName("backgroundPanel"); // NOI18N
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setText("Sale");
        title.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        title.setName("title"); // NOI18N
        backgroundPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        centerPanel.setName("centerPanel"); // NOI18N

        viewStock.setBackground(Theme.BUTTON_COLOR);
        viewStock.setText("View Stock");
        viewStock.setName("viewStock"); // NOI18N
        viewStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStockActionPerformed(evt);
            }
        });

        jLabel3.setForeground(Theme.FONT_COLOR);
        jLabel3.setText("Customer ID");
        jLabel3.setName("jLabel3"); // NOI18N

        customerId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        customerId.setName("customerId"); // NOI18N
        customerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdActionPerformed(evt);
            }
        });

        customerNameLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        customerNameLabel.setForeground(Theme.FONT_COLOR);
        customerNameLabel.setText("Default");
        customerNameLabel.setName("customerNameLabel"); // NOI18N

        date.setName("date"); // NOI18N

        jXLabel3.setForeground(Theme.FONT_COLOR);
        jXLabel3.setText("Date");
        jXLabel3.setName("jXLabel3"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Product Name", "Quantity", "Price per Unit", "Total"
            }
        ));
        productTable.setName("productTable"); // NOI18N
        jScrollPane1.setViewportView(productTable);

        completeSale.setBackground(Theme.BUTTON_COLOR);
        completeSale.setText("Complete Sale");
        completeSale.setName("completeSale"); // NOI18N
        completeSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeSaleActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jXLabel2.setText("Product");
        jXLabel2.setName("jXLabel2"); // NOI18N

        jLabel1.setText("Quantity");
        jLabel1.setName("jLabel1"); // NOI18N

        quantity.setName("quantity"); // NOI18N
        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFocusLost(evt);
            }
        });

        productType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No products available" }));
        productType.setName("productType"); // NOI18N
        productType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTypeActionPerformed(evt);
            }
        });

        addToTable.setBackground(Theme.BUTTON_COLOR);
        addToTable.setText("Add To Sale");
        addToTable.setName("addToTable"); // NOI18N
        addToTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToTableActionPerformed(evt);
            }
        });

        pricePerUnit.setName("pricePerUnit"); // NOI18N
        pricePerUnit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pricePerUnitFocusLost(evt);
            }
        });

        jLabel2.setText("Price Per Unit");
        jLabel2.setName("jLabel2"); // NOI18N

        remove.setBackground(Theme.BUTTON_COLOR);
        remove.setText("Remove product from Sale");
        remove.setName("remove"); // NOI18N
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jXLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 83, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(quantity)
                            .add(productType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(pricePerUnit)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(remove)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(addToTable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(productType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(pricePerUnit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 87, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(addToTable, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .add(remove, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout centerPanelLayout = new org.jdesktop.layout.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(centerPanelLayout.createSequentialGroup()
                        .add(viewStock, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel3)
                        .add(18, 18, 18)
                        .add(customerId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(33, 33, 33)
                        .add(customerNameLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jXLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(date, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(centerPanelLayout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 36, Short.MAX_VALUE)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 424, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(centerPanelLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(completeSale, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(centerPanelLayout.createSequentialGroup()
                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(centerPanelLayout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(date, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jXLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(centerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(viewStock)
                            .add(jLabel3)
                            .add(customerId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(customerNameLabel))))
                .add(18, 18, 18)
                .add(centerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 27, Short.MAX_VALUE)
                .add(completeSale, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backgroundPanel.add(centerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 91, -1, -1));

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
        vOut.validateIntTextBox(this.pricePerUnit);
        return vOut.valid;
    }
     
     /*
     if (!validateInputA()){
            return ;
        }
     */
     
    private void addToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToTableActionPerformed
        
// add details to the table
     if (!validateInput()){
            return ;
        }
     if (Integer.parseInt(quantity.getText())==0){
         return ;
     }
        if(productAvailable((String) productType.getSelectedItem(),Integer.parseInt(quantity.getText()))){
            
        DefaultTableModel productList = (DefaultTableModel) productTable.getModel();
        
        Vector productDetails = new Vector();
        productInList++;
        
        productDetails.add(productInList);
        productDetails.add(productType.getSelectedItem());
        productDetails.add(quantity.getText());
        productDetails.add(Float.parseFloat(pricePerUnit.getText()));
        productDetails.add(Float.parseFloat(pricePerUnit.getText())*Integer.parseInt(quantity.getText()));
        
        productList.addRow(productDetails);
        
        productTable.setModel(productList);
        } else{
            // show balloon tool tip is done at product available
        }
        clearUI();
    }//GEN-LAST:event_addToTableActionPerformed
     
    public boolean validateInputFinal(){
        ValidateOut vOut= new ValidateOut();
        vOut.validateDate(date);
        return vOut.valid;
    }
     
     /*
     if (!validateInputA()){
            return ;
        }
     */
    private void completeSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeSaleActionPerformed
        if (productTable.getRowCount() <= 0 || !validateInputFinal()){
            return ;
        }
        
        // Complete the sale
        try {
            // get the sale id
            String query = "SELECT max(`id`) from `item_sale`";
            ResultSet rs = database.statement.executeQuery(query);
            rs.next();
            int id = rs.getInt("max(`id`)")+1;

            Common c = new Common();
            // create the sale entry in the item_sale table
            String entry = "INSERT INTO `item_sale` (`customer_id`,`date`) VALUES('"+customerId.getSelectedItem()+"','"+c.getFormatDate(date.getDate())+"')";
            database.statement.executeUpdate(entry);

        // update all the entries in to the item_sale table and product_of_sale table
        for (int rows = 0; rows < productTable.getRowCount(); rows++){
            String productType = (String) productTable.getValueAt(rows, 1);
            // get stock of the current product
            query = "SELECT `stock` FROM `product` WHERE `name`='"+productType+"'";
            rs = database.statement.executeQuery(query);
            rs.next();
            int stock = rs.getInt("stock");
            Integer newStock = stock - Integer.parseInt((String) productTable.getValueAt(rows, 2));
   
            String update = "UPDATE `product` SET `stock`='"+newStock+"' WHERE `name`='"+((String) productTable.getValueAt(rows, 1))+"'";

            // update product stock
            database.statement.executeUpdate(update);
            System.out.println("product added");

            // add sale entry to sale_of_product table
            entry = "INSERT INTO `product_of_sale` (`item_sale_id`, `product_name`, `quantity`) VALUES('"+id+"','"+productType+"','"+((String) productTable.getValueAt(rows, 2))+"')";
            System.out.println(entry);

            database.statement.executeUpdate(entry);
        }

        resetProductTable();
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        clearUI();
    }//GEN-LAST:event_completeSaleActionPerformed

    private void quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusLost
          ValidateOut vOut = new ValidateOut();
       vOut.validateIntTextBox((JTextField) evt.getComponent());
    }//GEN-LAST:event_quantityFocusLost

    private void pricePerUnitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pricePerUnitFocusLost
         ValidateOut vOut = new ValidateOut();
       vOut.validateFloatTextBox((JTextField) evt.getComponent());
    }//GEN-LAST:event_pricePerUnitFocusLost

    private void productTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTypeActionPerformed
        try {
            // TODO add your handling code here:
            String query = "SELECT `price` FROM `product` WHERE `name`='"+productType.getSelectedItem()+"'";
            ResultSet rs = database.statement.executeQuery(query);
            
            rs.next();
            pricePerUnit.setText(""+rs.getInt("price")+"");
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_productTypeActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        ((DefaultTableModel) productTable.getModel()).removeRow(productTable.getSelectedRow());
        
    }//GEN-LAST:event_removeActionPerformed

    private void viewStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStockActionPerformed
        ManageProducts manageProducts = new ManageProducts(this, true);
        this.setVisible(false);
        manageProducts.setVisible(true);
    }//GEN-LAST:event_viewStockActionPerformed

    private void customerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdActionPerformed
        try {
            String query = "SELECT `name` FROM `customer` WHERE `id`='"+customerId.getSelectedItem()+"'";
            ResultSet rs = database.statement.executeQuery(query);
            
            rs.next();
            String name = rs.getString("name");
            customerNameLabel.setText(name);
        } catch (SQLException ex) {
            Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_customerIdActionPerformed
    /*
    Checks the product database if there are @quantity number of @name.
    */
    private boolean productAvailable(String name, int quantity){
        try {
        String query = "SELECT `stock` FROM `product`";
        ResultSet rs = database.statement.executeQuery(query);
        rs.next();
        
        int stock = rs.getInt("stock");
        
        if (quantity > stock){
            
            BalloonTip balloonTip = new BalloonTip(this.quantity, "Only "+stock+" units available");
            Animate a = new Animate(balloonTip);
            a.start();
            this.quantity.setText(""+stock+"");
            
            return false;
        }
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        return true ;
    }
    private void resetProductTable(){
        // reset Table
        DefaultTableModel gModel = new DefaultTableModel();
        gModel.addColumn("s.No");
        gModel.addColumn("Product Type");
        gModel.addColumn("Quantity");
        gModel.addColumn("Price per Unit");
        gModel.addColumn("Total");
        
        productTable.setModel(gModel);
        
    }
    
    private void loadProductList(){
        try{
            String query = "SELECT `name` FROM `product`";
            ResultSet rs = database.statement.executeQuery(query);
            
            Vector productList = new Vector();
            while(rs.next()){
                productList.add(rs.getString("name"));
            }
            
            productType.setModel(new DefaultComboBoxModel(productList));
            
        }catch(SQLException e){
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
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ProductSale dialog = new ProductSale(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addToTable;
    public org.jdesktop.swingx.JXPanel backgroundPanel;
    public javax.swing.JPanel centerPanel;
    public javax.swing.JButton completeSale;
    public javax.swing.JComboBox customerId;
    public javax.swing.JLabel customerNameLabel;
    public com.toedter.calendar.JDateChooser date;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public org.jdesktop.swingx.JXLabel jXLabel2;
    public org.jdesktop.swingx.JXLabel jXLabel3;
    public javax.swing.JTextField pricePerUnit;
    public org.jdesktop.swingx.JXTable productTable;
    public javax.swing.JComboBox productType;
    public javax.swing.JTextField quantity;
    public javax.swing.JButton remove;
    public org.jdesktop.swingx.JXLabel title;
    public javax.swing.JButton viewStock;
    // End of variables declaration//GEN-END:variables

    private void clearUI() {
        quantity.setText("");
        pricePerUnit.setText("");
    }
}
