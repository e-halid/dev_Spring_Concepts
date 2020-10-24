package com.componentProject.services;

import com.componentProject.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours is : 20 hr");
    }
}
