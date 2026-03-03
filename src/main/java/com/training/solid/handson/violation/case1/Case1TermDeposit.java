package com.training.solid.handson.violation.case1;

import java.time.LocalDate;

public class Case1TermDeposit extends Case1 {

    public Case1TermDeposit(String nomorRekening, double saldoAwal, LocalDate tanggalJatuhTempo) {
        super(nomorRekening, saldoAwal, tanggalJatuhTempo);
    }

    @Override
    public void tarik(double jumlah) {
        if (LocalDate.now().isBefore(tanggalJatuhTempo)) {
            throw new IllegalStateException("Penarikan sebelum jatuh tempo tidak diizinkan: " + tanggalJatuhTempo);
        }
        super.tarik(jumlah);
    }
}
