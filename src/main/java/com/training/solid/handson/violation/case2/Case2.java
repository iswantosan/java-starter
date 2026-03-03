package com.training.solid.handson.violation.case2;

public class Case2 {

    private final Case2CreditBureau bureau;
    private final Case2PdfWriter pdfWriter;

    public Case2() {
        this.bureau = new Case2CreditBureau();
        this.pdfWriter = new Case2PdfWriter();
    }

    public boolean approveKredit(String nasabahId, double plafon) {
        int skor = bureau.getCreditScore(nasabahId);
        if (skor < 600) return false;
        pdfWriter.write("surat_persetujuan_" + nasabahId + ".pdf", "Kredit disetujui: Rp " + plafon);
        return true;
    }
}
