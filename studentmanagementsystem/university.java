
package studentmanagementsystem;


public class university {
    
  static String uniName = "UNIVEN";
    
    public void addStudent(String studentName,int age, String studentID) {
       
    }
    
     public static String getUniversityNmae() {
       
        return uniName;
    }
    
    public void displayStudent(String studentName,int age, String studentID) {
       
        System.out.println("HERE IS THE RECORD OF REGISTERD STUDENTS:" + studentName + age + studentID);
    }
    
}
