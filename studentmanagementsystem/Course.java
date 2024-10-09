
package studentmanagementsystem;


public class Course {
    
    String courseName;
    String courseCode;
    int credits;
    
    Course() {
      
    courseName = "JAVA";
    courseCode = "COM1321";
    credits = 20;
        
    }
    
    Course(String cname, String ccode, int credits) {
        
        this.courseName = cname;
        this.courseCode = ccode;
        this.credits = credits;
        
    }
    
    public void enrollCourse(String course) {
        
        if(!courseCode.equalsIgnoreCase(course)) {
            System.out.println("YOU REGISTERD " + course);
        }
        else{
            System.out.println("COURSE DOES NOT EXISTS");
        }
       
        
    }
    
}
