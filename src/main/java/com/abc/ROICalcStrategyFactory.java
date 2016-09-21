package com.abc;

/**
 * Created by sudiprc on 9/20/2016.
 */
public final class ROICalcStrategyFactory {

    public static AccountROICalcStrategy createCalcStrategy(final int accountType) {
        switch (accountType) {
            case 0: return new CheckingAccountROICalcStrategy();
            case 1: return new SavingsAccountROICalcStrategy();
            default: return new MaxiSavingsAccountROICalcStrategy();
        }
    }

}
