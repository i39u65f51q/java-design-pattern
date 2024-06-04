package player;

import army.Army;
import building.BuildingFactory;
import resource.ResourceBuilder;

/*人族玩家 
    資源: 木頭200, 金錢100  
    傷害: 3
    建築物等級: 1
*/
public class HumanPlayer extends Player{
    @Override
    public void initResource(ResourceBuilder builder) {
        builder.addWood(200);
        builder.addGold(100);
        this.resource = builder.getResource();
    }

    @Override
    public void initDamage() {
       this.damage = 3;
    }

    @Override
    public void initBuilding(BuildingFactory factory) {
        this.building = factory.getNormalBuilding(this.resource);
    }

    @Override 
    public void initArmy(Army army){
        this.army = army;
    }
}
