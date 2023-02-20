package com.db.dbi.sdda.persistence;

import com.db.dbi.sdda.accounts.IAccount;
import com.db.dbi.sdda.error.AccountNotFoundException;

public interface IAccountsRepo {

    IAccount getAccount(String iban) throws AccountNotFoundException;

    IAccount addAccount(IAccount acc);

}
