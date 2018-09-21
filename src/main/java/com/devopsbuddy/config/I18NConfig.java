package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

    @Bean
    ReloadableResourceBundleMessageSource messageSource() {

        ReloadableResourceBundleMessageSource resourceBundleMessage = new ReloadableResourceBundleMessageSource();
        resourceBundleMessage.setBasename("classpath:i18n/messages");

        // Check for new messages every 30 minutes
        resourceBundleMessage.setCacheSeconds(1800);
        return resourceBundleMessage;
    }
}
