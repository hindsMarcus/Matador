package com.company;

public class Player {
    private BankAccount account;
    private String name;

    public Player(int balance, String pName) {
        this.name = pName;
        account = new BankAccount(balance);
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account.getBalance();
    }
    @Override
    public String toString() {
        return name + ": " + account.getBalance() + " dollars";
    }
}
