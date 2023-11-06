package com.solvd.laba.block1.task2;

public class FinalResult {
    private String victoryCountry;
    private int countOfSportsmen;
    private int countOfMedals;

    FinalResult(String victoryCountry, int countOfSportsmen, int countOfMedals) {
        this.victoryCountry = victoryCountry;
        this.countOfSportsmen = countOfSportsmen;
        this.countOfMedals = countOfMedals;
    }

    public String getVictoryCountry() {
        return victoryCountry;
    }

    public void setVictoryCountry(String victoryCountry) {
        this.victoryCountry = victoryCountry;
    }

    public int getCountOfSportsmen() {
        return countOfSportsmen;
    }

    public void setCountOfSportsmen(int countOfSportsmen) {
        this.countOfSportsmen = countOfSportsmen;
    }

    public int getCountOfMedals() {
        return countOfMedals;
    }

    public void setCountOfMedals(int countOfMedals) {
        this.countOfMedals = countOfMedals;
    }
}
