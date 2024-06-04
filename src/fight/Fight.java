package fight;

import java.util.ArrayList;
import java.util.List;

import player.Player;

//中介者模式
public class Fight implements Mediator {
    public List<Player> players;
    
    public Fight(){
        this.players = new ArrayList<Player>(); 
    }
    //註冊使用者加入戰鬥
    public void register(Player player){
        this.players.add(player); 
        player.setFight(this);
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
                this.players.remove(i);
                break;
            }
        }
    } 
}
