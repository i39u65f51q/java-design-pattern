import army.Army;
import building.BuildingFactory;
import fight.Fight;
import player.ElfPlayer;
import player.HumanPlayer;
import player.Player;
import resource.ResourceBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fight!");

        Fight fight = new Fight();
        Player p1 = new HumanPlayer();//人族玩家
        Player p2 = new ElfPlayer();//精靈玩家

        p1.initArmy(new Army());
        p2.initArmy(new Army());
        p1.initResource(new ResourceBuilder()); 
        p2.initResource(new ResourceBuilder());
        p1.initBuilding(new BuildingFactory());
        p2.initBuilding(new BuildingFactory());

        fight.register(p1);
        fight.register(p2); 

        p1.attack(); //p1發動攻擊
    }
}
