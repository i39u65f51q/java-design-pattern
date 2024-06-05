package test.mock;

import army.Army;
import army.State;

public class MockArmy extends Army{
    public boolean isCalledMethod;

    public MockArmy(State state) {
        super(state);
    }

    @Override 
    public void attack(){
        this.isCalledMethod = true;
    }

    @Override 
    public void defend(){
        this.isCalledMethod = true;
    }

    @Override 
    public void retreat(){
        this.isCalledMethod = true;
    }
    
    @Override 
    public void changeState(State state){
        this.isCalledMethod = true;
    }

}
