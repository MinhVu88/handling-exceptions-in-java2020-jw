package main.java.com.pluralsight.handlingexceptions.sec5;

public class InvalidStatementException extends Exception {
	public InvalidStatementException(String message) {
		super(message);
	}

	public InvalidStatementException(String message, Exception e) {
		super(message, e);
	}
}
