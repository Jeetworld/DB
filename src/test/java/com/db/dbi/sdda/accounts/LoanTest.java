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

public class LoanTest {

//    @Rule
//    public ExpectedException exception = ExpectedException.none();
	IAccount l;
	@BeforeMethod
	public void setUp() {
		CAccount cAccount = new CAccount();
	    l = cAccount.acc("Loans");
	}

    @Test(description="verify if user makes single booking")
    public void loanBookingOk() throws BankingException {
        //IAccount l = null; //TODO:
        l.book(Money.of(-5000, Constants.currencyUnit));
        System.out.println("Current loan balance is "+l.getBalance().getNumber().intValue());
        Assert.assertEquals(  l.getBalance().getNumber().intValue(),-5000, "Balance -5000 expected");
    }

    @Test(description="verify if user make single positive booking")
    public void loanBookingPositiveBalance() throws BankingException {
        Money newBalance = l.book(Money.of(5000, Constants.currencyUnit));
        System.out.println("Current loan balance is "+newBalance);
        Assert.assertTrue( ( l.getBalance().getNumber().intValue()<0), "***WARNING***You have made positive booking");
    }

    @Test(description="verify if user make single negative booking")
    public void loanBookingNoFunds() throws BankingException {
       Money newBalance = l.book(Money.of(-5000, Constants.currencyUnit));
        System.out.println("Current loan balance is "+newBalance);
        Assert.assertTrue( ( l.getBalance().getNumber().intValue()<0), "***WARNING***You have made positive booking");
    }
    
    @Test(description="verify if user makes multiple booking")
    public void zeroBalance() throws BankingException {
    	Money newBalance = l.book(Money.of(0, Constants.currencyUnit));
    	Money newBalance2 = l.book(Money.of(-4000, Constants.currencyUnit));
    	Money newBalance3 = l.book(Money.of(5000, Constants.currencyUnit));
    	int  totalBalance= newBalance.getNumber().intValue()+ newBalance2.getNumber().intValue()+ newBalance3.getNumber().intValue();
    	System.out.println("Current balance is "+totalBalance);
    	Assert.assertTrue( ( totalBalance<0), "***WARNING***You have made positive booking");
    }
}
