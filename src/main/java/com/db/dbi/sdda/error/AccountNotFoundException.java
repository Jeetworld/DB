package com.db.dbi.sdda.error;

public class AccountNotFoundException extends BankingException {
    public AccountNotFoundException() {
        super(ErrorCodes.ACCOUNTNOTFOUND);
    }
}
