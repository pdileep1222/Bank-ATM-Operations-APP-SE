package com.bank.atm;
// BLC (Business Logic Class )
public class BankAccount implements IBank
{
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) throws AccountNotFoundException, InvalidAmountException {
		super();
		if(accountNumber<=0)
		{
		  throw new AccountNotFoundException("Account cannot be zero and nagetive values..");
		  
		}else if(balance<0) 
		{
			throw new InvalidAmountException("Amount cannot be nagetive....");
		}else {
		this.accountNumber = accountNumber;
		this.balance = balance;
		}
	}

	
	@Override
	public void deposit(double amount) 
	{
		
		try {
		if(amount<=0)
		{
			throw new InvalidAmountException("Invalid deposit amount ....");
		}else
		{
			balance = balance+amount;
			System.out.println("Balance should increase by :: "+amount+" account number::  "+accountNumber);
			System.out.println("\033[1;31m Balance Amount::"+balance+"\033[1;0m");
		}
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
	
	@Override
	public void withdraw(double amount)
	{
		try {
			 if(amount>balance)
	   	{
	   		throw new InsufficientFundsException("InsufficientFound.....");
	   	}else if(amount<=0 || amount>balance)
	   	{
	   		throw new InvalidAmountException("Entered Invalid withdraw amount");
	   	}else
	   	{
	   		balance = balance-amount;
	   		System.out.println("Balance should decrease by :: "+amount+"  is account number::"+accountNumber);
	   		System.out.println("\033[1;32m Balance Amount::"+balance+"\033[1;0m");
		    
	   	}
		}catch(Exception e) {
			
			System.err.println(e);
		}
	}
	
	@Override
	public void transfer(BankAccount toAccount, double amount)
	{
		
		 
		try {//5000   50000
			if(amount<=0) 
			 {
				  throw new InvalidAmountException("Invalid transfer amount....");  
				  
			 }else if(amount>balance)
		   	{
		   		throw new InsufficientFundsException("InsufficientFound.....");
		   		
			} else if (toAccount == null || toAccount.equals(null))
		   	{
		   		throw new AccountNotFoundException("Your's Account is not found");
		   	}else
		   	{
		   	    long toAccountNo = toAccount.accountNumber;
		   	   
		   		System.out.println("From account number :: "+accountNumber+"Sender's balance should decrease by "+amount+", to -> receiver's balance should increase by "+amount+" this account number:: "+toAccountNo);
		   		balance = balance-amount;
		   	    toAccount.balance=toAccount.balance+amount;
		   	}
			}catch(Exception e) {
				
				System.err.println(e);
			}
		
	}
	
	@Override
	public void applyForLoan(double amount) 
	{
	  try {
	       if(amount<0) 
	       {
	    	  throw new InvalidAmountException("Your Loan amount is less Zero.");   
	       }else if(amount>50000)
	       {
				throw new LoanNotAllowedException("Your Loan Amount Exceeds Limit...");
			}else if(balance>=50000)
			{
				throw new LoanNotAllowedException("Your Invalid Loan Amount becoz Your balance "+this.balance+", Your balance is less than 50000 then is apply for loan...");
			}else//       
			{
				System.out.println("Loan should be approved, balance should increase by "+amount+" --> account number::"+accountNumber);
				balance = balance+amount;
			}
			
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

		@Override
	public double getBalance() 
	{
	     System.out.println("----------------------- Balance :: "+balance +"------> account No: "+accountNumber);	
		 return balance;
	}
		
}
