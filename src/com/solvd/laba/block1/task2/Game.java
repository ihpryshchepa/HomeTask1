package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidCountOfPlayersException;
import com.solvd.laba.block1.task2.interfaces.HistoryInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Game implements HistoryInterface {
    private static final Logger LOGGER = LogManager.getLogger(Game.class);

    static final int MIN_COUNT_OF_PLAYERS = 1;
    private String gameName;
    private String countryOfOrigin;
    private int countOfPlayers;

    static {
        LOGGER.info("The Olympic Games are starting");
    }

    protected Game(String gameName, String countryOfOrigin) {
        this.gameName = gameName;
        this.countryOfOrigin = countryOfOrigin;
    }

    public static void printCountOfGames(int countOfOlympicGames) {
        LOGGER.info("Count of Olympic Games " + countOfOlympicGames);
    }

    @Override
    public void toKnowTheHistory(int year) {
        LOGGER.info("The game " + getGameName() + " was included to Olympic Games in " + year);
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
        this.countOfPlayers = MIN_COUNT_OF_PLAYERS;
    }

    @Override
    public String toString() {
        return "Game {"
                + "gameName='" + gameName + '\''
                + "countOfPlayers='" + countOfPlayers + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return getCountOfPlayers() == game.getCountOfPlayers() && Objects.equals(getGameName(), game.getGameName()) && Objects.equals(getCountryOfOrigin(), game.getCountryOfOrigin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGameName(), getCountryOfOrigin(), getCountOfPlayers());
    }
}
