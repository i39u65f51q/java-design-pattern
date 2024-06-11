package test.army;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import army.Attack;
import test.mock.MockArmy;

public class AttackTest {
    @Test
    //案例：攻擊狀態時，呼叫攻擊    
    public void isAttackStateCallAttack(){
        Attack sut = new Attack();
        MockArmy doc = new MockArmy(new Attack()); 
        sut.attack(doc);
        assumeFalse(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    //案例：攻擊狀態時，呼叫防禦
    public void isAttackStateDefend(){
        Attack sut = new Attack();
        MockArmy doc = new MockArmy(new Attack()); 
        sut.defend(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    //案例：攻擊狀態時，呼叫撤退
    public void isAttackStateRetreat(){
        Attack sut = new Attack();
        MockArmy doc = new MockArmy(new Attack()); 
        sut.retreat(doc);
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }
}
