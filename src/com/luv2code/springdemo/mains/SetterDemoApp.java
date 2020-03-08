package com.luv2code.springdemo.mains;

import com.luv2code.springdemo.coaches.CricketCoach;
import com.luv2code.springdemo.intefaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main (String[] args) {
        //load spring conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("Coach's email address -> " + theCoach.getEmailAddress());
        System.out.println("Coach's team -> " + theCoach.getTeam());
        //close the context

        System.out.println("------------------------");
        //retrieve bean from spring container
        CricketCoach configuredCoach = context.getBean("myCricketCoachConfiguredFromProps", CricketCoach.class);

        //call methods on the bean
        System.out.println(configuredCoach.getDailyWorkout());
        System.out.println(configuredCoach.getDailyFortune());

        System.out.println("Coach's props email address -> " + configuredCoach.getEmailAddress());
        System.out.println("Coach's props  team -> " + configuredCoach.getTeam());
        //close the context


        System.out.println("------------------------");
        //retrieve bean from spring container
        CricketCoach randomPredCoach = context.getBean("randomPredCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(randomPredCoach.getDailyWorkout());
        System.out.println(randomPredCoach.getDailyFortune());

        System.out.println("Coach's props email address -> " + randomPredCoach.getEmailAddress());
        System.out.println("Coach's props  team -> " + randomPredCoach.getTeam());
        //close the context
        context.close();
    }
}
