
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

public class addScore {
    
    public void insertGrades(char operation,Integer uid,String ccode,Double amarks,Double tmark,Double quizs,Double fmark,String description){
        
        Connection con = databaseConnection.getConnection();
   
        PreparedStatement ps;
        
        if(operation == 'i') {
            
           
            try {
                 ps = con.prepareStatement("INSERT INTO `grades`(`userID`, `course_code`, `assigmnet_marks`,"
                         + " `test_marks`, `quiz_marks`,`final_marks`, `description`) VALUES (?,?,?,?,?,?,?)");
                  
                  ps.setInt(1,uid);
                  ps.setString(2,ccode);
                  ps.setDouble(3,amarks);
                  ps.setDouble(4,tmark);
                  ps.setDouble(5,quizs);
                  ps.setDouble(6,fmark);
                  ps.setString(7,description);
                  

                 
                  if(ps.executeUpdate() <= 0) {
                  } 
                      JOptionPane.showMessageDialog(null,"SCORE ADDED");
            } catch (SQLException ex) {
                Logger.getLogger(addScore.class.getName()).log(Level.SEVERE, null, ex);
            }
                     
        }
        
        
         if(operation == 'u') {
             
             JOptionPane.showConfirmDialog(null,"GRADES WILL BE UPDATED","GRADES UPDATED",JOptionPane.YES_NO_OPTION);
            try {
                 ps = con.prepareStatement("UPDATE `grades` SET `assigmnet_marks`=?,`test_marks`=?,`quiz_marks`=?,`final_marks`=?,`description`=? WHERE `userID`=? AND `course_code`=?");
              
                  
                  ps.setDouble(1,amarks);
                  ps.setDouble(2,tmark);
                  ps.setDouble(3,quizs);
                  ps.setDouble(4,fmark);
                  ps.setString(5,description);
                  ps.setInt(6,uid);
                  ps.setString(7,ccode);
                  
                  if(ps.executeUpdate() > 0) {
                       JOptionPane.showMessageDialog(null,"GRADES UPDATED");
                 
                  }
                    
            } catch (SQLException ex) {
                Logger.getLogger(addScore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'd') {
            
            int yesOrno = JOptionPane.showConfirmDialog(null,"THE GRADES  WILL BE DELETED","GRADES DELETED",JOptionPane.WARNING_MESSAGE,0);
            
            if(yesOrno == 0) {
            try {
                 ps = con.prepareStatement("DELETE FROM `grades` WHERE `userID` =? AND `course_code` =?");
                  
                   ps.setInt(1, uid);
                   ps.setString(2,ccode);
                  
                  if(ps.executeUpdate() > 0) {
                  } 
                      JOptionPane.showMessageDialog(null,"GRADES DELETED");
            } catch (SQLException ex) {
                Logger.getLogger(addScore.class.getName()).log(Level.SEVERE, null, ex);
            }
                     
        }
            
        }
             
        }
      
      public int getCourseId(String studentid) {
     
     int courseId = 0;
     
     Connection con = databaseConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `grade` WHERE 'course_id' = ?");
            ps.setString(1,studentid);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
               
                courseId =  rs.getInt("Id");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(addScore.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return courseId;
 } 
       public void fillScoreTable(JTable table) {
        
        Connection con = databaseConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT DISTINCT * FROM grades");
            
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()) {
                
                  row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getDouble(3);
                row[3] = rs.getDouble(4);
                row[4] = rs.getDouble(5);
                row[5] = rs.getDouble(6);
                row[6] = rs.getString(7);
                
                model.addRow(row);
                
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(addScore.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
       
        public void showScoreTable(JTable table) {
        
        Connection con = databaseConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT DISTINCT g.userID,c.course_code,g.final_marks,g.description \n" +
                           "FROM grades g \n" +
                           "INNER JOIN students s on g.userID = s.userID\n" +
                           "INNER JOIN course c on g.course_code = c.course_code");
            
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()) {
                
                  row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getDouble(3);
                row[3] = rs.getString(4);
                
                model.addRow(row);
                
            }
           
        } catch (Exception ex) {
            Logger.getLogger(addScore.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
        
        public void showStudentGrades(JTable table, int userID) {
              Connection con = databaseConnection.getConnection();
               PreparedStatement ps;
                try {
        
                ps = con.prepareStatement("SELECT DISTINCT g.userID, c.course_code,g.assigmnet_marks,g.test_marks,g.quiz_marks,"
                                  + " g.final_marks, g.description " +
                                  "FROM grades g " +
                                  "INNER JOIN students s ON g.userID = s.userID " +
                                  "INNER JOIN course c ON g.course_code = c.course_code " +
                                  "WHERE s.userID = ?");
        ps.setInt(1, userID); 

        ResultSet rs = ps.executeQuery();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        model.setRowCount(0);
        Object[] row;

        while (rs.next()) {
            row = new Object[7];
            row[0] = rs.getInt(1);      
            row[1] = rs.getString(2);   
            row[2] = rs.getDouble(3); 
            row[3] = rs.getDouble(4); 
            row[4] = rs.getDouble(5); 
            row[5] = rs.getDouble(6); 
            row[6] = rs.getString(7); 
           

            model.addRow(row);
        }

    } catch (Exception ex) {
        Logger.getLogger(addScore.class.getName()).log(Level.SEVERE, null, ex);
    }
}

   public boolean gradesAlreadyExist(int userID, String courseCode) {
    Connection con = databaseConnection.getConnection();
    PreparedStatement ps;
    boolean exists = false;

    try {
        ps = con.prepareStatement("SELECT * FROM grades WHERE userID = ? AND course_code = ?");
        ps.setInt(1, userID);
        ps.setString(2, courseCode);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            exists = true;
        }
    } catch (SQLException ex) {
        Logger.getLogger(addScore.class.getName()).log(Level.SEVERE, null, ex);
    }

    return exists;
}
}




