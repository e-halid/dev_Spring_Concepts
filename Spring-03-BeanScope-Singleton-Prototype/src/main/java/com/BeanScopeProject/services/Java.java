package com.BeanScopeProject.services;

import com.BeanScopeProject.interfaces.Course;

public class Java implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : w0");
    }
}
