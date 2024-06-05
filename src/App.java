import building.BuildingFactory;
import fight.Fight;
import player.ElfPlayer;
import player.HumanPlayer;
import player.Player;
import resource.ResourceBuilder;

public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, Fight!");

        Fight fight = new Fight(new BuildingFactory(), new ResourceBuilder());

        Player p1 = new HumanPlayer();
        Player p2 = new ElfPlayer();

        fight.register(p1);
        fight.register(p2); 

        System.out.println("p1 round:");
        p1.attack(); //p1發動攻擊

        System.out.println("p2 round:");
        p2.attack();
    }
}
