
package internalDialog;

import config.connectDB;
import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import rental.tracker.Register;

public class Adduser extends javax.swing.JDialog {
    private static Adduser instance;  

    public Adduser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
     public static void addUserDialog(JDesktopPane desktopPane) {
        if (instance == null) { // Create only if it doesn't exist
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(desktopPane);
            if (parentFrame != null) {
                instance = new Adduser(parentFrame, true);
                centerDialog(desktopPane); // Keep centering logic separate
            } else {
                System.err.println("Error: Parent frame not found!");
                return;
            }
        }

        // Restore if moved off-screen
        if (!instance.isVisible()) {
            centerDialog(desktopPane);
            instance.setVisible(true);
        }
    }
     // Helper method to center dialog
    private static void centerDialog(JDesktopPane desktopPane) {
        Point desktopLocation = desktopPane.getLocationOnScreen();
        int x = desktopLocation.x + (desktopPane.getWidth() - instance.getWidth()) / 2;
        int y = desktopLocation.y + (desktopPane.getHeight() - instance.getHeight()) / 2;
        instance.setLocation(x, y);
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        pw = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        em = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rl = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Add New User");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("First name :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 40));

        fn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 220, 40));

        ln.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 220, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Last name :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("User name :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 40));

        un.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 220, 40));

        pw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 220, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Password   :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 40));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 90, 30));

        em.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 220, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Email      :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 170, 70, 40));

        rl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jPanel3.add(rl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 220, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Role       :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 40));

        status.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Pending" }));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String fname = fn.getText();
    String lname = ln.getText();
    String uname = un.getText();
    String email = em.getText();
    String pass1 = pw.getText();

    // Validation: Check if any required fields are empty
    if (fname.isEmpty() || lname.isEmpty() || uname.isEmpty() || email.isEmpty() || pass1.isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Password validation: Minimum length of 8 characters
    if (pass1.length() < 8) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Email format validation
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);
    if (!matcher.matches()) {
        JOptionPane.showMessageDialog(null, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    connectDB con = new connectDB();
    Connection cn = con.getConnection();

    if (cn == null) {
        JOptionPane.showMessageDialog(null, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Check if email already exists
        String checkEmailSql = "SELECT COUNT(*) FROM user WHERE email = ?";
        try (PreparedStatement emailPst = cn.prepareStatement(checkEmailSql)) {
            emailPst.setString(1, email);
            ResultSet rsEmail = emailPst.executeQuery();
            if (rsEmail.next() && rsEmail.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Check if username already exists
        String checkUsernameSql = "SELECT COUNT(*) FROM user WHERE username = ?";
        try (PreparedStatement ps = cn.prepareStatement(checkUsernameSql)) {
            ps.setString(1, uname);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Username is already taken!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Insert new user securely (without password hashing)
        String insertQuery = "INSERT INTO user (f_name, l_name, username, email, role, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = cn.prepareStatement(insertQuery)) {
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, uname);
            pst.setString(4, email);
            pst.setString(5, rl.getSelectedItem().toString());  // Assuming role is being selected
            pst.setString(6, pass1);  // Store the plain password (not hashed)
            pst.setString(7, status.getSelectedItem().toString()); // Assuming status is being selected

            int result = pst.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "User registered successfully!");

                // Close the registration form (JDialog)
                JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                if (parentDialog != null) {
                    parentDialog.dispose();  // Closes the JDialog
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        // Improved error handling: Displaying a more user-friendly error message
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    } finally {
        try {
            if (cn != null) cn.close(); // Close database connection
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Adduser dialog = new Adduser(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField pw;
    private javax.swing.JComboBox<String> rl;
    public javax.swing.JComboBox<String> status;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables

}
