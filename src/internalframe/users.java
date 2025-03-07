/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalframe;

import config.connectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;




/**
 *
 * @author SCC-COLLEGE
 */
public class users extends javax.swing.JInternalFrame {

    /**
     * Creates new form users
     */
    public users() {
        initComponents();
        displayData();
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
   public void displayData(){
        try{
            connectDB dbc = new connectDB();
            ResultSet rs = dbc.getData("SELECT * FROM user");
           
            user_tbl.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sds = new javax.swing.JScrollPane();
        user_tbl = new javax.swing.JTable();

        jPanel1.setLayout(null);

        user_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sds.setViewportView(user_tbl);

        jPanel1.add(sds);
        sds.setBounds(10, 50, 480, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane sds;
    private javax.swing.JTable user_tbl;
    // End of variables declaration//GEN-END:variables
}
