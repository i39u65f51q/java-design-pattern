package army;

public class Attack implements State{

    public void attack(Army army) {
        System.out.println("Army is already attacking!");
    }

    public void defend(Army army) {
        System.out.println("Army's state is changed from attack to defend!");
        army.changeState(new Defend());
    }

    public void retreat(Army army) {
        System.out.println("Army's state is changed from attack to retreat!");
        army.changeState(new Retreat());
    }

}
