package interview.demo.service;
import java.util.List;

import interview.demo.entity.Sharp;

public interface SharpService {
    // boolean SaveImage(String name, SharpParam sp);
    boolean SaveImage(
        String shape,
        Integer sideA,
        Integer sideB,
        Integer radius,
        String unit
    );
    
    double CalculateArea(long id);
}
