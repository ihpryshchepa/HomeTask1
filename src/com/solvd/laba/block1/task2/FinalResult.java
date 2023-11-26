package com.solvd.laba.block1.task2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public final class FinalResult extends Result {

    private static final Logger LOGGER = LogManager.getLogger(FinalResult.class);

    private final String victoryCountry;
    private int countOfSportsmen;
    private int countOfMedals;

    public FinalResult(String result, int place, int score, String victoryCountry, int countOfSportsmen, int countOfMedals) {
        super(result, place, score);
        this.victoryCountry = victoryCountry;
        this.countOfSportsmen = countOfSportsmen;
        this.countOfMedals = countOfMedals;
    }

    @Override
    public void printResult() {
        LOGGER.info("It's a final result.");
    }

    public final void displayVictoryCountry() {
        LOGGER.info("The Victory Country is " + victoryCountry);
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

    @Override
    public String toString() {
        return "FinalResult{" +
                "victoryCountry='" + victoryCountry + '\'' +
                ", countOfSportsmen=" + countOfSportsmen +
                ", countOfMedals=" + countOfMedals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinalResult that = (FinalResult) o;
        return getCountOfSportsmen() == that.getCountOfSportsmen() && getCountOfMedals() == that.getCountOfMedals() && Objects.equals(victoryCountry, that.victoryCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(victoryCountry, getCountOfSportsmen(), getCountOfMedals());
    }
}
