package com.sanhotels.email.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
public class StaticResourceConfiguration implements WebMvcConfigurer {
private static final String CLASSPATH_RESOURCE_LOCATIONS= "classpath:/resources/";
@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addResourceHandlers(registry);
	registry.addResourceHandler("/img/**").addResourceLocations("classpath:/resources/").addResourceLocations("classpath:/resources/images/")
	.addResourceLocations("/images/").addResourceLocations("classpath:/resources/templates/").addResourceLocations("classpath:/resources/templates/images/")
	.addResourceLocations("classpath:/resources/static/");
	}
}
