package com.solvd.laba.block1.task2;

import java.util.Random;

public class GameResult extends Result {
    private String gameName;

    protected GameResult(String gameName, String result, int place, int score) {
        super(result, place, score);
        this.gameName = gameName;
    }

    @Override
    public String toString() {
        return "GameResult{"
                + "gameName='" + gameName + '\''
                + "place='" + result + '\''
                + ", place=" + place + '\''
                + ", score=" + score + '\''
                + '}';
    }

    public static void generateGameResult(Game game, int team1Score, int team2Score) {
        if (team1Score > team2Score) {
            System.out.println("In game " + game.getGameName() + " with count of score " + team1Score + " wins Team Ukraine");
        } else {
            System.out.println("In game " + game.getGameName() + " with count of score " + team2Score + " wins Team USA");
        }
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
}
