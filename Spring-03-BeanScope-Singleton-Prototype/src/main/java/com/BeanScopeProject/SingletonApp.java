package com.BeanScopeProject;

import com.BeanScopeProject.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("javaClass",Course.class);
        Course course2 = container.getBean("javaClass",Course.class);


        System.out.println("Pointing to the same object:" + (course1 == course2));

        System.out.println("Memory Location for the course1: "+course1);
        System.out.println("Memory Location for the course2: "+course2);

    }
}
