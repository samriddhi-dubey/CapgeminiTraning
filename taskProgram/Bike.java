package taskProgram;

public class Bike extends Vehicle{
	
	private boolean hasGear;
	
	Bike(boolean hasGear, String vehicleNumber,String brand,String model,double rentalPricePerDay){
		super(vehicleNumber,brand,model,rentalPricePerDay, true);
		this.hasGear=hasGear;
	}
	
	public void displayDetails() {
		rentVehicle();
		super.displayDetails();
		System.out.print(this.hasGear+"-It has a gear ");
	}

}
