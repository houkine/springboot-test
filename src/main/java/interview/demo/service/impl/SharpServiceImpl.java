


package interview.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import interview.demo.repository.SharpDao;
import interview.demo.service.*;
// import interview.demo.entity.SharpParam;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Constructor;
@Service
public class SharpServiceImpl implements SharpService{
    @Autowired
    private SharpDao sharpDao;

    @Override
    public boolean SaveImage(String name){
        

        return true;
    }

    
}
