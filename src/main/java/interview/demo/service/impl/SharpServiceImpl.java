


package interview.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interview.demo.entity.Image;
import interview.demo.entity.Sharp;
import interview.demo.repository.SharpDao;
import interview.demo.service.*;
// import interview.demo.entity.SharpParam;

@Service
public class SharpServiceImpl implements SharpService{
    @Autowired
    private SharpDao sharpDao;

    @Override
    public boolean SaveImage(
        String shape,
        Integer sideA,
        Integer sideB,
        Integer radius,
        String unit
    ){
        // get sharp and put fields in
        SharpFactory sf=SharpFactory.getInstance();
        Sharp s = sf.GetSharp(shape);
        s.setName(shape);
        s.setSideA(sideA);
        s.setSideB(sideB);
        s.setRadius(radius);
        s.setUnit(unit);

        // save 
        sharpDao.save(s);
        return true;
    }
    @Override
    public double CalculateArea(long id){
        // get instance
        SharpFactory sf=SharpFactory.getInstance();
        Sharp s = sharpDao.findById(id).get();

        // get image
        Image i = sf.GetImage(s);
        return i.getArea();
    }
    
}
