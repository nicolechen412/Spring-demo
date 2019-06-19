/**
 * FileName: MagicExistsCondition
 * Author: nicole
 * Date: 2019/6/18 19:00
 * Description:
 */

package com.nicole;/*
 * author: nicole
 * date: 2019/6/18
 * desc:
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class MagicExistsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment en = conditionContext.getEnvironment();
        return en.containsProperty("magic");
    }
}
