// Import the Scanner class for reading user input
import java.util.Scanner;

// Declare the main class (Note: Java convention suggests using "Main" with a capital M)
public class main {

    // Main method – this is the entry point of the program
    public static void main(String[] args) {
        
        // Create an object of the 'main' class to access non-static methods
        main m = new main();

        // Call the method that shows options and handles user operations
        m.operationsToBeDone();
    }

    // Method to show the menu and perform operations based on user input
    public void operationsToBeDone(){

        // Create an object of the 'student' class to access student-related methods
        student s = new student();

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Display menu options
        System.out.println("Select your choice");
        System.out.println("1.Add Student");
        System.out.println("2.Search Student");
        System.out.println("3.Remove Student");
        System.out.println("4.View All Students");
        System.out.println("Enter your choice(1-4)");

        // Read the user's input (choice)
        int answer = sc.nextInt();

        // Perform actions based on user's choice
        if(answer == 1){
            // If user chooses 1, call method to add a student
            s.addStudent();
        }
        else if(answer == 2){
            // If user chooses 2, call method to search for a student
            s.searchStudent();
        }
        else if(answer == 3){
            // If user chooses 3, call method to remove a student
            s.removeStudent();
        }
        else if(answer == 4){
            // If user chooses 4, call method to view all students
            s.viewStudent();
        }
        else{
            // If input is not between 1 and 4, display a message
            System.out.println("Terminate");
        }
    }
}
