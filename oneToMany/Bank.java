package oneToMany;

public class Bank {

	Customer[] customers; //Customer type of array to store customers-Customer is a dataType here-cutsomers is a variable for customer array
	String bankname;
	static int count = 0;

	Bank(int size, String bankName) {
		customers = new Customer[size];  //creating the customer array for the size that user entered
		this.bankname = bankName;
	}

	public void addCustomer(Customer customer) { //inside customer array-accpeting a customer object
		if (count < customers.length) {
			customers[count++] = customer;
			System.out.println("Customer added");

		} else {
			System.out.println("Cannot add customer, array filled");
		}

	}

	public void displayCustomers() { //displaying all the customer objects
		for (int i = 0; i < count; i++) {
			System.out.println(customers[i].customerName);
		}
	}

}
//add,fetch,remove customer by id

//one user-many posts
//one bank-many users(user has post description, post id)