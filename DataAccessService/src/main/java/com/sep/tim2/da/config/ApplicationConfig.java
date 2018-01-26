package com.sep.tim2.da.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sep.tim2.da.permission.PermissionInterceptor;

@Component
@ComponentScan(basePackages="com")
public class ApplicationConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor())
				.addPathPatterns("/**");
	}
	
	@Bean
	public PermissionInterceptor interceptor() {
	        return new PermissionInterceptor();
	}
}
