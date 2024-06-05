package test.mock;

import army.Army;
import fight.Fight;
import player.Player;


public class MockPlayer extends Player{
    public boolean isCalledMethod;

    @Override
    public int getDamage() {
        return 1;
    }

    @Override
    public void startFight(Fight f, Army army){
        this.isCalledMethod = true;
    }

    @Override
    public void beAttacked(int damage){
        this.isCalledMethod = true;
    }
}
