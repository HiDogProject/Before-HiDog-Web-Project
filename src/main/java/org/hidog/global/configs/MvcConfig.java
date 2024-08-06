package org.hidog.global.configs;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableJpaAuditing //Spring boot 애플리케이션 JPA 감독(auditing) 기능 활성화합니다.
@EnableDiscoveryClient
public class MvcConfig implements WebMvcConfigurer {


    /**
     * <input type="hidden" name="_method" value="PATCH"></inpu> -> PATCH 방식으로 요청
     * ?_method=DELETE
     * @return
     */
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new HiddenHttpMethodFilter();
    }
}
