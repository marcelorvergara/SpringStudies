/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frankmoley.lil.fid.config;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author marcelo
 */
@Configuration
public class ApplicationConfig {

    @Value("Hello")
    private String greeting;

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;

    @Bean
    public TimeService timeService() {
        return new TimeService(true);
    }

    @Bean
    public OutputService outputServie() {
        return new OutputService(greetingService, timeService);
    }

    @Bean
    public GreetingService greetingService() {
        return new GreetingService("Olahhh");
    }
}
