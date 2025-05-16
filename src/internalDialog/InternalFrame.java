/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalDialog;

/**
 *
 * @author HP
 */
public class InternalFrame extends javax.swing.JPanel {

   
    public InternalFrame() {
        initComponents();
        DefaultPage();
    }
    
    private void DefaultPage() {
        
        AddTenants dp = new AddTenants();
        bookingDesktop.add(dp);
        dp.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookingDesktop = new javax.swing.JDesktopPane();

        bookingDesktop.setPreferredSize(new java.awt.Dimension(756, 550));

        javax.swing.GroupLayout bookingDesktopLayout = new javax.swing.GroupLayout(bookingDesktop);
        bookingDesktop.setLayout(bookingDesktopLayout);
        bookingDesktopLayout.setHorizontalGroup(
            bookingDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        bookingDesktopLayout.setVerticalGroup(
            bookingDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane bookingDesktop;
    // End of variables declaration//GEN-END:variables
}
