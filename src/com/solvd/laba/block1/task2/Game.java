package com.solvd.laba.block1.task2;

public class Game {
    private String gameName;
    private int countOfPlayers;

    Game(String gameName, int countOfPlayers) {
        this.gameName = gameName;
        this.countOfPlayers = countOfPlayers;
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
}
