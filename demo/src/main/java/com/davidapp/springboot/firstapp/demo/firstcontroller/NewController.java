package com.davidapp.springboot.firstapp.demo.firstcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/busname")
    public String busAndName(){
        return "Your name is " + coachName + " , and your bus number is " + busName;
    }

    @Value("${bus.name}")
    private String busName;
    @GetMapping("/")
    public String funController(){
        return "This is my very first controller";
    }
    @GetMapping("/workout")
    public String marathon(){
        return "I am an olympic sprinter";
    }
}
