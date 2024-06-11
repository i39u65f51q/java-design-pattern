package test.resource;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import resource.Resource;
import resource.ResourceBuilder;

public class ResourceBuilderTest {

    @Test
    //案例：新增木頭
    public void addWood(){
        ResourceBuilder r = new ResourceBuilder();
        r.addWood(100);
        
        Resource res = r.getResource();
        assertEquals(res.getWood(), 100);
    }

    @Test
    //案例：新增金錢
    public void addGold(){
        ResourceBuilder r = new ResourceBuilder();
        r.addGold(100);
        
        Resource res = r.getResource();
        assertEquals(res.getGold(), 100);
    }

    @Test
    //案例：重置資源數量
    public void reset(){
        ResourceBuilder r = new ResourceBuilder();
        r.reset();
        
        Resource res = r.getResource();
        assertEquals(res.getGold(), 0);
        assertEquals(res.getWood(), 0);
    }

}
