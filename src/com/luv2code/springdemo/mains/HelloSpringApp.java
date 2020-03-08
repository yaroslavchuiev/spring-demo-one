package com.luv2code.springdemo.mains;

import com.luv2code.springdemo.intefaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main (String[] args) {
        //load spring conf file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve a bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call method on the bean
        System.out.println(theCoach.getDailyWorkout());
        //call our new fortune method
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
