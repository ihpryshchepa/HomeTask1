package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.Points;

public abstract class Result implements Points {
    protected String result;
    protected int place;
    protected int score;

    protected Result(String result, int place, int score) {
        this.result = result;
        this.place = place;
        this.score = score;
    }

    @Override
    public void getPoints(int points) {
        System.out.println("Method getPoints with score " + points);
    }
}
