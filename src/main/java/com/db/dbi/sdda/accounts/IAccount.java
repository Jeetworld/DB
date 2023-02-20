package com.db.dbi.sdda.accounts;

import com.db.dbi.sdda.dto.TransferResultImpl;
import com.db.dbi.sdda.error.BankingException;
import org.javamoney.moneta.Money;

public interface IAccount {

    /**
     * Book the amount on the account.
     *
     * @param amount
     * @return
     * @throws BankingException
     */
    Money book(Money amount) throws BankingException;

    /**
     * Check whether a amount can be booked against the account.
     *
     * @param amount
     * @return
     */
    TransferResultImpl checkForTransfer(Money amount);

    /**
     * Get IBAN of the account.
     *
     * @return
     */
    String getIban();

    /**
     * Get the balance of the account.
     *
     * @return
     */
    Money getBalance();
}
