package com.db.dbi.sdda;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class Constants {
    public final static CurrencyUnit currencyUnit = Monetary.getCurrency("EUR");
}
