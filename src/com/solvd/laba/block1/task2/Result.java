package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.Points;

public abstract class Result implements Points {
    String result;
    int place;
    int score;

    Result(String result, int place, int score) {
        this.result = result;
        this.place = place;
        this.score = score;
    }

    @Override
    public void getPoints(int points) {
        System.out.println("Method getPoints with score " + points);
    }
}
