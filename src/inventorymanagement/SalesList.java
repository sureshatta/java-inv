/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SalesList.java
 *
 * Created on Jun 27, 2015, 12:26:17 AM
 */
package inventorymanagement;

import BusinessLayer.ItemBl;
import BusinessLayer.SalesBl;
import DatabaseLayer.GlobalConnection;
import ObjectFactory.ItemOF;
import ObjectFactory.SalesOF;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chhabi
 */
public class SalesList extends javax.swing.JInternalFrame {
    
    GlobalConnection db = new GlobalConnection();
    ArrayList<String> ar = new ArrayList<String>();
    
    /** Creates new form SalesList */
    public SalesList() {
        initComponents();
        
        // item name in combo box
        ItemBl it = new ItemBl();
        try{
            ArrayList<ItemOF> itm = it.getItemList();
            for( int i=0; i<itm.size(); ++i){
                cmbItemName.addItem(itm.get(i).getItem_name());
            }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        
        sale = new SalesOF();
        blsale = new SalesBl();
        DefaultTableModel dtm = new DefaultTableModel();
        try{
            dtm.addColumn("Id");
            dtm.addColumn("Customer Name");
            dtm.addColumn("Customer Address");
            dtm.addColumn("Date");
            dtm.addColumn("Bill No");
            dtm.addColumn("Rate");
            dtm.addColumn("Quantity");
            dtm.addColumn("Item Name");
                                    
            ArrayList<SalesOF> sales = blsale.getSalesList();
            for(int i=0; i<sales.size(); ++i ){
              Object[] data = { sales.get(i).getSales_id(), sales.get(i).getSales_customer_name(), sales.get(i).getSales_customer_address(), sales.get(i).getSales_date(), sales.get(i).getSales_bill_no(), sales.get(i).getSales_rate(), sales.get(i).getSales_quantity(), sales.get(i).getItem_name() };
              dtm.addRow(data);
            }
            tblSalesList.setModel(dtm);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSearchCustomerName = new javax.swing.JTextField();
        btnSalesSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesList = new javax.swing.JTable();
        btnSelectedSales = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSalesId = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        txtBillNo = new javax.swing.JTextField();
        txtSaleRate = new javax.swing.JTextField();
        txtSaleQuantity = new javax.swing.JTextField();
        btnSalesUpdate = new javax.swing.JButton();
        btnSalesDelete = new javax.swing.JButton();
        cmbItemName = new javax.swing.JComboBox();
        txtSalesDate = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update Sales List");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sales Detail List ");

        btnSalesSearch.setText("Search Sales");
        btnSalesSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesSearchActionPerformed(evt);
            }
        });

        tblSalesList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tblSalesList);

        btnSelectedSales.setText("Edit Selected Sales");
        btnSelectedSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectedSalesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Selected Sales Detail");

        jLabel3.setText("Sale Id : ");

        jLabel4.setText("Customer Name : ");

        jLabel5.setText("Customer Address : ");

        jLabel6.setText("Sales Date : ");

        jLabel7.setText("Bill No : ");

        jLabel8.setText("Sales Rate : ");

        jLabel9.setText("Sales Quantity : ");

        jLabel10.setText("Item Name : ");

        txtSalesId.setEditable(false);

        btnSalesUpdate.setText("Update");
        btnSalesUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesUpdateActionPerformed(evt);
            }
        });

        btnSalesDelete.setText("Delete");
        btnSalesDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesDeleteActionPerformed(evt);
            }
        });

        cmbItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearchCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(92, 92, 92)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSelectedSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalesSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCustomerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(txtCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(txtSalesId, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(77, 77, 77)
                                    .addComponent(txtSalesDate, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10))
                                    .addGap(76, 76, 76)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSaleRate, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(txtBillNo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(txtSaleQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(cmbItemName, 0, 132, Short.MAX_VALUE)
                                        .addComponent(btnSalesUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(btnSalesDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalesSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSelectedSales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalesId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtSalesDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtSaleRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSaleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalesUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalesDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cmbItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemNameActionPerformed
// TODO add your handling code here:
  
}//GEN-LAST:event_cmbItemNameActionPerformed

private void btnSelectedSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectedSalesActionPerformed
// TODO add your handling code here:
  try{
    
    String saleId    = tblSalesList.getValueAt(tblSalesList.getSelectedRow(), 0).toString();
    String custName  = tblSalesList.getValueAt(tblSalesList.getSelectedRow(), 1).toString();
    String custAdd   = tblSalesList.getValueAt(tblSalesList.getSelectedRow(), 2).toString();
    String saleDate  = tblSalesList.getValueAt(tblSalesList.getSelectedRow(), 3).toString();
    String saleBill  = tblSalesList.getValueAt(tblSalesList.getSelectedRow(), 4).toString();
    String saleRate  = tblSalesList.getValueAt(tblSalesList.getSelectedRow(), 5).toString();
    String saleQty   = tblSalesList.getValueAt(tblSalesList.getSelectedRow(), 6).toString();
    String itemName  = tblSalesList.getValueAt(tblSalesList.getSelectedRow(), 7).toString();
        
    txtSalesId.setText(saleId);
    txtCustomerName.setText(custName);
    txtCustomerAddress.setText(custAdd);
    
    // Date load in edit form
    SimpleDateFormat oFormat = new SimpleDateFormat("yyyy-MM-dd");
    txtSalesDate.setDate((Date)oFormat.parse(saleDate));
   
    txtBillNo.setText(saleBill);
    txtSaleRate.setText(saleRate);
    txtSaleQuantity.setText(saleQty);
    cmbItemName.setSelectedItem(itemName);
    
    }catch(Exception ex){
        JOptionPane.showMessageDialog(this, ex);
    }
    
}//GEN-LAST:event_btnSelectedSalesActionPerformed

private void btnSalesUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesUpdateActionPerformed
// TODO add your handling code here:
    
    try {
       sale = new SalesOF();
       sale.setSales_id(Integer.parseInt(txtSalesId.getText()));
       sale.setSales_customer_name( new String(txtCustomerName.getText())); 
       sale.setSales_customer_address( new String(txtCustomerAddress.getText()));
       
       Date dtt = txtSalesDate.getDate();
       SimpleDateFormat ftt = new SimpleDateFormat("yyyy-MM-dd");
       sale.setSales_date(ftt.format(dtt).toString());

       sale.setSales_bill_no(Integer.parseInt(txtBillNo.getText()));
       sale.setSales_rate(Integer.parseInt(txtSaleRate.getText()));
       sale.setSales_quantity(Integer.parseInt(txtSaleQuantity.getText()));
       sale.setItem_name(cmbItemName.getSelectedItem().toString());
       
       blsale = new SalesBl(sale);   
       if(blsale.updateSales()){
           JOptionPane.showMessageDialog(this, "Sales Updated Successfully", "Operation Successfull", JOptionPane.INFORMATION_MESSAGE);
           this.dispose();
           DashBoard.dashBoard.add( new CategoryList());
           
            }else{
                JOptionPane.showMessageDialog(this, "Unable to Update Sales", "Error Occured", JOptionPane.ERROR_MESSAGE);
            }
       
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
       }
    
}//GEN-LAST:event_btnSalesUpdateActionPerformed

private void btnSalesDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesDeleteActionPerformed
// TODO add your handling code here:
     try{
        sale = new SalesOF();
        sale.setSales_id(Integer.parseInt(txtSalesId.getText()));
        blsale = new SalesBl(sale);
        if(blsale.deleteSales()){
            JOptionPane.showMessageDialog(null, "Sales Item Deleted Successfully", "Operation Successfull", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            DashBoard.dashBoard.add( new CategoryList());
        }else{
            JOptionPane.showMessageDialog(this, "Unabale to Delete Sales Item", "Error Occured", JOptionPane.ERROR_MESSAGE );
        }
    }catch( Exception ex){
        JOptionPane.showMessageDialog(this,ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btnSalesDeleteActionPerformed

    private void btnSalesSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesSearchActionPerformed
        // TODO add your handling code here:
        try{
            sale.setSales_customer_name(txtSearchCustomerName.getText());
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Id");
            dtm.addColumn("Customer Name");            
            dtm.addColumn("Customer Address");
            dtm.addColumn("Date");
            dtm.addColumn("Bill No");
            dtm.addColumn("Rate");
            dtm.addColumn("Quantity");
            dtm.addColumn("Item Name");            
           
            blsale = new SalesBl(sale);
            ArrayList<SalesOF>sls = blsale.searchSales();
                if(sls.size() > 0){
                    for( int i=0; i<sls.size(); i++){
                        Object[] data = { sls.get(i).getSales_id(), sls.get(i).getSales_customer_name(),  sls.get(i).getSales_customer_address(), sls.get(i).getSales_date(), sls.get(i).getSales_bill_no(), sls.get(i).getSales_rate(), sls.get(i).getSales_quantity(),sls.get(i).getItem_name() };
                        dtm.addRow(data);                    
                    }
                    tblSalesList.setModel(dtm);
                
                }
                else{
                   Object[] date = {"","","","","","","",""};
                   JOptionPane.showMessageDialog(this, "No Sales Item FOund");
                   tblSalesList.setModel(dtm);
                }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);        
        }
    }//GEN-LAST:event_btnSalesSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalesDelete;
    private javax.swing.JButton btnSalesSearch;
    private javax.swing.JButton btnSalesUpdate;
    private javax.swing.JButton btnSelectedSales;
    private javax.swing.JComboBox cmbItemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalesList;
    private javax.swing.JTextField txtBillNo;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtSaleQuantity;
    private javax.swing.JTextField txtSaleRate;
    private com.toedter.calendar.JDateChooser txtSalesDate;
    private javax.swing.JTextField txtSalesId;
    private javax.swing.JTextField txtSearchCustomerName;
    // End of variables declaration//GEN-END:variables
    private SalesOF sale;
    private SalesBl blsale;
}