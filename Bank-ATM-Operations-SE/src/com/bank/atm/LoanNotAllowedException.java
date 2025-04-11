package com.bank.atm;
@SuppressWarnings("serial" )
public class LoanNotAllowedException extends Exception//checked
{
   public LoanNotAllowedException(String unchecked)
   {
	   super(unchecked);
   }
}
