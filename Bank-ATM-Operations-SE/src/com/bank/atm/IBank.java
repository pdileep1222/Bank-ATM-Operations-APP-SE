package com.bank.atm;

public interface IBank 
{
  public void deposit(double amount);
  
  public void withdraw(double amount);
  
  public void transfer(BankAccount toAccount, double amount);
  
  public void applyForLoan(double amonut);
  
  public double getBalance();
}
