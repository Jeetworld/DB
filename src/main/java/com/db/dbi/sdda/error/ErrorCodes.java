package com.db.dbi.sdda.error;

public enum ErrorCodes {


    UNKNOWN(404000), ACCOUNTNOTFOUND(404001), NOTSUFFICIENTFUNDS(404020), NONEGATIVEBALANCE(404021), NOPOSITIVEBALANCE(404022);


    int errorCode = 404000;

    ErrorCodes(int errCode) {
        errorCode = errCode;

    }


}
