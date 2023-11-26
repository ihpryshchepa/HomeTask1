package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidTeamScoreException;
import com.solvd.laba.block1.task2.interfaces.ScoreInterface;
import com.solvd.laba.block1.task2.interfaces.SloganInterface;
import com.solvd.laba.block1.task2.interfaces.TrainingInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

public class Team implements SloganInterface, ScoreInterface, TrainingInterface {
    private static final Logger LOGGER = LogManager.getLogger(Team.class);

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
        LOGGER.info("The team slogan is - " + slogan);
    }

    @Override
    public void doTraining(int hours) {
        LOGGER.info("Team trains " + hours + " hours");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "sportsmen=" + sportsmen +
                ", trainer=" + trainer +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(sportsmen, team.sportsmen) && Objects.equals(trainer, team.trainer) && Objects.equals(getName(), team.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(sportsmen, trainer, getName());
    }
}
