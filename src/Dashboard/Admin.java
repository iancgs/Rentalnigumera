
package Dashboard;


import AdminInternalPage.Payment;
import AdminInternalPage.Property;
import AdminInternalPage.Tenant;
import AdminInternalPage.home;
import AdminInternalPage.users;
import java.awt.Color;
import javax.swing.JOptionPane;
import rental.tracker.login;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        showHomePage();
    }
    private void showHomePage() {
        home home = new home();
        mainDesktop.add(home);
        home.setVisible(true);
          
    }
        Color navcolor = new Color(204,204,204);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(255,255,255);
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tenanttBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        userBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        propertyBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mainDesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(968, 616));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/design(1)(1).jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 100));

        tenanttBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenanttBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tenanttBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tenanttBtnMouseExited(evt);
            }
        });
        tenanttBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tenant");
        tenanttBtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 50));

        jPanel2.add(tenanttBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 150, 50));

        homeBtn.setBackground(new java.awt.Color(255, 255, 255));
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
        });
        homeBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Home");
        homeBtn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 50));

        jPanel2.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 50));

        userBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userBtnMouseExited(evt);
            }
        });
        userBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("User");
        userBtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 50));

        jPanel2.add(userBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 50));

        propertyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                propertyBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                propertyBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                propertyBtnMouseExited(evt);
            }
        });
        propertyBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Property");
        propertyBtn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 50));

        jPanel2.add(propertyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 50));

        logout_button.setText("Log out");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 100, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 230, 620);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Admin ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, 40));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(230, 0, 740, 110);

        javax.swing.GroupLayout mainDesktopLayout = new javax.swing.GroupLayout(mainDesktop);
        mainDesktop.setLayout(mainDesktopLayout);
        mainDesktopLayout.setHorizontalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        mainDesktopLayout.setVerticalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(mainDesktop);
        mainDesktop.setBounds(230, 110, 740, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBtnMouseClicked
        users us = new users(); 
        mainDesktop.add(us).setVisible(true);
    }//GEN-LAST:event_userBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        home hm = new home();
        mainDesktop.add(hm).setVisible(true);
    }//GEN-LAST:event_homeBtnMouseClicked

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        login login = new login();

        // Show confirmation dialog
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // If the user clicks "Yes"
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Logging out", "Log", JOptionPane.INFORMATION_MESSAGE);
            login.setVisible(true);
            this.dispose();
        } else {
            // If the user clicks "No", you can optionally add a message here or do nothing
            JOptionPane.showMessageDialog(null, "You chose to stay logged in.", "Log Out Canceled", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void propertyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertyBtnMouseClicked
        Property pr = new Property();
        mainDesktop.add(pr).setVisible(true);
    }//GEN-LAST:event_propertyBtnMouseClicked

    private void tenanttBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenanttBtnMouseClicked
        Tenant tn = new Tenant();
        mainDesktop.add(tn).setVisible(true);
    }//GEN-LAST:event_tenanttBtnMouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(navcolor);
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(bodycolor);
    }//GEN-LAST:event_homeBtnMouseExited

    private void userBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBtnMouseEntered
        userBtn.setBackground(navcolor);
    }//GEN-LAST:event_userBtnMouseEntered

    private void userBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBtnMouseExited
         userBtn.setBackground(bodycolor);
    }//GEN-LAST:event_userBtnMouseExited

    private void propertyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertyBtnMouseEntered
        propertyBtn.setBackground(navcolor);
    }//GEN-LAST:event_propertyBtnMouseEntered

    private void propertyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertyBtnMouseExited
         propertyBtn.setBackground(bodycolor);
    }//GEN-LAST:event_propertyBtnMouseExited

    private void tenanttBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenanttBtnMouseExited
         tenanttBtn.setBackground(bodycolor);
    }//GEN-LAST:event_tenanttBtnMouseExited

    private void tenanttBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenanttBtnMouseEntered
        tenanttBtn.setBackground(navcolor);
    }//GEN-LAST:event_tenanttBtnMouseEntered

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout_button;
    private javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JPanel propertyBtn;
    private javax.swing.JPanel tenanttBtn;
    private javax.swing.JPanel userBtn;
    // End of variables declaration//GEN-END:variables
}
