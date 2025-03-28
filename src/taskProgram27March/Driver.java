package taskProgram27March;

public class Driver {
	public static void main(String[] args) {
		Employee employee1 = new FullTimeEmployee(20000, "Sam", 225566.3);
		employee1.employeeInfo();
		((FullTimeEmployee) employee1).jobRole();
		Employee employee2 = new PartTimeEmployee(9, "Ram", 2255633.3);
		employee2.employeeInfo();
		((PartTimeEmployee) employee2).designation();
		System.out.println("------------------------------------------------------");
		details(employee2);

	}

	static void details(Employee e) {
//		e.jobRole();
		if(e instanceof FullTimeEmployee) { //check the type of object.mainly used in cases to avaoid class cast exception duuring downcasting
			e.jobRole();
		}else {
			e.jobRole();
			((PartTimeEmployee)e).designation();
		}

	}

//	static void details(PartTimeEmployee p) {
//		p.jobRole();
//		p.designation();
//	}

}
