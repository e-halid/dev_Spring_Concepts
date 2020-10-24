package com.autowiredProject.services;

import com.autowiredProject.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    public int getHours() {
        return 4;
    }
}
