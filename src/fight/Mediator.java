package fight;

import player.Player;

public interface Mediator {
    public void attackNotify(int damage, Player player);
    public void quitNotify(Player player);
}
