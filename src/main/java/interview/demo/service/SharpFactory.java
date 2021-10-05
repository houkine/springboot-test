package interview.demo.service;

import interview.demo.entity.*;

public class SharpFactory {
    private static SharpFactory instance=null;

    private SharpFactory(){}
    public static SharpFactory getInstance(){
        if(instance==null){
            instance=new SharpFactory();
        }
        return instance;
    }

    public Sharp GetSharp(String name){
        switch (name) {
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }

    public Image GetImage(Sharp s){
        
        switch (s.getName()) {
            case "square":
                return (Square)s;
            case "circle":
                return (Circle)s;
            case "rectangle":
                return (Rectangle)s;
            default:
                return null;
        }
    }
}
