package aggregation;

public class Driver {
	public static void main(String[] args) {
		Sim sim=new Sim(1234567895);
		Phone phone=new Phone("Samsung", sim);
		phone.display();
		//weak association-even without phone class we can get the sim class
		phone=null;
		System.out.println(sim.phoneNo);
	}

}

