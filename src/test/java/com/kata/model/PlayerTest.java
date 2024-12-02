package com.kata.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void PlayerTest_when_winBall2_calculateScore_shouldReturn_30() {
        Player player = new Player();
        player.calculateScore(2);
        Assertions.assertEquals("30", player.getScore());
    }

    @Test
    public void PlayerTest_when_winBall4_calculateScore_shouldReturn_40plus() {
        Player player = new Player();
        player.calculateScore(4);
        Assertions.assertEquals("40+", player.getScore());
    }

    @Test
    public void PlayerTest_when_winFirstBall_shouldReturn_1() {
        Player player = new Player();
        player.winBall();
        Assertions.assertEquals(1, player.getBalls());
    }
}
