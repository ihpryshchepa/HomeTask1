package com.solvd.laba.block1.task2;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public String countryName;
    List<String> sportsmen = new ArrayList<>();

    Team(ArrayList<String> sportsmen, String countryName) {
        this.sportsmen = new ArrayList<>();
        this.countryName = countryName;
    }
}
