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

	public Student() {
		System.out.println("Non-Parameterized Constructor is called");
	}

	public Student(int id) {
		System.out.println("1 Parameterized Constructor is called");
		this.id = id;
	}

	public Student(int id, String name) {
		this(id); //this call statement
		this.name = name;
		// To prevent code redundancy we will pperform constructor chaining using this
		// call statement
        //this.id=id;
		System.out.println("2 Parameterized Constructor is called");

	}

	public Student(int id, String name, String collegeName) {
		this(id, name);
		System.out.println("3 Parameterized Constructor is called");
		this.collegeName = collegeName;
//		this.name = name;
//		this.id = id; code redundancy
	}

	public Student(int id, String name, String collegeName, double marks) {
		this(id, name, collegeName);
		System.out.println("4 Parameterized Constructor is called");
		this.marks = marks;
//		this.collegeName = collegeName;
//		this.name = name;
//		this.id = id; code redundancy
	}

//	public Student(int x, String s1, String s2, double m) {
//		id=x;
//		name=s1;
//		collegeName=s2;
//		marks=m;
//		
//	}

	public void studying() {
		System.out.println(name + " is studying");
	}

}
