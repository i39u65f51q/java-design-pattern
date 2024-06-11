package resource;

//生成器模式
public class ResourceBuilder {
    private Resource resource;

    public ResourceBuilder(){
        //初始化當前資源
        this.resource = new Resource();
    }

    //新增木頭
    public void addWood(int count){
        this.resource.setWood(this.resource.getWood() + count);
    }

    //新增金錢
    public void addGold(int count){
        this.resource.setGold(this.resource.getGold() + count);
    }

    //重置當前資源
    public void reset(){
        this.resource = new Resource();
    }

    //取得資源後，初始化當前資源
    public Resource getResource(){
        Resource temp = this.resource;
        this.reset();
        return temp;
    }

}
