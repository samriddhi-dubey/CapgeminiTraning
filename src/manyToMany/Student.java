package manyToMany;

public class Student {

	String name;
	Course[] arr;
	int count = 0; // we have many students

	Student(String name, int size) {
		this.name = name;
		arr = new Course[size];
	}

	public void addCourse(Course course) {
		if (count < arr.length) {
			arr[count++] = course;
			System.out.println("Course added");

		} else {
			System.out.println("Arraay filled");
		}
	}
}
