package test.building;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import building.Building;
import building.BuildingFactory;
import resource.Resource;

public class BuildingFactoryTest {
    

    @Test
    public void getNormalBuildingSuccessfully(){
        BuildingFactory sut = new BuildingFactory();
        Resource doc = new Resource();
        doc.setWood(200);
        Building res = sut.getNormalBuilding(doc);

        assertNotNull(res);
    }

    @Test
    public void getNormalBuildingFailed(){
        BuildingFactory sut = new BuildingFactory();
        Resource doc = new Resource();

        Building res = sut.getNormalBuilding(doc);

        assertNull(res);
    }

    @Test
    public void getStrongBuildingSuccessfully(){
        BuildingFactory sut = new BuildingFactory();
        Resource doc = new Resource();
        doc.setWood(250);
        doc.setGold(50);
        Building res = sut.getStrongBuilding(doc);

        assertNotNull(res);
    }

    @Test
    public void getStrongBuildingFailed(){
        BuildingFactory sut = new BuildingFactory();
        Resource doc = new Resource();

        Building res = sut.getStrongBuilding(doc);

        assertNull(res);
    }

    @Test
    public void getStrongBuildingFailedFromWood(){
        BuildingFactory sut = new BuildingFactory();
        Resource doc = new Resource();
        doc.setGold(100);

        Building res = sut.getStrongBuilding(doc);

        assertNull(res);
    }

    @Test
    public void getStrongBuildingFailedFromGold(){
        BuildingFactory sut = new BuildingFactory();
        Resource doc = new Resource();
        doc.setWood(1000);

        Building res = sut.getStrongBuilding(doc);

        assertNull(res);
    }
}
