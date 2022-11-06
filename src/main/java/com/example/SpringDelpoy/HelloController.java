package com.example.SpringDelpoy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloController {

    @Value("${app.message}")
    String message;


    @Autowired
    @GetMapping("/hola")
    public String HelloWord(){
        System.out.println(message);
        return "Hello Word What's up??";
    }

}
