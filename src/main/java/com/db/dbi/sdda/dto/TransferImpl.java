package com.db.dbi.sdda.dto;

import org.javamoney.moneta.Money;

public class TransferImpl implements ITransfer {

    private final String iban;


    private final Money amount;

    public TransferImpl(String i, Money amt) {
        iban = i;
        amount = amt;
    }

    public String getIban() {
        return iban;
    }

    public Money getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "TransferImpl{" +
                "iban='" + iban + '\'' +
                ", amount=" + amount +
                '}';
    }
}
