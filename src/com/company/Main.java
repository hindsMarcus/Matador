package com.company;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        System.out.println(game.players.toString());
        System.out.println(game.players.get(1).getAccount());

    }
}
