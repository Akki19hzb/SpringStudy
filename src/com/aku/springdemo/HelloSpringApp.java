/**
 * 
 */
package com.aku.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author akash
 *
 */
public class HelloSpringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); // id, interface
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout()); 
		
		// close the context
		context.close();

	}

}
