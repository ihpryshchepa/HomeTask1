package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidTeamScoreException;
import com.solvd.laba.block1.task2.interfaces.ScoreInterface;
import com.solvd.laba.block1.task2.interfaces.SloganInterface;
import com.solvd.laba.block1.task2.interfaces.TrainingInterface;

import java.util.List;

public class Team implements SloganInterface, ScoreInterface, TrainingInterface {
    private List<Sportsman> sportsmen;
    private Trainer trainer;
    private String name;

    protected Team(List<Sportsman> sportsmen, Trainer trainer) {
        this.sportsmen = sportsmen;
        this.trainer = trainer;
    }

    public int calculateScore() throws InvalidTeamScoreException {
        int teamScore = 0;
        for (Sportsman sportsman : sportsmen) {
            teamScore += sportsman.calculateScore();
        }
        if (teamScore > 0) {
            return teamScore * trainer.getYearsOfExp();
        } else {
            throw new InvalidTeamScoreException("Team score can not be negative.");
        }
    }

    @Override
    public void saySlogan(String slogan) {
        System.out.println("The team slogan is - " + slogan);
    }

    @Override
    public void doTraining(int hours) {
        System.out.println("Team trains " + hours + " hours");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
