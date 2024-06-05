package test.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import army.Army;
import building.BuildingFactory;
import player.Player;
import resource.ResourceBuilder;
import test.mock.MockArmy;
import test.mock.MockFight;

public class RealPlayerTest {

    @Test
    public void startFight(){
        Player sut = new RealPlayer();
        sut.startFight(new MockFight(new BuildingFactory(), new ResourceBuilder()), new Army(null));
       
        assumeNotNull(sut.getArmy());
        assumeNotNull(sut.getResource());
        assumeNotNull(sut.getBuilding());
        assumeNotNull(sut.getFight());
    }

    @Test
    public void attack(){
        Player sut = new RealPlayer();
        MockArmy docArmy = new MockArmy(null);
        MockFight docFight = new MockFight(new BuildingFactory(),new ResourceBuilder());
        sut.startFight(docFight, docArmy);

        sut.attack();

        assumeTrue(docArmy.isCalledMethod);
        assumeTrue(docFight.isCalledMethod);

        docArmy.isCalledMethod = false;
        docFight.isCalledMethod = false;
    }

    @Test
    public void defend(){
        Player sut = new RealPlayer();
        MockArmy docArmy = new MockArmy(null);
        MockFight docFight = new MockFight(new BuildingFactory(),new ResourceBuilder());
        sut.startFight(docFight, docArmy);

        sut.defend();

        assumeTrue(docArmy.isCalledMethod);
        assumeFalse(docFight.isCalledMethod);

        docArmy.isCalledMethod = false;
        docFight.isCalledMethod = false;
    }

    @Test
    public void beAttackedAndBeDead(){
        Player sut = new RealPlayer();
        MockArmy docArmy = new MockArmy(null);
        MockFight docFight = new MockFight(new BuildingFactory(), new ResourceBuilder());
        sut.startFight(docFight, docArmy);
        int damage = 10 , life = sut.getLife();

        sut.beAttacked(damage); //敵人傷害值為10

        assumeTrue(docArmy.isCalledMethod);
        assumeTrue(docFight.isCalledMethod);
        assertEquals(life - (damage - sut.getBuilding().getLevel()), sut.getLife()); //傷害-建築物

        docArmy.isCalledMethod = false;
        docFight.isCalledMethod = false;
    }

    @Test
    public void beAttackedAndBeAlive(){
        Player sut = new RealPlayer();
        MockArmy docArmy = new MockArmy(null);
        MockFight docFight = new MockFight(new BuildingFactory(), new ResourceBuilder());
        sut.startFight(docFight, docArmy);
        int damage = 5, life = sut.getLife();
        
        sut.beAttacked(damage); //敵人傷害值為5

        assumeFalse(docArmy.isCalledMethod);
        assumeFalse(docFight.isCalledMethod);
        assertEquals(life - (damage - sut.getBuilding().getLevel()), sut.getLife()); //傷害-建築物
        
        docArmy.isCalledMethod = false;
        docFight.isCalledMethod = false;
    }

    @Test
    public void beAttackedAndDamageIs0(){
        Player sut = new RealPlayer();
        MockArmy docArmy = new MockArmy(null);
        MockFight docFight = new MockFight(new BuildingFactory(), new ResourceBuilder());
        sut.startFight(docFight, docArmy);
        int damage = 0, life = sut.getLife();
        
        sut.beAttacked(damage); //敵人傷害值為5
        assumeFalse(docArmy.isCalledMethod);
        assumeFalse(docFight.isCalledMethod);
        assertEquals(life, sut.getLife()); //傷害-建築物
        
        docArmy.isCalledMethod = false;
        docFight.isCalledMethod = false;
    }
}
