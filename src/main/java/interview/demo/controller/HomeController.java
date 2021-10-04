
package interview.demo.controller;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import interview.demo.service.SharpService;
import interview.demo.entity.*;
import interview.demo.service.impl.*;
import java.util.Map;

@RestController
public class HomeController{
    @Resource
    private SharpService sharpService;


    @GetMapping("/")
    public String Get(){
        return "hello world get";
    }

    @PostMapping("/")
    public String Post(
        // Sharp s
        String shape,
        int sideA,
        int sideB,
        int radius,
        String unit
    ){
        
        return shape;
    }
}