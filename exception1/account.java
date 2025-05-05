
import java.util.InputMismatchException;
import java.util.Scanner;

public class account {

    main m = new main();

    Scanner sc = new Scanner(System.in);

    int balance = 0;
    
    public void deposit() {

        while (true) {

            try {
                System.out.println("Enter the amount");
                int amount = sc.nextInt();
    
                if (amount <= 0) {
                    System.out.println("Amount must be greater than 0. Try again.");
                    continue;
                }
    
                balance = balance + amount;
                System.out.println("");
                System.out.println("Balance is: " + balance);
                break; // exit the loop after successful input
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine(); // clear the invalid input
            }
        }

        System.out.println("Want to do another function: ");
        String respond = sc.next();

        if(respond.equalsIgnoreCase("yes")){

            m.operataionToBeDone();

        }
    }
    

    public void withdrawal() {
        while (true) {
            try {
                System.out.println("Enter amount to withdraw");
                int amount = sc.nextInt();
    
                if (amount <= 0) {
                    System.out.println("Amount must be greater than 0. Try again.");
                    continue;
                }
    
                if (balance >= amount) {
                    System.out.println("Processing...");
                    balance = balance - amount;
                    System.out.println("Available Balance: " + balance);
                    break;
                } else {
                    System.out.println("Insufficient balance. Try a lower amount.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine(); // clear invalid input
            }
        }
    }
    
    
}
