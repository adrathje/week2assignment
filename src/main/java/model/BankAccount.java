package model;

public class BankAccount {
	// Class fields.
	final double MIN_BALANCE = 0.0;
	final double APR = 0.065;
	private Customer customer;
	private double withdrawAmount;
	private double depositAmount;

	/**
	 * Constructor, takes customer as a parameter.
	 * 
	 * @param customer
	 */
	public BankAccount(Customer customer) {
		super();
		this.customer = customer;
	}

	/**
	 * @return the withdrawAmount
	 */
	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	/**
	 * @param withdrawAmount the withdrawAmount to set
	 */
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	/**
	 * @return the depositAmount
	 */
	public double getDepositAmount() {
		return depositAmount;
	}

	/**
	 * @param depositAmount the depositAmount to set
	 */
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the aPR
	 */
	public double getAPR() {
		return APR;
	}
	
}
