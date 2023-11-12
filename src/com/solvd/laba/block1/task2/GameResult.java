package com.solvd.laba.block1.task2;

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

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }
}
