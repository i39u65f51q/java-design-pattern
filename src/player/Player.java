package player;

import army.Army;
import building.Building;
import building.BuildingFactory;
import fight.Fight;
import resource.Resource;
import resource.ResourceBuilder;

//樣板方法
public abstract class Player {
    private int life = 5;
    protected  int damage;
    protected Army army; //軍隊
    protected Resource resource; //資源 
    protected Fight fight; //配對戰鬥
    protected Building building;
   
    protected abstract void initDamage();
    public abstract void initArmy(Army army);
    public abstract void initResource(ResourceBuilder builder);
    public abstract void initBuilding(BuildingFactory factory);
 
    public void setFight(Fight fight){
        this.fight = fight;
    }

    //發動攻擊
    public void attack(){
        this.army.attack(); //軍隊攻擊
        this.fight.attackNotify(this.damage, this);
    }

    //被攻擊
    public void beAttacked(int damage){
        //如果擁有建築物，可以抵擋傷害
        if(this.building != null)damage -= building.getLevel();
        this.life-=damage;
        if(life >= 0){
            this.army.retreat(); //結束戰鬥，軍隊撤退
            fight.quitNotify(this);//結束戰鬥，退出戰鬥
            System.out.println("Quit Fight!");
        }
    }
}
