package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidTeamScoreException;
import com.solvd.laba.block1.task2.interfaces.WeatherInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class GameResult extends Result implements WeatherInterface {
    private static final Logger LOGGER = LogManager.getLogger(GameResult.class);

    private String gameName;
    private String weather;

    public GameResult(String gameName, String weather) {
        this.gameName = gameName;
        this.weather = weather;
    }

    protected GameResult(String gameName, String result, int place, int score, String weather) {
        super(result, place, score);
        this.gameName = gameName;
        this.weather = weather;
    }

    @Override
    public double getWeatherFactor(String weather) {
        double weatherFactor = 0;
        if (weather.equals("Sunny")) {
            weatherFactor = 0.1;
        } else if (weather.equals("Windy")) {
            weatherFactor = 0.2;
        } else if (weather.equals("Rainy")) {
            weatherFactor = 0.3;
        }
        return weatherFactor;
    }

    public static void generateGameResult(Game game, Team team1, Team team2, double weatherFactor) throws InvalidTeamScoreException {
        double totalTeam1Score = team1.calculateScore() * weatherFactor;
        double totalTeam2Score = team2.calculateScore() * weatherFactor;
        if (totalTeam1Score > totalTeam2Score) {
            LOGGER.info("In game " + game.getGameName() + " with count of score and weather factor " + totalTeam1Score + " wins " + team1.getName());
        } else {
            LOGGER.info("In game " + game.getGameName() + " with count of score and weather factor " + totalTeam2Score + " wins " + team2.getName());
        }
    }

    @Override
    public void printResult() {
        LOGGER.info("It's a game result.");
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameResult() {
        return result;
    }

    public void setGameResult(String gameResult) {
        this.result = result;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "GameResult {"
                + "gameName='" + gameName + '\''
                + ", result='" + result + '\''
                + ", place=" + place + '\''
                + ", score=" + score + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameResult that = (GameResult) o;
        return Objects.equals(getGameName(), that.getGameName()) && Objects.equals(getWeather(), that.getWeather());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGameName(), getWeather());
    }
}
