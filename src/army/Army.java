package army;

//狀態模式
public class Army {
    public State state; //軍隊當前狀態

    public Army(State state){
        this.state = state;
    }
    //攻擊狀態
    public void attack(){
        this.state.attack(this);
    }
    //防守狀態
    public void defend(){
        this.state.defend(this);
    }
    //撤退狀態
    public void retreat(){
        this.state.retreat(this);   
    }
    //改變當前狀態
    public void changeState(State state){
        this.state = state;
    }
}
