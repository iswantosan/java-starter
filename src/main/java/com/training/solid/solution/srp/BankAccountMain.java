package com.training.solid.solution.srp;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccountSRP acc = new BankAccountSRP("ACC-001", "martink.kadarman@gmail.com", 1_000_000);
        
        NotificationService notificationService=new NotificationService();
        ReportService reportService = new ReportService();
        
        double currentBalance = acc.getBalance();
        
        // Expect: hanya update saldo
        acc.deposit(500_000);
        double depositAmount = acc.getBalance() - currentBalance;
        notificationService.sendNotification("DEPOSIT", "Deposit Success "+ depositAmount, acc.getAccountNumber());
        reportService.generateReport("EXCEL", "deposited: "+depositAmount+" current balance: "+ acc.getBalance());
        
    }
}