package com.qualifierProject.services;

import com.qualifierProject.interfaces.Course;
import com.qualifierProject.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

//@Autowired
//@Qualifier("officeHours")
    private ExtraSessions extraSessions;

    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    public void getTeachingHours() {
        System.out.println("Teaching hours : "+(20 + extraSessions.getHours()));

    }
}
