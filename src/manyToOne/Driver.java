package manyToOne;

public class Driver {
	
	public static void main(String[] args) {
		Bank bank=new Bank("SBI");
		Customer c1= new Customer(1, "Sam", bank);
		Customer c2= new Customer(2, "Ram", bank);
		Customer c3= new Customer(3, "Raj", bank);
		
		c1.display();
		c2.display();
		c3.display();
		
	}

}
