package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.HistoryInterface;
import com.solvd.laba.block1.task2.interfaces.WeatherInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Country implements WeatherInterface, HistoryInterface {

    private static final Logger LOGGER = LogManager.getLogger(Country.class);

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

    @Override
    public void toKnowTheHistory(int year) {
        LOGGER.info("The country " + getCountryName() + " held Olympic Games in " + year);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(getCountryName(), country.getCountryName()) && Objects.equals(capitalCity, country.capitalCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryName(), capitalCity);
    }
}
