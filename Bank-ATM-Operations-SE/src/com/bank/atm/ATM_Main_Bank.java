package com.bank.atm;

import java.util.Scanner;

public class ATM_Main_Bank {

	public static void main(String[] args) throws AccountNotFoundException, InvalidAmountException 
	{
		BankAccount bankAccount = new BankAccount(987456321L, 50000); // main account
		Customer customer = new Customer("Manish Kumar", bankAccount);
		Scanner s = new Scanner(System.in);
		BankAccount bAccount= customer.getAccount(); // also main 
	   
		BankAccount transerA = new BankAccount(123456789L, 5000); // Other 
		BankAccount savingAccount = new BankAccount(9876543210l,10000.00); 
		
		  while(true) {
		  System.err.println("Select your option :"
		    		+"\n1.Deposit Salary Account"
		    		+"\n 2.Withdraw salary Acount"
		    		+"\n  3.Transfer Salary to OtherAccount"
		    		+"\n   4.Loan Application for Salary Account "
		    		+"\n     5.Banks Account balance"
		    		+"\n        6.Deposit Other Account"
		    		+"\n          7.Transfer Other to Savings Account"
		    		+"\n            8.Exit");
		    System.out.print("Enter your option:");
		     int x = s.nextInt();
		    switch(x)
		    {
		    case 1:
		    	System.out.print("Enter Deposit Amount:");
		    	double dAmount = s.nextDouble();
		    	bAccount.deposit(dAmount);
		    	break;
		    case 2:
		    	System.out.print("Enter Withdraw Amount:");
		    	double wAmount = s.nextDouble();
		    	bAccount.withdraw(wAmount);  //
		    	break;
		    case 3:
		    	System.out.print("Enter Transfer Amount:");
		    	double tAmount = s.nextDouble();
		    	bAccount.transfer(transerA, tAmount);
		    	break;
		    case 4:
		    	System.out.print("Enter Loan Amount:");
		    	double lAmount = s.nextDouble();
		    	bAccount.applyForLoan(lAmount);
		    	break;
		    case 5:
		    	System.out.println("Select Your Bank:"
		    			+ "\n1.Salary account balance"
		    			+ "\n 2.Other Account Balance"
		    			+ "\n  3.Savings Account Balance");
		    	System.out.print("Enter Which account Check Balance:");
		    	
		    	int check = s.nextInt();
		    	switch(check)
		    	{
		    	case 1:
		    		bAccount.getBalance();
		    		check = 0 ;
		    		break;
		    	case 2:
		    		transerA.getBalance();
		    		check = 0;
		    		break;
		    	case 3:
		    		savingAccount.getBalance();
		    		check = 0;
		    		break;
		    		default:
		    			System.err.println("Invalid Bank Account Balance option...");
		    		
		    			break;
		    	} // inner switch case is closed 
		    	
		    	break;
		    case 6:
		    	System.out.print("Enter Deposit Amount:");
		    	double dAmount1 = s.nextDouble();
		    	transerA.deposit(dAmount1);
		    	break;
		    case 7: 
		    	System.out.print("Enter Transfer Amount from Other TO savings:");
		    	double tAmount1 = s.nextDouble();
		    	transerA.transfer(savingAccount, tAmount1); 
		    	break;
		    case 8: 
		    	System.out.print("Bank Operation Stopped...");
		    	 System.exit(0);
		    	 s.close();
		    	break;
		    default:
		         System.err.println("Invali choice....");
		        break;
		    }// outer switch cases closed
		}//end with while loop
		
	}

}
