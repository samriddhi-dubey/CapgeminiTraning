package comparableandComparatorInterface;

public class Person implements Comparable {

	int age;
	String name;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name:" + name + " " + "Age:" + age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p = (Person) o;

		if ((this.name.compareTo(p.name)) != 0) {
			return (this.name.compareTo(p.name));
		} else
			return this.age - p.age;
	}

}
