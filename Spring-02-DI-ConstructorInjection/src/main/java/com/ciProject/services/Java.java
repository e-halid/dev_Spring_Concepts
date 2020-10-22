package com.ciProject.services;

import com.ciProject.interfaces.Course;
import com.ciProject.interfaces.ExtraSessions;

public class Java implements Course {
    //OfficeHours officeHours;
    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : "+ (20 + extraSessions.getHours()));
    }
}
