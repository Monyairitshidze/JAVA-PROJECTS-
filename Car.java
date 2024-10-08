
public class Car extends Vehicle{
	
	Car() {
		
		this.name = "Audi";
		this.model = "SUV";
		this.year = 2023;
		
		System.out.println("The details of the car is: " + this.name +  this.model  + this.year );
	}
	
	
public  void carRent(int date) {
		
		int  vehicleAmount = 20;
		double vat = date*(vehicleAmount+0.10);
	     System.out.println("The total amount is: " + vat);
	     
	}

}
