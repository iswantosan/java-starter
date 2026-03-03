package com.training.solid.handson.violation.case1;

import java.time.LocalDate;

public class Case1 {

    protected String nomorRekening;
    protected double saldo;
    protected LocalDate tanggalJatuhTempo;

    public Case1(String nomorRekening, double saldoAwal, LocalDate tanggalJatuhTempo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
        this.tanggalJatuhTempo = tanggalJatuhTempo;
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) throw new IllegalArgumentException("Jumlah harus positif");
        if (jumlah > saldo) throw new IllegalArgumentException("Saldo tidak cukup");
        saldo -= jumlah;
    }

    public double getSaldo() {
        return saldo;
    }
}
