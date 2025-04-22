package practiceProblem_27thMarchQuestion2;

public class University {
	
	Person [] people=new Person[5];
	private int index=0;
	
	public void addPerson(Person p) {
		if(index < people.length) {
			people[index++]=p;
		}else {
			System.out.println("University is full...");
		}
	}
	
	public void showPeople() {
		for(int i=0;i<people.length;i++) {
			people[i].displayInfo();
			System.out.println("---------------");
		}
	}
	

}
