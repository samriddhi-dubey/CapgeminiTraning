package practiceProblem_27thMarch;

public class FullTimeEmployee extends Employee {

	private int bonus;

	FullTimeEmployee(String name, double salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}
	
	public void fullTimeEmployeeInfo() {
		System.out.println("Name:"+this.getName());
		System.out.println("Salary:"+this.getSalary());
		System.out.println("Bonus:"+this.bonus);
	}

}
