package com.initDestroyProject;

import com.initDestroyProject.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initDestroyProjectApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("javaClass",Course.class);

        ((ClassPathXmlApplicationContext)container).close();
    }
}
