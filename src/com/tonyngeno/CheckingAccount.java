package com.tonyngeno;

import java.util.Date;

public class CheckingAccount extends BankAccount {

    double balance;

    public CheckingAccount() {
    }

    public CheckingAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public void withdraw(float amount) throws InsufficientFundsException {
            if (balance < 500){
                throw new  InsufficientFundsException("Insufficient balance");
            }
             super.withdraw(amount);

    }

    @Override
    public void calculateInterest() {
        double interestGain = balance * (0.75 / 100.0);
        balance += interestGain;
        System.out.println("Interest:" +interestGain);
        System.out.println("Added interest and updated Balance: " + balance);    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) throws InsufficientFundsException{
        if (balance<500){
            throw new InsufficientFundsException("Insufficient Balance");
        }
        this.balance = balance;
    }
}
