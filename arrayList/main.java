import java.util.Scanner; // Imports Scanner class for reading user input

public class main {

    public static void main(String[] args) {
        main m = new main(); // Creates an instance of the main class
        m.operatinsToBeDone(); // Starts the menu-driven program by calling the method
    }

    // Method to display and handle the main menu operations
    public void operatinsToBeDone() {
        Catalogue_Management cm = new Catalogue_Management(); // Creates an object for managing books
        member m = new member(); // Creates an object for managing members

        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.println("Welcome");
        System.out.println("Choose your option:");
        System.out.println("1.Catalogue Management");
        System.out.println("2.Member Management");
        System.out.println("3.Reporting");

        System.err.println("Enter a number coresponding with your option(1-3)");
        int respond1 = sc.nextInt(); // Reads user's menu choice

        // If user chooses catalogue management
        if (respond1 == 1) {
            System.out.println("Choose your option:");
            System.out.println("1.ADD BOOKS");
            System.out.println("2.SEARCH BOOKS");
            System.out.println("3.REMOVE BOOKS");

            System.err.println("Enter a number coresponding with your option");
            int respond2 = sc.nextInt(); // Reads user's choice for catalogue actions

            if (respond2 == 1) {
                cm.addBooks(); // Calls method to add books
            } else if (respond2 == 2) {
                cm.searchBook(); // Calls method to search for books
            } else if (respond2 == 3) {
                cm.removeBook(); // Calls method to remove books
            }
        }

        // If user chooses member management
        else if (respond1 == 2) {
            System.out.println("Choose your option:");
            System.out.println("1.ADD MEMBER");
            System.out.println("2.UPDATE MEMBER");
            System.out.println("3.REMOVE MEMBER");

            System.err.println("Enter a number coresponding with your option");
            int respond2 = sc.nextInt(); // Reads user's choice for member actions

            if (respond2 == 1) {
                m.addMember(); // Calls method to add a member
            } else if (respond2 == 2) {
                m.updateMember(); // Calls method to update a member
            } else if (respond2 == 3) {
                m.removeMember(); // Calls method to remove a member
            }
        }

        // If user chooses to view reports
        else if (respond1 == 3) {
            m.report(); // Calls method to print report
        }
    }
}
