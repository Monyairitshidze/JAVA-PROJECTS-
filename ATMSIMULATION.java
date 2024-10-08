
package atmsimulation;

import java.util.Scanner;
public class ATMSIMULATION {

    public static void main(String[] args) {
        double balance = 0.0;
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Choose your Option.");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("Enter your choice(1-3)");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your available balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter your deposit: ");
                    double moneyIn = sc.nextDouble();
                    balance += moneyIn;
                    System.out.println(moneyIn + " was deposited into your savings account");
                    System.out.println("Your available amount is: " + balance);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double moneyOut = sc.nextDouble();
                    if (moneyOut > balance) {
                        System.out.println("Insufficient amount");
                        System.out.println("Available amount is: " + balance);
                        System.out.println("Try another amount to withdraw: ");
                        moneyOut = sc.nextDouble();
                        if (moneyOut <= balance) {
                            balance -= moneyOut;
                            System.out.println(moneyOut + " was withdrawn from your account ");
                            System.out.println("Your available amount is: " + balance);
                        }
                    } 
                    
                    break;
            }

            System.out.println("Do you want to do another transaction?");
            System.out.println("For yes enter (1) and For no enter (2)");
            int con = sc.nextInt();

            if (con == 2) {
                run = false;
                System.out.println("Thank you for using our ACCOUNT");
            }
        }
        sc.close();
    }
}