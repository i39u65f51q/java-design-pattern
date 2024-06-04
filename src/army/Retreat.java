package army;

public class Retreat implements State{

    public void attack(Army army) {
        System.out.println("Army's state is changed from retreat to attack!");
        army.changeState(new Attack());
    }

    public void defend(Army army) {
        System.out.println("Army's state is changed from retreat to defend!");
        army.changeState(new Defend());
    }

    public void retreat(Army army) {
        System.out.println("Army is already retreating!");
    }

}
