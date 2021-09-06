/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drugstoremanagement;

import CustomUI.Themes;
import drugstoremanagement.controllers.CPController;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;

/**
 *
 * @author b
 */
public class ControlPanel extends javax.swing.JFrame {

    /**
     * Creates new form ControlPanel
     */
    public ControlPanel() {
        initComponents();
        CPController.activeMenu = menuDashboard;
        CPController.headerTitle = headerTitle;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel3 = new javax.swing.JPanel();
        headerTitle = new javax.swing.JLabel();
        bottomParent = new javax.swing.JPanel();
        holderMenus = new javax.swing.JPanel();
        menuDashboard = new javax.swing.JPanel();
        lbDashboard = new javax.swing.JLabel();
        menuDrugSale = new javax.swing.JPanel();
        lbDrugSale = new javax.swing.JLabel();
        menuExpiring = new javax.swing.JPanel();
        lbExpiring = new javax.swing.JLabel();
        menuInventory = new javax.swing.JPanel();
        lbInventory = new javax.swing.JLabel();
        menuExpired = new javax.swing.JPanel();
        lbExpired = new javax.swing.JLabel();
        menuDrugIn = new javax.swing.JPanel();
        lbDrugIn = new javax.swing.JLabel();
        drugInFrame = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        drugSaleFrame = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        expiringFrame = new javax.swing.JInternalFrame();
        expiredFrame = new javax.swing.JInternalFrame();
        dashboardFrame = new javax.swing.JInternalFrame();
        inventoryFrame = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel3.setBackground(new java.awt.Color(1, 113, 130));

        headerTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        headerTitle.setForeground(new java.awt.Color(255, 255, 255));
        headerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerTitle.setText("   Dashboard");
        headerTitle.setIconTextGap(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(headerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bottomParent.setBackground(new java.awt.Color(204, 204, 204));
        bottomParent.setPreferredSize(new java.awt.Dimension(1366, 768));
        bottomParent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        holderMenus.setBackground(new java.awt.Color(153, 153, 153));
        holderMenus.setMinimumSize(new java.awt.Dimension(150, 1023));
        holderMenus.setPreferredSize(new java.awt.Dimension(250, 1023));
        holderMenus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuDashboard.setBackground(new java.awt.Color(50, 50, 50));
        menuDashboard.setMinimumSize(new java.awt.Dimension(250, 50));
        menuDashboard.setPreferredSize(new java.awt.Dimension(250, 80));

        lbDashboard.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lbDashboard.setForeground(new java.awt.Color(250, 250, 250));
        lbDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstoremanagement/images/dashboard.png"))); // NOI18N
        lbDashboard.setText("   Dashboard");
        lbDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDashboardMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbDashboardMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbDashboardMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout menuDashboardLayout = new javax.swing.GroupLayout(menuDashboard);
        menuDashboard.setLayout(menuDashboardLayout);
        menuDashboardLayout.setHorizontalGroup(
            menuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDashboardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        menuDashboardLayout.setVerticalGroup(
            menuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        holderMenus.add(menuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 70));

        menuDrugSale.setBackground(new java.awt.Color(153, 153, 153));
        menuDrugSale.setMinimumSize(new java.awt.Dimension(250, 50));
        menuDrugSale.setPreferredSize(new java.awt.Dimension(250, 80));

        lbDrugSale.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lbDrugSale.setForeground(new java.awt.Color(250, 250, 250));
        lbDrugSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstoremanagement/images/house.png"))); // NOI18N
        lbDrugSale.setText("   Drug Sale");
        lbDrugSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbDrugSaleMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbDrugSaleMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout menuDrugSaleLayout = new javax.swing.GroupLayout(menuDrugSale);
        menuDrugSale.setLayout(menuDrugSaleLayout);
        menuDrugSaleLayout.setHorizontalGroup(
            menuDrugSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuDrugSaleLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(lbDrugSale, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuDrugSaleLayout.setVerticalGroup(
            menuDrugSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDrugSale, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        holderMenus.add(menuDrugSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, 70));

        menuExpiring.setBackground(new java.awt.Color(153, 153, 153));
        menuExpiring.setMinimumSize(new java.awt.Dimension(250, 50));
        menuExpiring.setPreferredSize(new java.awt.Dimension(250, 80));

        lbExpiring.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lbExpiring.setForeground(new java.awt.Color(250, 250, 250));
        lbExpiring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstoremanagement/images/shelf-life.png"))); // NOI18N
        lbExpiring.setText("   Expiring");
        lbExpiring.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExpiringMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbExpiringMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbExpiringMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout menuExpiringLayout = new javax.swing.GroupLayout(menuExpiring);
        menuExpiring.setLayout(menuExpiringLayout);
        menuExpiringLayout.setHorizontalGroup(
            menuExpiringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuExpiringLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lbExpiring, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuExpiringLayout.setVerticalGroup(
            menuExpiringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExpiring, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        holderMenus.add(menuExpiring, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 70));

        menuInventory.setBackground(new java.awt.Color(153, 153, 153));
        menuInventory.setMinimumSize(new java.awt.Dimension(250, 50));
        menuInventory.setPreferredSize(new java.awt.Dimension(250, 80));
        menuInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuInventoryMouseEntered(evt);
            }
        });

        lbInventory.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lbInventory.setForeground(new java.awt.Color(250, 250, 250));
        lbInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstoremanagement/images/prescription.png"))); // NOI18N
        lbInventory.setText("   Inventory");
        lbInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbInventoryMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInventoryMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbInventoryMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbInventoryMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout menuInventoryLayout = new javax.swing.GroupLayout(menuInventory);
        menuInventory.setLayout(menuInventoryLayout);
        menuInventoryLayout.setHorizontalGroup(
            menuInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuInventoryLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lbInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuInventoryLayout.setVerticalGroup(
            menuInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbInventory, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        holderMenus.add(menuInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 70));

        menuExpired.setBackground(new java.awt.Color(153, 153, 153));
        menuExpired.setMinimumSize(new java.awt.Dimension(250, 50));
        menuExpired.setPreferredSize(new java.awt.Dimension(250, 80));

        lbExpired.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lbExpired.setForeground(new java.awt.Color(250, 250, 250));
        lbExpired.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstoremanagement/images/expired.png"))); // NOI18N
        lbExpired.setText("   Expired");
        lbExpired.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExpiredMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbExpiredMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbExpiredMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout menuExpiredLayout = new javax.swing.GroupLayout(menuExpired);
        menuExpired.setLayout(menuExpiredLayout);
        menuExpiredLayout.setHorizontalGroup(
            menuExpiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuExpiredLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lbExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuExpiredLayout.setVerticalGroup(
            menuExpiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExpired, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        holderMenus.add(menuExpired, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, 70));

        menuDrugIn.setBackground(new java.awt.Color(153, 153, 153));
        menuDrugIn.setMinimumSize(new java.awt.Dimension(250, 50));
        menuDrugIn.setPreferredSize(new java.awt.Dimension(250, 80));

        lbDrugIn.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lbDrugIn.setForeground(new java.awt.Color(250, 250, 250));
        lbDrugIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstoremanagement/images/expired.png"))); // NOI18N
        lbDrugIn.setText("  Drug In");
        lbDrugIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDrugInMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbDrugInMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbDrugInMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout menuDrugInLayout = new javax.swing.GroupLayout(menuDrugIn);
        menuDrugIn.setLayout(menuDrugInLayout);
        menuDrugInLayout.setHorizontalGroup(
            menuDrugInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuDrugInLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lbDrugIn, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuDrugInLayout.setVerticalGroup(
            menuDrugInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDrugIn, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        holderMenus.add(menuDrugIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, 70));

        bottomParent.add(holderMenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1070));

        drugInFrame.setOpaque(false);
        drugInFrame.setVisible(true);
        drugInFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Drug in");
        drugInFrame.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        bottomParent.add(drugInFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, 1380, 1000));

        drugSaleFrame.setOpaque(false);
        drugSaleFrame.setVisible(true);
        drugSaleFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Dashboard");
        drugSaleFrame.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        bottomParent.add(drugSaleFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, 1380, 1000));

        expiringFrame.setOpaque(false);
        expiringFrame.setVisible(true);
        expiringFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bottomParent.add(expiringFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, 1380, 1000));

        expiredFrame.setOpaque(false);
        expiredFrame.setVisible(true);
        expiredFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bottomParent.add(expiredFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, 1380, 1000));

        dashboardFrame.setOpaque(false);
        dashboardFrame.setPreferredSize(new java.awt.Dimension(1366, 768));
        dashboardFrame.setVisible(true);

        javax.swing.GroupLayout dashboardFrameLayout = new javax.swing.GroupLayout(dashboardFrame.getContentPane());
        dashboardFrame.getContentPane().setLayout(dashboardFrameLayout);
        dashboardFrameLayout.setHorizontalGroup(
            dashboardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1368, Short.MAX_VALUE)
        );
        dashboardFrameLayout.setVerticalGroup(
            dashboardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 969, Short.MAX_VALUE)
        );

