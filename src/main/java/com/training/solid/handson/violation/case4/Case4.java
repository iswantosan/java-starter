package com.training.solid.handson.violation.case4;

public class Case4 {

    public static final String TRANSFER_ANTARBANK = "TRANSFER_ANTARBANK";
    public static final String TARIK_TUNAI = "TARIK_TUNAI";
    public static final String VALAS = "VALAS";

    public double hitungBiayaAdmin(String jenisTransaksi, double nominal) {
        if (TRANSFER_ANTARBANK.equals(jenisTransaksi)) {
            return nominal <= 1_000_000 ? 0 : 2500;
        } else if (TARIK_TUNAI.equals(jenisTransaksi)) {
            return 0;
        } else if (VALAS.equals(jenisTransaksi)) {
            return nominal * 0.01;
        }
        throw new IllegalArgumentException("Jenis transaksi tidak dikenal: " + jenisTransaksi);
    }
}
