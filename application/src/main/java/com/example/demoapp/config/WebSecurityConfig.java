package com.example.demoapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static java.util.Objects.requireNonNull;

@Configuration
public class WebSecurityConfig {

    public WebSecurityConfig(Environment env) {
        this.env = env;
    }

    private Environment env;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            final String[] urls = requireNonNull(env.getProperty("demoapp.cors.urls")).split(",");
            final String mapping = env.getProperty("demoapp.cors.mapping");
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                var corsRegistration = registry.addMapping(requireNonNull(mapping));
                corsRegistration.allowedOrigins(urls);
            }
        };
    }

}
