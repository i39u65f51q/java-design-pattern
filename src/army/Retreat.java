package army;

public class Retreat implements State{

    //執行攻擊
    public void attack(Army army) {
        System.out.println("Army's state is changed from retreat to attack!");
        army.changeState(new Attack());
    }

    //執行防禦
    public void defend(Army army) {
        System.out.println("Army's state is changed from retreat to defend!");
        army.changeState(new Defend());
    }

    //執行撤退
    public void retreat(Army army) {
        System.out.println("Army is already retreating!");
    }

}
