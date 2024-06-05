package player;

/*人族玩家 
    資源: 木頭200, 金錢100  
    傷害: 5
    建築物等級: 1
*/
public class HumanPlayer extends Player{

    @Override
    public int getDamage(){
        return 5;
    }
}
