package test.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import player.DwarfPlayer;
import player.Player;


public class DwarfPlayerTest {

    @Test
    //案例：取得傷害值
    public void getDamage(){
        Player sut = new DwarfPlayer();
        assertEquals(sut.getDamage(), 4);
    }
}
