/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.management.system;


import static attendance.management.system.TeacherStartPage.jLabel4;
import static attendance.management.system.TeacherStartPage.jTextField1;
import static attendance.management.system.TeacherStartPage.jTextField2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Aayush Kanholikar
 */
public class TodaysAttendance extends javax.swing.JFrame {
DefaultTableModel dm=new DefaultTableModel();
    /**
     * Creates new form TodaysAttendance
     */
    public TodaysAttendance() {
        initComponents();
    }
private String getCellVal(int x, int y){
        return dm.getValueAt(x, y).toString();
        
    }
    
    
    private void writeToExcel() throws IOException{
        XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet ws=wb.createSheet();
        
        
        
        TreeMap<String, Object[]> data =new TreeMap<>();
        data.put("0", new Object[]{dm.getColumnName(0), dm.getColumnName(1), dm.getColumnName(2)});
        data.put("1", new Object[]{getCellVal(0, 0), getCellVal(0, 1), getCellVal(0, 2)});
        data.put("2", new Object[]{getCellVal(1,0), getCellVal(1,1), getCellVal(1,2)});
        data.put("3", new Object[]{getCellVal(2,0), getCellVal(2,1), getCellVal(2,2)});
        data.put("4", new Object[]{getCellVal(3,0), getCellVal(3,1), getCellVal(3,2)});
        data.put("5", new Object[]{getCellVal(4,0), getCellVal(4,1), getCellVal(4,2)});

        Set<String> ids=data.keySet();
        XSSFRow row;
        int rowID=0;
        
        for(String key: ids)
        {
            row=ws.createRow(rowID++);
            
            Object[] values=data.get(key);
            int cellID=0;
            for(Object o: values)
            {
                Cell cell=row.createCell(cellID++);
                cell.setCellValue(o.toString());
            }
        }
        
        
        try
        {
            FileOutputStream fos=new FileOutputStream (new File("D:/Excel/players.xlsx"));
            wb.write(fos);
            fos.close();
        }  
        
        catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 0, 50)); // NOI18N
        jLabel1.setText(" Subject Wise Attendance");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Subject", "EM-3", "EIM", "EDC", "DLC", "ENAS", "SBL" }));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setText("Select Subject");

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Rollno", "Status", "Date_time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(500);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(800);
        }

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton2.setText("Back");
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
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
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
String Query = "select * from em order by date_time desc;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    String Rollno = rs.getString("Rollno");
                    String Status = rs.getString("Status");
                    String Date_time = rs.getString("Date_time");
                 
                    
                    String tbData[] = {name,Rollno,Status,Date_time};
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
String Query = "SELECT * FROM eim order by date_time desc;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    String Rollno = rs.getString("Rollno");
                    String Status = rs.getString("Status");
                    String Date_time = rs.getString("Date_time");
                 
                    
                    String tbData[] = {name,Rollno,Status,Date_time};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                      
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
String Query = "SELECT * FROM edc order by date_time desc;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    String Rollno = rs.getString("Rollno");
                    String Status = rs.getString("Status");
                    String Date_time = rs.getString("Date_time");
                 
                    
                    String tbData[] = {name,Rollno,Status,Date_time};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                      
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
String Query = "SELECT * FROM dlc order by date_time desc;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    String Rollno = rs.getString("Rollno");
                    String Status = rs.getString("Status");
                    String Date_time = rs.getString("Date_time");
                 
                    
                    String tbData[] = {name,Rollno,Status,Date_time};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                      
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
String Query = "SELECT * FROM enas order by date_time desc;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    String Rollno = rs.getString("Rollno");
                    String Status = rs.getString("Status");
                    String Date_time = rs.getString("Date_time");
                 
                    
                    String tbData[] = {name,Rollno,Status,Date_time};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                      
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
String Query = "SELECT * FROM sbl order by date_time desc;";
        pst= con.prepareStatement(Query);
        rs = pst.executeQuery();
        
         while(rs.next()) {
                    
                    String name = rs.getString("name");
                    String Rollno = rs.getString("Rollno");
                    String Status = rs.getString("Status");
                    String Date_time = rs.getString("Date_time");
                 
                    
                    String tbData[] = {name,Rollno,Status,Date_time};
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    tblModel.addRow(tbData);
                      
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
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
}String status = TeacherStartPage.jTextField1.getText();
         if(status.equals("DEACTIVATE"))
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
            java.util.logging.Logger.getLogger(TodaysAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodaysAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodaysAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodaysAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodaysAttendance().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
