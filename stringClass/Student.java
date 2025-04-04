package stringClass;

import java.util.Scanner;

public class Student {
	String name;
	int id;
	char gender;
	double marks;
	
	public Student(String name, int id, char gender, double marks) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.marks = marks;
	}
	
	public int hashCode() {
		return (int)(this.id+this.marks+this.gender+this.name.hashCode());
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
			return this.marks == student.marks && this.id == student.id && this.gender == student.gender && this.name.equals(student.name);
		}
		return false;
	}
	
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gender=" + gender + ", marks=" + marks + "]";
	}
}
