package com.example.infrastructure.configuration;

import com.example.infrastructure.configuration.jackson.CustomObjectMapper;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;

@Configuration
class WebConfiguration implements WebMvcConfigurer {

    @Bean
    HttpMessageConverters customConverters() {
        HttpMessageConverter<?> stringHttpMessageConverter = new StringHttpMessageConverter(StandardCharsets.UTF_8);
        HttpMessageConverter<?> mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter(CustomObjectMapper.objectMapper());
        return new HttpMessageConverters(stringHttpMessageConverter, mappingJackson2HttpMessageConverter);
    }
}