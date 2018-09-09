package tut07.account;

public class InsufficienTBalanceException extends Exception {
	public InsufficienTBalanceException(String message) {
		super(message);
	}
}
