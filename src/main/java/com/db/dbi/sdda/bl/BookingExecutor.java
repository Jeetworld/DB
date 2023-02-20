package com.db.dbi.sdda.bl;

import com.db.dbi.sdda.dto.ITransfer;
import com.db.dbi.sdda.dto.ITransferResult;
import com.db.dbi.sdda.persistence.IAccountsRepo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Callable;

/**
 * Executing booking for given transfer
 */
public class BookingExecutor implements Callable<ITransferResult> {
    private static final Logger LOGGER = LogManager.getLogger(BookingExecutor.class);
    private static final IAccountsRepo repository = null;//TODO:
    private final ITransfer transfer;

    public BookingExecutor(ITransfer t) {
        transfer = t;
    }

    @Override
    public ITransferResult call() throws Exception {
        return null; //TODO:
    }
}
