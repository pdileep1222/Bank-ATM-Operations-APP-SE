package com.bank.atm;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception//checked
{
   public InvalidAmountException(String unchecked)
   {
	   super(unchecked);
   }
}
