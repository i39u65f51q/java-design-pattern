package test.army;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import army.Retreat;
import test.mock.MockArmy;

public class RetreatTest {
    @Test
    public void isRetreatStateCallAttack(){
        Retreat sut = new Retreat();
        MockArmy doc = new MockArmy(new Retreat()); //防
        sut.attack(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    public void isRetreatStateDefend(){
        Retreat sut = new Retreat();
        MockArmy doc = new MockArmy(new Retreat()); //防
        sut.defend(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    public void isRetreatStateRetreat(){
        Retreat sut = new Retreat();
        MockArmy doc = new MockArmy(new Retreat()); //防
        sut.retreat(doc);
        assumeFalse(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
}
