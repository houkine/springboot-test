package interview.demo.entity;
import javax.persistence.Entity;

import interview.demo.entity.*;

public class Square implements Image{
    private Sharp s;

    public float getArea(){
        return s.getsSideA()*s.getsSideA();
    }
    public boolean save(){
        return true;
    }
}
