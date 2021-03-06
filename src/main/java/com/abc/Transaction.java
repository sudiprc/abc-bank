package com.abc;

import java.util.Date;

public class Transaction {

    private final double amount;

    private Date transactionDate;

    public Transaction(final double amount) {
        this.amount = amount;
        this.transactionDate = DateProvider.getInstance().now();
    }

    public double getAmount() {
        return amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}
