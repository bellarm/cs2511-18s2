package tut06;

import java.time.LocalDate;

/**
 * @invariant balance >= 0
 */
public class BankAccount {
	private static final int WITHDRAW_LIMIT = 800;
	
	private int balance;
	private int todayWithdrawal;
	private LocalDate lastWithdrawal;
	
	/**
	 * @precondition balance >= 0
	 * @param balance
	 */
	public BankAccount(int balance) {
		this.balance = balance;
		todayWithdrawal = 0;
	}
	
	/**
	 * @precondition amount >= 0
	 * @postcondition balance >= 0
	 * @param amount
	 */
	public void deposit(int amount) {
		balance += amount;
	}
	
	/**
	 * @precondition amount >= 0
	 * @postcondition balance >= 0
	 * @param amount
	 */
	public boolean withdraw(int amount) {
		LocalDate today = LocalDate.now();
		if (lastWithdrawal == null || !sameDay(lastWithdrawal, today)) {
			todayWithdrawal = 0;
		}
		if (amount <= balance && amount + todayWithdrawal <= WITHDRAW_LIMIT) {
			balance -= amount;
			todayWithdrawal += amount;
			lastWithdrawal = today;
			return true;
		}
		return false;
	}
	
	private boolean sameDay(LocalDate day1, LocalDate day2) {
		return day1.equals(day2);
	}
}
