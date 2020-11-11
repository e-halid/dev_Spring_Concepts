package com.postConstructPreDestroyProject.services;

import com.postConstructPreDestroyProject.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("Teaching Hours : 20");
    }
}
