package reflectionAPI;

public class Employee {

	private String name;
	private int id;
	private int age;
	private double salary;

	Employee(String name, int id, int age, double salary) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
    @Deprecated
	public String getName() {
		return name;
	}
    @Deprecated
	public int getId() {
		return id;
	}
    @Deprecated
	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return id+"	"+name+" "+age+" "+salary;
	}

}
