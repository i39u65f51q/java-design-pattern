package resource;

public class Resource {
    private int wood;
    private int gold;
    
    public Resource(){
       this.wood = 0;
       this.gold = 0;
    }
    //取得金錢
    public int getGold() {
        return gold;
    }
    //取得木頭
    public int getWood() {
        return wood;
    }

    //設定金錢
    public void setGold(int gold) {
        this.gold = gold;
    }
    //設定木頭
    public void setWood(int wood) {
        this.wood = wood;
    }

}
