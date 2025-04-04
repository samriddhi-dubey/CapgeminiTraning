package comparableandComparatorInterface;

public class Employee implements Comparable {

	 int id;
	 String name;
	 int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary= " + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e=(Employee)o;
		
		return this.name.compareToIgnoreCase(e.name);
	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		//comparing based on salary
//		Employee e = (Employee) o; //downcasting
//		return (int) (this.salary - e.salary);
//	}
	
	

}
