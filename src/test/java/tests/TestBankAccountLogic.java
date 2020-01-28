package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;
import model.BankAccountLogic;
import model.Customer;

public class TestBankAccountLogic {
	Customer customer = new Customer();
	BankAccount bankAccount = new BankAccount(customer);
	BankAccountLogic bankLogic = new BankAccountLogic();
	
	@Before
	public void setUp() throws Exception {
		customer.setBalance(1000.0);
	}

	@Test
	public void testCalculateAPR() {
		double calculatedAPR = bankLogic.calculateAPR(bankAccount);
		assertEquals(65.0, calculatedAPR, 0.0);
	}
	
	@Test
	public void testWithdraw() {
		bankLogic.withdraw(bankAccount, 550.0);
		assertEquals(450.0, customer.getBalance(), 0.0);
	}
	
	@Test
	public void testDeposit() {
		bankLogic.deposit(bankAccount, 45.0);
		assertEquals(1045.0, customer.getBalance(), 0.0);
	}
	
}
