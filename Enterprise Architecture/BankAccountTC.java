package com.acme.financial;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTC {
	
	@Test
	public void testTransfer() throws Exception {
		BankAccount savAcc= new BankAccount(1000);
		BankAccount chkAcc = new BankAccount(200);
		
		assertNotNull(savAcc);
		assertEquals("balance is savings is 1000", 1000, savAcc.getBalance());
		assertEquals("balance in checking is 200", 200, chkAcc.getBalance());
		
		savAcc.transfer(500, chkAcc);
		assertEquals("balance in savings is 500", 500, savAcc.getBalance());
		assertEquals("balance in savings is 700", 700, chkAcc.getBalance());
		
	}
	
	
//	@Test
//	public void testWithdraw() throws Exception {
//		BankAccount act = new BankAccount(500);
//		
//		assertNotNull(act);
//		assertEquals("balance should be 500", 500, act.getBalance());
//		
//		act.withdraw(300);
//		assertEquals("balance should be 200", 200, act.getBalance());
//	}
	
//	@Test
//	public void testDeposit() throws Exception {
//		BankAccount acct = new BankAccount(0);
//		
//		assertNotNull(acct);
//		assertEquals("balance should be 0",  0, acct.getBalance());
//		
//		acct.deposit(100);
//		assertEquals("balance should be 100",  100, acct.getBalance());
//		
//	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
