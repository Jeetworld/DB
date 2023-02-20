package com.db.dbi.sdda.bl;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.db.dbi.sdda.dto.ITransfer;
import com.db.dbi.sdda.dto.ITransferResult;
import com.db.dbi.sdda.error.ErrorCodes;
import com.db.dbi.sdda.persistence.IAccountsRepo;
//import org.junit.Assert;
//import org.junit.Test;

public class BookingExecutorTest {

    private static final IAccountsRepo accountsRepo = null; //TODO:


    @Test
    public void bookingCheckingOk() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertTrue( transferResult.isTransferOk(), "Booking needs to go through");
    }

    @Test
    public void bookingCheckingNotEnoughFunds() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertFalse( transferResult.isTransferOk(), "Account should not have enough");
        Assert.assertEquals( ErrorCodes.NOTSUFFICIENTFUNDS, transferResult.getReason() , "Should have " + ErrorCodes.NOTSUFFICIENTFUNDS);
    }

    @Test
    public void bookingSavingsOk() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertTrue( transferResult.isTransferOk(), "Booking needs to go through");
    }

    @Test
    public void bookingSavingsFails() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertFalse( transferResult.isTransferOk(), "Booking needs to fail");
    }

    @Test
    public void bookingLoanOk() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertTrue( transferResult.isTransferOk(), "Booking needs to go through");
    }

    @Test
    public void bookingLoanFails() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertFalse( transferResult.isTransferOk(), "Booking needs to fail");
    }
}
