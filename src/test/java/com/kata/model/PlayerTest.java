package com.kata.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void PlayerTest_when_winBall2_calculateScore_shouldReturn_30() {
        Player player = new Player();
        player.calculateScore(2, 0);
        Assertions.assertEquals("30", player.getScore());
    }

    @Test
    public void PlayerTest_when_winBall4_calculateScore_shouldReturn_40plus() {
        Player playerA = new Player();
        playerA.setBalls(4);
        playerA.calculateScore(playerA.getBalls(),0);
        Assertions.assertEquals("40+", playerA.getScore());
    }
    @Test
    public void PlayerTest_calculateScore() {
        Player playerA = new Player();
        Player playerB = new Player();
        playerA.setBalls(7);
        playerB.setBalls(5);
        playerA.calculateScore(playerA.getBalls(), playerB.getBalls());
        playerB.calculateScore(playerB.getBalls(), playerA.getBalls());
        Assertions.assertEquals("40+", playerA.getScore());
        Assertions.assertEquals("40", playerB.getScore());
    }

    @Test
    public void PlayerTest_when_winFirstBall_shouldReturn_1() {
        Player player = new Player();
        player.winBall();
        Assertions.assertEquals(1, player.getBalls());
    }
}
