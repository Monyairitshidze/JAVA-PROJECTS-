import java.util.Scanner;

public class main {

   public static void main(String[] args) {
       
    main m = new main();
    m.operationsToBeDone();

   }

   public void operationsToBeDone(){

    student s = new student();

    Scanner sc = new Scanner(System.in);

    System.out.println("Select your choice");
    System.out.println("1.Add Student");
    System.out.println("2.Search Student");
    System.out.println("3.Remove Student");
    System.out.println("4.View All Students");
    System.out.println("Enter your choice(1-4)");
    int answer = sc.nextInt();

    if(answer == 1){

        s.addStudent();
    }

    else if(answer == 2){

        s.searchStudent();
    }
    else if(answer == 3){

        s.removeStudent();
    }

    else if(answer == 4){

        s.viewStudent();
    }

    else{
        System.out.println("Terminate");
    }

   }

    
    
}
