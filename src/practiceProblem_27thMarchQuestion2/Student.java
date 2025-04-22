package practiceProblem_27thMarchQuestion2;

public class Student extends Person {
    
	
	private int studentid;
	Student(int age, String name, int studentid) {
		super(name, age);
		
		this.studentid=studentid;
	}
	
	public void displayStudentInfo() {
		super.displayInfo();
		System.out.println("StudentID:"+this.studentid);
		
		System.out.println("---------------------");
	}

}
