package treeSet;

public class Employee implements Comparable<Employee> {

	String name;
	int salary;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + "	" + salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int)(o.salary-this.salary);
 	}

}
