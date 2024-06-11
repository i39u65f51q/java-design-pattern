package building;

public class NormalBuilding extends Building {
    private int level = 1; //初始等級1

    //取得建築物等級
    @Override
    public int getLevel() {
        return this.level;
    }
}
