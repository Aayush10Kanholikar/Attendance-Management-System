/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.management.system;


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
public class ViewAttendance extends javax.swing.JFrame {

    /**
     * Creates new form ViewAttendance
     */
    public ViewAttendance() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 0, 50)); // NOI18N
        jLabel1.setText(" View Attendance ");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel3.setText("Attendance Percentage");

        jTextField1.setEditable(false);
        jTextField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField1MouseMoved(evt);
            }
        });

        jTextField2.setEditable(false);

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel4.setText("Subject ");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose subject", "EM-3", "EIM", "EDC", "DLC", "ENAS", "SBL" }));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Date and Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(356, 356, 356)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(261, 261, 261)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(508, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StudentStartPage ssp = new StudentStartPage();
        ssp.setVisible(true);
        StudentStartPage.jLabel1.setText("Welcome "+jTextField1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseMoved
        // TODO add your handling code here:
      
 
    }//GEN-LAST:event_jTextField1MouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     

        String name = jTextField1.getText();
       
               PreparedStatement pst;
        ResultSet rs;
        
         DefaultTableModel model = (DefaultTableModel)
                jTable2.getModel(); int rows=model.getRowCount();
        
        
        
        
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
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select status, date_time from em where name='"+name+"' order by date_time desc;";
rs = stmt.executeQuery(query);
while(rs.next())
{
String Status = rs.getString("status");
String date_time = rs.getString("date_time");
 

model.addRow (new Object[] {Status, date_time});
}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select  count(*) from em where name='"+name+"';";
rs = stmt.executeQuery(query);
while(rs.next())
{

 jTextField3.setText(rs.getString("count(*)"));


}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        double present, Result,percentage;
        present=Double.parseDouble(jTextField3.getText());
        percentage = present/30*100;
        Result=Math.round(percentage);
        jTextField2.setText(Double.toString(Result)+" %");
        
         try
{
    
     String Per = jTextField2.getText();
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="update percentage set em='"+Per+"' where Name='"+name+"';";
stmt.executeUpdate(query);




}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        
        
        break;
            
            case 2: 
           
               
                    if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
                
                
                
        try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select status, date_time from eim where name='"+name+"' order by date_time desc;";
rs = stmt.executeQuery(query);
while(rs.next())
{
String Status = rs.getString("status");
String date_time = rs.getString("date_time");

model.addRow (new Object[] {Status, date_time});
}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select  count(*) from eim where name='"+name+"';";
rs = stmt.executeQuery(query);
while(rs.next())
{

 jTextField3.setText(rs.getString("count(*)"));


}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
       
        present=Double.parseDouble(jTextField3.getText());
        percentage = present/30*100;
        Result=Math.round(percentage);
        jTextField2.setText(Double.toString(Result)+" %");
        
        try
{
    String Per = jTextField2.getText();
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="update percentage set eim='"+Per+"' where name='"+name+"';";
stmt.executeUpdate(query);
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        
        break;
            
            
            case 3: 
           
      
                    if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
        try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select status, date_time from edc where name='"+name+"' order by date_time desc;";
rs = stmt.executeQuery(query);
while(rs.next())
{
String Status = rs.getString("status");
String date_time = rs.getString("date_time");

model.addRow (new Object[] {Status, date_time});
}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select  count(*) from edc where name='"+name+"';";
rs = stmt.executeQuery(query);
while(rs.next())
{

 jTextField3.setText(rs.getString("count(*)"));


}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        present=Double.parseDouble(jTextField3.getText());
        percentage = present/30*100;
        Result=Math.round(percentage);
        jTextField2.setText(Double.toString(Result)+" %");
        try
{
    String Per = jTextField2.getText();
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="update percentage set edc='"+Per+"' where name='"+name+"';";

stmt.executeUpdate(query);
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        break;
            
            
            case 4: 
           
       if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
       
        try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select status, date_time from dlc where name='"+name+"' order by date_time desc;";
rs = stmt.executeQuery(query);
while(rs.next())
{
String Status = rs.getString("status");
String date_time = rs.getString("date_time");

model.addRow (new Object[] {Status, date_time});
}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select  count(*) from dlc where name='"+name+"';";
rs = stmt.executeQuery(query);
while(rs.next())
{

 jTextField3.setText(rs.getString("count(*)"));


}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
       present=Double.parseDouble(jTextField3.getText());
        percentage = present/30*100;
        Result=Math.round(percentage);
        jTextField2.setText(Double.toString(Result)+" %");
        try
{
    String Per = jTextField2.getText();
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="update percentage set dlc='"+Per+"' where name='"+name+"';";

stmt.executeUpdate(query);
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        break;
            
            
            case 5: 
           
                if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
       
        try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select status, date_time from enas where name='"+name+"' order by date_time desc;";
rs = stmt.executeQuery(query);
while(rs.next())
{
String Status = rs.getString("status");
String date_time = rs.getString("date_time");

model.addRow (new Object[] {Status, date_time});
}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select  count(*) from enas where name='"+name+"';";
rs = stmt.executeQuery(query);
while(rs.next())
{

 jTextField3.setText(rs.getString("count(*)"));


}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
       present=Double.parseDouble(jTextField3.getText());
        percentage = present/30*100;
        Result=Math.round(percentage);
        jTextField2.setText(Double.toString(Result)+" %");
        try
{
    String Per = jTextField2.getText();
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="update percentage set enas='"+Per+"' where name='"+name+"';";

stmt.executeUpdate(query);
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        break;
            
            case 6: 
           
                if (rows>0)
                    {
                        for (int i=0; i<rows; i++)
                        model.removeRow(0); 
                    }
       
        try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select status, date_time from sbl where name='"+name+"' order by date_time desc;";
rs = stmt.executeQuery(query);
while(rs.next())
{
String Status = rs.getString("status");
String date_time = rs.getString("date_time");

model.addRow (new Object[] {Status, date_time});
}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="select  count(*) from sbl where name='"+name+"';";
rs = stmt.executeQuery(query);
while(rs.next())
{

 jTextField3.setText(rs.getString("count(*)"));


}
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        present=Double.parseDouble(jTextField3.getText());
        percentage = present/30*100;
        Result=Math.round(percentage);
        jTextField2.setText(Double.toString(Result)+" %");
        try
{
    String Per = jTextField2.getText();
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root", "9970727628");
Statement stmt = (Statement) con.createStatement();

String query="update percentage set sbl='"+Per+"' where name='"+name+"';";

stmt.executeUpdate(query);
}
catch (Exception e)
{
JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        break;
        
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
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
