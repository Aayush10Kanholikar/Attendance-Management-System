/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.management.system;


 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.sql.*;
import static attendance.management.system.ViewYourProfile.jTextField10;
import static attendance.management.system.ViewYourProfile.jTextField20;
import static attendance.management.system.ViewYourProfile.jTextField30;
import static attendance.management.system.ViewYourProfile.jTextField40;
import static attendance.management.system.ViewYourProfile.jTextField50;
import static attendance.management.system.ViewYourProfile.jTextField60;

/**
 *
 * @author Aayush Kanholikar
 */
public class MarkAttendance extends javax.swing.JFrame {

    /**
     * Creates new form MarkAttendance
     */
    public MarkAttendance() {
        initComponents();
    }
    
    public void curDateTime(){
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 0, 48)); // NOI18N
        jLabel1.setText(" Mark Today's Attendance");

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 30)); // NOI18N
        jCheckBox1.setText("Present");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setText("Date & Time");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton1.setText("Mark Attendance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel3.setText("Subjects:");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel5.setText("Roll No.");

        jTextField2.setEditable(false);
        jTextField2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField2MouseMoved(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField3MouseMoved(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel6.setText("Status:");

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton3.setText("Check Status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton4.setText("Verify your Name and Roll no.");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel7.setText("Subject:");

        jTextField5.setEditable(false);
        jTextField5.setText(" ");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jCheckBox2.setText("EM");

        buttonGroup2.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jCheckBox3.setText("EIM");

        buttonGroup2.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jCheckBox4.setText("EDC");

        buttonGroup2.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jCheckBox5.setText("DLC");

        buttonGroup2.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jCheckBox6.setText("ENAS");

        buttonGroup2.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jCheckBox7.setText("SBL");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField4)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(211, 211, 211)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox4)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox5)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton1)
                                .addGap(46, 46, 46)
                                .addComponent(jButton2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        jTextField2.setText(StudentLogin.jTextField1.getText());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy   HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jTextField1.setText(dtf.format(now));
        PreparedStatement pst;
        ResultSet rs;

        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
            Statement stmt = (Statement) con.createStatement();

            String Query ="select * from Students where name='"+jTextField2.getText()+"';";
            rs=stmt.executeQuery(Query);
            int i=0;
            while(rs.next())
            {
                i++;
                jTextField3.setText(rs.getString("Roll_no"));    }

        }
        catch(Exception e)

        {

            JOptionPane.showMessageDialog (this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
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
                jTextField4.setText(rs.getString("Status"));

            }

            if(i==0)
            { jTextField4.setText("");  }

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
                jTextField5.setText(rs.getString("Subject"));

            }

            if(i==0)
            { jTextField5.setText("");  }

        }
        catch(Exception e)

        {

            JOptionPane.showMessageDialog (this, e.getMessage());
        }

        String status = jTextField4.getText();
        String Subject = jTextField5.getText();

        if (status.equals("ACTIVATE")&&Subject.equals("EM"))
        {
            jTextField2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField3.setVisible(true);

            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(true);
            jCheckBox3.setEnabled(false);
            jCheckBox4.setEnabled(false);
            jCheckBox5.setEnabled(false);
            jCheckBox6.setEnabled(false);
            jCheckBox7.setEnabled(false);

            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jButton4.setVisible(true);
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog (this, "Please Verify your Name and Roll no. !!!");
        }

        else if (status.equals("ACTIVATE")&&Subject.equals("EIM"))
        {
            jTextField2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField3.setVisible(true);

            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(false);
            jCheckBox3.setEnabled(true);
            jCheckBox4.setEnabled(false);
            jCheckBox5.setEnabled(false);
            jCheckBox6.setEnabled(false);
            jCheckBox7.setEnabled(false);

            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jButton4.setVisible(true);
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog (this, "Please Verify your Name and Roll no. !!!");
        }

        else if (status.equals("ACTIVATE")&&Subject.equals("EDC"))
        {
            jTextField2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField3.setVisible(true);

            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(false);
            jCheckBox3.setEnabled(false);
            jCheckBox4.setEnabled(true);
            jCheckBox5.setEnabled(false);
            jCheckBox6.setEnabled(false);
            jCheckBox7.setEnabled(false);

            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jButton4.setVisible(true);
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog (this, "Please Verify your Name and Roll no. !!!");
        }

        else if (status.equals("ACTIVATE")&&Subject.equals("DLC"))
        {
            jTextField2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField3.setVisible(true);

            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(false);
            jCheckBox3.setEnabled(false);
            jCheckBox4.setEnabled(false);
            jCheckBox5.setEnabled(true);
            jCheckBox6.setEnabled(false);
            jCheckBox7.setEnabled(false);

            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jButton4.setVisible(true);
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog (this, "Please Verify your Name and Roll no. !!!");
        }

        else if (status.equals("ACTIVATE")&&Subject.equals("ENAS"))
        {
            jTextField2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField3.setVisible(true);

            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(false);
            jCheckBox3.setEnabled(false);
            jCheckBox4.setEnabled(false);
            jCheckBox5.setEnabled(false);
            jCheckBox6.setEnabled(true);
            jCheckBox7.setEnabled(false);

            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jButton4.setVisible(true);
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog (this, "Please Verify your Name and Roll no. !!!");
        }

        else if (status.equals("ACTIVATE")&&Subject.equals("SBL"))
        {
            jTextField2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField3.setVisible(true);

            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(false);
            jCheckBox3.setEnabled(false);
            jCheckBox4.setEnabled(false);
            jCheckBox5.setEnabled(false);
            jCheckBox6.setEnabled(false);
            jCheckBox7.setEnabled(true);

            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jButton4.setVisible(true);
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog (this, "Please Verify your Name and Roll no. !!!");
        }

        else if (status.equals("DEACTIVATE"))
        {
            jButton4.setVisible(false);
            jButton1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField1.setVisible(false);
            jTextField3.setVisible(false);
            jTextField5.setVisible(false);

            jCheckBox1.setEnabled(false);
            jCheckBox2.setEnabled(false);
            jCheckBox3.setEnabled(false);
            jCheckBox4.setEnabled(false);
            jCheckBox5.setEnabled(false);
            jCheckBox6.setEnabled(false);
            jCheckBox7.setEnabled(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel7.setVisible(false);
            JOptionPane.showMessageDialog (this, "Attendance Marking is Closed for now !!!");
            
           
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField3MouseMoved

    private void jTextField2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2MouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StudentStartPage ssp = new StudentStartPage();
        ssp.setVisible(true);

       StudentStartPage.jLabel1.setText("Welcome "+StudentLogin.jTextField1.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String Name=jTextField2.getText();
        String Rollno = jTextField3.getText();
        String Date_Time=jTextField1.getText();
        String Status = null;
        if(jCheckBox1.isSelected())
        {
            Status="Present";
        }

        else
        {
            Status = "Absent";
        }

        if(jCheckBox2.isSelected())
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
                Statement stmt = (Statement) con.createStatement();

                String query="INSERT INTO EM VALUES('"+Name+"','"+Rollno+"','"+Status+"','"+Date_Time+"');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog (this, "Today's Attendance Marked Successfully!!!");
                this.setVisible(false);
                StudentStartPage ssp = new StudentStartPage();
                ssp.setVisible(true);
                StudentStartPage.jLabel1.setText("Welcome "+jTextField2.getText());

            }
            catch(Exception e)

            {

                JOptionPane.showMessageDialog (this, e.getMessage());
            }
        }

        else if(jCheckBox3.isSelected())
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
                Statement stmt = (Statement) con.createStatement();

                String query="INSERT INTO EIM VALUES('"+Name+"','"+Rollno+"','"+Status+"','"+Date_Time+"');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog (this, "Today's Attendance Marked Successfully!!!");
                this.setVisible(false);
                StudentStartPage ssp = new StudentStartPage();
                ssp.setVisible(true);
                StudentStartPage.jLabel1.setText("Welcome "+jTextField2.getText());

            }
            catch(Exception e)

            {

                JOptionPane.showMessageDialog (this, e.getMessage());
            }
        }

        else if(jCheckBox4.isSelected())
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
                Statement stmt = (Statement) con.createStatement();

                String query="INSERT INTO EDC VALUES('"+Name+"','"+Rollno+"','"+Status+"','"+Date_Time+"');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog (this, "Today's Attendance Marked Successfully!!!");
                this.setVisible(false);
                StudentStartPage ssp = new StudentStartPage();
                ssp.setVisible(true);
                StudentStartPage.jLabel1.setText("Welcome "+jTextField2.getText());

            }
            catch(Exception e)

            {

                JOptionPane.showMessageDialog (this, e.getMessage());
            }
        }

        else if(jCheckBox5.isSelected())
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
                Statement stmt = (Statement) con.createStatement();

                String query="INSERT INTO DLC VALUES('"+Name+"','"+Rollno+"','"+Status+"','"+Date_Time+"');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog (this, "Today's Attendance Marked Successfully!!!");
                this.setVisible(false);
                StudentStartPage ssp = new StudentStartPage();
                ssp.setVisible(true);
                StudentStartPage.jLabel1.setText("Welcome "+jTextField2.getText());

            }
            catch(Exception e)

            {

                JOptionPane.showMessageDialog (this, e.getMessage());
            }
        }

        else if(jCheckBox6.isSelected())
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
                Statement stmt = (Statement) con.createStatement();

                String query="INSERT INTO ENAS VALUES('"+Name+"','"+Rollno+"','"+Status+"','"+Date_Time+"');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog (this, "Today's Attendance Marked Successfully!!!");
                this.setVisible(false);
                StudentStartPage ssp = new StudentStartPage();
                ssp.setVisible(true);
                StudentStartPage.jLabel1.setText("Welcome "+jTextField2.getText());

            }
            catch(Exception e)

            {

                JOptionPane.showMessageDialog (this, e.getMessage());
            }
        }

        else if(jCheckBox7.isSelected())
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","9970727628");
                Statement stmt = (Statement) con.createStatement();

                String query="INSERT INTO SBL VALUES('"+Name+"','"+Rollno+"','"+Status+"','"+Date_Time+"');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog (this, "Today's Attendance Marked Successfully!!!");
                this.setVisible(false);
                StudentStartPage ssp = new StudentStartPage();
                ssp.setVisible(true);
                StudentStartPage.jLabel1.setText("Welcome "+jTextField2.getText());

            }
            catch(Exception e)

            {

                JOptionPane.showMessageDialog (this, e.getMessage());
            }
        }

        else
        {
            JOptionPane.showMessageDialog (this, "Please fill All fields Properly!!!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

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
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JCheckBox jCheckBox2;
    public static javax.swing.JCheckBox jCheckBox3;
    public static javax.swing.JCheckBox jCheckBox4;
    public static javax.swing.JCheckBox jCheckBox5;
    public static javax.swing.JCheckBox jCheckBox6;
    public static javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
