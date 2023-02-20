package com.db.dbi.sdda.accounts;

import org.javamoney.moneta.Money;

import com.db.dbi.sdda.Constants;
import com.db.dbi.sdda.dto.TransferResultImpl;
import com.db.dbi.sdda.error.BankingException;

public class Savings implements IAccount {
	
	Money amount;
	
	@Override
	public Money book(Money amount) throws BankingException {
		System.out.println("Savings entered amount is "+amount);
		this.amount = amount;
		return amount;
	}

	@Override
	public TransferResultImpl checkForTransfer(Money amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIban() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Money getBalance() {

		return amount;
	}

}
