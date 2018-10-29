package com.ironstarter;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {
    private final RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ravenProperties.getwhereFly().forEach(System.out::print);
        System.out.println("sending raven");
    }
}
