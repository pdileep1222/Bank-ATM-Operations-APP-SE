package com.bank.atm;
//BLC business logic class
public class Customer
{
	@SuppressWarnings("unused")
	private String customerName;
	
	private BankAccount customerAccount; // Has-A relation
	
	public Customer(String customerName, BankAccount customerAccount) {
		super();
		this.customerName = customerName;
		this.customerAccount = customerAccount;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	
	
	public BankAccount getAccount()
	{
	   return customerAccount;	
	}
	
}
