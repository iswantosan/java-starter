package com.training.solid.solution.lsp;

public class SavingsAccountLSP extends BankAccountLSP {

    private static final double MINIMUM_BALANCE = 100.0;

    public SavingsAccountLSP(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}
