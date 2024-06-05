package test.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import player.DwarfPlayer;
import player.Player;

public class DwarfPlayerTest {

    @Test
    public void getDamage(){
        Player sut = new DwarfPlayer();
        assertEquals(sut.getDamage(), 4);
    }
}
