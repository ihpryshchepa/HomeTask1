package com.solvd.laba.block1.task2.interfaces;

import com.solvd.laba.block1.task2.exceptions.InvalidTeamScoreException;

public interface ScoreInterface {
    int calculateScore() throws InvalidTeamScoreException;
}
