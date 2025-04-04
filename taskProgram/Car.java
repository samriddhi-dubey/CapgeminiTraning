package taskProgram;

public class Car extends Vehicle{
	
	private int numberOfDoors;
	
	Car(int numberOfDoors,String vehicleNumber,String brand,String model,double rentalPricePerDay){
		super(vehicleNumber,brand,model,rentalPricePerDay, true);
		this.numberOfDoors=numberOfDoors;
	}
	
	public void displayDetails() {
		rentVehicle();
		super.displayDetails();
		System.out.print(this.numberOfDoors+" number of doors are present. ");
	}

}
