package taskProgram;

public class DriverInheritance {
	public static void main(String[] args) {
		Bike bike=new Bike(true, "JH052236","Hero Honda","Basic",2233.5);
		bike.displayDetails();
		System.out.println("\n------------------------------------");
		Car car=new Car(4,"JH052236","Tata","Basic",2233.5 );
		car.displayDetails();
		
		System.out.println("\n------------------------------------");
		Vehicle v=new Vehicle("JH052236","Hero Honda","Basic",2233.5, true);
		v.displayDetails();
		
		
		
		
		
	}

}
