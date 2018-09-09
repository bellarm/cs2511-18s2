package tut07.account;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Testing the exceptions from BankAccount
 * Using JUnit 4
 * 
 * More information here: 
 * https://github.com/junit-team/junit4/wiki/exception-testing
 * 
 * @author bellarm
 *
 */
public class BankAccountTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test() throws InsufficienTBalanceException, LimitException {
		BankAccount bankAccount = new BankAccount(100);
		assertEquals(100, bankAccount.getBalance());
		bankAccount.withdraw(10);
		assertEquals(90, bankAccount.getBalance());
	}

	@Test(expected = LimitException.class)
	public void testLimitException() 
			throws InsufficienTBalanceException, 
			LimitException {
		BankAccount bankAccount = new BankAccount(900);
		bankAccount.withdraw(850);
	}

	@Test
	public void testLimitException2() 
			throws InsufficienTBalanceException, 
			LimitException {
		thrown.expect(LimitException.class);
		BankAccount bankAccount = new BankAccount(900);
		bankAccount.withdraw(850);
	}
	
	@Test
	public void testInsufficienTBalanceException() 
			throws InsufficienTBalanceException, 
			LimitException {
		thrown.expect(InsufficienTBalanceException.class);
		BankAccount bankAccount = new BankAccount(100);
		bankAccount.withdraw(200);
	}
}
