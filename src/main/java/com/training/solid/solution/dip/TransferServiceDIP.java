package com.training.solid.solution.dip;

public class TransferServiceDIP {

    private final NotifyService emailService;

    public TransferServiceDIP(EmailServiceDIP emailService) {
        this.emailService = emailService;
    }

    public boolean transfer(String fromAccount, String toAccount, double amount) {
        emailService.send(fromAccount, "Transfer of " + amount + " to " + toAccount);
        return true;
    }
}
