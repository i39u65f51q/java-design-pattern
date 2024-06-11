package test.building;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import building.StrongBuilding;

public class StrongBuildingTest {
    @Test
    //案例：取得堅固建築物防禦等級
    public void getLevel(){
        StrongBuilding sut = new StrongBuilding();
        assertEquals(sut.getLevel(), 2);
    }
}
