/**
 * 这个类弃用了
 * 我之前打算用一张表来存放3种图形。检查模型准备用这个类做
 * 但是后来觉得每个图形存为一张表更符合逻辑
 * 就不用了
 * 
 * 同级目录下的那个文件夹也弃用了
 * 
 */


package interview.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import interview.demo.service.impl.sharps.*;
import interview.demo.service.*;
// import interview.demo.entity.SharpParam;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Constructor;
// @Service
public class SharpServiceImpl1 implements SharpService{
    private ImageBeanFactory imageBeanFactory = ImageBeanFactory.GetInstance();

    @Override
    public boolean SaveImage(String name, SharpParam sp){
        // create an image
        Image image = imageBeanFactory.getImage(name);
        if(image==null){
            return false;
        }

        // save image as a sharp

        return true;
    }

    
}

class ImageBeanFactory{
    private Map<String,Image > imageMap;
    private static ImageBeanFactory instance = null;

    private ImageBeanFactory(){
        if(imageMap==null){
            imageMap=new HashMap<String,Image >();
            imageMap.put("square", new Square());
        }
    }
    public static ImageBeanFactory GetInstance(){
        if(instance==null){
            instance = new ImageBeanFactory();
        }
        return instance;
    }
    public Image getImage(String name){
        return imageMap.get(name);
    }
    public Image getImage(String name,SharpParam sp){ 
        switch (name) {
            case "square":
                Square image = (Square)imageMap.get(name);
                image.setSideA(sp.getSideA());
                image.setUnit(sp.getUnit());
                return image;
        
            default:
                return null;
        }
    }
}