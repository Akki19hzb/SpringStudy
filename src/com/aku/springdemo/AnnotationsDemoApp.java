package com.aku.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.context.Theme;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class); // id, interface
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("\n\n======Swim Coach======\n\n");
		SwimCoach theCoach1 = context.getBean("swimCoach", SwimCoach.class); // id, interface
		
		// call methods on the bean
		System.out.println(theCoach1.getDailyWorkout());
		
		System.out.println(theCoach1.getDailyFortune());
		
		System.out.println("Team:"+theCoach1.getTeam());
		System.out.println("Email:"+theCoach1.getEmail());
		
		// close the context
		context.close();
	}

}
