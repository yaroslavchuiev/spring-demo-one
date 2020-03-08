package com.luv2code.springdemo.mains;

import com.luv2code.springdemo.coaches.TrackCoach;
import com.luv2code.springdemo.intefaces.Coach;

public class MyApp {
    public static void main (String[] args) {
        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}
