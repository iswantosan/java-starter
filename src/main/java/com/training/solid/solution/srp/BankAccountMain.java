package com.training.solid.solution.srp;

public class BankAccountMain {

    public static void main(String[] args) {
        final BankAccount acc = new BankAccount(
                "123",
                "user@gmail.com",
                1_000_000);
        final ReportService reportService = new ReportService();
        final NotificationService notificationService = new NotificationService();

        acc.deposit(100_000);
        notificationService.sendNotification(
                "DEPOSIT",
                "Deposit Success",
                acc.getCustomerEmail()
        );
        reportService.generateReport("DEPOSIT", "Deposit Trx");
    }
}
