package interview.demo.entity;

import javax.persistence.Entity;

@Entity
public class Rectangle extends Sharp implements Image{

    public double getArea(){
        return sideA*sideB;
    }
    public boolean save(){
        return true;
    }
}
