package com.componentProject.services;

import com.componentProject.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weeklt Teaching hours : 7");
    }
}
