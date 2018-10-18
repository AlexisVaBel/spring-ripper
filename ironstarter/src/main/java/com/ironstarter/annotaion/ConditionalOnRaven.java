package com.ironstarter.annotaion;

import com.ironstarter.OnRavenCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by alexeybel on 18.10.18.
 */
@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnRavenCondition.class)
public @interface ConditionalOnRaven {
}
