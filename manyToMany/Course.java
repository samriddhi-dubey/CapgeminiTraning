package manyToMany;

public class Course {
	String name;
	
	Student[] students;
	
	Course(String name, int size){
		this.name=name;
		students=new Student[size];
	}

}
