package com.db.dbi.sdda.accounts;

public class CAccount {
	
	  public IAccount acc(String account){
	      if(account == null){
	         return null;
	      }		
	      if(account.equalsIgnoreCase("Checking")){
	         return new Checkings();
	         
	      } else if(account.equalsIgnoreCase("Savings")){
	         return new Savings();
	         
	      } else if(account.equalsIgnoreCase("Loans")){
	         return new Loans();
	      }
	      
	      return null;
	   }

}
