package com.training.solid.handson.violation.case5;

public interface Case5 {

    void bukaProduk(String idProduk, String idNasabah);
    void tutupProduk(String idProduk);
    void perpanjang(String idProduk);
    void klaimAsuransiSimpanan(String idProduk);
    void requestBukuCek(String nomorRekening);
}
