package test.player;

import player.Player;

//實例化抽象物件，用於測試Abstract Player
public class RealPlayer extends Player{

    @Override    
    public int getDamage() {
        return 0;
    }

}
