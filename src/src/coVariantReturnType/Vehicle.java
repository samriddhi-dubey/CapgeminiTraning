package coVariantReturnType;

public class Vehicle {
	
	public Vehicle getObject() {
		return new Vehicle();
		//return new Bike(); error 
	}

}
