package abstractionTask;

public class Driver {
	public static void main(String[] args) {
		  Payment creditCardPayment = new CreditCardPayment(600.0, "TXN12345");
	      creditCardPayment.processPayment();

	      Payment payPalPayment = new PayPalPayment(300.0, "TXN67890");
	      payPalPayment.processPayment();
	}
  }

