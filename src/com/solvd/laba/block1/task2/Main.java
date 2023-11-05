package com.solvd.laba.block1.task2;

public class Main {
    public static void main(String[] args) {
        Country country = new Country("USA");
        System.out.println(country.getCountryName());
        country.setCountryName("Ukraine");
        System.out.println(country.getCountryName());

        Sportsman sportsman = new Sportsman(19, "Ihor");

    }
}
