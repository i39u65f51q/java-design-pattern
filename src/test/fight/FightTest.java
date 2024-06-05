package test.fight;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import fight.Fight;
import test.mock.MockPlayer;

public class FightTest {

    @Test
    public void register(){
        Fight sut = new Fight(null, null);
        MockPlayer doc = new MockPlayer();

        sut.register(doc);

        assumeTrue(sut.players.contains(doc));
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    public void attackNotify(){
        Fight sut = new Fight(null, null);
        MockPlayer p1 = new MockPlayer();
        MockPlayer p2 = new MockPlayer();
        sut.players.add(p1);
        sut.players.add(p2);

        sut.attackNotify(p1.getDamage(), p1); //p1發動攻擊

        assumeTrue(p2.isCalledMethod); //p2被攻擊，會被call Attacked
        assumeFalse(p1.isCalledMethod); //p1發動攻擊，不會被call Attacked
        p2.isCalledMethod = false;
    }

    @Test
    public void quitNotify(){
        Fight sut = new Fight(null, null);
        MockPlayer p1 = new MockPlayer();
        MockPlayer p2 = new MockPlayer();
        sut.players.add(p1);
        sut.players.add(p2);

        sut.quitNotify(p1); //p1退出

        assumeFalse(sut.players.contains(p1));
        assumeTrue(sut.players.contains(p2));
    }
}
