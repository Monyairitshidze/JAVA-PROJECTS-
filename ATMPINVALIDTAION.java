
package atmpinvalidtaion;

import java.util.Scanner;
public class ATMPINVALIDTAION {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        String pin = "12345";
        
        System.out.println("Enter your pin: ");
        String enterdPin = sc.next();
        
        
        
        for(int i=2; i>=0; i--) {
            
           if(enterdPin == null) {
              System.out.println("PLEASE ENTER PIN ");
           }
           else if(!enterdPin.equals(pin)) {
            System.out.println("Wrong pin" + i + " Try Left");
            System.out.println("Enter pin:");
            enterdPin = sc.next();
            
           }
        }
           
              while(pin.equals(enterdPin)){
            System.out.println("Choose your Option.");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money"); 
            
            break;  
            
        } 
           
        
    
    
    }
}
