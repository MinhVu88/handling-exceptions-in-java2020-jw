package main.java.com.pluralsight.handlingexceptions.sec4.custom_exceptions;

public class InvalidStatementException extends Exception {
	public InvalidStatementException(String message) {
		super(message);
	}
}
