package com.solvd.laba.block1.task2;

public class GameResult extends Result {
    private String gameName;

    protected GameResult(String gameName, String result, int place, int score) {
        super(result, place, score);
        this.gameName = gameName;
    }

    @Override
    public String toString() {
        return "GameResult{"
                + "gameName='" + gameName + '\''
                + "place='" + result + '\''
                + ", place=" + place + '\''
                + ", score=" + score + '\''
                + '}';
    }

    public static void generateGameResult(Game game, Team team1, Team team2) {
        double weatherFactor = 0.5;
        if (team1.getTeamScore() > team2.getTeamScore()) {
            System.out.println("In game " + game.getGameName() + " with count of score and weather factor " + team1.getTeamScore() * weatherFactor + " wins " + team1.getName());
        } else {
            System.out.println("In game " + game.getGameName() + " with count of score and weather factor " + team2.getTeamScore() * weatherFactor + " wins " + team2.getName());
        }
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameResult() {
        return result;
    }

    public void setGameResult(String gameResult) {
        this.result = result;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
