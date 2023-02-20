package com.db.dbi.sdda.dto;

import com.db.dbi.sdda.error.ErrorCodes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TransferResultImpl implements ITransferResult {

    private static final Logger LOGGER = LogManager.getLogger(TransferResultImpl.class);
    private boolean transferOk = true;
    private ErrorCodes reason;

    private TransferResultImpl() {
    }


    @Override
    public boolean isTransferOk() {
        return transferOk;
    }

    @Override
    public ErrorCodes getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "TransferResultImpl{" +
                "transferOk=" + transferOk +
                ", reason=" + reason +
                '}';
    }


}
