package com.inti.Project_AutoEcole;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSConfig implements WebMvcConfigurer {

@Override
public void addCorsMappings(CorsRegistry registery) {
	registery.addMapping("/**")
		.allowedOrigins("http://localhost:4200")
		.allowedHeaders("*")
		.allowedMethods ("POST, PUT, GET, OPTIONS, DELETE")
		.exposedHeaders("Set-Cookie", "Authorization");
	
}
}
