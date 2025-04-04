package customException;

public class UserLogin {
	private int pin = 1234;
	
	public void login(int pin) throws PinInvalidException {
		if (this.pin == pin) {
			System.out.println("user successfully logged in");
		}
		else {
			throw new PinInvalidException("Pin incorrect");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		UserLogin user = new UserLogin();
		try {
			user.login(1223);
		} catch (PinInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
	}
}
