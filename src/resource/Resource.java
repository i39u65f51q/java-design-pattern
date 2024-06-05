package resource;

public class Resource {
    private int wood;
    private int gold;
    
    public Resource(){
       this.wood = 0;
       this.gold = 0;
    }

    public int getGold() {
        return gold;
    }

    public int getWood() {
        return wood;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

}
