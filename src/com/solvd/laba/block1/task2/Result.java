package com.solvd.laba.block1.task2;

public abstract class Result {
    protected String result;
    protected int place;
    protected int score;

    public Result() {};

    protected Result(String result, int place, int score) {
        this.result = result;
        this.place = place;
        this.score = score;
    }

    protected abstract void printResult();
}
