package com.abc;

/**
 * Created by sudiprc on 9/20/2016.
 */
public class SavingsAccountROICalcStrategy implements AccountROICalcStrategy {
    @Override
    public double calculate(double balance) {
        if (balance <= 1000)
            return balance * 0.001;
        else
            return 1 + (balance-1000) * 0.002;
    }
}
