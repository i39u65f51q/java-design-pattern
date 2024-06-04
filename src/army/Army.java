package army;

//狀態模式
public class Army {
    public State state; 

    public Army(){
        this.state = new Defend(); //預設防守狀態
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
