package com.davidapp.springboot.firstapp.demo.firstcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("/")
    public String funController(){
        return "This is my very first controller";
    }
    @GetMapping("/workout")
    public String marathon(){
        return "I am an olympic sprinter";
    }
}
