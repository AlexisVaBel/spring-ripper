package com.ironstarter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by alexeybel on 29.10.18.
 */
public class CheckApplicationContextInitializer implements ApplicationContextInitializer{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if(applicationContext.getEnvironment().getActiveProfiles().length == 0){
            throw new RuntimeException("Без профиля никак");
        }
    }
}
