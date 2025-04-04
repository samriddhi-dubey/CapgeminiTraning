package day8;

public class Employee {
	int id;
	String name;
	double salary;
	String companyName;

	Employee() {
		System.out.println("Welcome to the team");
	}

	Employee(int id) {
		this.id = id;
	}

	Employee(int id, String name) {
		this(id);
		this.name = name;
	}

	Employee(int id, String name, double salary) {
		this(id, name);
		this.salary = salary;
	}
	Employee(int id, String name, double salary, String companyName){
		this(id,name, salary);
		this.companyName=companyName;
	}
}
