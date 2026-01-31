package com.davidapp.springboot.firstapp.demo.rest;

import com.davidapp.springboot.firstapp.demo.common.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//1. Add controller
@RestController
public class DemoController {
    // Create coach instance for constructor
    private Coach myCoach;

    // Create a constructor class
    public DemoController(Coach thisCoach){
        myCoach = thisCoach;
    }


    //Call method for the get coach in package.common.Coach interface
    @GetMapping("/EveningWorkout")
    public String getCoach(){
        return myCoach.getCoach();

    }
}
