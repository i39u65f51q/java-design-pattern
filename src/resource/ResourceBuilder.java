package resource;

//生成器模式
public class ResourceBuilder {
    private Resource resource;

    public ResourceBuilder(){
        this.resource = new Resource();
    }

    public void addWood(int count){
        this.resource.wood += count;
    }

    public void addGold(int count){
        this.resource.gold += count;
    }

    public void reset(){
        this.resource = new Resource();
    }

    public Resource getResource(){
        return this.resource;
    }

}
