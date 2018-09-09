//package tut07.account;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.Rule;
//import org.junit.jupiter.api.Test;
//import org.junit.rules.ExpectedException;
//
//class BankAccountTest5 {
//
//	@Rule
//	public ExpectedException thrown = ExpectedException.none();
//	
//	@Test
//	void test() throws InsufficienTBalanceException, LimitException {
//		BankAccount bankAccount = new BankAccount(100);
//		assertEquals(100, bankAccount.getBalance());
//		bankAccount.withdraw(10);
//		assertEquals(90, bankAccount.getBalance());
//	}
//
//	@Test
//	void testLimitException() 
//			throws InsufficienTBalanceException, 
//			LimitException {
//		thrown.expect(LimitException.class);
//		BankAccount bankAccount = new BankAccount(900);
//		bankAccount.withdraw(800);
//		assertTrue(false);
//	}
//}
