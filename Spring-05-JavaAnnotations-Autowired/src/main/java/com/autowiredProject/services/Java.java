package com.autowiredProject.services;

import com.autowiredProject.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Autowired // field injection
    private OfficeHours officeHours;
/*
@Autowired Constructor Injection, we dont need to put Autowired if we have only one constructor
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
*/
    /* Setter Injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours){
        this.officeHours = officeHours;
    }
*/

    public void getTeachingHours() {
        System.out.println("Teaching hours : "+(30 + officeHours.getHours()));
    }
}
