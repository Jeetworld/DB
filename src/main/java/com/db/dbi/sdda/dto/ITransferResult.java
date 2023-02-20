package com.db.dbi.sdda.dto;

import com.db.dbi.sdda.error.ErrorCodes;

public interface ITransferResult {
    boolean isTransferOk();

    ErrorCodes getReason();
}
