/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer_consumer;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class FarmerLogin extends javax.swing.JFrame {

    /**
     * Creates new form FarmerLogin
     */
    private dbConnect db = new dbConnect();
    private static Session sess = null;
    public FarmerLogin(Session ses) {
        sess=ses;
        db.connect();
        initComponents();
        this.fuser.setText("Farmer, "+sess.username+".");
        fillPending();
        fillConfirmed();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fuser = new javax.swing.JLabel();
        Tabs = new javax.swing.JTabbedPane();
        PendingTab = new javax.swing.JScrollPane();
        PendingTable = new javax.swing.JTable();
        ConfirmedTab = new javax.swing.JScrollPane();
        ConfirmedTable = new javax.swing.JTable();
        Addstock = new javax.swing.JButton();
        ConfirmSelected = new javax.swing.JButton();
        ViewStock = new javax.swing.JButton();
        logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmer Page");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Orders");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("E-Market");

        fuser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fuser.setText("Farmer,");

        PendingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Order id", "Customer", "Product", "Quantity", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PendingTab.setViewportView(PendingTable);

        Tabs.addTab("Pending", PendingTab);

        ConfirmedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order id", "Customer", "Product", "Quantity", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ConfirmedTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ConfirmedTab.setViewportView(ConfirmedTable);

        Tabs.addTab("Confirmed", ConfirmedTab);

        Addstock.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Addstock.setText("Add Stock +");
        Addstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddstockActionPerformed(evt);
            }
        });

        ConfirmSelected.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        ConfirmSelected.setText("Confirm Selected");
        ConfirmSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmSelectedActionPerformed(evt);
            }
        });

        ViewStock.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        ViewStock.setText("View My Stock");
        ViewStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStockActionPerformed(evt);
            }
        });

        logOut.setText("Log Out...");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(250, 250, 250)
                        .addComponent(ViewStock)
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuser, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Addstock, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ConfirmSelected)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logOut)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOut)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewStock)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Addstock)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConfirmSelected)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillPending(){
        try {
            db.prestmt = db.con.prepareStatement("select o.order_id,u.username,s.product_name,o.quantity,s.price from orders o,stock s,users u,customer c where o.status='pending' and o.stock_id=s.stock_id and u.uid=(select uid from customer where customer_id=o.customer_id) and o.farmer_id="+sess.typeid);
            db.rs = db.prestmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel)PendingTable.getModel();
            while(db.rs.next()){
                model.addRow(new Object[]{false,db.rs.getInt("order_id"),db.rs.getString("username"),db.rs.getString("product_name"),db.rs.getFloat("quantity"),db.rs.getFloat("price")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(viewStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fillConfirmed(){
        try {
            db.prestmt = db.con.prepareStatement("select o.order_id,u.username,s.product_name,o.quantity,s.price from orders o,stock s,users u,customer c where o.status='confirmed' and o.stock_id=s.stock_id and u.uid=(select uid from customer where customer_id=o.customer_id) and o.farmer_id="+sess.typeid);
            db.rs = db.prestmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel)ConfirmedTable.getModel();
            while(db.rs.next()){
                model.addRow(new Object[]{db.rs.getInt("order_id"),db.rs.getString("username"),db.rs.getString("product_name"),db.rs.getFloat("quantity"),db.rs.getFloat("price")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(viewStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void AddstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddstockActionPerformed
        // TODO add your handling code here:
        addStock ads = new addStock(sess);
        ads.setVisible(true);
    }//GEN-LAST:event_AddstockActionPerformed

    private void ConfirmSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmSelectedActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)PendingTable.getModel();
        for(int i=0; i<model.getRowCount(); i++){
            if((Boolean)model.getValueAt(i,0)){
                int orderId = (Integer)model.getValueAt(i,1);
                try {
                    db.prestmt = db.con.prepareCall("{CALL confirm_order(?)}");
                    db.prestmt.setInt(1, orderId);
                    db.rs = db.prestmt.executeQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(FarmerLogin.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
        }
    }//GEN-LAST:event_ConfirmSelectedActionPerformed

    private void ViewStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStockActionPerformed
        // TODO add your handling code here:
        viewStock vstk = new viewStock(sess);
        vstk.setVisible(true);
    }//GEN-LAST:event_ViewStockActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        sess.reset();
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

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
            java.util.logging.Logger.getLogger(FarmerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FarmerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FarmerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FarmerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FarmerLogin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addstock;
    private javax.swing.JButton ConfirmSelected;
    private javax.swing.JScrollPane ConfirmedTab;
    private javax.swing.JTable ConfirmedTable;
    private javax.swing.JScrollPane PendingTab;
    private javax.swing.JTable PendingTable;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton ViewStock;
    private javax.swing.JLabel fuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
