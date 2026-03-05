package com.training.solid.solution.srp;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccountSolution bankAccountSolution = new BankAccountSolution("12345", 1_000_000);
        BankAccountNotification bankAccountNotification = new BankAccountNotification();
        BankAccountReport bankAccountReport = new BankAccountReport();

        bankAccountSolution.deposit(1_000);
        bankAccountNotification.sendEmailNotification("DEPOSIT","Deposit Successfully", "12345@gmail.com");
        bankAccountReport.generateTransactionReport("REPORT DEPOSIT", "Report Successfully Generated");
    }
    
}
