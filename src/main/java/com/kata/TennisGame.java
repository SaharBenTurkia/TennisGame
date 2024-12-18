package com.kata;

import com.kata.model.Player;

public class TennisGame {
    public static void main(String[] args) {
        String input = "ABABAA";
        play(input);
    }

    public static void play(String input) {
        Player playerA = new Player();
        Player playerB = new Player();
        for (char c : input.toCharArray()) {
            if (c == 'A') {
                playerA.winBall();
            } else if (c == 'B') {
                playerB.winBall();
            }

            // display scores
            playerA.calculateScore(playerA.getBalls(), playerB.getBalls());
            playerB.calculateScore(playerB.getBalls(), playerA.getBalls());

            // display result
            if (playerA.getBalls() >= 4 && playerA.getBalls() - playerB.getBalls() >= 2) {
                System.out.println("Player A wins the game");
                return;
            } else if (playerB.getBalls() >= 4 && playerB.getBalls() - playerA.getBalls() >= 2) {
                System.out.println("Player B wins the game");
                return;
            } else {
                System.out.println("Player A : " + playerA.getScore() + " / Player B : " + playerB.getScore());
            }
        }
        // case of incomplete game
        System.out.println("incomplete game");
    }
}