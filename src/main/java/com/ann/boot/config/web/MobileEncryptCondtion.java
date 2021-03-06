package com.ann.boot.config.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotatedTypeMetadata;


@Configuration
@Conditional(MobileEncryptCondtion.EncryptCondition.class)
public class MobileEncryptCondtion {
    @Bean
    public MobileEncryptBean mobileEncryptBean() {
        return new MobileEncryptBean();
    }

    static class EncryptCondition implements Condition {

        public boolean matches(ConditionContext ctx, AnnotatedTypeMetadata metadata) {
            Resource res = ctx.getResourceLoader().getResource("encrypt.txt");
            Environment env = ctx.getEnvironment();
            return res.exists() && env.containsProperty("mobile.encrypt.enable");
        }

    }
}
