package taskProgramInterface;

public class VehicleTest {
	public static void main(String[] args) {
		AbstractVehicle v = new Car("Tata", 200);
		v.start();
		v.getCurrentSpeed();
		v.accelerate(10);
		v.brake(15);
		v.getCurrentSpeed();
		v.stop();
		
		v.displayDetails();
		v.displayType();
		System.out.println("-----------------------------");

		AbstractVehicle v1 = new Bike("Kawasaki", 100);
		v1.start();
		v1.getCurrentSpeed();
		v1.accelerate(10);
		v1.brake(15);
		v1.getCurrentSpeed();
		v1.stop();
		v1.displayDetails();
		v1.displayType();

		System.out.println("-----------------------------");

		AbstractVehicle v2 = new Truck("Tractor", 80);
		v2.start();
		v2.getCurrentSpeed();
		v2.accelerate(10);
		v2.brake(15);
		v2.getCurrentSpeed();
		v2.stop();
		v2.displayDetails();
		v2.displayType();
	}

}
