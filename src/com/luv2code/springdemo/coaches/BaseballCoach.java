package com.luv2code.springdemo.coaches;

import com.luv2code.springdemo.intefaces.Coach;
import com.luv2code.springdemo.intefaces.FortuneService;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout () {
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune () {
        //use my fortune Service to get fortune

        return fortuneService.getFortune();
    }
}
