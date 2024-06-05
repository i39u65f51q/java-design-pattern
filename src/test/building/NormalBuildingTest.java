package test.building;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import building.NormalBuilding;

public class NormalBuildingTest {
    
    @Test
    public void getLevel(){
        NormalBuilding sut = new NormalBuilding();
        assertEquals(sut.getLevel(), 1);
    }
}
