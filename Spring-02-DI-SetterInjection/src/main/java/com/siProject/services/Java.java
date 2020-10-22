package com.siProject.services;

import com.siProject.interfaces.Course;
import com.siProject.interfaces.ExtraSessions;

public class Java implements Course {
    private ExtraSessions extraSessions;

    public ExtraSessions getExtraSessions() {
        return extraSessions;
    }

    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : "+ (20 + extraSessions.getHours()));
    }
}
