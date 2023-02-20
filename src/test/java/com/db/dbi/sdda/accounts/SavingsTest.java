package com.db.dbi.sdda.accounts;

import com.db.dbi.sdda.Constants;
import com.db.dbi.sdda.error.BankingException;
import org.javamoney.moneta.Money;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
import org.testng.annotations.Test;

public class SavingsTest {

   // @Rule
   // public ExpectedException exception = ExpectedException.none();
	IAccount l;
	@BeforeMethod
	public void setUp() {
		CAccount cAccount = new CAccount();
	    l = cAccount.acc("Savings");
	}

    @Test(description="verify if user make only single transaction")
    public void savingsBookingOk() throws BankingException {
        //IAccount l = null; //TODO:	
        l.book(Money.of(20, Constants.currencyUnit));
        System.out.println("Current balance is "+l.getBalance().getNumber().intValue());
        Assert.assertEquals( l.getBalance().getNumber().intValue(), 20, "Balance 20 expected");
    }

    @Test(description="verify if user makes mutliple transactions")
    public void savingsBookingSeveralBookingsOk() throws BankingException {
    	 Money newBalance= l.book(Money.of(-17, Constants.currencyUnit));
    	 Money newBalance2 = l.book(Money.of(70.56, Constants.currencyUnit));
    	 Money newBalance3 = l.book(Money.of(12.44, Constants.currencyUnit));
    	 Money newBalance4 =  l.book(Money.of(-99, Constants.currencyUnit));
    	 int  totalBalance= newBalance.getNumber().intValue()+ newBalance2.getNumber().intValue()+ newBalance3.getNumber().intValue()+ newBalance4.getNumber().intValue();
        System.out.println("Current balance is "+totalBalance);
      Assert.assertTrue( ( totalBalance>0), "***WARNING***Your current balance is in negative");
      
    }

    @Test(description="verify if user makes negative transaction")
    public void savingsBookingNoFunds() throws BankingException {
       Money newBalance = l.book(Money.of(-5000, Constants.currencyUnit));
        System.out.println("Your savings account balance is "+ newBalance.getNumber().intValue());
        Assert.assertTrue( ( newBalance.getNumber().intValue()>0), "***WARNING***Your current balance is in negative");
    }


}
