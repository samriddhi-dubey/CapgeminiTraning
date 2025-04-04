package manyToMany;

import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {

		Student s1 = new Student("Sam", 3);
		Student s2 = new Student("Ram", 4);

		Course c1 = new Course("CSE", 3);
		Course c2 = new Course("AIML", 4);
		Course c3 = new Course("IOT", 2);

		s1.addCourse(c1);
		s1.addCourse(c2);
		s2.addCourse(c3);
		s2.addCourse(c1);

		System.out.println(Arrays.toString(s1.arr) + "   " + Arrays.toString(s2.arr));

	}

}
