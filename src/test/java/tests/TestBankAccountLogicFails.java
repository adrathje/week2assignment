package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;
import model.BankAccountLogic;
import model.Customer;

/*
 * 
 * By: Austin Rathje
 * Program Name: week2assignment
 * Date: 1/28/2020
 * Operating System: Windows 10
 * 
 * */

public class TestBankAccountLogicFails {
	Customer customer = new Customer();
	BankAccount bankAccount = new BankAccount(customer);
	BankAccountLogic bankLogic = new BankAccountLogic();
	
	@Before
	public void setUp() throws Exception {
		customer.setBalance(1000.0);
	}

	@Test
	public void testWithdraw() {
		System.out.println("Expecting insufficient funds...");
		bankLogic.withdraw(bankAccount, 1500.0);
		assertEquals(1000.0, customer.getBalance(), 0.0);
	}
	
	@Test
	public void testDeposit() {
		System.out.println("Expecting negative amount error message...");
		bankLogic.deposit(bankAccount, -45.0);
		assertEquals(1000.0, customer.getBalance(), 0.0);
	}
	
}
