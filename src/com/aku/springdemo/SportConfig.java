package com.aku.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.aku.springdemo")
public class SportConfig {
	/*
	 * use @Bean to make an existing third-party class available to 
	 * your Spring framework application context.
	 * */
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach kabbadiCoach() {
		return new KabbadiCoach(sadFortuneService());
	} 
}
