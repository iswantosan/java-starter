package com.training.solid.solution.isp;


public interface BankAccountAble {
	void deposit(double amount);
	void withdraw(double amount);
    void transfer(BankAccountAble to, double amount);
}
