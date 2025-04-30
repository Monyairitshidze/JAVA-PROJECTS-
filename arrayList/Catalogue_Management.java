import java.util.ArrayList;
import java.util.Scanner;

public class Catalogue_Management {

    Scanner sc = new Scanner(System.in); // Scanner object for user input
    static ArrayList<String> book = new ArrayList<String>(); // ArrayList to store book names
    main m = new main(); // Creating object of main class to call other operations

    // Method to add books
    public void addBooks() {

        System.out.println("ADD NEW BOOKs");
        System.out.println("Enter book name:");
        String bookName = sc.next(); // Taking book name input
        book.add(bookName); // Adding book to the ArrayList

        // Displaying available books
        System.out.println("Available books: " + book);
        System.out.println("");

        System.out.println("You want to add another Book? (YES/NO)");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("yes")) {
            addBooks(); // If user says yes, call addBooks() again
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Want to perform another task? (YES/NO)");
            String answer1 = sc.next();

            if (answer1.equalsIgnoreCase("yes")) {
                m.operatinsToBeDone(); // Perform another task
            } else if (answer1.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using our system"); // Exit message
            }
        }

    }

    // Method to search books
    public void searchBook() {
        
        System.out.println("Search books");
        System.out.println("Enter the name of the book");
        String name = sc.next(); // Input book name
        String answer;

        // Check if the book exists in the list
        if (book.contains(name)) {

            System.out.println("Book is Available");

            // Ask if user wants to search another book
            System.out.println("You want to search another book? (Yes/No)");
            answer = sc.next();

            if (answer.equalsIgnoreCase("yes")) {
                searchBook(); // Call searchBook() again
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Want to perform another task? (Yes/No)");
                String answer1 = sc.next();

                if (answer1.equalsIgnoreCase("yes")) {
                    m.operatinsToBeDone(); // Perform another task
                } else if (answer1.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for using our system"); // Exit message
                }
            }
        } else {
            System.out.println("Book is not Available. Sorry!");

            // Ask if user wants to try searching again
            System.out.println("You want to search another book? (Yes/No)");
            answer = sc.next();

            if (answer.equalsIgnoreCase("yes")) {
                searchBook(); // Try searching again
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Want to perform another task? (Yes/No)");
                String answer1 = sc.next();

                if (answer1.equalsIgnoreCase("yes")) {
                    m.operatinsToBeDone(); // Perform another task
                } else if (answer1.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for using our system"); // Exit message
                }
            }
        }
    }

    // Method to remove books
    public void removeBook() {

        System.out.println("Enter the name of the book you want to remove");
        String name = sc.next(); // Input book name to remove

        // Loop through the list to find and remove the book
        if (book.contains(name)) {
            book.remove(name); // Remove the book from the list
            System.out.println("Book removed successfully!");
            System.out.println("Available Books:" + book);

            // Ask if user wants to perform another task
            System.out.println("Want to perform another task? (YES/NO)");
            String answer1 = sc.next();

            if (answer1.equalsIgnoreCase("yes")) {
                m.operatinsToBeDone(); // Perform another task
            } else if (answer1.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using our system"); // Exit message
            }
        } else {
            // If book not found, ask the user if they want to try again
            System.out.println("Book doesn't exist. Try again.");
            System.out.println("You want to try again? (Yes/No)");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("yes")) {
                removeBook(); // Try removing again
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Want to perform another task? (YES/NO)");
                String answer1 = sc.next();

                if (answer1.equalsIgnoreCase("yes")) {
                    m.operatinsToBeDone(); // Perform another task
                } else if (answer1.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for using our system"); // Exit message
                }
            }
        }
    }
}

