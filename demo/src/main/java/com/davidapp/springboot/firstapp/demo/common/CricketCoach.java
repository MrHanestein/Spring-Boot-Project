package com.davidapp.springboot.firstapp.demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getCoach() {
        return "This is my coach to the gym!";
    }
}
