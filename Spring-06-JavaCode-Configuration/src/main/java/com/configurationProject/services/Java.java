package com.configurationProject.services;

import com.configurationProject.interfaces.Course;
import org.springframework.stereotype.Component;
@Component
public class Java implements Course {
public void getTeachingHours() {
        System.out.println("Weekly teaching hours 22");
    }
}
