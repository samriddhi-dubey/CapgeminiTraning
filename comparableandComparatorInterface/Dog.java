package comparableandComparatorInterface;

import java.util.Arrays;
import java.util.Comparator;

public class Dog implements Comparable {

	String name;
	int age;
	String breed;

	Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Name:" + name + " " + "Age:" + age + " " + "Breed:" + breed;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Dog d = (Dog) o;

		if (this.name.compareTo(d.name) != 0) {
			return this.name.compareTo(d.name);
		}
		if (d.age - this.age != 0) {
			return d.age-this.age;
		}
		return 0;
	}

}
