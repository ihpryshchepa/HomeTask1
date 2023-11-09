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
        String result = teamUkraine.toString();
        System.out.println(result);
    }
}
