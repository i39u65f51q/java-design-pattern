package army;

public class Defend implements State{

    public void attack(Army army) {
        System.out.println("Army's state is changed from defend to attack!");
        army.changeState(new Retreat());
    }

    public void defend(Army army) {
        System.out.println("Army is already defending!");
    }

    public void retreat(Army army) {
        System.out.println("Army's state is changed from defend to retreat!");
        army.changeState(new Retreat());
    }


}
