package test.army;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import army.Defend;
import test.mock.MockArmy;

public class DefendTest {
    @Test
    //案例：防禦狀態時，呼叫攻擊
    public void isDefendStateCallAttack(){
        Defend sut = new Defend();
        MockArmy doc = new MockArmy(new Defend());
        sut.attack(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    //案例：防禦狀態時，呼叫防禦
    public void isDefendStateCallDefend(){
        Defend sut = new Defend();
        MockArmy doc = new MockArmy(new Defend()); //防
        sut.defend(doc);
        assumeFalse(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    //案例：防禦狀態時，呼叫撤退
    public void isDefendStateCallRetreat(){
        Defend sut = new Defend();
        MockArmy doc = new MockArmy(new Defend()); //防
        sut.retreat(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
}
