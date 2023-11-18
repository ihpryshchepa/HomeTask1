package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.Slogan;
import com.solvd.laba.block1.task2.interfaces.Sportsmen;

import java.util.List;

public class Team implements Slogan, Sportsmen {
    private List<Sportsman> sportsmen;
    private Country country;

    public Team(List<Sportsman> sportsmen, Country country) {
        this.sportsmen = sportsmen;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Team{"
                + "countryName='" + country + '\''
                + '}';
    }

    @Override
    public void doTrain() {
        System.out.println("The Team trains");
    }

    @Override
    public void saySlogan() {
        System.out.println("The Team's Slogan");
    }

    public Country getCountryName() {
        return country;
    }

    public void setCountryName(String countryName) {
        this.country = country;
    }
}
