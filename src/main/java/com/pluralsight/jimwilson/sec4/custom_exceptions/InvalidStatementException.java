package main.java.com.pluralsight.jimwilson.sec4.custom_exceptions;

public class InvalidStatementException extends Exception {
	public InvalidStatementException(String message) {
		super(message);
	}
}
