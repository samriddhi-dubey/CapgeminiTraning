package methodChaining;

public class Student {
	String name;
	int id;
	
	public Student setName(String name) {
		this.name=name;
		return this;
	}
	public Student setID(int id) {
		this.id=id;
		return this; //returns the current calling object
	}
	
	public void display() {
		System.out.println(this.name+" "+this.id);
	}

}
