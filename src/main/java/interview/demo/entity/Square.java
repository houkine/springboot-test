package interview.demo.entity;

import javax.persistence.Entity;

@Entity
public class Square extends Sharp implements Image{

    public double getArea(){
        return sideA*sideA;
    }
    public boolean save(){
        return true;
    }
}
