package com.pauls.SpringWebPractice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // allow all endpoints
                .allowedOrigins("*") // allow all origins (you can restrict later)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // allowed HTTP methods
                .allowedHeaders("*");
    }
}
