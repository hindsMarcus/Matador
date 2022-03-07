package com.company;

import java.util.ArrayList;

public class Game {

    ArrayList<Player> players = new ArrayList<>();
    FileIO fileIO = new FileIO();


    public Game() {
        /*Player p1 = new Player(15000, "Marcus");
        Player p2 = new Player(10000, "Christian");
        Player p3 = new Player(5000, "Kalle");
        players.add(p1);
        players.add(p2);
        players.add(p3);*/

        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();

        for (String s: data) {
            String[] values = s.split(": ");

            int balance = Integer.parseInt(values[1]);

            Player p1 = new Player(balance, values[0]);

            players.add(p1);
        }
    }

    /*public static boolean hadGameData() {

    }*/

    void runLoop() {

    }

    void takeTurn() {

    }

    void printAccounts() {

    }

    void saveGameData() {

    }



}
