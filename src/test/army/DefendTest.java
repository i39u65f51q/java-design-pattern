package test.army;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import army.Defend;
import test.mock.MockArmy;

public class DefendTest {
    @Test
    public void isDefendStateCallAttack(){
        Defend sut = new Defend();
        MockArmy doc = new MockArmy(new Defend());
        sut.attack(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    public void isDefendStateCallDefend(){
        Defend sut = new Defend();
        MockArmy doc = new MockArmy(new Defend()); //防
        sut.defend(doc);
        assumeFalse(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    public void isDefendStateCallRetreat(){
        Defend sut = new Defend();
        MockArmy doc = new MockArmy(new Defend()); //防
        sut.retreat(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
}
