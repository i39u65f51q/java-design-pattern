package test.army;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import army.Army;
import test.mock.MockState;

public class ArmyTest {

    @Test
    //軍隊執行攻擊
    public void attack(){
        MockState doc = new MockState();
        Army sut = new Army(doc); 
        sut.attack();
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
    @Test
    //軍隊執行防禦
    public void defend(){
        MockState doc = new MockState();
        Army sut = new Army(doc); 
        sut.defend();
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
    @Test
    //軍隊執行撤退
    public void retreat(){
        MockState doc = new MockState();
        Army sut = new Army(doc); 
        sut.retreat();
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
    @Test
    //軍隊改變狀態 
    public void changeState(){
        MockState m1 = new MockState();
        MockState m2 = new MockState();
        Army sut = new Army(m1); 
  
        sut.changeState(m2);
     
        assertEquals(sut.state, m2);
        assertNotEquals(sut.state, m1);
    }
    
}
