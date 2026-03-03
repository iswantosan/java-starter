package com.training.solid.handson.violation.case5;

public class Case5TermDeposit implements Case5 {

    private String idProduk;
    private String idNasabah;

    @Override
    public void bukaProduk(String idProduk, String idNasabah) {
        this.idProduk = idProduk;
        this.idNasabah = idNasabah;
    }

    @Override
    public void tutupProduk(String idProduk) {
        this.idProduk = null;
    }

    @Override
    public void perpanjang(String idProduk) {
        throw new UnsupportedOperationException("Deposito berjangka tidak bisa perpanjang otomatis");
    }

    @Override
    public void klaimAsuransiSimpanan(String idProduk) {
        throw new UnsupportedOperationException("Deposito berjangka tanpa asuransi simpanan");
    }

    @Override
    public void requestBukuCek(String nomorRekening) {
        throw new UnsupportedOperationException("Deposito berjangka tidak punya buku cek");
    }
}
