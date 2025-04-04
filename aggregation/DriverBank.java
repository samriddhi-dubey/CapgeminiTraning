package aggregation;

public class DriverBank {
	public static void main(String[] args) {
		Customer customer=new Customer("Samriddhi");
		Bank bank=new Bank("ICICI", customer);
		bank.display();
		
		bank=null;
		System.out.println(customer.customerName);
		}

}
