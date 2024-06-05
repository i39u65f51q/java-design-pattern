package resource;

//生成器模式
public class ResourceBuilder {
    private Resource resource;

    public ResourceBuilder(){
        this.resource = new Resource();
    }

    public void addWood(int count){
        this.resource.setWood(this.resource.getWood() + count);
    }

    public void addGold(int count){
        this.resource.setGold(this.resource.getGold() + count);
    }

    public void reset(){
        this.resource = new Resource();
    }

    public Resource getResource(){
        Resource temp = this.resource;
        this.reset();
        return temp;
    }

}
