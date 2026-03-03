package com.training.solid.handson.violation.case3;

public class Case3 {

    public void openSavingsAccount(String nik, String name, String phone) {
        if (nik == null || nik.length() < 16) {
            throw new IllegalArgumentException("NIK tidak valid");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nama nasabah tidak valid");
        }
        String rekening = "REK-" + nik.substring(nik.length() - 8);
        System.out.println("Rekening tabungan dibuka: " + rekening);
        sendWelcomeSms(phone, name, rekening);
        registerLoyaltyProgram(phone, name);
    }

    private void sendWelcomeSms(String phone, String name, String rekening) {
        System.out.println("[SMS to " + phone + "] Selamat " + name + ", rekening " + rekening + " aktif.");
    }

    private void registerLoyaltyProgram(String phone, String name) {
        System.out.println("[Loyalty] Nasabah terdaftar: " + phone);
    }
}
