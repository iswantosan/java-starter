package com.training.solid.solution.srp;

public class BankAccountMain {
    public static void main(String[] args) {
        
        // untuk SRP -> memisahkan yg tidak keterkaitan dengan BankAccount, yaitu Report dan Notif

        BankAccount acc = new BankAccount("123", "nasabah@gmail.com", 1_000_000);
        NotificationService notificationService = new NotificationService();
        ReportService reportService = new ReportService();

        acc.deposit(100_000);
        notificationService.sendNotification("Deposit", "Deposit Sukses", "nasabah@gmail.com");
        reportService.generateReport("Deposit", "Deposit Trx");
    }
}
