package taskProgram;

public class Student extends Person {

	private int studentID;

	Student(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
	}

//	public void displayStudentDetails() {
//
//		System.out.println(getStudentID()+" "+getName()+" "+getAge());
//
//	}
//
//	public int getStudentID() {
//		return studentID;
//	}
	
	//can be done without using getter and setter
	public void displayStudentDetails() {
		displayDetails();
		System.out.println(" " + this.studentID);
	}

}
