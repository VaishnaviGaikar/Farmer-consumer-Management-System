/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer_consumer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class CustomerLogin extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLogin
     */
    private dbConnect db = new dbConnect();
    private static Session sess = null;
    public CustomerLogin(Session ses) {
        sess=ses;
        try {
            db.connect();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning", JOptionPane.WARNING_MESSAGE);
        }
        initComponents();
        this.cuser.setText("Welcome Customer, "+sess.username+".");
        searchText.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                searchActionPerformed(ae);
            }
            
        });
        searchText.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuser = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewCart = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Results = new javax.swing.JTable();
        addtocart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Login");

        cuser.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        cuser.setText("Welcome Customer,");

        logOut.setText("Log Out...");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("E-Market");

        viewCart.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        viewCart.setText("View Cart");
        viewCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCartActionPerformed(evt);
            }
        });

        searchText.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        search.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Results.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Stock id", "Product", "Available", "Farmer", "Price", "Enter Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Results.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(Results);
        Results.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        addtocart.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        addtocart.setText("Add to Cart >>");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addComponent(cuser, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewCart)
                        .addGap(83, 83, 83)
                        .addComponent(logOut)))
                .addGap(24, 24, 24))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addtocart)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cuser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logOut)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search)
                            .addComponent(viewCart))
                        .addGap(14, 14, 14)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addtocart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        sess.reset();
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String prdct = this.searchText.getText();
        try{
            db.prestmt = db.con.prepareStatement("select s.stock_id,s.product_name,s.available,u.username,s.price from stock s,users u where product_name like ? and u.uid=(select uid from farmer where farmer_id=s.farmer_id)");
            db.prestmt.setString(1,prdct+"%");
            db.rs = db.prestmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel)Results.getModel();
            model.setRowCount(0);
            while(db.rs.next()){
                model.addRow(new Object[]{false,db.rs.getInt("stock_id"),db.rs.getString("product_name"),db.rs.getFloat("available"),db.rs.getString("username"),db.rs.getFloat("price")});
            }
            if(model.getRowCount()==0){
                throw new Exception("'"+prdct+"' not found!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"Not Found", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)Results.getModel();
        boolean flag=false;
        for(int i=0; i<model.getRowCount(); i++){
            if((Boolean)model.getValueAt(i,0)){
                flag=true;
                String farmerName = (String)model.getValueAt(i,4);
                int stkid = (Integer)model.getValueAt(i,1);                
                try {
                    float qtt = (float)model.getValueAt(i,6);
                    if(qtt<=0)
                        throw new NullPointerException();
                    db.prestmt = db.con.prepareStatement("insert into cart(customer_id,farmer_id,stock_id,quantity) values(?,(select farmer_id from farmer f,users u where f.uid=u.uid and u.username=?),?,?)");
                    db.prestmt.setInt(1, sess.typeid);
                    db.prestmt.setString(2, farmerName);
                    db.prestmt.setInt(3, stkid);
                    db.prestmt.setFloat(4, qtt);
                    db.rs = db.prestmt.executeQuery();
                }
                catch (NullPointerException e){
                    JOptionPane.showMessageDialog(this, "Press Enter on entering correct Quantity.","Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        if(flag){
            JOptionPane.showMessageDialog(this, "Item(s) Added.");
        }
        else
            JOptionPane.showMessageDialog(this, "None Selected.","Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_addtocartActionPerformed

    private void viewCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCartActionPerformed
        // TODO add your handling code here:
        Cart crt = new Cart(sess);
        crt.setVisible(true);
    }//GEN-LAST:event_viewCartActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Results;
    private javax.swing.JButton addtocart;
    private javax.swing.JLabel cuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton viewCart;
    // End of variables declaration//GEN-END:variables
}
