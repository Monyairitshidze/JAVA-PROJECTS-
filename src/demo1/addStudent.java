
package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class addStudent {
    
    public void insertStudent(char operation, Integer id, String fname, String lname,
                           String gender, Integer pin, String role) {

        Connection con = databaseConnection.getConnection();
        PreparedStatement ps = null;

        if(operation == 'i') {
            
            try {
               
                ps = con.prepareStatement("INSERT INTO students(first_name, last_name, gender , pin , role) VALUES (?,?,?,?,?)");
                    ps.setString(1, fname);  
                    ps.setString(2, lname);  
                    ps.setString(3, gender); 
                    ps.setInt(4, pin);       
                    ps.setString(5, role);
                    
                    if(ps.executeUpdate()>0) {
                        JOptionPane.showMessageDialog(null,"NEW STUDENT ADDED");
                    }
            } catch (SQLException ex) {
                Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (operation == 'u') {
            int confirm = JOptionPane.showConfirmDialog(null, "WANT TO UPDATE RECORD", "STUDENT RECORD UPDATED", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    String query = "UPDATE students SET first_name = ?, last_name = ?, gender = ?, pin = ?, role = ? WHERE userID = ?";
                    ps = con.prepareStatement(query);
                    ps.setString(1, fname);  
                    ps.setString(2, lname);  
                    ps.setString(3, gender); 
                    ps.setInt(4, pin);       
                    ps.setString(5, role);   
                    ps.setInt(6, id); 
                    
                    
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "STUDENT RECORD UPDATED");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                
                }
            }
        }
        
         if(operation == 'd') {
          
              int yesOrno = JOptionPane.showConfirmDialog(null,"THE STUDENT RECORD  WILL BE DELETED","RECORD DELETED",JOptionPane.WARNING_MESSAGE,0);
            
            if(yesOrno == 0) {
          
             try {
               
                ps = con.prepareStatement("DELETE FROM students WHERE userID = ? ");
                    ps.setInt(1, id);  
                    
                    
                    if(ps.executeUpdate()>0) {
                        JOptionPane.showMessageDialog(null,"STUDENT RECORD DELETED");
                    }
            } catch (SQLException ex) {
                Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }
       
        public void fillStudentTable(JTable table, String valueToSearch) {
        
        Connection con = databaseConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM students WHERE CONCAT(first_name,last_name,gender,pin,role) LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()) {
                
                  row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getInt(5);
                row[5] = rs.getString(6);
                
                model.addRow(row);
              
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        
        
        
    }
    
    
    
    

    

