package com.example.demoapp.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public GroupedOpenApi vetsApi() {
        return GroupedOpenApi.builder()
                .group("vets")
                .pathsToMatch("/api/vets/**")
                .build();
    }

    @Bean
    public GroupedOpenApi visitsApi() {
        return GroupedOpenApi.builder()
                .group("visits")
                .pathsToMatch("/api/visits/**")
                .build();
    }
}
