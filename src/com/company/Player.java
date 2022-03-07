package com.company;

public class Player {
    BankAccount account;
    String name;

    public Player(int balance, String pName) {

        this.name = pName;

        account = new BankAccount(balance);
    }
}
