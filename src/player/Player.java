package player;

import army.Army;
import building.Building;
import fight.Fight;
import resource.Resource;

//樣板方法
public abstract class Player {
    private int life = 5;
    private Army army; //軍隊
    private Resource resource; //資源 
    private Building building; //建築物
    private Fight fight; //配對戰鬥

    public abstract int getDamage();

    //加入戰爭才會從戰爭類別獲取資源(資源、建築物、軍隊)
    public void startFight(Fight fight, Army army){
        this.army = army;
        this.fight = fight;
        fight.rBuilder.addWood(300);
        fight.rBuilder.addGold(100);
        this.resource = fight.rBuilder.getResource();
        this.building = fight.bFactory.getNormalBuilding(resource);
    }

    //發動攻擊
    public void attack(){
        this.army.attack(); //軍隊攻擊
        this.fight.attackNotify(this.getDamage(), this);
    }
    //防禦
    public void defend(){
        this.army.defend();
    }

    //被攻擊
    public void beAttacked(int damage){
        //如果擁有建築物，可以抵擋傷害
        damage -= this.building.getLevel();
        damage = damage <= 0 ? 0 : damage;
        this.life -= damage;
        if(life <= 0){
            this.army.retreat(); //結束戰鬥，軍隊撤退
            fight.quitNotify(this);//結束戰鬥，退出戰鬥
            System.out.println("Quit Fight!");
        }else{
            System.out.println("Rest of life is " + this.life);
        }
    }

    public Army getArmy() {
        return army;
    }

    public Resource getResource() {
        return resource;
    }

    public Building getBuilding() {
        return building;
    }

    public Fight getFight() {
        return fight;
    }

    public int getLife() {
        return life;
    }
}
