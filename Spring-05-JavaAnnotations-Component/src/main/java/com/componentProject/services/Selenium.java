package com.componentProject.services;

import com.componentProject.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours is 15 hours.");
    }
}
