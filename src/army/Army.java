package army;

//狀態模式
public class Army {
    public State state; 

    public Army(State state){
        this.state = state;
    }

    public void attack(){
        this.state.attack(this);
    }

    public void defend(){
        this.state.defend(this);
    }

    public void retreat(){
        this.state.retreat(this);   
    }

    public void changeState(State state){
        this.state = state;
    }
}
