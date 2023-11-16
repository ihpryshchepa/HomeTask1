package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.Ball;

public class Game implements Ball {
    private String gameName;
    private int countOfPlayers;
    static int countOfOlympicGames;

    protected Game(String gameName, int countOfPlayers) {
        this.gameName = gameName;
        this.countOfPlayers = countOfPlayers;
    }

    public static void printCountOfGames(int countOfOlympicGames) {
        System.out.println("Count of Olympic Games " + countOfOlympicGames);
    }

    static {
        System.out.println("The Olympic Games are starting");
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getCountOfPlayers() {
        return countOfPlayers;
    }

    public void setCountOfPlayers(int countOfPlayers) {
        this.countOfPlayers = countOfPlayers;
    }

    @Override
    public void playWithBall() {
        System.out.println("Method playWithBall in class Game.");
    }
}
