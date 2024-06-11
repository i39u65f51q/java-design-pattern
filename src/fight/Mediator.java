package fight;

import player.Player;

//中介者介面
public interface Mediator {
    public void attackNotify(int damage, Player player);
    public void quitNotify(Player player);
}
