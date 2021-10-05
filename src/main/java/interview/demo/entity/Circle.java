package interview.demo.entity;

import javax.persistence.Entity;

@Entity
public class Circle extends Sharp implements Image{

    public double getArea(){
        return radius*radius*3.14;
    }
    public boolean save(){
        return true;
    }
}
