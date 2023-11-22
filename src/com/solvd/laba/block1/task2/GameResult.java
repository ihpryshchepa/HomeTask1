package com.solvd.laba.block1.task2;

public class GameResult extends Result {
    private String gameName;
    private String weather;

    protected GameResult(String gameName, String result, int place, int score, String weather) {
        super(result, place, score);
        this.gameName = gameName;
        this.weather = weather;
    }

    public double getWeatherFactor(String weather) {
        double weatherFactor = 0;
        if (weather.equals("Sunny")) {
            weatherFactor = 0.1;
        } else if (weather.equals("Rainy")) {
            weatherFactor = 0.5;
        }
        return weatherFactor;
    }

    public static void generateGameResult(Game game, Team team1, Team team2, double weatherFactor) {
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

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
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
}
