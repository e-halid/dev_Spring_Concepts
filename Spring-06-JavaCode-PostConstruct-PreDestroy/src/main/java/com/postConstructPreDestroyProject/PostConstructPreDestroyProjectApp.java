package com.postConstructPreDestroyProject;

import com.postConstructPreDestroyProject.config.AppConfig;
import com.postConstructPreDestroyProject.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostConstructPreDestroyProjectApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        Course course = container.getBean("java",Course.class);


        course.getTeachingHours();

        ((AnnotationConfigApplicationContext)container).close();
    }
}
