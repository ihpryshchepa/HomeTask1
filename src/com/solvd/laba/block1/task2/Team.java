package com.solvd.laba.block1.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Team {
    private List<Object> sportsmen;
    private String countryName;

    public Team(List<Object> sportsmen, String countryName) {
        this.sportsmen = sportsmen;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Names: " + this.getClass().getSimpleName() + " Country: " + countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
