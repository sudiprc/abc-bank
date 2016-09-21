package com.abc;

/**
 * Created by sudiprc on 9/20/2016.
 */
public class CheckingAccountROICalcStrategy implements AccountROICalcStrategy {
    @Override
    public double calculate(double balance) {
        return balance * 0.001;
    }
}
