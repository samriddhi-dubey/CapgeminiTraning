package inheritance;

public class Driver {
	public static void main(String[] args) {
		Bike bike = new Bike("Kawasaki","V4");
		Car car=new Car("Feraari", 1000, "V8");
		bike.display();
		car.display();
		System.out.println(car.price);
	}

}
