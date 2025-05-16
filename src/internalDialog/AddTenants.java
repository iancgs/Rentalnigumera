
package internalDialog;

import config.TenantSession;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class AddTenants extends javax.swing.JInternalFrame {

    public AddTenants() {
        initComponents();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        bd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        proceedBtn = new javax.swing.JButton();
        gen = new javax.swing.JComboBox<>();
        bdValidation = new javax.swing.JLabel();
        fnValidation = new javax.swing.JLabel();
        lnValidation = new javax.swing.JLabel();
        cnValidation = new javax.swing.JLabel();
        emValidation = new javax.swing.JLabel();
        genValidation = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add Tenant Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 270, 50));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 112, 270, 50));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 270, 50));

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel1.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 270, 50));

        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });
        jPanel1.add(bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 270, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Birthdate");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Contact Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        proceedBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        proceedBtn.setText("Proceed");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });
        jPanel1.add(proceedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 130, 50));

        gen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 270, 50));
        jPanel1.add(bdValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 270, 20));
        jPanel1.add(fnValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 160, 270, 20));
        jPanel1.add(lnValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 270, 20));
        jPanel1.add(cnValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 270, 20));
        jPanel1.add(emValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 270, 20));
        jPanel1.add(genValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 270, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdActionPerformed

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed

        String first = fn.getText().trim();
        String last = ln.getText().trim();
        String contact = cn.getText().trim();
        String emailVal = em.getText().trim();
        String genderVal = gen.getSelectedItem().toString();
        String birth = bd.getText().trim();

                fnValidation.setText("");
        
                boolean hasError = false;
        
                if (first.isEmpty()) {
                        fnValidation.setText("First name is required.");
                        fnValidation.setForeground(Color.RED);
                        hasError = true;
                    }
        
                if (last.isEmpty()) {
                        lnValidation.setText("Last name is required.");
                        lnValidation.setForeground(Color.RED);
                        hasError = true;
                    }
        
                if (contact.isEmpty()) {
                        cnValidation.setText("Contact number is required.");
                        cnValidation.setForeground(Color.RED);
                        hasError = true;
                    }
        
                if (emailVal.isEmpty()) {
                        emValidation.setText("Email is required.");
                        emValidation.setForeground(Color.RED);
                        hasError = true;
                    }
        
                if (genderVal.equals("Select")) {
                        genValidation.setText("Please select a gender.");
                        genValidation.setForeground(Color.RED);
                        hasError = true;
                    }
        
                if (birth.isEmpty()) {
                        bdValidation.setText("Birthdate is required.");
                        bdValidation.setForeground(Color.RED);
                        hasError = true;
                    }
        
                if (hasError) {
                        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
        
                // Regex validations
                String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                if (!emailVal.matches(emailRegex)) {
                        JOptionPane.showMessageDialog(this, "Invalid email format.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
        
                String contactRegex = "^[0-9]{10,13}$";
                if (!contact.matches(contactRegex)) {
                        JOptionPane.showMessageDialog(this, "Contact number must be 10 to 13 digits.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
        
                String dateRegex = "^\\d{4}-\\d{2}-\\d{2}$";
                if (!birth.matches(dateRegex)) {
                        JOptionPane.showMessageDialog(this, "Birthdate must be in YYYY-MM-DD format.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

        // All validations passed
        TenantSession session = TenantSession.getInstance();
        session.setFirstName(first);
        session.setLastName(last);
        session.setContact(contact);
        session.setEmail(emailVal);
        session.setGender(genderVal);
        session.setBirthdate(birth);

        // Manual debug printout
        System.out.println("=== DEBUG: TenantSession Data ===");
        System.out.println("First Name: " + session.getFirstName());
        System.out.println("Last Name: " + session.getLastName());
        System.out.println("Contact: " + session.getContact());
        System.out.println("Email: " + session.getEmail());
        System.out.println("Gender: " + session.getGender());
        System.out.println("Birthdate: " + session.getBirthdate());
        System.out.println("=================================");

        JOptionPane.showMessageDialog(this, "Information saved. Proceeding...");

        SelectProperty sp = new SelectProperty();
        JDesktopPane desktopPane = this.getDesktopPane();

desktopPane.add(sp); // Add to the desktop pane
sp.setVisible(true); // Then make it visible

    }//GEN-LAST:event_proceedBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bd;
    private javax.swing.JLabel bdValidation;
    private javax.swing.JTextField cn;
    private javax.swing.JLabel cnValidation;
    private javax.swing.JTextField em;
    private javax.swing.JLabel emValidation;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel fnValidation;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JLabel genValidation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ln;
    private javax.swing.JLabel lnValidation;
    private javax.swing.JButton proceedBtn;
    // End of variables declaration//GEN-END:variables
}
