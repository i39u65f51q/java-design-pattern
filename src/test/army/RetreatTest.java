package test.army;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import army.Retreat;
import test.mock.MockArmy;

public class RetreatTest {
    @Test
    //案例：撤退狀態時，呼叫攻擊
    public void isRetreatStateCallAttack(){
        Retreat sut = new Retreat();
        MockArmy doc = new MockArmy(new Retreat()); //防
        sut.attack(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    //案例：撤退狀態時，呼叫防禦
    public void isRetreatStateDefend(){
        Retreat sut = new Retreat();
        MockArmy doc = new MockArmy(new Retreat()); //防
        sut.defend(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    //案例：撤退狀態時，呼叫撤退
    public void isRetreatStateRetreat(){
        Retreat sut = new Retreat();
        MockArmy doc = new MockArmy(new Retreat()); //防
        sut.retreat(doc);
        assumeFalse(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
}
