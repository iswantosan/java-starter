package com.training.solid.violation.lsp;

public class SavingsAccountLSP extends BankAccountLSP {

    private static final double MINIMUM_BALANCE = 100.0;

    public SavingsAccountLSP(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < MINIMUM_BALANCE) {
            throw new IllegalStateException(
                "Savings account must maintain minimum balance: " + MINIMUM_BALANCE);
        }
        super.withdraw(amount);
    }
}
