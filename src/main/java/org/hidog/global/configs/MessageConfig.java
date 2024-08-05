package org.hidog.global.configs;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConfig {
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.setDefaultEncoding("UTF-8");
        ms.setUseCodeAsDefaultMessage(true); //메세지가 없었을 때 에러코드
        ms.setBasenames("messages.commons", "messages.validations","messages.errors");

        return ms;
    }
}
