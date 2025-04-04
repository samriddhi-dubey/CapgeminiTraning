package customException;

public class InsufficientBalanceException extends RuntimeException {
	String message;

	public InsufficientBalanceException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
