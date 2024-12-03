package com.kata.model;

import com.kata.enumeration.Score;

public class Player {

    private Integer balls = 0;
    private String score;

    public void winBall() {
        this.balls++;
    }

    public Integer getBalls() {
        return balls;
    }

    public void setBalls(Integer balls) {
        this.balls = balls;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void calculateScore(Integer balls, Integer ballsOpponent) {
        switch (balls) {
            case 0 -> this.setScore(Score.ZERO.getValue());
            case 1 -> this.setScore(Score.FIFTEEN.getValue());
            case 2 -> this.setScore(Score.THIRTY.getValue());
            case 3 -> this.setScore(Score.FORTY.getValue());
            default -> {
                if (balls > ballsOpponent) {
                    this.setScore(Score.ADVANTAGE.getValue());
                } else {
                    this.setScore(Score.FORTY.getValue());
                }

            }
        }

    }
}
