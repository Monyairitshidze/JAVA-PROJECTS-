import java.util.Scanner;

public class main{

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        student u = new student("Ritshidze",12,"com");

        u.addStudent();

        System.out.println("Do you want to add more students?");
        System.out.println("Enter yes or no");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("yes")){

            System.out.println("Enter your name:");
            String name = sc.next();
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            System.out.println("Enter your subject:");
            String subject = sc.next();

            u = new student(name, age, subject);
            u.addStudent();

        }
        else{


           
        }
       
    }
}