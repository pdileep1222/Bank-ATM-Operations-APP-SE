package com.bank.atm;
@SuppressWarnings({"serial" })
public class InsufficientFundsException extends Exception//checked
{
   public InsufficientFundsException(String checked)
   {
	  super(checked);
   }
}
