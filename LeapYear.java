
package leapyear;

import java.util.Scanner;
public class LeapYear {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        boolean run = true;
        int year;
        
         System.out.println("Enter the year");
         year = sc.nextInt();
        
        while(run) {
        
        if(year%4==0 || year%400 ==0 && year%100 !=0 ) {
            
           System.out.println("Year is leap year"); 
        }
        else {
          System.out.println("Year is not leap year");   
        }
        
        System.out.println("Do you want to try another year(enter y/n)");
        String answer = sc.next().toLowerCase();
        
        if(answer.equals("yes")) {
           System.out.println("Enter the year");
            year = sc.nextInt(); 
        }
        else {
            if(answer.equalsIgnoreCase("no")) {
            run = false;
            System.out.println("Thank you");
            }
        }
        }
        
        
    }
    
}
