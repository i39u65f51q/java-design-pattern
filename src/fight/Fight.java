package fight;

import java.util.ArrayList;
import java.util.List;

import army.Army;
import army.Defend;
import building.BuildingFactory;
import player.Player;
import resource.ResourceBuilder;

//中介者模式
public class Fight implements Mediator {
    public BuildingFactory bFactory; //建築物工廠
    public ResourceBuilder rBuilder; //資源生成器
    public List<Player> players; //使用者們
    
    public Fight(BuildingFactory bFactory, ResourceBuilder rBuilder){
        this.bFactory = bFactory;
        this.rBuilder = rBuilder;
        this.players = new ArrayList<Player>(); 
    }

    //註冊使用者加入戰鬥，並初始化資源、建築物
    public void register(Player player){
        this.players.add(player); 
        player.startFight(this, new Army(new Defend()));
    }

    //某使用者發動攻擊
    public void attackNotify(int damage, Player attacker){
        for(int i=0; i<this.players.size();i++){
            Player p = this.players.get(i);
            if(p != attacker){
                p.beAttacked(damage); //除了攻擊者外的使用者被攻擊
            }
        }
    }
    //某使用者退出戰鬥
    public void quitNotify(Player player){
        for(int i=0; i<this.players.size();i++){
            Player p = this.players.get(i);
            if(p == player){
                this.players.remove(i); //移除使用者
                break;
            }
        }
    } 
}
