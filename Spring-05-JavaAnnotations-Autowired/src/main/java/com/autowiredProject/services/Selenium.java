package com.autowiredProject.services;

import com.autowiredProject.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("Teaching hours : 11");
    }
}
