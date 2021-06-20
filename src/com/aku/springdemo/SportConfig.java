package com.aku.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//to remove the use of XML file we used ComponentScan which created bean automatically for all the classes using @Component
//@ComponentScan("com.aku.springdemo")  
@PropertySource("classpath:sports.properties")
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
