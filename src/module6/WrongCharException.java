package module6;

public class WrongCharException extends Exception {

	// Exception is designed to keep message and other exceptions details
	// When we create new Exception's class, usually we initialize all types of
	// constructor as Exception class has. 
	public WrongCharException(String message) {
		super(message);
	}

	public WrongCharException() {
		super();
	}

	public WrongCharException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongCharException(Throwable cause) {
		super(cause);
	}

}
