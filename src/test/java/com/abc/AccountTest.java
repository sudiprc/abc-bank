package com.abc;

import org.junit.Test;

/**
 * Created by sudiprc on 9/20/2016.
 */
public class AccountTest {

    @Test(expected = IllegalArgumentException.class)
    public void expectExceptionOnNegativeDepositAmount() {
        IAccount account = new Account(AccountType.CHECKING);
        account.deposit(-100.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void expectExceptionOnNegativeWithdrawalAmount() {
        IAccount account = new Account(AccountType.CHECKING);
        account.withdraw(-100.00);
    }

}
