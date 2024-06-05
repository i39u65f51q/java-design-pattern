package test.mock;

import building.BuildingFactory;
import fight.Fight;
import player.Player;
import resource.ResourceBuilder;

public class MockFight extends Fight{
    public boolean isCalledMethod;

    public MockFight(BuildingFactory bFactory, ResourceBuilder rBuilder) {
        super(bFactory, rBuilder);
    }

    @Override 
    public void attackNotify(int damage, Player attacker){
        this.isCalledMethod = true;
    }
    
    @Override 
    public void quitNotify(Player attacker){
        this.isCalledMethod = true;
    }
}
