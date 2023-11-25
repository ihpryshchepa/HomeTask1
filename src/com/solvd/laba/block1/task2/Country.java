package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.WeatherInterface;

public class Country implements WeatherInterface {
    private String countryName;
    private String capitalCity;

    protected Country(String countryName, String capitalCity) {
        this.countryName = countryName;
        this.capitalCity = capitalCity;
    }

    @Override
    public double getWeatherFactor(String weather) {
        double weatherFactor = 0;
        if (weather.equals("Sunny")) {
            weatherFactor = 10;
        } else if (weather.equals("Rainy")) {
            weatherFactor = -10;
        }
        return weatherFactor;
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
