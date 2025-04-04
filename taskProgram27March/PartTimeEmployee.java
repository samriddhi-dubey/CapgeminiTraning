package taskProgram27March;

public class PartTimeEmployee extends Employee{
	
	private int workingHours;
	
	PartTimeEmployee(int workingHours, String name, double salary){
		super(name,salary);
		this.workingHours=workingHours;
	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.print(this.workingHours);
	}
	
	public void designation() {
		System.out.println("\nEmployee is an associate");
	}
	
	public void jobRole() {
		System.out.println("cloud engineer-part time");
	}

}
