package com.bank.atm;
@SuppressWarnings({"serial" })
public class AccountNotFoundException extends Exception//checked
{
   public AccountNotFoundException(String checked)
   {
	   super(checked);
   }
}
