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

public class CheckingTest {

   // @Rule
   // public ExpectedException exception = ExpectedException.none();
	IAccount l;
	@BeforeMethod
	public void setUp() {
		CAccount cAccount = new CAccount();
	    l = cAccount.acc("Checking");
	}
    @Test(description="verify if user makes mutliple transactions")
    public void checkingBookingOk() throws BankingException {
       // IAccount l = null; //TODO:
        Money newBalance1 = l.book(Money.of(-5000, Constants.currencyUnit));
        Money newBalance2 =l.book(Money.of(1000, Constants.currencyUnit));
        int  totalBalance= newBalance1.getNumber().intValue()+ newBalance2.getNumber().intValue();
        System.out.println("Current balance is "+totalBalance);
        Assert.assertEquals( totalBalance, -4000, "Balance -4000 expected");
    }

    @Test(description="verify if user makes single transactions")
    public void checkingBookingNoFunds() throws BankingException {
        Money newBalance = l.book(Money.of(-5000, Constants.currencyUnit));
        System.out.println("Current balance is "+newBalance);
        Assert.assertEquals(  newBalance.getNumber().doubleValue(), -5000, 0, "Balance -5000 expected");
        Assert.assertEquals(  l.getBalance().getNumber().doubleValue(),-5000, 0, "Balance -5000 expected");
    }
    
    @Test(description="verify if user makes positive transaction")
    public void positiveTransaction() throws BankingException {
        Money newBalance = l.book(Money.of(5000, Constants.currencyUnit));
        System.out.println("Current balance is "+newBalance);
        Assert.assertEquals(  newBalance.getNumber().doubleValue(), 5000, 0, "Balance -5000 expected");
        Assert.assertEquals(  l.getBalance().getNumber().doubleValue(),5000, 0, "Balance -5000 expected");
    }
    
}
