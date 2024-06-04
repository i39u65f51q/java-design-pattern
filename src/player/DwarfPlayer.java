package player;

import army.Army;
import building.BuildingFactory;
import resource.ResourceBuilder;


/*矮人玩家 
    資源: 木頭250, 金錢70  
    傷害: 2
    建築物等級: 2
*/
public class DwarfPlayer extends Player{

    @Override
    public void initResource(ResourceBuilder builder) {
        builder.addWood(250);
        builder.addGold(70);
        this.resource = builder.getResource();
    }

    @Override
    public void initDamage() {
        this.damage = 2;
    }

    @Override
    public void initBuilding(BuildingFactory factory) {
        this.building = factory.getStrongBuilding(this.resource);
    }

    @Override 
    public void initArmy(Army army){
        this.army = army;
    }
}
