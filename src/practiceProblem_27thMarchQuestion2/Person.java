package practiceProblem_27thMarchQuestion2;

public class Person {
	
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	
	public void displayInfo() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
	}

}
