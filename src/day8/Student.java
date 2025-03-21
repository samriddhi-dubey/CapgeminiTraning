package day8;

public class Student {

//	int id=1;
//	String name="Sam";
//	String collegeName="UEM";
//	double marks=89.96;

	int id;
	String name;
	String collegeName;
	double marks;
	
//	public Student() {
//		System.out.println("Non-Parameterized Constructor is called");
//	}
	
	public Student(int x, String s1, String s2, double m) {
		id=x;
		name=s1;
		collegeName=s2;
		marks=m;
		
	}

	public void studying() {
		System.out.println(name + " is studying");
	}

}
