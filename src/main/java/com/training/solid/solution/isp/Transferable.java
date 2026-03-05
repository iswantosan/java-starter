package com.training.solid.solution.isp;

import com.training.solid.violation.isp.BankAccountISP;

public interface Transferable {
    void transfer(BankAccountISP to, double amount);
}
