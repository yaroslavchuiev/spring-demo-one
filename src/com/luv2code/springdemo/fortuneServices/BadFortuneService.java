package com.luv2code.springdemo.fortuneServices;

import com.luv2code.springdemo.intefaces.FortuneService;

import java.util.ArrayList;

public class BadFortuneService implements FortuneService {
    private ArrayList<String> predictionList;

    public BadFortuneService () {

    }

    public ArrayList<String> getPredictionList () {
        return predictionList;
    }

    public void setPredictionList (ArrayList<String> predictionList) {
        System.out.println("predictionList"+predictionList);

        this.predictionList = predictionList;
    }

    @Override
    public String getFortune () {
        return predictionList.get(getPosition());
    }
    private int getPosition() {
        return (int) (Math.random() * (predictionList.size()));
    }
}
