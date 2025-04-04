package inheritance;

public class Car extends Vehicle {
	int price;
	
	public Car(String name, int price,String engineType) {
		this.name=name;
		this.engineType=engineType;
		this.price=price;
	}

}
