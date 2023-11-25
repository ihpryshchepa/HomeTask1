package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidCountOfPlayersException;

public class Game {
    private String gameName;
    private String countryOfOrigin;
    private int countOfPlayers;

    static {
        System.out.println("The Olympic Games are starting");
    }

    protected Game(String gameName, String countryOfOrigin) {
        this.gameName = gameName;
        this.countryOfOrigin = countryOfOrigin;
    }

    public static void printCountOfGames(int countOfOlympicGames) {
        System.out.println("Count of Olympic Games " + countOfOlympicGames);
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getCountOfPlayers() {
        return countOfPlayers;
    }

    public void setCountOfPlayers(int countOfPlayers) throws InvalidCountOfPlayersException {
        if (countOfPlayers > 0) {
            this.countOfPlayers = countOfPlayers;
        } else {
            throw new InvalidCountOfPlayersException("Count of players can not be negative.");
        }
    }

    public void setDefaultCountOfPlayers() {
        this.countOfPlayers = 2;
    }

    @Override
    public String toString() {
        return "Game {"
                + "gameName='" + gameName + '\''
                + "countOfPlayers='" + countOfPlayers + '\''
                + '}';
    }
}
