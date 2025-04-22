package practiceProblems_26thMarch;

public class Student extends Person {

	private int studentid;

	public int getStudentid() {
		return studentid;
	}

	Student(String name, int age, int studentid) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.studentid = studentid;
	}
	
	public void displayStudentDetails() {
		System.out.println(getName()+" "+getAge()+" "+this.studentid);
	}

}
