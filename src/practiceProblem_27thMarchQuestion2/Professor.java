package practiceProblem_27thMarchQuestion2;

public class Professor extends Person {
	private String specialization;
	
	Professor(String specialiazation,String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.specialization=specialiazation;
		
	}
	
	public void displayProfessorInfo() {
		super.displayInfo();
		System.out.println("Specialization:"+this.specialization);
	}

	
	

}
