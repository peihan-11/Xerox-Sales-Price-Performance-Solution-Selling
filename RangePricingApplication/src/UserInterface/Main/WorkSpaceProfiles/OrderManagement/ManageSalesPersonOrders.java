/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main.WorkSpaceProfiles.OrderManagement;

import UserInterface.ProductManagement.*;
import TheBusiness.Business.Business;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.Supplier.Supplier;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kal bugrara
 */
public class ManageSalesPersonOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    Supplier selectedsupplier;
    Product selectedproduct;

    public ManageSalesPersonOrders(Business bz, JPanel jp) {
        CardSequencePanel = jp;
        this.business = bz;
        initComponents();
        popuate();
 

    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
           // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
           private void initComponents() {

                      Back = new javax.swing.JButton();
                      Next = new javax.swing.JButton();
                      jScrollPane2 = new javax.swing.JScrollPane();
                      jScrollPane1 = new javax.swing.JScrollPane();
                      SupplierCatalogTable = new javax.swing.JTable();
                      jLabel2 = new javax.swing.JLabel();
                      jLabel8 = new javax.swing.JLabel();

                      setBackground(new java.awt.Color(0, 153, 204));
                      setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                      Back.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      Back.setText("<< Back");
                      Back.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            BackActionPerformed(evt);
                                 }
                      });
                      add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 110, -1));

                      Next.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      Next.setText("Next >>");
                      Next.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            NextActionPerformed(evt);
                                 }
                      });
                      add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 100, -1));

                      SupplierCatalogTable.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      SupplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
                                 new Object [][] {

                                 },
                                 new String [] {
                                            "Order id", "Status", "Sales Volume", "Customer"
                                 }
                      ) {
                                 boolean[] canEdit = new boolean [] {
                                            false, false, false, false
                                 };

                                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                                            return canEdit [columnIndex];
                                 }
                      });
                      SupplierCatalogTable.addMouseListener(new java.awt.event.MouseAdapter() {
                                 public void mouseEntered(java.awt.event.MouseEvent evt) {
                                            SupplierCatalogTableMouseEntered(evt);
                                 }
                                 public void mousePressed(java.awt.event.MouseEvent evt) {
                                            SupplierCatalogTableMousePressed(evt);
                                 }
                      });
                      jScrollPane1.setViewportView(SupplierCatalogTable);

                      jScrollPane2.setViewportView(jScrollPane1);

                      add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 123, 760, 340));

                      jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
                      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      jLabel2.setText("BROWSE ORDERS");
                      add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, -1));

                      jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel8.setText("Orders");
                      add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));
           }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_BackActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        
 
    }//GEN-LAST:event_NextActionPerformed

    private void SupplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMousePressed
        // TODO add your handling code 
    }//GEN-LAST:event_SupplierCatalogTableMousePressed

    private void SupplierCatalogTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierCatalogTableMouseEntered


           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JButton Back;
           private javax.swing.JButton Next;
           private javax.swing.JTable SupplierCatalogTable;
           private javax.swing.JLabel jLabel2;
           private javax.swing.JLabel jLabel8;
           private javax.swing.JScrollPane jScrollPane1;
           private javax.swing.JScrollPane jScrollPane2;
           // End of variables declaration//GEN-END:variables

    private void popuate() {
        MasterOrderList mol = business.getMasterOrderList();
        int i=1;
        for(Order o:mol.getOrders()){

                Object[] row = new Object[5];
                row[0] = i;
                i++;
                row[1] = o.getStatus();
                row[2] = o.getOrderPricePerformance();
                row[3] = o.getCustomer().getCustomerId();

                ((DefaultTableModel) SupplierCatalogTable.getModel()).addRow(row);
            
        }
    }

}