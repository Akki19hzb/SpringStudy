package com.aku.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KabbadiJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
		// retrieve bean from spring container
		KabbadiCoach theCoach = context.getBean("kabbadiCoach", KabbadiCoach.class); // id, interface
		
		//get email and team
		System.out.println("Email :"+ theCoach.getEmail());
		
		System.out.println("Team: " + theCoach.getTeam());
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());		
		
		// close the context
		context.close();
	}

}
