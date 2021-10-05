
package interview.demo.controller;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort;

import interview.demo.service.SharpService;
import interview.demo.entity.*;
import interview.demo.repository.SharpDao;
import interview.demo.service.impl.*;

import java.util.List;
import java.util.Map;

@RestController
public class HomeController{
    @Resource
    private SharpService sharpService;

    @Autowired
    private SharpDao sharpDao;

    @GetMapping("/SearchShape")
    public SearchEntity Get(
        Integer pageNumber,
        Integer pageSize
    ){
        Pageable pageable = PageRequest.of(pageNumber,pageSize);
        SearchEntity se = new SearchEntity();
        se.count = sharpDao.count();
        se.l = sharpDao.findAll(pageable).getContent();
        // return null;
        return se;
    }
    @GetMapping("/area")
    public Double GetArea(
        Long id
    ){
        
        return sharpService.CalculateArea(id);
    }

    @PostMapping("/")
    public String Post(
        String shape,
        Integer sideA,
        Integer sideB,
        Integer radius,
        String unit
    ){
        sharpService.SaveImage(shape, sideA, sideB, radius, unit);
        return null;
    }
}

class SearchEntity{
    long count;
    public long getCount(){ return count;}

    List<Sharp> l;
    public List<Sharp> getL(){ return l;}

}