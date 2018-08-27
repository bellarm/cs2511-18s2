package tut06;

import java.time.LocalDate;

/**
 * @invariant balance >= 0
 */
public class InternetAccount extends BankAccount {
	private static final int PAYMENT_LIMIT = 10;
	
	private int numPayment;
	private LocalDate lastPayment;
	
	/**
	 * @precondition balance >= 0
	 * @param balance
	 */
	public InternetAccount(int balance) {
		super(balance);
		numPayment = 0;
	}
	
	/**
	 * @precondition amount >= 0
	 * @postcondition balance >= 0
	 * @param amount
	 */
	public void makePayment(int amount) {
		LocalDate today = LocalDate.now();
		if (lastPayment == null || !sameMonth(lastPayment, today)) {
			numPayment = 0;
		}
		if (numPayment <= PAYMENT_LIMIT) {
			if (withdraw(amount)) {
				numPayment += 1;
				lastPayment = today;
			}
		}
	}
	
	private boolean sameMonth(LocalDate day1, LocalDate day2) {
		return (day1.getMonth() == day2.getMonth() && 
				day1.getYear() == day2.getYear());
	}
}
