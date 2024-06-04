package player;

import army.Army;
import building.BuildingFactory;
import resource.ResourceBuilder;

/*精靈玩家 
    資源: 木頭300, 金錢50  
    傷害: 5
    建築物等級: 2
*/
public class ElfPlayer extends Player {
    @Override
    public void initResource(ResourceBuilder builder) {
        builder.addWood(300);
        builder.addGold(50);
        this.resource = builder.getResource();
    }

    @Override
    public void initDamage() {
       this.damage = 5;
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
