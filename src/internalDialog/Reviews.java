/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalDialog;

import config.TenantSession;
import config.connectDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author HP
 */
public class Reviews extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reviews
     */
    public Reviews() {
        initComponents();
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bd = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pp = new javax.swing.JLabel();
        pn = new javax.swing.JLabel();
        pt = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        pcp = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        out = new javax.swing.JLabel();
        in = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tenant Details :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 3, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Property Details :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Birthdate:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Move Out Date: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contact Number:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        bd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 260, 20));

        fn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 20));

        cn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 20));

        em.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Gender:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        gen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Type:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Compound:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Capacity:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Moved Details :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 280, 40));

        pp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 200, 20));

        pn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 20));

        pt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 20));

        pc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 200, 20));

        pcp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(pcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 200, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Price:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Move In Date: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        out.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 200, 20));

        in.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 200, 20));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        TenantSession session = TenantSession.getInstance();
        fn.setText("" + session.getLastName()+"," +session.getFirstName() );
        cn.setText(""+session.getContact());
        em.setText(""+session.getEmail());
        gen.setText(""+session.getGender());
        bd.setText(""+session.getBirthdate());
        
        pn.setText(""+session.getPname());
        pt.setText(""+session.getPtype());
        pcp.setText(""+session.getPcapacity());
        pc.setText(""+session.getPcompound());
        pp.setText(""+session.getPprice());
        
        in.setText(""+session.getMoveInDate());
        out.setText(""+session.getMoveOutDate());
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Fname = fn.getText();
        String Contact = cn.getText();
        String Email = em.getText();
        String Gender = gen.getText();
        String Birthdate = bd.getText();

        String PropertyName = pn.getText();
        String PropertyType = pt.getText();
        String PropertyCapacity = pcp.getText();
        String PropertyCompound = pc.getText();
        String PropertyPrice = pp.getText();

        String MoveInDate = in.getText();
        String MoveOutDate = out.getText();


// 1. Gather input values
String fullName = fn.getText(); // Assuming fn = full name (e.g., "Doe, John")
String contact = cn.getText();
String email = em.getText();
String gender = gen.getText();
String birthdate = bd.getText(); // yyyy-MM-dd
String moveIn = in.getText();    // yyyy-MM-dd
String moveOut = out.getText();  // yyyy-MM-dd

// Property ID — make sure this is correct; you may need to get it from session or DB
int propertyId = 1; // Example only

// 2. Insert SQL
String sql = "INSERT INTO tenant (full_name, contact_number, email, gender, birthdate, status, property_id, move_in_date, move_out_date) " +
             "VALUES (?, ?, ?, ?, ?, 'Active', ?, ?, ?)";

try {
    // 3. Use your connectDB class
    connectDB db = new connectDB();
    Connection conn = db.getConnection();
    
    PreparedStatement pstmt = conn.prepareStatement(sql);

    // 4. Set values
    pstmt.setString(1, fullName);
    pstmt.setString(2, contact);
    pstmt.setString(3, email);
    pstmt.setString(4, gender);
    pstmt.setDate(5, Date.valueOf(birthdate));
    pstmt.setInt(6, propertyId);
    pstmt.setDate(7, Date.valueOf(moveIn));
    pstmt.setDate(8, Date.valueOf(moveOut));

    // 5. Execute and confirm
    int result = pstmt.executeUpdate();
    if (result > 0) {
        JOptionPane.showMessageDialog(null, "Tenant successfully inserted!");
    }

    // 6. Close
    pstmt.close();
    conn.close();

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Insert failed: " + e.getMessage());
}


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bd;
    private javax.swing.JLabel cn;
    private javax.swing.JLabel em;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel gen;
    private javax.swing.JLabel in;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel out;
    private javax.swing.JLabel pc;
    private javax.swing.JLabel pcp;
    private javax.swing.JLabel pn;
    private javax.swing.JLabel pp;
    private javax.swing.JLabel pt;
    // End of variables declaration//GEN-END:variables
}
