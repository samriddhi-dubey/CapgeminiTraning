package methodChaining;

public class StudentDriver {
	public static void main(String[] args) {
		Student s=new Student();
//		s.setName("Sam");
		s.setID(1).setName("Sam").display();
	}

}
