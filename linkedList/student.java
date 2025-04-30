import java.util.ArrayList;
import java.util.Scanner;

class student {

    String name; // Field for student name (not currently used in logic)
    int marks;   // Field for student marks (not currently used in logic)

    // Static list to store student names
    static ArrayList names = new ArrayList();

    Scanner sc = new Scanner(System.in); // Scanner for user input
    main m = new main(); // Object to access operationsToBeDone method from main class

    // Method to add a student
    void addStudent() {
        System.out.println("Add new Student");
        System.out.println("Enter student name");
        String name = sc.next(); // Reads student name

        names.add(name); // Adds student to list

        System.out.println("Student " + name + " was Added Successfully");
        System.out.println("");
        System.out.println("Do you want to add another student?(YES/NO)");
        String answer = sc.next(); // Ask to add another

        if (answer.equalsIgnoreCase("yes")) {
            addStudent(); // Recursively call to add again
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Want to perform another operation?(YES/NO)");
            String answer2 = sc.next();

            if (answer2.equalsIgnoreCase("yes")) {
                m.operationsToBeDone(); // Return to main menu
            } else if (answer2.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using our System");
            }
        }
    }

    // Method to search for a student
    public void searchStudent() {
        System.out.println("Enter the name of student");
        String name = sc.next();

        if (names.contains(name)) {
            System.out.println("Student Exists");
            System.out.println("");
            System.out.println("You want to search another one?(YESNO)");
            String answer2 = sc.next();

            if (answer2.equalsIgnoreCase("yes")) {
                searchStudent();
            } else if (answer2.equalsIgnoreCase("no")) {
                System.out.println("Want to perform another operation?(YES/NO)");
                String answer3 = sc.next();

                if (answer3.equalsIgnoreCase("yes")) {
                    m.operationsToBeDone();
                } else if (answer3.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for using our System");
                }
            }
        } else {
            // If student not found, ask for another name
            System.out.println("Sorry Student is not Available");
            System.out.println("Try Again Enter Another name");
            String tried_name = sc.next();

            if (names.contains(tried_name)) {
                System.out.println("Student exists");

                System.out.println("You want to search another one?(YESNO)");
                String answer2 = sc.next();

                if (answer2.equalsIgnoreCase("yes")) {
                    searchStudent();
                } else if (answer2.equalsIgnoreCase("no")) {
                    System.out.println("Want to perform another operation?(YES/NO)");
                    String answer3 = sc.next();

                    if (answer3.equalsIgnoreCase("yes")) {
                        m.operationsToBeDone();
                    } else if (answer3.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for using our System");
                    }
                }
            }
        }
    }

    // Method to remove a student
    public void removeStudent() {
        System.out.println("Enter name of Students To be Removed");
        String name = sc.next();

        if (names.contains(name)) {
            names.remove(name); // Remove if found
            System.out.println("Student " + name + " was successfully removed");
            System.out.println("");
            System.out.println("Want to remove another one?(YES/NO)");
            String respond1 = sc.next();

            if (respond1.equalsIgnoreCase("yes")) {
                removeStudent(); // Recursively call
            } else if (respond1.equalsIgnoreCase("no")) {
                System.out.println("Want to perform another operation?(YES/NO)");
                String respond2 = sc.next();

                if (respond2.equalsIgnoreCase("yes")) {
                    m.operationsToBeDone();
                } else if (respond2.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using our system");
                }
            }
        } else {
            // If name not found, ask to try another
            System.out.println("Student doesn't exist");
            System.out.println("Try again! Enter another name");
            String respond3 = sc.next();

            if (names.contains(respond3)) {
                names.remove(name); // Note: This removes the original "name", not "respond3" — might be a logic error
                System.out.println("Student " + name + " was successfully removed");
                System.out.println("");
                System.out.println("Want to remove another one?(YES/NO)");
                String respond1 = sc.next();

                if (respond1.equalsIgnoreCase("yes")) {
                    removeStudent();
                } else if (respond1.equalsIgnoreCase("no")) {
                    System.out.println("Want to perform another operation?(YES/NO)");
                    String respond2 = sc.next();

                    if (respond2.equalsIgnoreCase("yes")) {
                        m.operationsToBeDone();
                    } else if (respond2.equalsIgnoreCase("no")) {
                        System.out.println("Thank you for using our system");
                    }
                }
            }
        }
    }

    // Method to view all registered students
    void viewStudent() {
        System.out.println("Registered Students");
        System.out.println("");
        System.out.println(names); // Print student names list

        m.operationsToBeDone(); // Return to main menu
    }

}
