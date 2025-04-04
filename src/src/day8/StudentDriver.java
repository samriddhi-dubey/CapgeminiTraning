package day8;

public class StudentDriver {
	public static void main(String[] args) {
		// WORK FLOW OF THE CONTROL STATEMENTS

		// Step-1: goes to the constructor of the driver class having Student(), loads
		// all the non-static members of the class, assigns default values to the
		// variables

		// Student obj2 = new Student(); non-parameterized constructor

		Student obj1 = new Student(1, "Sam", "UEM", 89.23);// parameterized constructor
		System.out.println(obj1.collegeName + " " + obj1.id + " " + obj1.marks + " " + obj1.name);

		System.out.println("------------------------------------");
		Student obj2 = new Student(1, "Sam", "UEM");
		System.out.println(obj2.collegeName + " " + obj2.id + " " + obj2.name);

		System.out.println("--------------------------------");
		Student obj3 = new Student(1, "Sam");
		System.out.println(obj3.id + " " + obj3.name);
		System.out.println("--------------------------------------");
		Student obj4 = new Student(1);
		System.out.println(obj4.id);

		// Step-2: comes back to this class, reassigns the default values to the
		// assigned values
//		obj1.name = "Sam";
//		obj1.marks = 89.23;
//		obj1.id = 1;
//		obj1.collegeName = "UEM";
		// Step-3: prints the newly assigned values
//		System.out.println(obj1.collegeName + " " + obj1.id + " " + obj1.marks + " " + obj1.name);

		// Step-4: calls the method and executes it
//		obj1.studying();

//		System.out.println("----------------------------------------------");
		// Same things happen for the second object of the class
//		Student obj2 = new Student(2, "Ram", "IEM", 79.23);
//
//		obj2.name = "Ram";
//		obj2.marks = 79.23;
//		obj2.id = 2;
//		obj2.collegeName = "IEM";
//		System.out.println(obj2.collegeName + " " + obj2.id + " " + obj2.marks + " " + obj2.name);
//		obj2.studying();

	}

}
