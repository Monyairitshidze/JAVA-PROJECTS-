
package studentmanagementsystem;

import java.util.Scanner;


public class StudentManagementSystem {

   String name;
   int age;
   String studentId;
   
   
   StudentManagementSystem() {
       
    name = "RITSHIDZE";
    age = 20;
    studentId = "23023917"; 
   
   }
   
   StudentManagementSystem(String n1,int a1,String sid){
       
       this.name = n1;
       this.age = a1;
       this.studentId = sid;
       
       
   }
   
   
   
  public void classifyStudent() {
      
      if(age < 18) {
            System.out.println("INVALID AGE");
        }
      else if(age>=18 && age <= 22) {
          
         System.out.println("UNDERGRADUATE"); 
      }
      else if(age>=18 && age <= 22) {
          
         System.out.println("GRADUATED"); 
      }
        else {
            System.out.println("UNKNOWN");
        }
       
   }
  
  
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean run;
        
         System.out.println("YOU WANT TO ADD NEW STUDENT?");
        System.out.println("ENTER YES/NO");
        String choice = sc.next().toLowerCase();
        
         if(choice.equalsIgnoreCase("yes")) {
            
            run = true;
        }
        else {
            run = false;
        }
         
        
        while(run == true) {
        System.out.println("ENTER NAME:");
        String name = sc.next();
        System.out.println("ENTER AGE:");
        int age = sc.nextInt();
        System.out.println("ENTER STUDENT NO:");
        String studentID = sc.next();
        
        StudentManagementSystem student = new StudentManagementSystem();
        student.name = name;
        student.age = age;
        student.studentId = studentID;
        
        student.classifyStudent();
        
        System.out.println("ENTER THE COURSE:");
        String course = sc.next();
        Course c = new Course();
        c.enrollCourse(course);
        
        university u = new university();
        u.addStudent(name, age, studentID);
        
        
    }
    
}

}