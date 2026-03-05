package com.training.solid.solution.dip;

public class TransferServiceDIP {

    private final NotifyService notifyService;

    
    public TransferServiceDIP(NotifyService notifyService) {
        this.notifyService = notifyService;
    }

    public boolean transfer(String fromAccount, String toAccount, double amount) {
    	notifyService.send(fromAccount, "Transfer of " + amount + " to " + toAccount);
        return true;
    }
}
