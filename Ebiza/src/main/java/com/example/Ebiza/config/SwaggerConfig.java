package com.example.Ebiza.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "데모 API 명세서",
                description = "데모 API 명세서",
                version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi defaultOpenApi() {
        return GroupedOpenApi.builder()
                .packagesToScan("com.example.Ebiza.controller")
                .group("API v1")
                .build();
    }
}

