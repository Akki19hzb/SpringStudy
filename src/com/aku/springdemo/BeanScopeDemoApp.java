package com.aku.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Code for Bean Scope learning
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		Coach theAplhaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = theCoach == theAplhaCoach;
		
		// call methods on the bean
		System.out.println("Same Object: "+ result);
		System.out.println("Memory Location for theCoach: "+ theCoach);
		System.out.println("Memory Location for theCoach: "+ theAplhaCoach);
		
		// close the context
		context.close();
	}

}
