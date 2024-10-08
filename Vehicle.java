
import java.util.Scanner;

public class Vehicle {
	
	String name;
	String model;
	int year;
	
	public  void vehicleRent(int date) {
		
		int  vehicleAmount = 20;
		double vat = date*(vehicleAmount+0.10);
	     System.out.println("The total amount is: " + vat);
	     
	}
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the date:");
	int date1 = sc.nextInt();
	
	System.out.println("Enter the type of vehicle u want to rent: ");
	System.out.println("1. Car");
	System.out.println("2. Truck");
	System.out.println("3. MotorCycle");
	int choice = sc.nextInt();
	
	sc.close();
	
	    Car c = new Car();
	    Truck t = new Truck();
	    mototrCycle m = new mototrCycle();
	    
	    if(choice==1) {
	    	
	    	c.carRent(date1);
	    }
	    
	    else if(choice==2) {
	    	t.truckRent(date1);
	    }
	    else {
	    	m.motorcycleRent(date1);
	    }
	    
}
}


