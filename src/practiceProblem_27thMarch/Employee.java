package practiceProblem_27thMarch;

public class Employee {

	private String name;
	private double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void employeeInfo() {
		System.out.println("The name of Employee:"+ this.name+" "+"Employee's salary is:"+this.salary);
	}

}
