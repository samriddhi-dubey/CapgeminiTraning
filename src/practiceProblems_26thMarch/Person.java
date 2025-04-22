package practiceProblems_26thMarch;

public class Person {

	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void displayPersonDetails() {
		System.out.println(this.name+" "+this.age);
	}

}
