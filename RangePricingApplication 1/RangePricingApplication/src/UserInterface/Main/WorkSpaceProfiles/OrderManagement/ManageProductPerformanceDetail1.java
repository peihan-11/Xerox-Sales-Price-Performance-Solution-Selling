/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main.WorkSpaceProfiles.OrderManagement;

import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.Supplier.Supplier;
import javax.swing.JPanel;

/**
 *
 * @author kal bugrara
 */
public class ManageProductPerformanceDetail1 extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Supplier selectedsupplier;
    Product selectedproduct;

    public ManageProductPerformanceDetail1(Product product, JPanel jp) {

        CardSequencePanel = jp;
        this.selectedproduct = product;
        initComponents();
        refreshTable();

    }


    public void refreshTable() {

       
        ProductSummary productsummary = new ProductSummary(selectedproduct);

        productNameTextField.setText(selectedproduct.toString());
        String revenues = String.valueOf(productsummary.getSalesRevenues());
        productRevenueTextField.setText(revenues);
        productFrequencyAboveTargetTextField.setText( String.valueOf(productsummary.getNumberAboveTarget()));
        productFrequencyBelowTargetTextField.setText( String.valueOf(productsummary.getNumberBelowTarget()));
        productPricePerformanceTextField.setText(String.valueOf(productsummary.getProductPricePerformance()));

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
                      jLabel2 = new javax.swing.JLabel();
                      jLabel3 = new javax.swing.JLabel();
                      productNameTextField = new javax.swing.JTextField();
                      productFrequencyAboveTargetTextField = new javax.swing.JTextField();
                      jLabel4 = new javax.swing.JLabel();
                      productRevenueTextField = new javax.swing.JTextField();
                      jLabel5 = new javax.swing.JLabel();
                      productFrequencyBelowTargetTextField = new javax.swing.JTextField();
                      jLabel6 = new javax.swing.JLabel();
                      productPricePerformanceTextField = new javax.swing.JTextField();
                      jLabel7 = new javax.swing.JLabel();

                      setBackground(new java.awt.Color(0, 153, 153));
                      setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                      Back.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      Back.setText("<< Back");
                      Back.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            BackActionPerformed(evt);
                                 }
                      });
                      add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

                      jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
                      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                      jLabel2.setText("PRODUCT PERFORMANCE SUMMARY");
                      add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

                      jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel3.setText("Product name");
                      add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, -1));

                      productNameTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      productNameTextField.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            productNameTextFieldActionPerformed(evt);
                                 }
                      });
                      add(productNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, -1));

                      productFrequencyAboveTargetTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      add(productFrequencyAboveTargetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 220, -1));

                      jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel4.setText("Frequency Above Target");
                      add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 200, -1));

                      productRevenueTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      productRevenueTextField.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            productRevenueTextFieldActionPerformed(evt);
                                 }
                      });
                      add(productRevenueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

                      jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel5.setText("Sales Revenues");
                      add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, -1));

                      productFrequencyBelowTargetTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      add(productFrequencyBelowTargetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 220, -1));

                      jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel6.setText("Frequency Below Target");
                      add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 210, -1));

                      productPricePerformanceTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      productPricePerformanceTextField.addActionListener(new java.awt.event.ActionListener() {
                                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            productPricePerformanceTextFieldActionPerformed(evt);
                                 }
                      });
                      add(productPricePerformanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 220, -1));

                      jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                      jLabel7.setText("Marign around target");
                      add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 170, -1));
           }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);


    }//GEN-LAST:event_BackActionPerformed

    private void productNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTextFieldActionPerformed

    private void productRevenueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRevenueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRevenueTextFieldActionPerformed

    private void productPricePerformanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPricePerformanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPricePerformanceTextFieldActionPerformed


           // Variables declaration - do not modify//GEN-BEGIN:variables
           private javax.swing.JButton Back;
           private javax.swing.JLabel jLabel2;
           private javax.swing.JLabel jLabel3;
           private javax.swing.JLabel jLabel4;
           private javax.swing.JLabel jLabel5;
           private javax.swing.JLabel jLabel6;
           private javax.swing.JLabel jLabel7;
           private javax.swing.JTextField productFrequencyAboveTargetTextField;
           private javax.swing.JTextField productFrequencyBelowTargetTextField;
           private javax.swing.JTextField productNameTextField;
           private javax.swing.JTextField productPricePerformanceTextField;
           private javax.swing.JTextField productRevenueTextField;
           // End of variables declaration//GEN-END:variables

}