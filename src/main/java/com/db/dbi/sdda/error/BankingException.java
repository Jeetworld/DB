package com.db.dbi.sdda.error;

public class BankingException extends Exception {

    public final ErrorCodes errorCode;

    public BankingException(ErrorCodes errC) {
        errorCode = errC;
    }


}
