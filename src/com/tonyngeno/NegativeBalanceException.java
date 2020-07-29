package com.tonyngeno;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {
        super("Negative balance not allowed");
    }
}
