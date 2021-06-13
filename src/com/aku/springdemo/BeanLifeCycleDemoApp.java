package com.aku.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Code for Bean Scope learning
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		Coach theAplhaCoach = context.getBean("myCoach", Coach.class);
			
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
