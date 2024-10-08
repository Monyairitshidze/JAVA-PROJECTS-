
package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class databaseConnection {
    public static Connection getConnection() {
        
        Connection connect = null;
        
       try {
           Class.forName("com.mysql.jdbc.Driver");
           connect = DriverManager.getConnection("jdbc:mysql://localhost/gradebook","root","");
           
       }
       catch (ClassNotFoundException | SQLException ex) {
           System.out.println(ex.getMessage());
       }
    
     return connect;   
    }
    
}
