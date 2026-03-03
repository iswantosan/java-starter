package com.training.solid.violation.ocp;

public class InterestCalculatorOCP {

    public static final String SAVINGS = "SAVINGS";
    public static final String CURRENT = "CURRENT";
    public static final String FIXED_DEPOSIT = "FIXED_DEPOSIT";

    public double calculateInterest(String accountType, double balance, int months) {
        if (SAVINGS.equals(accountType)) {
            return balance * 0.03 * months / 12;
        } else if (CURRENT.equals(accountType)) {
            return 0;
        } else if (FIXED_DEPOSIT.equals(accountType)) {
            return balance * 0.06 * months / 12;
        }
        throw new IllegalArgumentException("Unknown account type: " + accountType);
    }
}
