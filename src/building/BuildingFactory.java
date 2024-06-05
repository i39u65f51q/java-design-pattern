package building;

import resource.Resource;

//工廠模式
public class BuildingFactory {
    public BuildingFactory(){}

    public Building getNormalBuilding(Resource resource){
        if(resource.getWood() >= 100){
            resource.setWood(resource.getWood() - 100);
            return new NormalBuilding();
        }
        System.out.println("Resource is not enough for NormalBuilding!");
        return null;
    }

    public Building getStrongBuilding(Resource resource){
        if(resource.getWood() >= 250 && resource.getGold() >= 50){
            resource.setWood(resource.getWood() - 250);
            resource.setGold(resource.getGold() - 50);
            return new StrongBuilding();
        }
        System.out.println("Resource is not enough for StrongBuilding!");
        return null;
    }
}
