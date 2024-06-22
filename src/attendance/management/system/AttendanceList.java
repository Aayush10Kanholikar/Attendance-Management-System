/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.management.system;

import static attendance.management.system.TeacherStartPage.jTextField1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush Kanholikar
 */
public class AttendanceList extends javax.swing.JFrame {

    /**
     * Creates new form AttendanceList
     */
    public AttendanceList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Attendance List");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setText("Select Subject");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Subject", "EM-3", "EIM", "EDC", "DLC", "ENAS", "SBL" }));

        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        TeacherStartPage tsp = new TeacherStartPage();
        tsp.setVisible(true);
        
        
        PreparedStatement pst;
        ResultSet rs;
        
       
        try
    {
Class.forName("java.sql.DriverManager");
Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
Statement stmt = (Statement) con.createStatement();


           String Query ="select * from attendance_status where srno='1';";
            rs=stmt.executeQuery(Query); 
            int i=0;    
            while(rs.next())
            { 
                i++;
            jTextField1.setText(rs.getString("Status"));     }
         
            if(i==0)
            { jTextField1.setText("");  } 



}
catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        
        
         PreparedStatement pst;
        ResultSet rs;
        
         DefaultTableModel model = (DefaultTableModel)
                jTable1.getModel(); int rows=model.getRowCount();
        
        
        
        
        switch(jComboBox1.getSelectedIndex())
        {
            case 0 : 
                
                
                    if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
                
                JOptionPane.showMessageDialog(this,"Please Select Subject from list!!!"); break;
            
            case 1: 
            
           
                    if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
        
       
        try
    {
Class.forName("java.sql.DriverManager");
Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
Statement stmt = (Statement) con.createStatement();
String Query = "select Name, Status from em order by name;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    
                    String Status = rs.getString("Status");
                   
                 
                    
                    String tbData[] = {name,Status};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                    
                    jTable1.clearSelection();
                    
                }
       }
catch(Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}break;
            
            case 2: 
           
               
                    if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
                
                
                
        try
    {
Class.forName("java.sql.DriverManager");
Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
Statement stmt = (Statement) con.createStatement();
String Query = "select Name, Status from eim order by name;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    
                    String Status = rs.getString("Status");
                   
                 
                    
                    String tbData[] = {name,Status};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                    
                    jTable1.clearSelection();
                    
                }
       }
catch(Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}break;
            
            
            case 3: 
           
      
                    if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
       try
    {
Class.forName("java.sql.DriverManager");
Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
Statement stmt = (Statement) con.createStatement();
String Query = "select Name, Status from edc order by name;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    
                    String Status = rs.getString("Status");
                   
                 
                    
                    String tbData[] = {name,Status};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                    
                    jTable1.clearSelection();
                    
                }
       }
catch(Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}break;
            
            
            case 4: 
           
       if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
       
        try
    {
Class.forName("java.sql.DriverManager");
Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
Statement stmt = (Statement) con.createStatement();
String Query = "select Name, Status from dlc order by name;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    
                    String Status = rs.getString("Status");
                   
                 
                    
                    String tbData[] = {name,Status};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                    
                    jTable1.clearSelection();
                    
                }
       }
catch(Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}break;
            
            
            case 5: 
           
                if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
       
        try
    {
Class.forName("java.sql.DriverManager");
Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
Statement stmt = (Statement) con.createStatement();
String Query = "select Name, Status from enas order by name;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    
                    String Status = rs.getString("Status");
                   
                 
                    
                    String tbData[] = {name,Status};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                    
                    jTable1.clearSelection();
                    
                }
       }
catch(Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}break;
            
            case 6: 
           
                if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
       
       try
    {
Class.forName("java.sql.DriverManager");
Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
Statement stmt = (Statement) con.createStatement();
String Query = "select Name, Status from sbl order by name;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    
                    String Status = rs.getString("Status");
                   
                 
                    
                    String tbData[] = {name,Status};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                    
                    jTable1.clearSelection();
                    
                }
       }
catch(Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}break;
        
        default : 
            
            if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
            
            JOptionPane.showMessageDialog (this, "Please Select Subject from list!!!");break;
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AttendanceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
