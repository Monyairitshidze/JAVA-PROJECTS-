
import java.util.Scanner;

public class main {
    

    public static void main(String[] args) {

        main c = new main();
// Call addUser method to create user
User user = c.addUser();  // Store the returned User object
        
// Now, create an instance of main_Account to add account using the created user
main_Account ma = new main_Account();
ma.addAccount(user);  // Pass the user object to the addAccount method
}

    

    public static User addUser(){

        String name;
        String id;
        String address;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter user's name");
        name = sc.next();

        System.out.println("Enter user's ID");
        id = sc.next();

        System.out.println("Enter user's Address");
        address = sc.next();


    
        if(!name.isBlank() && !id.isBlank() && !address.isBlank()){


            System.out.println("Information Saved");

           
          
        }

    

        User user = new User(name, id, address);

        return user;
        
    }
}
