package com.training.solid.solution.isp;

public interface CoreAccountOps {

    void deposit(double amount);
    void withdraw(double amount);
    void transfer(CoreAccountOps to, double amount);
}
