
public class Truck extends Vehicle {
	
	Truck() {
		
		this.name = "TATA";
		this.model = "unknown";
		this.year = 2022;
	}
	
	
	public  void truckRent(int date) {
			
			int  vehicleAmount = 20;
			double vat = date*(vehicleAmount+0.15);
		     System.out.println("The total amount is: " + vat);
		     
		}

}
