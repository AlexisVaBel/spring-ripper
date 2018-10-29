package com.ironstarter;
import com.ironstarter.RavenProperties;
import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.REGISTER_BEAN;

/**
 *
 * Created by alexeybel on 18.10.18.
 */

//@EnableConfigurationProperties(RavenProperties.class)
public class OnRavenCondition extends AllNestedConditions {

    public OnRavenCondition(){
        super(REGISTER_BEAN);
    }

    @ConditionalOnProperty("raven.where-fly")
    public static class OnDestinationCondition{
    }
    @ConditionalOnProperty(value = "raven.turn-on",havingValue = "true")
    public static class OnEnableCOndition{

    }
}
