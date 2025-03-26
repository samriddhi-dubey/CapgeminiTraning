package taskProgram;

public class Person {

	private String name;
	private int age;

	Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

//	public String getName() {
//		return name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//	
//	public void displayDetails() {
//		System.out.println(getName()+" "+getAge());
//	}
	
	//can also be done without using getter  and setters
	
	public void displayDetails() {
		System.out.print(this.name+" "+this.age);
	}

}
