package com.company;

import java.util.ArrayList;

public class Game {

    ArrayList<Player> players = new ArrayList<>();

    public Game() {
        Player p1 = new Player(15000, "Marcus");
        Player p2 = new Player(10000, "Christian");
        Player p3 = new Player(5000, "Kalle");
        players.add(p1);
        players.add(p2);
        players.add(p3);
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
