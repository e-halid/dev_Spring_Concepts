package com.configurationProject.configs;

import com.configurationProject.interfaces.ExtraSessions;
import com.configurationProject.services.Java;
import com.configurationProject.services.OfficeHours;
import com.configurationProject.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.configurationProject")
@PropertySource("classpath:application.properties")
public class ConfigurationAppConfig {

    @Bean
    public Java java() {
    return new Java(officeHours());
}
    @Bean
    public Selenium selenium(){
    return new Selenium();
    }

    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }
    /*
    @Bean
    public ExtraSessions extraSessions() {
        return new OfficeHours;

    }
    */

}
