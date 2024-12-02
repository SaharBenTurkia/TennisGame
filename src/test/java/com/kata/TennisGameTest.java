package com.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TennisGameTest {

    @Test
    public void testGame_when_PlayerA_wins() {
        String input = "ABBAAA";
        String result = getOutput(() -> TennisGame.play(input));
        Assertions.assertTrue(result.contains("Player A wins the game"));
    }

    @Test
    public void testGame_when_PlayerB_wins() {
        String input = "BABBB";
        String result = getOutput(() -> TennisGame.play(input));
        Assertions.assertTrue(result.contains("Player B wins the game"));
    }

    @Test
    public void testGame_when_PlayerB_wins_after_deuce() {
        String input = "ABABABABABABBB";
        String result = getOutput(() -> TennisGame.play(input));
        Assertions.assertTrue(result.contains("Player A : 40 / Player B : 40"));
        Assertions.assertTrue(result.contains("Player B wins the game"));
    }

    @Test
    public void testGame_when_incomplete_game() {
        String input = "ABABABABABABB";
        String result = getOutput(() -> TennisGame.play(input));
        Assertions.assertTrue(result.contains("Player A : 40 / Player B : 40"));
        Assertions.assertTrue(result.contains("incomplete game"));
    }

    private String getOutput(Runnable task) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(outputStream));
            task.run();
        } finally {
            System.setOut(System.out);
        }
        return outputStream.toString();
    }
}