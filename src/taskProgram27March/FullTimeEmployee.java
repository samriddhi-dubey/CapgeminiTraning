package taskProgram27March;

public class FullTimeEmployee extends Employee{
	
	private int bonus;
	
	FullTimeEmployee(int bonus, String name, double salary){
		super(name,salary);
		this.bonus=bonus;
	}
	
	public void employeeInfo() {
		super.employeeInfo();
		System.out.print(this.bonus);
	}
	public void jobRole() {
		System.out.println("\nSoftware Engineer");
	}

}
