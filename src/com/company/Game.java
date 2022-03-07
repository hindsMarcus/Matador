package com.company;

import java.util.ArrayList;

public class Game {

    ArrayList<Player> players = new ArrayList<>();

    public Game() {
        Player player1 = new Player(1234, "Marcus");
        Player player2 = new Player(1234, "Christian");
        Player player3 = new Player(1234, "Kalle");
        players.add(player1);
        players.add(player2);
        players.add(player3);
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
