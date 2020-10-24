package com.configurationProject.services;

import com.configurationProject.interfaces.Course;
import com.configurationProject.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//if you have @Bean annotation in config class you dont need @Component, its covering same work.
public class Java implements Course {

    private ExtraSessions extraSessions;
    @Value("JD01")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String [] days;


    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {

        System.out.println("Weekly teaching hours : "+(22 + extraSessions.getHours()));
    }

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
