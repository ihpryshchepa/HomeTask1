package com.solvd.laba.block1.task2;

public final class FinalResult extends Result {
    private final String victoryCountry;
    private int countOfSportsmen;
    private int countOfMedals;

    protected FinalResult(String result, int place, int score, String victoryCountry, int countOfSportsmen, int countOfMedals) {
        super(result, place, score);
        this.victoryCountry = victoryCountry;
        this.countOfSportsmen = countOfSportsmen;
        this.countOfMedals = countOfMedals;
    }

    @Override
    public String toString() {
        return "FinalResult{"
                + "victoryCountry='" + victoryCountry + '\''
                + ", countOfSportsmen=" + countOfSportsmen + '\''
                + ", countOfMedals='" + countOfMedals + '\''
                + '}';
    }

    public final void displayVictoryCountry() {
        System.out.println("The Victory Country is " + victoryCountry);
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
