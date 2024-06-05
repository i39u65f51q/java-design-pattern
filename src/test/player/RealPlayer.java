package test.player;

import player.Player;

//實例化抽象方法
public class RealPlayer extends Player{

    @Override
    public int getDamage() {
        return 0;
    }

}
