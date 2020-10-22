package com.siProject.services;

import com.siProject.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 5;
    }
}
