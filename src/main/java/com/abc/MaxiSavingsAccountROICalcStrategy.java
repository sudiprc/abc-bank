package com.abc;

/**
 * Created by sudiprc on 9/20/2016.
 */
public class MaxiSavingsAccountROICalcStrategy implements AccountROICalcStrategy {
    @Override
    public double calculate(double balance) {
        if (balance <= 1000)
            return balance * 0.02;
        else if (balance <= 2000)
            return 20 + (balance - 1000) * 0.05;
        return 70 + (balance - 2000) * 0.1;
    }
}
