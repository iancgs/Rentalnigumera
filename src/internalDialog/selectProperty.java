
package internalDialog;

import config.TenantSession;
import config.connectDB;
import java.awt.Window;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class selectProperty extends javax.swing.JPanel {

    public selectProperty() {
        initComponents();
        displayData();
    }
    
    public void displayData(){
        
        connectDB dbc = new connectDB();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM properties");         
           DefaultTableModel model = (DefaultTableModel)properties_tbl.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{rs.getString(2), 
                   rs.getString(3), 
                   rs.getString(4), 
                   rs.getString(5), 
                   rs.getString(6), 
                   rs.getString(7)});                     
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        in = new javax.swing.JTextField();
        out = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        proceedBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        properties_tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Select Property");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });
        jPanel1.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 210, 40));

        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });
        jPanel1.add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 210, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Move In Date ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Move out Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        proceedBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        proceedBtn.setText("Submit");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });
        jPanel1.add(proceedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 130, 50));

        properties_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Compound", "Capacity", "Rent Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(properties_tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 440, 290));

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        jLabel2.setText("yy-mm-dd");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outActionPerformed

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        String In = in.getText().trim();
        String Out = out.getText().trim();
        
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//        try {
//            LocalDate.parse(In, formatter);
//        } catch (DateTimeParseException e) {
//            JOptionPane.showMessageDialog(null, "Invalid date format for 'In'. Please use yyyy-MM-dd.");
//            return;
//        }
//
//        try {
//            LocalDate.parse(Out, formatter);
//        } catch (DateTimeParseException e) {
//            JOptionPane.showMessageDialog(null, "Invalid date format for 'Out'. Please use yyyy-MM-dd.");
//            return;
//        }
        
        TenantSession session = TenantSession.getInstance();
        
        session.setMoveInDate(In);
        session.setMoveOutDate(Out);
        
        System.out.println("Out: " + In);
        System.out.println("In: " + Out);
        
        JOptionPane.showMessageDialog(null, "Proceeding...");
        
         Window parentWindow = SwingUtilities.getWindowAncestor(this);
        if (parentWindow instanceof JDialog) {
            parentWindow.dispose();
        }

        review spPanel = new review();
        JDialog dialog = new JDialog(); 
        dialog.setTitle("Select Property");
        dialog.setModal(true); 
        dialog.setContentPane(spPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = properties_tbl.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a property first.");
            return;
        }

        String Name = properties_tbl.getValueAt(selectedRow, 0).toString();
        String Type = properties_tbl.getValueAt(selectedRow, 1).toString();
        String Compound = properties_tbl.getValueAt(selectedRow, 2).toString();
        String Capacity = properties_tbl.getValueAt(selectedRow, 3).toString();
        String Price = properties_tbl.getValueAt(selectedRow, 4).toString();
        
        TenantSession session = TenantSession.getInstance();

        session.setPname(Name);
        session.setPtype(Type);
        session.setPcompound(Compound);
        session.setPcapacity(Capacity);
        session.setPprice(Price);

        JOptionPane.showMessageDialog(this, 
            "Property \"" + Name + "\" has been successfully booked!", 
            "Booking Confirmed", 
            JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Name: " + Name);
        System.out.println("Type: " + Type);
        System.out.println("Compound: " + Compound);
        System.out.println("Capacity: " + Capacity);
        System.out.println("Price: " + Price);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField in;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField out;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JTable properties_tbl;
    // End of variables declaration//GEN-END:variables
}
