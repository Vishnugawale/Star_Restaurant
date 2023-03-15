package com.str.springConfiguration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class SpringFoxConfig1 extends WebMvcConfigurerAdapter {
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("swagger-ui.html")
	.addResourceLocations("classpath:/META-INF/resources/");
	

	registry.addResourceHandler("/webjars/**")
	.addResourceLocations("classpath:/META-INF/resources/webjars/"); }
	

	}

