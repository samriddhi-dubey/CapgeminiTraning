package oneToMany;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size"); //input from the user
		int size = sc.nextInt();

		Bank bank = new Bank(size, "SBI");
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to add customer\n Enter 2 to display customers\n Enter 3 to exit");
			int choice = sc.nextInt(); 
			switch (choice) {
			case 1:
				sc.nextLine(); //clearing the buffer memory
				String name = sc.nextLine(); //name of the customer
				Customer customer = new Customer(name); //creating the object of customer class
				bank.addCustomer(customer); //passing the customer object
				break;

			case 2:
				bank.displayCustomers();
				break;
			case 3:
				flag = false;
				break;
			}
			sc.close();
		}
	}

}
