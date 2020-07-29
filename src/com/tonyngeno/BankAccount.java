package com.tonyngeno;

import java.util.Date;

public class BankAccount {
    String accountNumber;
    String name;
    double balance;
    Date date;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.setDate(new Date());

    }

    public BankAccount() {
        this.setDate(new Date());
    }


    public void deposit(float amount) throws InsufficientFundsException {
            if (amount < 0){
                throw new  InsufficientFundsException("Insufficient Amount");
            }
            if (amount > 0) {
                balance = balance + amount;
                System.out.println(balance);

        }
    }

    public void withdraw(float amount) throws InsufficientFundsException {

            if (balance < amount){
                throw new  InsufficientFundsException("Insufficient balance");
            }
            if (balance > amount) {
            balance = balance - amount;
            System.out.println(balance);
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void displayAccountInfo() {
        System.out.println(this.toString());
    }
    public void showBalance(){
        System.out.println("Balance is:" +this.balance);
    }

    public void calculateInterest(){
        System.out.println("This Method will calculate Interest");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) throws LengthValidationException {
        if (accountNumber.length() != 6)
            throw new LengthValidationException();
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws NegativeBalanceException, InsufficientFundsException {
        if(balance < 0)
            throw new NegativeBalanceException();
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
