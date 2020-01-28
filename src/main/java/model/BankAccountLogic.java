package model;

/*
 * 
 * By: Austin Rathje
 * Program Name: week2assignment
 * Date: 1/28/2020
 * Operating System: Windows 10
 * 
 * */

public class BankAccountLogic {

	/**
	 * Calculates a bank accounts APR amount.
	 * 
	 * @param bankAccount
	 * @return
	 */
	public double calculateAPR(BankAccount bankAccount) {
		double aprAmount = 0.0;
		aprAmount = bankAccount.getCustomer().getBalance() * bankAccount.getAPR();

		return aprAmount;
	}

	/**
	 * Withdraws funds from a bank account.
	 * 
	 * @param bankAccount
	 * @param withdrawAmount
	 */
	public void withdraw(BankAccount bankAccount, double withdrawAmount) {
		// Local variable.
		double balance = bankAccount.getCustomer().getBalance();
		
		// Check if sufficient funds are in account.
		if (balance - withdrawAmount >= 0) {
			balance -= withdrawAmount;
			bankAccount.getCustomer().setBalance(balance);
		} else {
			System.out.println("Insufficient funds!");
		};
	}

	/**
	 * Deposits funds into a bank account.
	 * 
	 * @param bankAccount
	 * @param depositAmount
	 */
	public void deposit(BankAccount bankAccount, double depositAmount) {
		// Local variable.
		double balance = bankAccount.getCustomer().getBalance();
		
		// Check if deposit amount is a positive number.
		if (depositAmount > 0) {
			balance += depositAmount;
			bankAccount.getCustomer().setBalance(balance);
		} else {
			System.out.println("Can't deposit a negative amount!");
		};
	}
}
