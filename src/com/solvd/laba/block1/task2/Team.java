package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.Slogan;
import com.solvd.laba.block1.task2.interfaces.Sportsmen;

import java.util.List;

public class Team implements Slogan, Sportsmen {
    private List<Sportsman> sportsmen;
    private Trainer trainer;

    public Team(List<Sportsman> sportsmen, Trainer trainer) {
        this.sportsmen = sportsmen;
        this.trainer = trainer;
    }
    public int getTeamScore() {
        int teamScore = 0;
        for(Sportsman sportsman : sportsmen) {
            teamScore += sportsman.getSportsmanScore();
        }
        return teamScore * trainer.getYearsOfExp();
    }

    @Override
    public void doTrain() {
        System.out.println("The Team trains");
    }

    @Override
    public void saySlogan() {
        System.out.println("The Team's Slogan");
    }
}
