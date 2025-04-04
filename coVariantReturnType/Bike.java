package coVariantReturnType;

public class Bike extends Vehicle {
	
//	public Vehicle getObject() {
//		return new Bike(); //upcasting
//		//if the return type of the object is parent and child is returned
//		//then there is no error because it is getting upcasted.
//	}
	
	//covariant data type
	public Bike getObject() {
		return new Bike();
		
		
	}

}
