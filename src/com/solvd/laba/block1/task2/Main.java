package com.solvd.laba.block1.task2;

import java.util.ArrayList;
import java.util.List;

import static com.solvd.laba.block1.task2.Game.printCountOfGames;

public class Main {
    public static void main(String[] args) {
        Sportsman sportsman1 = new Sportsman("Igor", "Pryshchepa", 21);
        Sportsman sportsman2 = new Sportsman("Vasiliy", "Korzsh", 22);
        Trainer trainer1 = new Trainer("Dmitriy", "Greck", "MSMC");

        Sportsman sportsman3 = new Sportsman("John", "Wilson", 23);
        Sportsman sportsman4 = new Sportsman("Tom", "Nixon", 22);
        Trainer trainer2 = new Trainer("Mickey", "Bradly", "MSMC");

        List<Sportsman> sportsmenUkraine = new ArrayList<>();
        sportsmenUkraine.add(sportsman1);
        sportsmenUkraine.add(sportsman2);
        Country ukraine = new Country("Ukraine", "Kyiv");
        Team teamUkraine = new Team(sportsmenUkraine, ukraine);
        System.out.println(teamUkraine);
        System.out.println();

        List<Sportsman> sportsmenUSA = new ArrayList<>();
        sportsmenUSA.add(sportsman3);
        sportsmenUSA.add(sportsman4);
        Country usa = new Country("USA", "Washington");
        Team teamUsa = new Team(sportsmenUSA, usa);
        System.out.println(teamUsa);
        System.out.println();

        GameResult gameResult1 = new GameResult("Basketball","Victory!", 1, 1000);
        System.out.println(gameResult1);
        FinalResult finalResult = new FinalResult("Victory", 1, 10000, "victoryCountry", 15, 10);
        System.out.println(finalResult);
        System.out.println(sportsman1);

        Sportsman sportsman5 = new Sportsman("Arthur", "L", 23);
        Sportsman sportsman6 = new Sportsman("Timur", "O", 24);
        System.out.println(sportsman3.equals(sportsman4));
        System.out.println(sportsman3.hashCode());

        printCountOfGames(42);

        Game basketball = new Game("Basketball", 10);
        GameResult.generateGameResult(basketball, teamUkraine, teamUsa);
    }
}
