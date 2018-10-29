package com.ironstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by Belyaev Alexei (lebllex) on 29.10.18.
 */
public class ProfileDetector implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length == 0) {
            environment.setActiveProfiles("зимаТута");
        };
    }
}
