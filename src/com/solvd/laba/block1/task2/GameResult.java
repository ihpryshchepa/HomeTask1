package com.solvd.laba.block1.task2;

public class GameResult {
    private String gameResult;
    private int place;

    GameResult(String gameResult, int place) {
        this.gameResult = gameResult;
        this.place = place;
    }

    public String getGameResult() {
        return gameResult;
    }

    public void setGameResult(String gameResult) {
        this.gameResult = gameResult;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
