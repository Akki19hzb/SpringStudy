package com.aku.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class); // id, interface
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());		
		
		// close the context
		context.close();
	}

}
