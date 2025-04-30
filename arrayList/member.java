import java.awt.print.Book; // This import is unused and can be removed
import java.util.ArrayList; // Imports the ArrayList class
import java.util.Scanner; // Imports the Scanner class for user input

public class member {

    Scanner sc = new Scanner(System.in); // Used to read user input
    static ArrayList<String> users = new ArrayList<String>(); // Stores list of user names
    main m = new main(); // Creates an instance of the main class (assumed to have operatinsToBeDone method)

    public void addMember() {
        System.out.println("Add Meamber"); // Prompts the user to add a member (typo: Meamber)
        System.out.println("Add name");
        String name = sc.next(); // Reads name input from user

        users.add(name); // Adds the name to the users list
        System.out.println("User added successfully");

        System.out.println("You want to add another Member?(YES/NO)");
        String respond = sc.next(); // Reads user's response

        if (respond.equalsIgnoreCase("yes")) {
            addMember(); // Recursively calls addMember to add another
        } else if (respond.equalsIgnoreCase("no")) {
            System.out.println("Do you want to perform another operation?");
            String respond2 = sc.next(); // Asks if user wants to perform another operation

            if (respond2.equalsIgnoreCase("yes")) {
                m.operatinsToBeDone(); // Calls method in main class
            } else if (respond2.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using our system"); // Ends process
            }
        }
    }

    public void updateMember() {
        System.out.println("Enter the name to be updated");
        String name = sc.next(); // Reads the name to be updated

        for (Object user : users) { // Iterates through the list of users
            if (user.equals(name)) {
                int indexOfName = users.indexOf(name); // Gets index of the name in the list

                System.out.println("Enter new name");
                String name2 = sc.next(); // Reads new name
                users.set(indexOfName, name2); // Replaces old name with new name
                System.out.println("Name successfully updated");

                System.out.println("");
                System.out.println("You want to Change another one?(Yes/No)");
                String respond = sc.next();

                if (respond.equalsIgnoreCase("yes")) {
                    updateMember(); // Calls method again if user wants to update another
                } else if (respond.equalsIgnoreCase("no")) {
                    System.out.println("Do you want to perform another operation?");
                    String respond2 = sc.next();

                    if (respond2.equalsIgnoreCase("yes")) {
                        m.operatinsToBeDone(); // Calls another operation
                    } else if (respond2.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for using our system"); // Ends process
                    }
                }
            }
        }

        // This condition checks if the name wasn't found (logic could be improved)
        if (!users.equals(name)) {
            System.out.println("Name enterd doesnt exists");
            System.out.println("Want to try?(Yes/NO)");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("yes")) {
                updateMember(); // Tries again
            }
        }
    }

    public void removeMember() {
        System.out.println("Enter the name of user to be removed");
        String name = sc.next(); // Reads name to remove

        if (users.contains(name)) {
            users.remove(name); // Removes user from list
            System.out.println("User was successfully removed");
            System.out.println("");

            System.out.println("Want to remoce another one?(YES/NO)");
            String respond = sc.next();

            if (respond.equalsIgnoreCase("yes")) {
                removeMember(); // Removes another if user says yes
            } else if (respond.equalsIgnoreCase("no")) {
                System.out.println("Want to perform another operation(YES/NO)");
                String respond2 = sc.next();

                if (respond2.equalsIgnoreCase("yes")) {
                    m.operatinsToBeDone(); // Performs another operation
                } else if (respond2.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for using our system"); // Ends process
                }
            }
        } else {
            System.out.println("User doesnt exist"); // User not found
            System.out.println("Want to try again(YES/NO)");
            String respond = sc.next();

            if (respond.equalsIgnoreCase("yes")) {
                removeMember(); // Try removing again
            } else if (respond.equalsIgnoreCase("no")) {
                System.out.println("Want to perform another operation(YES/NO)");
                String respond2 = sc.next();

                if (respond2.equalsIgnoreCase("yes")) {
                    m.operatinsToBeDone(); // Another operation
                } else if (respond2.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for using our system"); // Ends process
                }
            }
        }
    }

    public void report() {
        Catalogue_Management cm = new Catalogue_Management(); // Creates instance of catalogue class

        System.out.println("Full Detail Report");
        System.out.println("Number of Students Registerd " + users.size()); // Prints number of users
        System.out.println("");
        System.out.println("Students Names " + users); // Prints list of users
        System.out.println("");
        System.out.println("Number of Books Availables " + cm.book.size()); // Prints number of books
        System.out.println("");
        System.out.println("List of Books Availables " + cm.book); // Prints list of books
        System.out.println("");
        System.out.println("want to perform another operation(YES/NO)");
        String respond = sc.next();

        if (respond.equalsIgnoreCase("yes")) {
            m.operatinsToBeDone(); // Perform another operation
        } else if (respond.equalsIgnoreCase("no")) {
            System.out.println("Thanks for using our System"); // Ends process
        }
    }
}
