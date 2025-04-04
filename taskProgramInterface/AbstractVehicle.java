package taskProgramInterface;

public abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;
	
	AbstractVehicle(String name, int speed){
		this.name=name;
		this.speed=speed;
	}
	public void displayDetails() {
		System.out.println("The Vehicle details are: "+this.name+" "+this.speed);
	}
	
	@Override
	public void accelerate(int increment) {
		
	}
	
	@Override
	public void brake(int decrement) {
		
	
	}
	
	public void getCurrentSpeed() {
		
	}

}
