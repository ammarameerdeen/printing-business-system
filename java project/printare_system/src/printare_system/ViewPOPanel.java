/*
 * copyright Ammar Bin Ameerdeen
 * All rights reserved
 */
package printare_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ammar Bin Ameerdeen
 */
public class ViewPOPanel extends ContentPanel {

    Database database ;
    /**
     * Creates new form ViewPOPanel
     */
    public ViewPOPanel() {
        database = new Database();
        database.connect();
        
        initComponents();
        
        Common common = new Common();
         POList.setModel(common.getTable( new String [] {
                "P/O ID", "Order Date", "Delivery Date", "Vendor ID"
            }, new String [] {
                "id", "ordered_date", "delivery_date", "vendor_id"
            }, "purchase_order", null, null));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        POList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productsOfPO = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(Theme.CENTER_BOX_COLOR);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        POList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P/O ID", "Order Date", "Delivery Date", "Vendor ID"
            }
        ));
        POList.setName("POList"); // NOI18N
        POList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(POList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 88, -1, 390));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Purchase Orders");
        jLabel2.setName("jLabel2"); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setName("jPanel1"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        productsOfPO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Unit", "Unit Price", "Quantity", "Total"
            }
        ));
        productsOfPO.setName("productsOfPO"); // NOI18N
        jScrollPane2.setViewportView(productsOfPO);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Purchase Order Details");
        jLabel1.setName("jLabel1"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 147, Short.MAX_VALUE)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 248, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 450, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void POListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POListMouseClicked
        try {
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Product");
            tableModel.addColumn("Unit");
            tableModel.addColumn("Unit Price");
            tableModel.addColumn("Quantity");
            tableModel.addColumn("Total");

            String query = "SELECT * FROM `purchase_order_product` WHERE `purchase_order_id`="+POList.getValueAt(POList.getSelectedRow(), 0);
            ResultSet rs = database.statement.executeQuery(query);

            while(rs.next()){
                Vector v = new Vector();
                Integer price = rs.getInt("unit_price");
                Integer quantity = rs.getInt("quantity");
                v.add(rs.getObject("product_name"));
                v.add(rs.getObject("unit_name"));
                v.add(price.toString());
                v.add(quantity.toString());
                v.add((price*quantity));

                tableModel.addRow(v);
            }

            productsOfPO.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(ViewPOPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_POListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable POList;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable productsOfPO;
    // End of variables declaration//GEN-END:variables
}
