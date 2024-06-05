package test.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import player.ElfPlayer;
import player.Player;

public class ElfPlayerTest {
    @Test
    public void getDamage(){
        Player sut = new ElfPlayer();
        assertEquals(sut.getDamage(), 5);
    }
}
