package com.aku.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		if(theCoach == alphaCoach) {
			System.out.println("Refers Same Object:"+ theCoach);
		}
		else {
			System.out.println("Refers different Object \n"
					+ "Mem Location of theCoach and alphaCoach respectively: "+theCoach +" and "+alphaCoach);
		}
		
		context.close();
	}

}
