package com.qualifierProject.services;

import com.qualifierProject.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    public int getHours() {
        return 4;
    }
}
