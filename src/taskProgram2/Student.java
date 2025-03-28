package taskProgram2;

public class Student extends Person{
	
	private int studentId;
	
	Student(int studentId,String name, int age){
		super(name,age);
		this.studentId=studentId;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println(this.studentId);
	}
	

}
