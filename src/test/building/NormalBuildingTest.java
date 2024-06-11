package test.building;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import building.NormalBuilding;

public class NormalBuildingTest {
    
    @Test
    //案例：取得普通建築物防禦等級
    public void getLevel(){
        NormalBuilding sut = new NormalBuilding();
        assertEquals(sut.getLevel(), 1);
    }
}
