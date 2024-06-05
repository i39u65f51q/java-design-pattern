package test.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import player.HumanPlayer;
import player.Player;

public class HumanPlayerTest {
    @Test
    public void getDamage(){
        Player sut = new HumanPlayer();
        assertEquals(sut.getDamage(), 5);
    }
}
