package ru.ruslan.springapp.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
@Configuration
class Config {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public HttpEntity entity() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-KEY", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
        headers.set("accept", "application/json");
        HttpEntity entity = new HttpEntity(headers);
        return entity;
    }
}
