package com.solvd.laba.block1.task2;

public class Country {
    private String countryName;
    private String capitalCity;

    protected Country(String countryName, String capitalCity) {
        this.countryName = countryName;
        this.capitalCity = capitalCity;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String newCountryName) {
        this.countryName = newCountryName;
    }

    public String getCapitalOfOlympicGames() {
        return capitalCity;
    }

    public void setCapitalOfOlympicGames(String capitalOfOlympicGames) {
        this.capitalCity = capitalOfOlympicGames;
    }

    @Override
    public String toString() {
        return "Country {"
                + "countryName='" + countryName + '\''
                + "capitalCity='" + capitalCity + '\''
                + '}';
    }
}
