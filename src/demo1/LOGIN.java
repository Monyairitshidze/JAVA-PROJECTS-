
package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LOGIN extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    addScore as = new addScore();
    public LOGIN() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtuid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtrole = new javax.swing.JComboBox();
        txtpin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Left.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("USER ID:");

        txtuid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuidKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("PIN:");

        Login.setBackground(new java.awt.Color(0, 102, 102));
        Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("LOGIN");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Role:");

        txtrole.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtrole.setForeground(new java.awt.Color(0, 0, 204));
        txtrole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "LECTURER", "STUDENT" }));
        txtrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtroleActionPerformed(evt);
            }
        });

        txtpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpinKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel6.setText("HELLO FRIEND!!");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel5)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel5)
                .addGap(67, 67, 67)
                .addComponent(jLabel6)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtpin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(Login, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtuid, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtuid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Login)
                        .addGap(81, 81, 81))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed


       String role,query;
        int userID,pin;

// Get userID, pin, and role input from the user interface
userID = Integer.parseInt(txtuid.getText());
pin = Integer.parseInt(txtpin.getText());
role = txtrole.getSelectedItem().toString(); 

try {
    // Load MySQL driver for connecting to the database
    Class.forName("com.mysql.jdbc.Driver");
    // Establish connection to the "gradebook" database
    con = DriverManager.getConnection("jdbc:mysql://localhost/gradebook", "root", "");

    // Check if the selected role is Admin (index 0)
    if (txtrole.getSelectedIndex() == 0) {
        
        // Query to check if the provided username and password match for an Admin
        query= "SELECT * FROM admin WHERE userID = ? and pin = ? and role = 'Admin'"; 
        pst = con.prepareStatement(query);
        pst.setInt(1,userID); // Set username in the query
        pst.setInt(2,pin); // Set pin in the query
        rs = pst.executeQuery(); // Execute the query

        // If a matching Admin user is found
        if (rs.next()) {
            // Display a message that login is successful
            JOptionPane.showMessageDialog(this, "USER ID AND PIN MATCHED. YOU ARE LOGGING IN AS " + rs.getString("role"));
            // Open the admin dashboard
            adminDashboard ad = new adminDashboard();
            ad.setVisible(true);
            ad.setLocationRelativeTo(null);
            ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            // Center the dashboard window
            // Display student and course counts on the admin dashboard
            adminDashboard.studentcount.setText("STUDENTS COUNT = " + Integer.toString(myFunction.countData("students")));
            adminDashboard.coursecount.setText("COURSES COUNT = " + Integer.toString(myFunction.countData("course")));
            ad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close the login window when dashboard opens
            this.dispose(); // Close the current window
            // Display a welcome message for Admin
            adminDashboard.txtwelcome.setText("WELCOME ADMIN");
        } else {
            // If credentials don't match, deny access
            JOptionPane.showMessageDialog(this, "ACCESS DENIED!!");
        }

    // Check if the selected role is Instructor (index 1)
    } else if (txtrole.getSelectedIndex() == 1) {

        // Query to check if the provided username and password match for an Instructor
        query = "SELECT * FROM instructors WHERE userID = ? and pin = ? and role = 'LECTURER'"; 
        pst = con.prepareStatement(query);
        pst.setInt(1, userID); // Set username in the query
        pst.setInt(2, pin); // Set password in the query
        rs = pst.executeQuery(); // Execute the query

        // If a matching Instructor user is found
        if (rs.next()) {
            // Display a message that login is successful
            JOptionPane.showMessageDialog(this, "USER ID AND PIN MATCHED. YOU ARE LOGGING IN AS " + rs.getString("role"));
            // Open the instructor dashboard
            instructorDashboard ID = new instructorDashboard();
            ID.setVisible(true);
            ID.setLocationRelativeTo(null); // Center the dashboard window
            ID.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the login window when dashboard opens
            this.dispose(); // Close the current window
            // Display a welcome message for Instructor
            instructorDashboard.txtwelcome.setText("WELCOME INSTRUCTOR");
        } else {
            // If credentials don't match, deny access
            JOptionPane.showMessageDialog(this, "ACCESS DENIED!!");
        }

    // Check if the selected role is Student (index 2)
    } else if (txtrole.getSelectedIndex() == 2) { 

        // Query to check if the provided username and password match for a Student
        query = "SELECT * FROM students WHERE userID = ? and pin = ? and role = 'STUDENT'"; 
        pst = con.prepareStatement(query);
        pst.setInt(1, userID); // Set username in the query
        pst.setInt(2, pin); // Set password in the query
        rs = pst.executeQuery(); // Execute the query

        // If a matching Student user is found
        if (rs.next()) {
            // Display a message that login is successful
            JOptionPane.showMessageDialog(this, "USER ID AND PIN MATCHED. YOU ARE LOGGING IN AS " + rs.getString("role"));
            // Open the student dashboard
            studentDashboard sd = new studentDashboard();
            sd.setVisible(true);
            sd.setLocationRelativeTo(null); // Center the dashboard window
            sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the login window when dashboard opens
            this.dispose(); // Close the current window
            // Display a welcome message for Student
            studentDashboard.txtwelcome.setText("WELCOME STUDENT");
        } else {
            // If credentials don't match, deny access
            JOptionPane.showMessageDialog(this, "ACCESS DENIED!!");
        }

    }

} catch (Exception ex) {
    // Print error message to console if any exception occurs
    System.out.println("ERROR: " + ex.getMessage());
}


    }//GEN-LAST:event_LoginActionPerformed

    private void txtroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroleActionPerformed

    }//GEN-LAST:event_txtroleActionPerformed

    private void txtuidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuidKeyTyped
if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }      
    }//GEN-LAST:event_txtuidKeyTyped

    private void txtpinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpinKeyTyped
       if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtpinKeyTyped

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton Login;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtpin;
    private javax.swing.JComboBox txtrole;
    private javax.swing.JTextField txtuid;
    // End of variables declaration//GEN-END:variables
}
