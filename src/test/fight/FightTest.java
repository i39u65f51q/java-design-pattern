package test.fight;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import fight.Fight;
import test.mock.MockPlayer;

public class FightTest {

    @Test
    //案例：新增玩家至戰鬥
    public void register(){
        Fight sut = new Fight(null, null);
        MockPlayer doc = new MockPlayer();

        sut.register(doc);

        assumeTrue(sut.players.contains(doc));
        assumeTrue(doc.isCalledMethod);
        doc.isCalledMethod = false;
    }

    @Test
    //案例：玩家發出攻擊戰鬥通知
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
    //案例：玩家發出退出戰鬥通知
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
