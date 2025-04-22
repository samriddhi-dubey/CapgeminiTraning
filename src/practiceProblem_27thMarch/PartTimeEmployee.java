package practiceProblem_27thMarch;

public class PartTimeEmployee extends Employee {

	private int workingHours;

	PartTimeEmployee(String name, double salary, int workingHours) {
		super(name, salary);
		this.workingHours = workingHours;
	}

	public void partTimeEmployeeInfo() {
		System.out.println("The working hours of " + this.getName() + " is " + this.workingHours
				+ ".The salary of the Employee is " + this.getSalary());
	}

}
