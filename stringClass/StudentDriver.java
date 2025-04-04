package stringClass;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Anwesa", 1, 'F', 350);
		Student s2 = new Student("Sinha", 2, 'F', 200);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
