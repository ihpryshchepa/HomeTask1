package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.Slogan;
import com.solvd.laba.block1.task2.interfaces.Sportsmen;

import java.util.List;

public class Team implements Slogan, Sportsmen {
    private List<Object> sportsmen;
    private String countryName;

    public Team(List<Object> sportsmen, String countryName) {
        this.sportsmen = sportsmen;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Team{"
                + "countryName='" + countryName + '\''
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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
