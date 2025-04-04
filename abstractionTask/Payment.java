package abstractionTask;

public  abstract class  Payment {
	
	private double amount;
    private String transactionId;

    public Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    
    public double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }


    public double calculateDiscount() {
        return amount > 500 ? 0.10 * amount : 0.0;
    }

    public abstract void processPayment();
	
	

}
