package test.mock;

import army.Army;
import army.State;

public class MockState implements State{
    public boolean isCalledMethod;

    @Override
    public void attack(Army army){
        this.isCalledMethod = true;
    }

    @Override
    public void defend(Army army){
        this.isCalledMethod = true;
    }

    @Override
    public void retreat(Army army){
        this.isCalledMethod = true;
    } 
}
