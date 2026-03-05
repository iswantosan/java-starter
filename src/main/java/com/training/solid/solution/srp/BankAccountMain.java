package com.training.solid.solution.srp;

import java.lang.module.ResolutionException;

public class BankAccountMain {

public static void main(String[] args)
{
    BankAccountSRP acc = new BankAccountSRP("12345", "haha@haha.com", 12);
    NotificationService ns = new NotificationService();
    ReportService rs = new ReportService();

    double amount = 10_000;
    acc.deposit(amount);
    ns.sendEmailNotification("Berhasil kirim email", "selamat transaksi anda berhasil", acc.getCustomerEmail());
    rs.generateTransactionReport("Deposit", "Sukses Deposit" + amount);

}

}
