package com.luv2code.springdemo.fortuneServices;

import com.luv2code.springdemo.intefaces.FortuneService;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune () {
        return "Today is your lucky day!";
    }

}
