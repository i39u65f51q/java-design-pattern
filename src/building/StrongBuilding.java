package building;

public class StrongBuilding  extends Building{
    private int level = 2; //初始等級2
    
    //取得建築物等級    
    @Override
    public int getLevel() {
        return this.level;
    }
}
