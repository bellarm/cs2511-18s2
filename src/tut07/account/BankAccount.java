package tut07.account;

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
	
	public int getBalance() {
		return balance;
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
	public void withdraw(int amount) 
			throws InsufficienTBalanceException, LimitException {
		LocalDate today = LocalDate.now();
		if (lastWithdrawal == null || !sameDay(lastWithdrawal, today)) {
			todayWithdrawal = 0;
		}
		if (amount > balance) {
			throw new InsufficienTBalanceException("Not enough balance");
		}
		if (amount + todayWithdrawal > WITHDRAW_LIMIT) {
			throw new LimitException("Exceed daily limit");
		}
		balance -= amount;
		todayWithdrawal += amount;
		lastWithdrawal = today;
	}
	
	private boolean sameDay(LocalDate day1, LocalDate day2) {
		return day1.equals(day2);
	}
}
