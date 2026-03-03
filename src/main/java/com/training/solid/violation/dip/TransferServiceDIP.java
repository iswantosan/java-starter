package com.training.solid.violation.dip;

public class TransferServiceDIP {

    private final EmailServiceDIP emailService;

    public TransferServiceDIP() {
        this.emailService = new EmailServiceDIP();
    }

    public TransferServiceDIP(EmailServiceDIP emailService) {
        this.emailService = emailService;
    }

    public boolean transfer(String fromAccount, String toAccount, double amount) {
        emailService.send(fromAccount, "Transfer of " + amount + " to " + toAccount);
        return true;
    }
}
