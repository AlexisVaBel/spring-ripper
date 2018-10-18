package com.ironstarter;

import com.ironstarter.annotaion.ConditionOnProduction;
import com.ironstarter.annotaion.ConditionalOnRaven;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration  {

    @Bean
    @ConditionOnProduction
    @ConditionalOnRaven
//    @ConditionalOnProperty(name = "raven.where") // эту хрень не видит, но при этом сами параметры считаны
    // точка на подумать
    public RavenListener ravenListener(RavenProperties r){
        return new RavenListener(r);
    }
}
