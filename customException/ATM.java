package customException;

public class ATM {
	private int currentBalance = 50000;
	private int pin = 1234; 
	
	public void setBalance(int deposit, int pin) {
		if(this.pin == pin) {
			currentBalance += deposit;
		}
		else {
			throw new PinInvalidException("pin incorrect");
		}
	}
	
	public void getBalance (int pin) {
		if(this.pin == pin) {
			System.out.println(currentBalance);
		}
		else {
			throw new PinInvalidException("pin incorrect");
		}
	}
	
	public void withdrawBalance (int amount, int pin) {
		if(this.pin == pin) {
			if(currentBalance >= amount) {
				currentBalance -= amount;
				System.out.println(currentBalance);
			}
			else {
				throw new InsufficientBalanceException("insufficient balace");
			}
		}
		else {
			throw new PinInvalidException("pin incorrect");
		}
	}
}
