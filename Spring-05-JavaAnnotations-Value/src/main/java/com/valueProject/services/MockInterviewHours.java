package com.valueProject.services;

import com.valueProject.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements ExtraSessions {
    public int getHours() {
        return 6;
    }
}
