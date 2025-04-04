package customException;

public class PinInvalidException extends RuntimeException {
	String message;

	public PinInvalidException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}