package com.db.dbi.sdda;


import com.db.dbi.sdda.error.AccountNotFoundException;
import com.db.dbi.sdda.persistence.IAccountsRepo;
//import org.junit.BeforeClass;
//import org.junit.Test;

import java.util.concurrent.ExecutionException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookingSimulator {

    private static final IAccountsRepo accountsRepo = null; //TODO:


    @BeforeClass
    public static void setup() {


    }

    @Test
    public void simulateBookingsMultithreadedOk() throws InterruptedException, ExecutionException, AccountNotFoundException {
        //TODO:
    }

}
