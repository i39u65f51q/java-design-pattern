package test.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import player.ElfPlayer;
import player.Player;

public class ElfPlayerTest {
    @Test
    //案例：取得傷害值
    public void getDamage(){
        Player sut = new ElfPlayer();
        assertEquals(sut.getDamage(), 5);
    }
}
