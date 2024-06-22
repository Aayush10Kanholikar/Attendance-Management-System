/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.management.system;

import static attendance.management.system.TeacherStartPage.jLabel4;
import static attendance.management.system.TeacherStartPage.jTextField1;
import static attendance.management.system.TeacherStartPage.jTextField2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush Kanholikar
 */
public class AllStudents extends javax.swing.JFrame {

    /**
     * Creates new form AllStudents
     */
    public AllStudents() {
        initComponents();
    }
String name, Rollno;

    public AllStudents(String val1, String val2)
    {
        initComponents();
        this.name=val1;
        this.Rollno=val2;
        
        AddDataToTable();
    }
    void AddDataToTable(){
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        Vector v = new Vector();
        v.add(name);
        v.add(Rollno);
        dt.addRow(v);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 0, 65)); // NOI18N
        jLabel1.setText(" All Students");

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Rollno", "Branch", "Address", "Phone", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setMinWidth(100);
            jTable2.getColumnModel().getColumn(5).setMinWidth(130);
        }

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(jButton1)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
        );

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
            jTextField2.setText(rs.getString("Subject"));     }
         
            if(i==0)
            { jTextField2.setText("");  } 



}
catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}String status = TeacherStartPage.jTextField1.getText();if(status.equals("DEACTIVATE"))
        {
            TeacherStartPage.jLabel4.setVisible(false); 
            TeacherStartPage.jTextField2.setVisible(false);
            jTextField2.setVisible(false);
jLabel4.setVisible(false);
TeacherStartPage.jCheckBox1.setEnabled(false);
TeacherStartPage.jCheckBox2.setEnabled(false);
TeacherStartPage.jCheckBox3.setEnabled(false);
TeacherStartPage.jCheckBox4.setEnabled(false);
TeacherStartPage.jCheckBox5.setEnabled(false);
TeacherStartPage.jCheckBox6.setEnabled(false);
        } else
        {
           TeacherStartPage.jLabel4.setVisible(true); 
            TeacherStartPage.jTextField2.setVisible(true);
            jTextField2.setVisible(true);
jLabel4.setVisible(true);
TeacherStartPage.jCheckBox1.setEnabled(true);
TeacherStartPage.jCheckBox2.setEnabled(true);
TeacherStartPage.jCheckBox3.setEnabled(true);
TeacherStartPage.jCheckBox4.setEnabled(true);
TeacherStartPage.jCheckBox5.setEnabled(true);
TeacherStartPage.jCheckBox6.setEnabled(true); 
        }

String subject = TeacherStartPage.jTextField2.getText();
if(subject.equals("EM"))
{
    TeacherStartPage.jCheckBox1.setSelected(true);
    TeacherStartPage.jCheckBox2.setSelected(false);
TeacherStartPage.jCheckBox3.setSelected(false);
TeacherStartPage.jCheckBox4.setSelected(false);
TeacherStartPage.jCheckBox5.setSelected(false);
TeacherStartPage.jCheckBox6.setSelected(false);
}
else if(subject.equals("EIM"))
{
   TeacherStartPage.jCheckBox1.setSelected(false);
    TeacherStartPage.jCheckBox2.setSelected(true);
    TeacherStartPage.jCheckBox3.setSelected(false);
TeacherStartPage.jCheckBox4.setSelected(false);
TeacherStartPage.jCheckBox5.setSelected(false);
TeacherStartPage.jCheckBox6.setSelected(false);
}
else if(subject.equals("EDC"))
{
    TeacherStartPage.jCheckBox1.setSelected(false);
    TeacherStartPage.jCheckBox2.setSelected(false);
    TeacherStartPage.jCheckBox3.setSelected(true);
    TeacherStartPage.jCheckBox4.setSelected(false);
TeacherStartPage.jCheckBox5.setSelected(false);
TeacherStartPage.jCheckBox6.setSelected(false);
}
else if(subject.equals("DLC"))
{
   TeacherStartPage.jCheckBox1.setSelected(false);
    TeacherStartPage.jCheckBox2.setSelected(false);
TeacherStartPage.jCheckBox3.setSelected(false);
    TeacherStartPage.jCheckBox4.setSelected(true);
    TeacherStartPage.jCheckBox5.setSelected(false);
TeacherStartPage.jCheckBox6.setSelected(false);
}
else if(subject.equals("ENAS"))
{
    TeacherStartPage.jCheckBox1.setSelected(false);
    TeacherStartPage.jCheckBox2.setSelected(false);
TeacherStartPage.jCheckBox3.setSelected(false);
TeacherStartPage.jCheckBox4.setSelected(false);
    TeacherStartPage.jCheckBox5.setSelected(true);
    TeacherStartPage.jCheckBox6.setSelected(false);
}
else if(subject.equals("SBL"))
{
    TeacherStartPage.jCheckBox1.setSelected(false);
    TeacherStartPage.jCheckBox2.setSelected(false);
TeacherStartPage.jCheckBox3.setSelected(false);
TeacherStartPage.jCheckBox4.setSelected(false);
TeacherStartPage.jCheckBox5.setSelected(false);
    TeacherStartPage.jCheckBox6.setSelected(true);
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
            java.util.logging.Logger.getLogger(AllStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
