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
import javax.swing.JOptionPane;

/**
 *
 * @author Aayush Kanholikar
 */
public class percentage extends javax.swing.JFrame {

    /**
     * Creates new form percentage
     */
    public percentage() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 0, 60)); // NOI18N
        jLabel1.setText(" Attendance Percentage");

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "EM-III", "EIM", "EDC", "DLC", "ENAS", "SBL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
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
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jButton1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
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
            java.util.logging.Logger.getLogger(percentage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(percentage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(percentage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(percentage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new percentage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
