package com.tonyngeno;

import java.util.Date;

public class SavingsAccount  extends BankAccount  {
    double balance;

    public SavingsAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    public SavingsAccount() {
    }

    public void calculateInterest() {
        double interestGain = balance * (5 / 100.0);
        balance += interestGain;
        System.out.println("Interest:" +interestGain);
        System.out.println("Added interest and updated Balance: " + balance);
    }

    @Override
    public void withdraw(float amount) throws InsufficientFundsException {

            if (balance < 2500){
                throw new  InsufficientFundsException("Insufficient balance");
            }
        super.withdraw(amount);

    }

    @Override
    public double getBalance() {

        return balance;
    }

    @Override
    public void setBalance(double balance) throws InsufficientFundsException {
        if (balance<2500){
            throw new InsufficientFundsException("Insufficient Balance");
        }
        this.balance = balance;
    }
}

