package army;

public class Defend implements State{

    //執行攻擊
    public void attack(Army army) {
        System.out.println("Army's state is changed from defend to attack!");
        army.changeState(new Retreat());
    }

    
    //執行防禦
    public void defend(Army army) {
        System.out.println("Army is already defending!");
    }

    //執行撤退
    public void retreat(Army army) {
        System.out.println("Army's state is changed from defend to retreat!");
        army.changeState(new Retreat());
    }


}
