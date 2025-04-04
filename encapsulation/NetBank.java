package encapsulation;

public class NetBank {
	private int balance = 500000;
	private int pin = 1234;

	public void getBalance(int pin) {
		if (this.pin == pin) {
			System.out.println(balance);
		} else {
			System.out.println("Invalid pin");
		}
	}

	public void setBalance(int deposit, int pin) {
		if (this.pin == pin) {
			balance += deposit;
			System.out.println(balance);
		} else {
			System.out.println("Invalid pin");
		}
	}

	public void withdraw(int withdraw, int pin) {
		if (this.pin == pin) {
			if (balance >= withdraw) {
				balance -= withdraw;
			} else {
				System.out.println("Insufficient balance");
			}
		} else {
			System.out.println("Invalid pin");
		}
	}
}
