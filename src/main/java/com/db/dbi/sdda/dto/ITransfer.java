package com.db.dbi.sdda.dto;

import org.javamoney.moneta.Money;

/**
 * Transfer DTO for processing bookings
 */
public interface ITransfer {

    String getIban();

    Money getAmount();
}
