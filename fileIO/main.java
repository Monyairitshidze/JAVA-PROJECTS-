import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Registration
        System.out.println("USER REGISTRATION");

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter the password: ");
        String password = sc.next();

        // Write credentials to file
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("output.txt"));
            bf.write(username);
            bf.newLine();  // Move to the next line
            bf.write(password);
            bf.newLine();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Login
        System.out.println("\nUSER LOGIN");

        System.out.print("Enter Username: ");
        String usernameL = sc.next();

        System.out.print("Enter the password: ");
        String passwordL = sc.next();

        try {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String fileUsername = br.readLine();  // First line: username
            String filePassword = br.readLine();  // Second line: password
            br.close();

            if (usernameL.equals(fileUsername) && passwordL.equals(filePassword)) {
                System.out.println("✅ Successfully Logged In");
            } else {
                System.out.println("❌ Login Failed: Incorrect Username or Password");
            }

        } catch (FileNotFoundException e) {
            System.out.println("User data file not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

