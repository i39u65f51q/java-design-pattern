package test.building;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import building.StrongBuilding;

public class StrongBuildingTest {
    @Test
    public void getLevel(){
        StrongBuilding sut = new StrongBuilding();
        assertEquals(sut.getLevel(), 2);
    }
}
