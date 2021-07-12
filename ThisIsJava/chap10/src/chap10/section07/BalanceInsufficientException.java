package chap10.section07;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
		
	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
