package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static com.solvd.laba.block1.task2.Game.printCountOfGames;

public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InvalidTeamScoreException {
        Game judo = new Game("Judo", "Japan");
        try {
            judo.setCountOfPlayers(2);
        } catch (InvalidCountOfPlayersException e) {
            LOGGER.info(e.getMessage());
            judo.setDefaultCountOfPlayers();
        }

        Sportsman sportsman1 = new Sportsman("Igor", "Pryshchepa");
        try {
            sportsman1.setAge(20);
        } catch (InvalidAgeException e) {
            LOGGER.info(e.getMessage());
        }
        try {
            sportsman1.setCharacteristics(10, 9, 8);
        } catch (InvalidCharacteristicsException e) {
            LOGGER.info(e.getMessage());
        }

        Sportsman sportsman2 = new Sportsman("Vasiliy", "Korzsh");
        try {
            sportsman2.setAge(21);
        } catch (InvalidAgeException e) {
            LOGGER.info(e.getMessage());
        }
        try {
            sportsman2.setCharacteristics(8, 9, 10);
        } catch (InvalidCharacteristicsException e) {
            LOGGER.info(e.getMessage());
        }

        Trainer trainer1 = new Trainer("Dmitriy", "Greck", "MSMC");
        try {
            trainer1.setYearsOfExp(20);
        } catch (InvalidYearsOfExperience e) {
            LOGGER.info(e.getMessage());
        }
        trainer1.printNameLastName();
        sportsman1.printNameLastName();
        LOGGER.info(sportsman1.getName() + "'s score is - " + sportsman1.calculateScore());
        sportsman2.printNameLastName();
        LOGGER.info(sportsman2.getName() + "'s score is - " + sportsman2.calculateScore());

        Sportsman sportsman3 = new Sportsman("John", "Wilson");
        try {
            sportsman3.setAge(18);
        } catch (InvalidAgeException e) {
            LOGGER.info(e.getMessage());
        }
        try {
            sportsman3.setCharacteristics(8, 8, 8);
        } catch (InvalidCharacteristicsException e) {
            LOGGER.info(e.getMessage());
        }

        Sportsman sportsman4 = new Sportsman("Tom", "Nixon");
        try {
            sportsman4.setAge(20);
        } catch (InvalidAgeException e) {
            LOGGER.info(e.getMessage());
        }
        try {
            sportsman4.setCharacteristics(9, 9, 9);
        } catch (InvalidCharacteristicsException e) {
            LOGGER.info(e.getMessage());
        }

        Trainer trainer2 = new Trainer("Mickey", "Bradly", "MSMC");
        try {
            trainer2.setYearsOfExp(18);
        } catch (InvalidYearsOfExperience e) {
            LOGGER.info(e.getMessage());
        }
        trainer2.printNameLastName();
        sportsman3.printNameLastName();
        LOGGER.info(sportsman3.getName() + "'s score is - " + sportsman3.calculateScore());
        sportsman4.printNameLastName();
        LOGGER.info(sportsman4.getName() + "'s score is - " + sportsman4.calculateScore());

        List<Sportsman> sportsmenUkraine = new ArrayList<>();
        sportsmenUkraine.add(sportsman1);
        sportsmenUkraine.add(sportsman2);

        Team teamUkraine = new Team(sportsmenUkraine, trainer1);
        teamUkraine.setName("Ukraine");
        teamUkraine.saySlogan("Never give up!");
        int teamUkraineScore = 0;
        try {
            teamUkraineScore = teamUkraine.calculateScore();
        } catch (InvalidTeamScoreException e) {
            LOGGER.info(e.getMessage());
        }
        LOGGER.info("The team Ukraine score is - " + teamUkraineScore);

        List<Sportsman> sportsmenUSA = new ArrayList<>();
        sportsmenUSA.add(sportsman3);
        sportsmenUSA.add(sportsman4);

        Team teamUsa = new Team(sportsmenUSA, trainer2);
        teamUsa.setName("USA");
        int teamUsaScore = 0;
        try {
            teamUsaScore = teamUsa.calculateScore();
        } catch (InvalidTeamScoreException e) {
            LOGGER.info(e.getMessage());
        }
        LOGGER.info("The team USA score is - " + teamUsaScore);

        GameResult gameResult1 = new GameResult("Judo", "Rainy");
        double weatherFactor = gameResult1.getWeatherFactor("Rainy");

        GameResult.generateGameResult(judo, teamUkraine, teamUsa, weatherFactor);

        FinalResult finalResult = new FinalResult("Victory", 1, 10000, "victoryCountry", 15, 10);
        LOGGER.info(finalResult);

        Sportsman sportsman5 = new Sportsman("Arthur", "L");
        Sportsman sportsman6 = new Sportsman("Timur", "O");
        LOGGER.info(sportsman3.equals(sportsman4));
        LOGGER.info(sportsman3.hashCode());

        printCountOfGames(42);
    }
}
