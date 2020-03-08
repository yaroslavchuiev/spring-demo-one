package com.luv2code.springdemo.coaches;

import com.luv2code.springdemo.intefaces.Coach;
import com.luv2code.springdemo.intefaces.FortuneService;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach () {
    }

    public TrackCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout () {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune () {
        return "Just do it!: " + fortuneService.getFortune();
    }
}
