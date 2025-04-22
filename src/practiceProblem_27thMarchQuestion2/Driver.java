package practiceProblem_27thMarchQuestion2;


public class Driver {
	public static void main(String[] args) {
		University university=new University();
		
		 Student s1 = new Student(20,"Sam",26);
	        Student s2 = new Student(21,"Ram", 6);

	        Professor p1 = new Professor("IOT","Sam", 56);
	        Professor p2 = new Professor("IOT","Sam", 56);
	        Professor p3 = new Professor("IOT","Sam", 56);
	        p3.displayProfessorInfo();

	        university.addPerson(s1);
	        university.addPerson(s2);
	        university.addPerson(p1);
	        university.addPerson(p2);
	        university.addPerson(p3);

	        university.showPeople();

	}

}
