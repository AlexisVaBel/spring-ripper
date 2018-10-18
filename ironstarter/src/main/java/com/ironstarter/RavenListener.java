package com.ironstarter;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@RequiredArgsConstructor
public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {
    private final RavenProperties ravenProperties;

// или @Autowired или @RequiredArgsConstructor
//     @Autowired
//    public RavenListener(RavenProperties ravenProperties) {
//        this.ravenProperties = ravenProperties;
//    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ravenProperties.getWhere().forEach(System.out::print);
        System.out.println("sending raven");
    }
}
