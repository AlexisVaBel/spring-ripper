package com.ironstarter.annotaion;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnProductionCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
<<<<<<< HEAD
        return true;
//        return JOptionPane.showConfirmDialog(null,"production?") == 0;
=======
        return true;//JOptionPane.showConfirmDialog(null,"production?") == 0;
>>>>>>> 33aacf2bdabadbb398ec34d58d928bd5dfb7d2cf
    }
}
