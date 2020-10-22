package com.ciProject;

import com.ciProject.interfaces.Course;
import com.ciProject.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ciProjectApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("javaClass",Course.class);
        course.getTeachingHours();


    }
}
