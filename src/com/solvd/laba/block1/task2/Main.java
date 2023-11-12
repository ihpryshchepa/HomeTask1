package com.solvd.laba.block1.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sportsman sportsman1 = new Sportsman("Igor", "Pryshchepa", 21);
        Sportsman sportsman2 = new Sportsman("Vasiliy", "Korzsh", 22);
        sportsman1.printNameLastName();
        Trainer trainer = new Trainer("Dmitriy", "Greck", "MSMC");
        List<Object> sportsmenUkraine = new ArrayList<>();
        sportsmenUkraine.add(sportsman1);
        sportsmenUkraine.add(sportsman2);
        sportsmenUkraine.add(trainer);
        Team teamUkraine = new Team(sportsmenUkraine, "Ukraine");
        System.out.println(teamUkraine);
        System.out.println();

        GameResult gameResult1 = new GameResult("Basketball","Victory!", 1, 1000);
        System.out.println(gameResult1);
        FinalResult finalResult = new FinalResult("Victory", 1, 10000, "Ukraine", 15, 10);
        System.out.println(finalResult);
        System.out.println(sportsman1);

        Sportsman sportsman3 = new Sportsman("Arthur", "L", 23);
        Sportsman sportsman4 = new Sportsman("Timur", "O", 24);
        System.out.println(sportsman3.equals(sportsman4));
        System.out.println(sportsman3.hashCode());
    }
}
