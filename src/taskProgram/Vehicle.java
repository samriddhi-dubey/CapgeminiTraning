package taskProgram;

public class Vehicle {
	
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	Vehicle(String vehicleNumber,String brand,String model,double rentalPricePerDay, boolean isAvailable){
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rentalPricePerDay=rentalPricePerDay;
		this.isAvailable=isAvailable;
	}
	
	public void rentVehicle() {
		if(this.isAvailable) {
			System.out.println("yes, available to rent");
		}else {
			System.out.println("no, not available");
		}
	}
	public void displayDetails() {
		System.out.print(this.brand+" "+this.model+" "+this.rentalPricePerDay+" "+this.vehicleNumber+" ");
	}

}
