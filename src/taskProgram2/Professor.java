package taskProgram2;

public class Professor extends Person {
	
	private String specialization;
	
	Professor(String specialization,String name, int age){
		super(name,age);
		this.specialization=specialization;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println(this.specialization);
	}

}
