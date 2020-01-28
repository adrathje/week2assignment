package model;

public class Customer {
	// Fields.
	private String name;
	private int age;
	private double yearlyIncome;
	private double balance = 0.0;
	
	/**
	 * Default no-arg constructor.
	 */
	public Customer() {
		super();
	}
	/**
	 * Non-default constructor, takes all parameters.
	 * @param name
	 * @param age
	 * @param yearlyIncome
	 */
	public Customer(String name, int age, double yearlyIncome) {
		super();
		this.name = name;
		this.age = age;
		this.yearlyIncome = yearlyIncome;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the yearlyIncome
	 */
	public double getYearlyIncome() {
		return yearlyIncome;
	}
	/**
	 * @param yearlyIncome the yearlyIncome to set
	 */
	public void setYearlyIncome(double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
