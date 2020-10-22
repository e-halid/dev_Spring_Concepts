package com.ciProject.services;

import com.ciProject.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 5;
    }
}
