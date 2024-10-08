
package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class addCourse {
  
// Method to insert, update, or delete a course based on the operation ('i' for insert, 'u' for update, 'd' for delete)
public void insertCourse(char operation, Integer cid, String cname, String ccode,
                          String ccredits, String cduration) {
        
    // Establish a connection to the database
    Connection con = databaseConnection.getConnection();
    PreparedStatement ps;
        
    // Insert operation ('i')
    if (operation == 'i') {
        try {
            // Prepare SQL statement to insert a new course into the database
            ps = con.prepareStatement("INSERT INTO course(course_name, course_code, course_credits, course_duration) VALUES (?,?,?,?)");
            
            // Set the course details in the SQL query
            ps.setString(1, cname);
            ps.setString(2, ccode);
            ps.setString(3, ccredits);
            ps.setString(4, cduration);
            
            // Execute the update and check if the insertion is successful
            if (ps.executeUpdate() > 0) {
                // Show a message if the course is added successfully
                JOptionPane.showMessageDialog(null, "NEW COURSE ADDED");
            }
        } catch (SQLException ex) {
            // Log any exceptions
            Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Update operation ('u')
    if (operation == 'u') {
        // Show a confirmation dialog before updating
        JOptionPane.showConfirmDialog(null, "WANT TO UPDATE A COURSE", "COURSE UPDATED", JOptionPane.YES_NO_OPTION);
        try {
            // Prepare SQL statement to update an existing course in the database
            ps = con.prepareStatement("UPDATE course SET course_name=?,course_code=?,course_credits=?,course_duration=? WHERE course_id=?");
            
            // Set the new course details in the SQL query
            ps.setString(1, cname);
            ps.setString(2, ccode);
            ps.setString(3, ccredits);
            ps.setString(4, cduration);
            ps.setInt(5, cid);
            
            // Execute the update and show a success message if the update was successful
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "COURSE UPDATED");
            }
        } catch (SQLException ex) {
            // Log any exceptions
            Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Delete operation ('d')
    if (operation == 'd') {
        // Show a warning message before deleting
        int yesOrNo = JOptionPane.showConfirmDialog(null, "THE COURSE WILL BE DELETED", "COURSE DELETED", JOptionPane.WARNING_MESSAGE, 0);
        
        // If the user confirms deletion
        if (yesOrNo == 0) {
            try {
                // Prepare SQL statement to delete a course by its ID
                ps = con.prepareStatement("DELETE FROM course WHERE course_id=?");
                
                // Set the course ID in the query
                ps.setInt(1, cid);
                
                // Execute the deletion and show a success message if it was successful
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "COURSE DELETED");
                }
            } catch (SQLException ex) {
                // Log any exceptions
                Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

// Method to check if a course with a given name already exists in the database
public boolean isCourseExist(String CourseName) {
    boolean isExist = false; // Default is false
    Connection con = databaseConnection.getConnection();
    PreparedStatement ps;
    
    try {
        // Prepare SQL query to search for the course by name
        ps = con.prepareStatement("SELECT * FROM course WHERE Course_Name = ?");
        ps.setString(1, CourseName);
        
        // Execute the query
        ResultSet rs = ps.executeQuery();
        
        // If a matching course is found, set isExist to true
        if (rs.next()) {
            isExist = true;
        }
    } catch (Exception ex) {
        // Log any exceptions
        Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return isExist; // Return true if the course exists, false otherwise
}

// Method to populate a table with course data from the database
public void fillCourseTable(JTable table) {
    Connection con = databaseConnection.getConnection();
    PreparedStatement ps;
    
    try {
        // Prepare SQL query to retrieve all courses
        ps = con.prepareStatement("SELECT * FROM course");
        
        // Execute the query and get the results
        ResultSet rs = ps.executeQuery();
        
        // Get the table model
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // Loop through each course and add its details to the table
        Object[] row;
        while (rs.next()) {
            row = new Object[5]; // Create a row for the table
            row[0] = rs.getInt(1); // Course ID
            row[1] = rs.getString(2); // Course Name
            row[2] = rs.getString(3); // Course Code
            row[3] = rs.getString(4); // Course Credits
            row[4] = rs.getString(5); // Course Duration
            model.addRow(row); // Add the row to the table model
        }
    } catch (Exception ex) {
        // Log any exceptions
        Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
    }
}

// Method to get a course ID based on its label (name or code)
public int getCourseId(String courseLabel) {
    int courseId = 0;
    Connection con = databaseConnection.getConnection();
    PreparedStatement ps;
    
    try {
        // Prepare SQL query to get the course by its label
        ps = con.prepareStatement("SELECT * FROM course WHERE 'course_id' = ?");
        ps.setString(1, courseLabel);
        
        // Execute the query
        ResultSet rs = ps.executeQuery();
        
        // If a matching course is found, set courseId
        if (rs.next()) {
            courseId = rs.getInt("id");
        }
    } catch (Exception ex) {
        // Log any exceptions
        Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return courseId; // Return the course ID
}

// Method to populate a combo box with course names or codes
public void fillCourseCombo(JComboBox combo) {
    Connection con = databaseConnection.getConnection();
    PreparedStatement ps;
    
    try {
        // Prepare SQL query to get all courses
        ps = con.prepareStatement("SELECT * FROM course");
        
        // Execute the query
        ResultSet rs = ps.executeQuery();
        
        // Loop through each course and add its name to the combo box
        while (rs.next()) {
            combo.addItem(rs.getString(3)); // Add course code (or name) to the combo box
        }
    } catch (Exception ex) {
        // Log any exceptions
        Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    
}
