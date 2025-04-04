package customException;

public class ATMDriver {
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.getBalance(1234);;
		atm.setBalance(10000, 1234);;
		atm.setBalance(10000, 1234);
		atm.getBalance(1234);
		atm.withdrawBalance(400000, 1234);
		atm.withdrawBalance(8000, 1241);
	}
}
