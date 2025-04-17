package hashSet_Collections;

import java.util.Objects;

public class Student {

	int id;
	String name;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name + "	" + id;
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		return this.id == s.id && Objects.equals(this.name, s.name);
	}

	public int hashCode() {
		return id + name.hashCode();
	}
}
