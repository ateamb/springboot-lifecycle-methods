package com.javabanters.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//marks the class as a spring bean
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor "+ getClass().getSimpleName());
    }


    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartstuff "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanstuff "+ getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice fast bowling for 20 mins";
    }
}
