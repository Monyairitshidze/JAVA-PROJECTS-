
public class mototrCycle extends Vehicle {
	
	mototrCycle() {
		
		this.name = "TFT";
		this.model = "un23";
		this.year = 2020;
		
	}

	
	public  void motorcycleRent(int date) {
			
			int  vehicleAmount = 20;
			double vat = date*(vehicleAmount+0.05);
		     System.out.println("The total amount is: " + vat);
		     
		}
}
