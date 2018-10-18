package com.ironstarter;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.REGISTER_BEAN;

/**
 * Created by alexeybel on 18.10.18.
 */
public class OnRavenCondition extends AllNestedConditions {

    public OnRavenCondition(){
        super(REGISTER_BEAN);
    }
    @ConditionalOnProperty("raven.wher-to-fly")
    public static class OnDestinationCondition{

    }
}
