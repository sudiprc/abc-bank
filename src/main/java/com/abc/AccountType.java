package com.abc;

/**
 * Created by sudiprc on 9/20/2016.
 */
public enum AccountType {

    CHECKING(0, "Checking Account"),
    SAVINGS(1, "Savings Account"),
    MAXI_SAVINGS(2, "Maxi-Savings account");

    private final int code;
    private final String displayName;
    private final AccountROICalcStrategy accountROICalcStrategy;

    AccountType(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
        this.accountROICalcStrategy = ROICalcStrategyFactory.createCalcStrategy(code);
    }

    public int getCode() {
        return code;
    }

    public AccountROICalcStrategy getAccountROICalcStrategy() {
        return accountROICalcStrategy;
    }

    public String getDisplayName() {
        return displayName;
    }
}
