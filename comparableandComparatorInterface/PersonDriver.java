package comparableandComparatorInterface;

public class PersonDriver {

	public static void main(String[] args) {
		Person p1 = new Person("Sam", 23);
		Person p2 = new Person("Sam", 23);

		if (p1.compareTo(p2) > 0) {
			System.out.println("P1 is greater");

		} else if (p1.compareTo(p2) < 0) {
			System.out.println("P2 is greater");
		} else {
			System.out.println("Both are same");
		}

	}

}
