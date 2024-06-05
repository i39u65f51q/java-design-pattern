package test.army;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import army.Attack;
import test.mock.MockArmy;

public class AttackTest {
    @Test
    public void isAttackStateCallAttack(){
        Attack sut = new Attack();
        MockArmy doc = new MockArmy(new Attack()); 
        sut.attack(doc);
        assumeFalse(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    public void isAttackStateDefend(){
        Attack sut = new Attack();
        MockArmy doc = new MockArmy(new Attack()); 
        sut.defend(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    public void isAttackStateRetreat(){
        Attack sut = new Attack();
        MockArmy doc = new MockArmy(new Attack()); 
        sut.retreat(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
}
