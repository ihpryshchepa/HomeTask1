package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidTeamScoreException;
import com.solvd.laba.block1.task2.interfaces.Sportsmen;

import java.util.List;

public class Team implements Sportsmen {
    private List<Sportsman> sportsmen;
    private Trainer trainer;
    private String name;

    protected Team(List<Sportsman> sportsmen, Trainer trainer) {
        this.sportsmen = sportsmen;
        this.trainer = trainer;
    }

    public int getTeamScore() throws InvalidTeamScoreException {
        int teamScore = 0;
        for (Sportsman sportsman : sportsmen) {
            teamScore += sportsman.getSportsmanScore();
        }
        if (teamScore > 0) {
            return teamScore * trainer.getYearsOfExp();
        } else {
            throw new InvalidTeamScoreException("Team score can not be negative.");
        }
    }

    public int setDefaultTeamScore() {
        return 100;
    }

    @Override
    public void doTrain() {
        System.out.println("The Team trains");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