        bottomParent.add(dashboardFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, 1380, 1000));

        inventoryFrame.setOpaque(false);
        inventoryFrame.setVisible(true);
        inventoryFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("inventory frame");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        inventoryFrame.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        bottomParent.add(inventoryFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, 1380, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bottomParent, javax.swing.GroupLayout.PREFERRED_SIZE, 1606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomParent, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInventoryMouseClicked
        CPController.clicked(evt, inventoryFrame);
     
    }//GEN-LAST:event_lbInventoryMouseClicked

    private void lbDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseClicked
        CPController.clicked(evt,dashboardFrame);
        
    }//GEN-LAST:event_lbDashboardMouseClicked

    private void menuInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInventoryMouseEntered
         CPController.entered(evt);
         
    }//GEN-LAST:event_menuInventoryMouseEntered

    private void lbInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInventoryMouseEntered
        
        CPController.entered(evt);        
    }//GEN-LAST:event_lbInventoryMouseEntered

    private void lbInventoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInventoryMouseReleased
           
    }//GEN-LAST:event_lbInventoryMouseReleased

    private void lbInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInventoryMouseExited
        CPController.exited(evt);
    }//GEN-LAST:event_lbInventoryMouseExited

    private void lbDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseEntered
        CPController.entered(evt);
    }//GEN-LAST:event_lbDashboardMouseEntered

    private void lbDrugInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDrugInMouseClicked
        CPController.clicked(evt,drugInFrame);
    }//GEN-LAST:event_lbDrugInMouseClicked

    private void lbDrugInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDrugInMouseEntered
        CPController.entered(evt);
    }//GEN-LAST:event_lbDrugInMouseEntered

    private void lbDrugSaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDrugSaleMouseEntered
        CPController.entered(evt);
    }//GEN-LAST:event_lbDrugSaleMouseEntered

    private void lbExpiringMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExpiringMouseEntered
        CPController.entered(evt);
    }//GEN-LAST:event_lbExpiringMouseEntered

    private void lbDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseExited
        CPController.exited(evt);
    }//GEN-LAST:event_lbDashboardMouseExited

    private void lbDrugInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDrugInMouseExited
        CPController.exited(evt);
    }//GEN-LAST:event_lbDrugInMouseExited

    private void lbDrugSaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDrugSaleMouseExited
        CPController.exited(evt);
    }//GEN-LAST:event_lbDrugSaleMouseExited

    private void lbExpiringMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExpiringMouseExited
        CPController.exited(evt);
    }//GEN-LAST:event_lbExpiringMouseExited

    private void lbExpiredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExpiredMouseClicked
        CPController.clicked(evt,expiredFrame);
    }//GEN-LAST:event_lbExpiredMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbExpiringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExpiringMouseClicked
        CPController.clicked(evt, expiringFrame);
    }//GEN-LAST:event_lbExpiringMouseClicked

    private void lbExpiredMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExpiredMouseEntered
        CPController.entered(evt);
    }//GEN-LAST:event_lbExpiredMouseEntered

    private void lbExpiredMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExpiredMouseExited
        CPController.exited(evt);
    }//GEN-LAST:event_lbExpiredMouseExited

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
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomParent;
    private javax.swing.JInternalFrame dashboardFrame;
    private javax.swing.JInternalFrame drugInFrame;
    private javax.swing.JInternalFrame drugSaleFrame;
    private javax.swing.JInternalFrame expiredFrame;
    private javax.swing.JInternalFrame expiringFrame;
    private javax.swing.JLabel headerTitle;
    private javax.swing.JPanel holderMenus;
    private javax.swing.JInternalFrame inventoryFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbDrugIn;
    private javax.swing.JLabel lbDrugSale;
    private javax.swing.JLabel lbExpired;
    private javax.swing.JLabel lbExpiring;
    private javax.swing.JLabel lbInventory;
    private javax.swing.JPanel menuDashboard;
    private javax.swing.JPanel menuDrugIn;
    private javax.swing.JPanel menuDrugSale;
    private javax.swing.JPanel menuExpired;
    private javax.swing.JPanel menuExpiring;
    private javax.swing.JPanel menuInventory;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables


}
