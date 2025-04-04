package taskProgramInterface;

public class Car extends AbstractVehicle {

	Car(String name, int speed) {
		super(name, speed);

	}

	public void start() {
		System.out.println("Car is starting...");

	}

	public void stop() {
		System.out.println("Car has stopped");
	}

	public void accelerate(int increment) {
		System.out.println("Accelerated speed:" + (this.speed += increment));

	}

	public void brake(int decrement) {
		System.out.println("Decremented speed:" + (this.speed -= decrement));

	}

	public void getCurrentSpeed() {
		System.out.println("Current speed:" + this.speed);

	}

	public void displayType() {
		System.out.println("The Vehicle is of " + this.name + " type.");

	}

}
