package abstractionTask;

public class PayPalPayment extends Payment {
	
	  public PayPalPayment(double amount, String transactionId) {
	        super(amount, transactionId);
	    }

	    @Override
	    public void processPayment() {
	        System.out.println("Processing PayPal Payment...");
	        double discount = calculateDiscount();
	        double fee = 0.03 * (getAmount() - discount);
	        double finalAmount = (getAmount() - discount) + fee;

	        System.out.println("Transaction ID: " + getTransactionId());
	        System.out.println("Original Amount: " + getAmount());
	        System.out.println("Discount Applied: " + discount);
	        System.out.println("Transaction Fee: " + fee);
	        System.out.println("Final Payable Amount: " + finalAmount);
	        System.out.println("PayPal Payment Successful!\n");
	    }

}
