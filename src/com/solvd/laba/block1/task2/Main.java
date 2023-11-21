package com.solvd.laba.block1.task2;

import java.util.ArrayList;
import java.util.List;

import static com.solvd.laba.block1.task2.Game.printCountOfGames;

public class Main {
    public static void main(String[] args) {
        Game judo = new Game("Judo", 2);

        Sportsman sportsman1 = new Sportsman("Igor", "Pryshchepa", 21);
        sportsman1.setCharacteristics(10, 9, 8);
        Sportsman sportsman2 = new Sportsman("Vasiliy", "Korzsh", 22);
        sportsman2.setCharacteristics(8, 9, 10);
        Trainer trainer1 = new Trainer("Dmitriy", "Greck", "MSMC");
        trainer1.setYearsOfExp(20);
        System.out.println(sportsman1.getSportsmanScore());
        System.out.println(sportsman2.getSportsmanScore());

        Sportsman sportsman3 = new Sportsman("John", "Wilson", 23);
        sportsman3.setCharacteristics(8, 8, 8);
        Sportsman sportsman4 = new Sportsman("Tom", "Nixon", 22);
        sportsman4.setCharacteristics(9, 9, 9);
        Trainer trainer2 = new Trainer("Mickey", "Bradly", "MSMC");
        trainer2.setYearsOfExp(18);
        System.out.println(sportsman3.getSportsmanScore());
        System.out.println(sportsman4.getSportsmanScore());

        List<Sportsman> sportsmenUkraine = new ArrayList<>();
        sportsmenUkraine.add(sportsman1);
        sportsmenUkraine.add(sportsman2);
        Team teamUkraine = new Team(sportsmenUkraine, trainer1, "Ukraine");
        int teamUkraineScore = teamUkraine.getTeamScore();
        System.out.println("Очки команды Ukraine " + teamUkraineScore);

        List<Sportsman> sportsmenUSA = new ArrayList<>();
        sportsmenUSA.add(sportsman3);
        sportsmenUSA.add(sportsman4);
        Team teamUsa = new Team(sportsmenUSA, trainer2, "USA");
        int teamUsaScore = teamUsa.getTeamScore();
        System.out.println("Очки команды USA " + teamUsaScore);

        GameResult.generateGameResult(judo, teamUkraine, teamUsa);
        System.out.println();

        GameResult gameResult1 = new GameResult("Basketball", "Victory!", 1, 1000);
        System.out.println(gameResult1);
        FinalResult finalResult = new FinalResult("Victory", 1, 10000, "victoryCountry", 15, 10);
        System.out.println(finalResult);

        Sportsman sportsman5 = new Sportsman("Arthur", "L", 23);
        Sportsman sportsman6 = new Sportsman("Timur", "O", 24);
        System.out.println(sportsman3.equals(sportsman4));
        System.out.println(sportsman3.hashCode());

        printCountOfGames(42);
    }
}
